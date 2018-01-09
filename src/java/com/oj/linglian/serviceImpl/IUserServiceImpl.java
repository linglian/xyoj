/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.serviceImpl;

import com.oj.linglian.dao.IUserDao;
import com.oj.linglian.daoImpl.IUserDaoImpl;
import com.oj.linglian.entity.User;
import com.oj.linglian.service.IUserService;

/**
 *
 * @author lol
 */
public class IUserServiceImpl implements IUserService {

    IUserDao iud = null;

    public IUserServiceImpl() {
        iud = new IUserDaoImpl();
    }

    @Override
    public User queryUser(String userid) {
        return iud.queryUser(userid);
    }

    @Override
    public User queryUser(String userid, String password) {
        return iud.queryUser(userid, password);
    }

    public int updateUser(User user) {
        return iud.updateUser(user);
    }
}
