/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.daoImpl;

import com.oj.linglian.dao.ICoderDao;
import com.oj.linglian.entity.Coder;
import com.oj.linglian.entity.Question;
import db.DBMan;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lol
 */
public class ICoderDaoImpl implements ICoderDao {

    /**
     * 插入Coder到数据库。
     * 以下类推，名字即代码意思
     * @param coder
     * @return 成功为1，失败为0
     */
    public int insertCoder(Coder coder) {
        try {
            String sql = "INSERT INTO Coder (code, time, startTime, endTime, result, status, userId, questionId)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            return DBMan.getInstance().update(sql, coder.getCode(), coder.getTime(), coder.getStartTime(), coder.getEndTime(), coder.getResult(), coder.getStatus(), coder.getUserId(), coder.getQuestionId());
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-Coder不是JavaBean");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        }
        return 0;
    }

    @Override
    public int updateCoder(Coder coder) {
        try {
            System.out.println(coder);
            String sql = "Update Coder set code = ?, time = ?, startTime = ?, endTime = ?,"
                    + " result = ?, status = ?, userId = ?, questionId = ? where coderId = ?";
            return DBMan.getInstance().update(sql, coder.getCode(), coder.getTime(), coder.getStartTime(), coder.getEndTime(), coder.getResult(), coder.getStatus(), coder.getUserId(), coder.getQuestionId(), coder.getCoderId());
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-Coder不是JavaBean");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        }
        return 0;
    }
    @Override
    public List<Coder> queryAllCoder() {
        try {
            String sql = "SELECT coderId, code, time, startTime, endTime, result, status,"
                    + " userId, questionId"
                    + " FROM Coder order by coderId desc";
            return DBMan.getInstance().query(Coder.class, sql);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-Question不是JavaBean");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        } catch (InstantiationException ex) {
            ex.printStackTrace();
            System.out.println("请给相应的Entity编写默认构造函数");
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
            System.out.println("不是标准的setter函数");
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
            System.out.println("setter函数传入失败，请检查参数是否正确");
        }
        return null;
    }

    private List<Coder> queryCoderById(String idName, String param, String... more) {
        try {
            String sql = "SELECT coderId, code, time, startTime, endTime, result, status,"
                    + " userId, questionId"
                    + " FROM Coder Where " + idName + " = ? ";
            String[] mores = null;
            if (more != null) {
                mores = new String[more.length / 2 + 1];
                for (int i = 0; i < more.length; i += 2) {
                    sql += " AND " + more[i] + " = ?";
                    mores[i / 2 + 1] = more[i + 1];
                }
                sql += "order by coderId desc";
                mores[0] = param;
                return DBMan.getInstance().query(Coder.class, sql, mores);
            } else {
                sql += "order by coderId desc";
                return DBMan.getInstance().query(Coder.class, sql, param);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-Question不是JavaBean");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        } catch (InstantiationException ex) {
            ex.printStackTrace();
            System.out.println("请给相应的Entity编写默认构造函数");
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
            System.out.println("不是标准的setter函数");
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
            System.out.println("setter函数传入失败，请检查参数是否正确");
        }
        return null;
    }

    @Override
    public Coder queryCoderById(String coderId) {
        List<Coder> list = queryCoderById("coderId", coderId);
        if (list != null) {
            if (!list.isEmpty()) {
                return list.get(0);
            }
        }
        return null;
    }

    @Override
    public List<Coder> queryCoderByUserId(String userId) {
        return queryCoderById("userId", userId);
    }

    @Override
    public List<Coder> queryCoderByQuestionId(String questionId) {
        return queryCoderById("questionId", questionId);
    }

    @Override
    public List<Coder> queryCoderByUserIdAndQuestionId(String userId, String questionId) {
        return queryCoderById("userId", userId, "questionId", questionId);
    }

    public static void main(String[] args) {
        ICoderDao icd = new ICoderDaoImpl();
        System.out.println(icd.queryCoderByQuestionId("1"));
        System.out.println(icd.queryCoderByUserIdAndQuestionId("2015081108", "1"));
    }
}
