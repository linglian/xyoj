/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.dao;

import com.oj.linglian.entity.InputAndOutput;
import java.util.List;

/**
 *
 * @author lol
 */
public interface IInputAndOutputDao {
    public List<InputAndOutput> queryInputAndOutputs(String qid);
}
