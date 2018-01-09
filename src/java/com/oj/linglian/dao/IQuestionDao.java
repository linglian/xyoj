/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.dao;

import com.oj.linglian.entity.Question;
import java.util.List;

/**
 *
 * @author lol
 */
public interface IQuestionDao {
    public Question queryQuestion(String qid);
    public List<Question> queryAllQuestion();
    public int insertQuestion(Question q);
    public int updateQuestion(Question q);
}
