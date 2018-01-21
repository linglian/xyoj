/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.entity;

/**
 *
 * @author lol
 */
public class CoderBuilder {
    
    private Coder coder;
    
    public CoderBuilder() {
        coder = new Coder();
    }
    
    public CoderBuilder(Coder coder) {
        this.coder = coder;
    }
    
    public CoderBuilder setCoderId(String coderId) {
        coder.setCoderId(coderId);
        return this;
    }
    
    
    public CoderBuilder setCode(String code) {
        coder.setCode(code);
        return this;
    }
    
    
    public CoderBuilder setTime(String time) {
        coder.setTime(time);
        return this;
    }
    
    public CoderBuilder setStartTime(String startTime) {
        coder.setStartTime(startTime);
        return this;
    }
    
    public CoderBuilder setEndTime(String endTime) {
        coder.setEndTime(endTime);
        return this;
    }
    
    public CoderBuilder setResult(String result) {
        coder.setResult(result);
        return this;
    }
    
    public CoderBuilder setStatus(String status) {
        coder.setStatus(status);
        return this;
    }
    
    public CoderBuilder setUserId(String userId) {
        coder.setUserId(userId);
        return this;
    }
    
    public CoderBuilder setQuestionId(String questionId) {
        coder.setQuestionId(questionId);
        return this;
    }
    
    public Coder build() {
        return coder;
    }
}
