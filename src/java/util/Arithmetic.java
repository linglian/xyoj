/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lol
 */
public class Arithmetic {
    
    private static <T> List<List<T>> combinerSelect(List<T> data, List<T> workSpace, int n, int k) {  
        List<T> copyData;
        List<T> copyWorkSpace;
        List<List<T>> list = new ArrayList();
        if(workSpace.size() == k) {
            List<T> tlist = new ArrayList();
            for(T str : workSpace)
                tlist.add(str);
            list.add(tlist);
        }
        for(int i = 0; i < data.size(); i++) {  
            copyData = new ArrayList(data);  
            copyWorkSpace = new ArrayList(workSpace);  
            copyWorkSpace.add(copyData.get(i));  
            for(int j = i; j >=  0; j--)  
                copyData.remove(j);  
            List<List<T>> tList = combinerSelect(copyData, copyWorkSpace, n, k);
            for (List<T> l : tList) {
                list.add(l);
            }
        }
        return list;
    }
    
    public static <T> List<List<T>> combiner(List<T> a, int length) {
        if (length == 0) {
            length = a.size();
        }
        List<List<T>> list = new ArrayList();
        for (int i = 1; i <= length; i++) {
            List<List<T>> tList = combinerSelect(a, new ArrayList<T>(), 0, i);
            for (List<T> l : tList) {
                list.add(l);
            }
        }
        return list;
    }
    private static <T> List<List<T>> combiner(List<T> a) {
        return combiner(a, a.size());
    }

}
