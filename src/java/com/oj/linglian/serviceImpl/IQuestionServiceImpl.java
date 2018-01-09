/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.serviceImpl;

import com.oj.linglian.dao.IQuestionDao;
import com.oj.linglian.daoImpl.IQuestionDaoImpl;
import com.oj.linglian.entity.Question;
import com.oj.linglian.service.IQuestionService;
import java.util.List;

/**
 *
 * @author lol
 */
public class IQuestionServiceImpl implements IQuestionService {

    IQuestionDao iqd = new IQuestionDaoImpl();

    public void IQuestionServiceImpl() {
        iqd = new IQuestionDaoImpl();
    }

    @Override
    public Question queryQuestion(String qid) {
        return iqd.queryQuestion(qid);
    }
    
    @Override
    public List<Question> queryAllQuestion() {
        return iqd.queryAllQuestion();
    }
    public int insertQuestion(Question q) {
        return iqd.insertQuestion(q);
    }

    @Override
    public int updateQuestion(Question q) {
        return iqd.updateQuestion(q);
    }

}
