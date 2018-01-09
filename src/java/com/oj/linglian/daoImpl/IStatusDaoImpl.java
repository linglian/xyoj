 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.daoImpl;

import com.oj.linglian.dao.IStatusDao;
import com.oj.linglian.entity.Status;
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
public class IStatusDaoImpl implements IStatusDao {

    @Override
    public Status getStatus(String statusId) {
        try {
            String sql = "select statusId, name, body from status where statusId = ?";
            return DBMan.getInstance().queryById(Status.class, sql, statusId);
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
    
    public static void main(String[] args) {
        IStatusDao isd = new IStatusDaoImpl();
        System.out.println(isd.getStatus("11"));
    }
}
