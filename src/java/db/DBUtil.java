/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.alibaba.fastjson.JSON;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ArrayUtil;
import util.ClassUtil;
import util.GC;
import util.OperationException;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public class DBUtil {

    public static <T> List<T> getObjectLimit(String baseDate, String orderBy, T t, int start, int size) {
        return getObjectLimit(baseDate, orderBy, "desc", t, start, size);
    }

    public static <T> List<T> getObjectLimit(String baseDate, String orderBy, String by, T t, int start, int size) {
        String sql = new SqlUtil()
                .addDataName(baseDate)
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(t.getClass()))
                .addAfterWheres(ClassUtil.getNameNotNull(t))
                .addLast("order by " + orderBy + " " + by + " limit ?, ?")
                .build();
        Object[] os = new Object[2];
        os[0] = start;
        os[1] = size;
        Object[] objs = ArrayUtil.multArray(ClassUtil.getValueNotNull(t), os);
        return DBMan.getInstance().queryWithoutThrow((Class<T>) t.getClass(), sql, objs);
    }

    public static <T> List<T> getObjectLikeLimit(String baseDate, String orderBy, String like, String by, T t, Object likes, int start, int size) {
        String sql = new SqlUtil()
                .addDataName(baseDate)
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(t.getClass()))
                .addAfterWheres(ClassUtil.getNameNotNull(t))
                .addAfterWheres(like, "like ?")
                .addLast("order by " + orderBy + " " + by + " limit ?, ?")
                .build();
        Object[] os = new Object[3];
        os[0] = likes;
        os[1] = start;
        os[2] = size;
        Object[] objs = ArrayUtil.multArray(ClassUtil.getValueNotNull(t), os);
        return DBMan.getInstance().queryWithoutThrow((Class<T>) t.getClass(), sql, objs);
    }

    public static <T> List<T> getObjectNotLikeLimit(String baseDate, String orderBy, String like, String by, T t, Object likes, int start, int size) {
        String sql = new SqlUtil()
                .addDataName(baseDate)
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(t.getClass()))
                .addAfterWheres(ClassUtil.getNameNotNull(t))
                .addAfterWheres(like, "not like ?")
                .addLast("order by " + orderBy + " " + by + " limit ?, ?")
                .build();
        Object[] os = new Object[3];
        os[0] = likes;
        os[1] = start;
        os[2] = size;
        Object[] objs = ArrayUtil.multArray(ClassUtil.getValueNotNull(t), os);
        return DBMan.getInstance().queryWithoutThrow((Class<T>) t.getClass(), sql, objs);
    }

}
