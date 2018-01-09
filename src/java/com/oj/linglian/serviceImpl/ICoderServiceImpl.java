/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.serviceImpl;

import com.oj.linglian.dao.ICoderDao;
import com.oj.linglian.daoImpl.ICoderDaoImpl;
import com.oj.linglian.entity.Coder;
import com.oj.linglian.service.ICoderService;
import java.util.List;

/**
 *
 * @author lol
 */
public class ICoderServiceImpl implements ICoderService {

    ICoderDao icd = new ICoderDaoImpl();

    public ICoderServiceImpl() {
        icd = new ICoderDaoImpl();
    }

    @Override
    public int insertCoder(Coder coder) {
        return icd.insertCoder(coder);
    }

    @Override
    public int updateCoder(Coder coder) {
        return icd.updateCoder(coder);
    }

    @Override
    public List<Coder> queryAllCoder() {
        return icd.queryAllCoder();
    }

    @Override
    public Coder queryCoderById(String coderId) {
        return icd.queryCoderById(coderId);
    }

    @Override
    public List<Coder> queryCoderByUserId(String userId) {
        return icd.queryCoderByUserId(userId);
    }

    @Override
    public List<Coder> queryCoderByQuestionId(String questionId) {
        return icd.queryCoderByQuestionId(questionId);
    }

    @Override
    public List<Coder> queryCoderByUserIdAndQuestionId(String userId, String questionId) {
        return icd.queryCoderByUserIdAndQuestionId(userId, questionId);
    }

}
