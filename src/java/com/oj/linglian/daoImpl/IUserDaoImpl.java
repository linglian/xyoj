/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.daoImpl;

import com.oj.linglian.dao.IUserDao;
import com.oj.linglian.entity.Question;
import com.oj.linglian.entity.User;
import db.DBMan;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lol
 */
public class IUserDaoImpl implements IUserDao {

    public int updateUser(User user) {
        try {
            String sql = "update user set email = ?, phone = ?, sex = ?,"
                    + " passQuestions = ?, score = ?,"
                    + " lastCode = ?, lastQuestionId = ? where userid = ?";
            return DBMan.getInstance().update(sql, user.getEmail(), user.getPhone(),
                    user.getSex(), user.getPassQuestions(), user.getScore(),
                    user.getLastCode(), user.getLastQuestionId(), user.getUserId());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("加载数据库类库失败");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("加载数据库配置文件失败");
        }
        return 0;
    }

    @Override
    public User queryUser(String userid) {
        try {
            String sql = "SELECT userId, email, phone, sex, passQuestions, score, lastCode, lastQuestionId  FROM USER WHERE userid = ?";
            return DBMan.getInstance().queryById(User.class, sql, userid);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-User不是JavaBean");
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
    public User queryUser(String userid, String password) {
        try {
            String sql = "SELECT userId, email, phone, sex, passQuestions, score, lastCode, lastQuestionId FROM USER WHERE userid = ? and password = ?";
            return DBMan.getInstance().queryById(User.class, sql, userid, password);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-User不是JavaBean");
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

    public static void main(String[] args) {
        IUserDao isd = new IUserDaoImpl();
        System.out.println(isd.queryUser("2015081108"));
        System.out.println(isd.queryUser("2015081108", "4269877"));
    }

}
