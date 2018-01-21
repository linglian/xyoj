package util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {

    public static List mult(List... objs) {
        List<List> list = new ArrayList();
        int length = objs.length;
        int size = objs[0].size();
        for (int i = 0; i < size; i++) {
            list.add(new ArrayList());
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                list.get(i).add(objs[j].get(i));
            }
        }
        System.out.println(list);
        return list;
    }

    public static List multArray(List... list) {
        List objs = new ArrayList();
        for (int k = 0; k < list.length; k++) {
            objs.add(list[k]);
        }
        return objs;
    }

    public static Object[] multArray(Object[] a, Object[] b) {
        if (a == null) {
            a = new Object[0];
        }
        if (b == null) {
            b = new Object[0];
        }
        Object[] objs = new Object[a.length + b.length];
        int i = 0;
        while (i < a.length) {
            objs[i] = a[i++];
        }
        while (i < b.length + a.length) {
            objs[i] = b[i++ - a.length];
        }
        return objs;
    }

    public static void display(Object[] objs) {
        if (objs == null) {
            objs = new Object[0];
        }
        for (Object o : objs) {
            System.out.println(o);
        }
    }

    public static String[] toStringArray(List list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i).toString();
        }
        return array;
    }
}
