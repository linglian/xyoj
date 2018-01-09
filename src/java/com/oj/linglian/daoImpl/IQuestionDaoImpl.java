/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.daoImpl;

import com.oj.linglian.dao.IQuestionDao;
import com.oj.linglian.entity.Question;
import db.DBMan;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lol
 */
public class IQuestionDaoImpl implements IQuestionDao {

    @Override
    public Question queryQuestion(String qid) {
        try {
            String sql = "SELECT questionId, title, body, score, demoCode, rightPeople, mainPeople,"
                    + " startTime, endTime, inputFormat, outputFormat, inputTest, outputTest"
                    + " FROM QUESTION WHERE questionId = ?";
            return DBMan.getInstance().queryById(Question.class, sql, qid);
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
    public List<Question> queryAllQuestion() {
        try {
            String sql = "SELECT questionId, title, body, score, demoCode, rightPeople, mainPeople,"
                    + " startTime, endTime, inputFormat, outputFormat, inputTest, outputTest"
                    + " FROM QUESTION";
            return DBMan.getInstance().query(Question.class, sql);
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

    /**
     * 插入Question到数据库。
     *
     * @param Question
     * @return 成功为1，失败为0
     */
    public int insertQuestion(Question q) {
        try {
            String sql = "INSERT INTO question (title, body, score, demoCode, rightPeople, mainPeople,"
                    + " startTime, endTime, inputFormat, outputFormat, inputTest, outputTest)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            return DBMan.getInstance().update(sql, q.getTitle(), q.getBody(), q.getScore(), q.getDemoCode(),
                    q.getRightPeople(), q.getMainPeople(), q.getStartTime(), q.getEndTime(),
                    q.getInputFormat(), q.getOutputFormat(), q.getInputTest(), q.getOutputTest());
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
    public int updateQuestion(Question q) {
        try {
            String sql = "update question title = ?, body = ?, score = ?, demoCode = ?, rightPeople = ?, mainPeople = ?,"
                    + " startTime = ?, endTime = ?, inputFormat = ?, outputFormat = ?, inputTest = ?, outputTest = ?"
                    + " where questionId = ?";
            return DBMan.getInstance().update(sql, q.getTitle(), q.getBody(), q.getScore(), q.getDemoCode(),
                    q.getRightPeople(), q.getMainPeople(), q.getStartTime(), q.getEndTime(),
                    q.getInputFormat(), q.getOutputFormat(), q.getInputTest(), q.getOutputTest(), q.getQuestionId());
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

    public static void main(String[] args) {
        IQuestionDao iqd = new IQuestionDaoImpl();
        System.out.println(new IQuestionDaoImpl().queryQuestion("1"));
        for (int i = 0; i < 10000; i++) {
            Question q = new Question();
            q.setTitle(String.valueOf(i));
            q.setBody(String.valueOf(i));
            q.setScore(String.valueOf(i));
            q.setStartTime(String.valueOf(new Date().getTime()));
            q.setEndTime(String.valueOf(new Date(new Date().getTime() + 1000 * 60 * 360).getTime()));
            iqd.insertQuestion(q);
        }
    }
}
