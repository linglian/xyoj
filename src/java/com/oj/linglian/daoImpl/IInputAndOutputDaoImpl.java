/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.daoImpl;

import com.oj.linglian.dao.IInputAndOutputDao;
import com.oj.linglian.entity.InputAndOutput;
import com.oj.linglian.entity.Question;
import db.DBMan;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lol
 */
public class IInputAndOutputDaoImpl implements IInputAndOutputDao {

    @Override
    public List<InputAndOutput> queryInputAndOutputs(String qid) {
        try {
            String sql = "SELECT inputAndOutputId, input, output, questionId FROM INPUTANDOUTPUT WHERE questionId = ?";
            return DBMan.getInstance().query(InputAndOutput.class, sql, qid);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("读取配置文件失败");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("所给的类-InputAndOutput不是JavaBean");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQL数据库操作出错");
        }catch (InstantiationException ex) {
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
        IInputAndOutputDao iiao = new IInputAndOutputDaoImpl();
        System.out.println(iiao.queryInputAndOutputs("1"));
    }
}
