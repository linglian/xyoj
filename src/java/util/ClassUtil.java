package util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;


public class ClassUtil {

    /**
     * 获取属性名数组
	 *
     */
    public static <T> String[] getName(Class<T> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        String[] list = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            list[i] = fields[i].getName();
        }
        return list;
    }

    /**
     * 根据属性名获取属性值
	 *
     */
    public static Object getValue(Object o, String fieldName) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {
            System.out.println("ClassUtil, Bad getValue() :" + e.getMessage());
            return null;
        }
    }

    /**
     * 根据属性名获取属性值
	 *
     */
    public static Object setValue(Object o, String fieldName, Object... value) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String setter = "set" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(setter);
            method.invoke(o, value);
            return o;
        } catch (Exception e) {
            System.out.println("ClassUtil, Bad getValue() :" + e.getMessage());
            return null;
        }
    }

    public static Object[] getValueNotNull(Object o) {
        String[] names = getName(o.getClass());
        List<Object> list = new ArrayList<Object>();
        if (names != null) {
            for (String str : names) {
                Object obj = getValue(o, str);
                if (obj != null) {
                    list.add(obj);
                }
            }
        }
        Object[] objs = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objs[i] = list.get(i);
        }
        return objs;
    }

    public static String[] getNameNotNull(Object o) {
        String[] names = getName(o.getClass());
        List<String> list = new ArrayList<String>();
        if (names != null) {
            for (String str : names) {
                Object obj = getValue(o, str);
                if (obj != null) {
                    list.add(str);
                }
            }
        }
        String[] objs = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objs[i] = list.get(i);
        }
        return objs;
    }

    public static List<Object> getValues(Object o) {
        return getValues(o, getName(o.getClass()));
    }

    public static List<Object> getValues(Object o, String[] names) {
        List<Object> list = new ArrayList<Object>();
        if (names != null) {
            for (String str : names) {
                list.add(getValue(o, str));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        
    }
}
