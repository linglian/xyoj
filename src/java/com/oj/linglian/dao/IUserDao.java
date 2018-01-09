/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.dao;

import com.oj.linglian.entity.User;

/**
 *
 * @author lol
 */
public interface IUserDao {

    public User queryUser(String userid);

    public User queryUser(String userid, String password);

    public int updateUser(User user);
}
