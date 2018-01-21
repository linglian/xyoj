/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author lol
 */
public class MapUtil {
    public static Map<String, String> ooss(Map<Object, Object> m) {
        Map<String, String> map = new HashMap();
        if (m == null) {
            return map;
        }
        Set<Object> set = m.keySet();
        for (Object o : set) {
            map.put(o.toString(), m.get(o).toString());
        }
        return map;
    }
    
    public static Map<String, String> soss(Map<String, Object> m) {
        Map<String, String> map = new HashMap();
        if (m == null) {
            return map;
        }
        Set<String> set = m.keySet();
        for (String o : set) {
            map.put(o, m.get(o).toString());
        }
        return map;
    }
}
