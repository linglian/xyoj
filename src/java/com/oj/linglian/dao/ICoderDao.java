/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.dao;

import com.oj.linglian.entity.Coder;
import java.util.List;

/**
 *
 * @author lol
 */
public interface ICoderDao {
    public int insertCoder(Coder coder);
    public int updateCoder(Coder coder);
    public List<Coder> queryAllCoder();
    public Coder queryCoderById(String coderId);
    public List<Coder> queryCoderByUserId(String userId);
    public List<Coder> queryCoderByQuestionId(String questionId);
    public List<Coder> queryCoderByUserIdAndQuestionId(String userId, String questionId);
}
