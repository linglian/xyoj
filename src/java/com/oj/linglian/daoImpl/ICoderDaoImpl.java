package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Coder;

import com.oj.linglian.dao.ICoderDao;
import db.DBMan;

public class ICoderDaoImpl implements ICoderDao {
    public int update(Coder coder, Coder keyCoder) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(coder, keyCoder, "coder");
    }
    public int updateOfCoderId(Coder coder, String coderId) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        return update(coder, kCoder);
    }
    public int updateOfCode(Coder coder, String code) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        return update(coder, kCoder);
    }
    public int updateOfTime(Coder coder, String time) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        return update(coder, kCoder);
    }
    public int updateOfStartTime(Coder coder, String startTime) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        return update(coder, kCoder);
    }
    public int updateOfEndTime(Coder coder, String endTime) {
        Coder kCoder = new Coder();
        kCoder.setEndTime(endTime);
        return update(coder, kCoder);
    }
    public int updateOfResult(Coder coder, String result) {
        Coder kCoder = new Coder();
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfStatus(Coder coder, String status) {
        Coder kCoder = new Coder();
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfUserId(Coder coder, String userId) {
        Coder kCoder = new Coder();
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfQuestionId(Coder coder, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndCode(Coder coder, String coderId, String code) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setCode(code);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndTime(Coder coder, String coderId, String time) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setTime(time);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndStartTime(Coder coder, String coderId, String startTime) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setStartTime(startTime);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndEndTime(Coder coder, String coderId, String endTime) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setEndTime(endTime);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndResult(Coder coder, String coderId, String result) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndStatus(Coder coder, String coderId, String status) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndUserId(Coder coder, String coderId, String userId) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfCoderIdAndQuestionId(Coder coder, String coderId, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setCoderId(coderId);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndTime(Coder coder, String code, String time) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setTime(time);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndStartTime(Coder coder, String code, String startTime) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setStartTime(startTime);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndEndTime(Coder coder, String code, String endTime) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setEndTime(endTime);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndResult(Coder coder, String code, String result) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndStatus(Coder coder, String code, String status) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndUserId(Coder coder, String code, String userId) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfCodeAndQuestionId(Coder coder, String code, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setCode(code);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndStartTime(Coder coder, String time, String startTime) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setStartTime(startTime);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndEndTime(Coder coder, String time, String endTime) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setEndTime(endTime);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndResult(Coder coder, String time, String result) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndStatus(Coder coder, String time, String status) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndUserId(Coder coder, String time, String userId) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfTimeAndQuestionId(Coder coder, String time, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setTime(time);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfStartTimeAndEndTime(Coder coder, String startTime, String endTime) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        kCoder.setEndTime(endTime);
        return update(coder, kCoder);
    }
    public int updateOfStartTimeAndResult(Coder coder, String startTime, String result) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfStartTimeAndStatus(Coder coder, String startTime, String status) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfStartTimeAndUserId(Coder coder, String startTime, String userId) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfStartTimeAndQuestionId(Coder coder, String startTime, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setStartTime(startTime);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfEndTimeAndResult(Coder coder, String endTime, String result) {
        Coder kCoder = new Coder();
        kCoder.setEndTime(endTime);
        kCoder.setResult(result);
        return update(coder, kCoder);
    }
    public int updateOfEndTimeAndStatus(Coder coder, String endTime, String status) {
        Coder kCoder = new Coder();
        kCoder.setEndTime(endTime);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfEndTimeAndUserId(Coder coder, String endTime, String userId) {
        Coder kCoder = new Coder();
        kCoder.setEndTime(endTime);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfEndTimeAndQuestionId(Coder coder, String endTime, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setEndTime(endTime);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfResultAndStatus(Coder coder, String result, String status) {
        Coder kCoder = new Coder();
        kCoder.setResult(result);
        kCoder.setStatus(status);
        return update(coder, kCoder);
    }
    public int updateOfResultAndUserId(Coder coder, String result, String userId) {
        Coder kCoder = new Coder();
        kCoder.setResult(result);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfResultAndQuestionId(Coder coder, String result, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setResult(result);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfStatusAndUserId(Coder coder, String status, String userId) {
        Coder kCoder = new Coder();
        kCoder.setStatus(status);
        kCoder.setUserId(userId);
        return update(coder, kCoder);
    }
    public int updateOfStatusAndQuestionId(Coder coder, String status, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setStatus(status);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int updateOfUserIdAndQuestionId(Coder coder, String userId, String questionId) {
        Coder kCoder = new Coder();
        kCoder.setUserId(userId);
        kCoder.setQuestionId(questionId);
        return update(coder, kCoder);
    }
    public int remove(Coder coder) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(coder, "coder");
    }
    public int removeOfCoderId(String coderId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        return remove(coder);
    }
    public int removeOfCode(String code) {
        Coder coder = new Coder();
        coder.setCode(code);
        return remove(coder);
    }
    public int removeOfTime(String time) {
        Coder coder = new Coder();
        coder.setTime(time);
        return remove(coder);
    }
    public int removeOfStartTime(String startTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        return remove(coder);
    }
    public int removeOfEndTime(String endTime) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        return remove(coder);
    }
    public int removeOfResult(String result) {
        Coder coder = new Coder();
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfStatus(String status) {
        Coder coder = new Coder();
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfUserId(String userId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfQuestionId(String questionId) {
        Coder coder = new Coder();
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfCoderIdAndCode(String coderId, String code) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setCode(code);
        return remove(coder);
    }
    public int removeOfCoderIdAndTime(String coderId, String time) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setTime(time);
        return remove(coder);
    }
    public int removeOfCoderIdAndStartTime(String coderId, String startTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStartTime(startTime);
        return remove(coder);
    }
    public int removeOfCoderIdAndEndTime(String coderId, String endTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setEndTime(endTime);
        return remove(coder);
    }
    public int removeOfCoderIdAndResult(String coderId, String result) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfCoderIdAndStatus(String coderId, String status) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfCoderIdAndUserId(String coderId, String userId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfCoderIdAndQuestionId(String coderId, String questionId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfCodeAndTime(String code, String time) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setTime(time);
        return remove(coder);
    }
    public int removeOfCodeAndStartTime(String code, String startTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStartTime(startTime);
        return remove(coder);
    }
    public int removeOfCodeAndEndTime(String code, String endTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setEndTime(endTime);
        return remove(coder);
    }
    public int removeOfCodeAndResult(String code, String result) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfCodeAndStatus(String code, String status) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfCodeAndUserId(String code, String userId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfCodeAndQuestionId(String code, String questionId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfTimeAndStartTime(String time, String startTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStartTime(startTime);
        return remove(coder);
    }
    public int removeOfTimeAndEndTime(String time, String endTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setEndTime(endTime);
        return remove(coder);
    }
    public int removeOfTimeAndResult(String time, String result) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfTimeAndStatus(String time, String status) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfTimeAndQuestionId(String time, String questionId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setEndTime(endTime);
        return remove(coder);
    }
    public int removeOfStartTimeAndResult(String startTime, String result) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfStartTimeAndStatus(String startTime, String status) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfStartTimeAndUserId(String startTime, String userId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfStartTimeAndQuestionId(String startTime, String questionId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfEndTimeAndResult(String endTime, String result) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setResult(result);
        return remove(coder);
    }
    public int removeOfEndTimeAndStatus(String endTime, String status) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfEndTimeAndUserId(String endTime, String userId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfEndTimeAndQuestionId(String endTime, String questionId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfResultAndStatus(String result, String status) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setStatus(status);
        return remove(coder);
    }
    public int removeOfResultAndUserId(String result, String userId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfResultAndQuestionId(String result, String questionId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfStatusAndUserId(String status, String userId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setUserId(userId);
        return remove(coder);
    }
    public int removeOfStatusAndQuestionId(String status, String questionId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int removeOfUserIdAndQuestionId(String userId, String questionId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        coder.setQuestionId(questionId);
        return remove(coder);
    }
    public int insert(Coder coder) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(coder, "coder");
    }
    public int insertOfCoderId(String coderId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        return insert(coder);
    }
    public int insertOfCode(String code) {
        Coder coder = new Coder();
        coder.setCode(code);
        return insert(coder);
    }
    public int insertOfTime(String time) {
        Coder coder = new Coder();
        coder.setTime(time);
        return insert(coder);
    }
    public int insertOfStartTime(String startTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        return insert(coder);
    }
    public int insertOfEndTime(String endTime) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        return insert(coder);
    }
    public int insertOfResult(String result) {
        Coder coder = new Coder();
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfStatus(String status) {
        Coder coder = new Coder();
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfUserId(String userId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfQuestionId(String questionId) {
        Coder coder = new Coder();
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfCoderIdAndCode(String coderId, String code) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setCode(code);
        return insert(coder);
    }
    public int insertOfCoderIdAndTime(String coderId, String time) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setTime(time);
        return insert(coder);
    }
    public int insertOfCoderIdAndStartTime(String coderId, String startTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStartTime(startTime);
        return insert(coder);
    }
    public int insertOfCoderIdAndEndTime(String coderId, String endTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setEndTime(endTime);
        return insert(coder);
    }
    public int insertOfCoderIdAndResult(String coderId, String result) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfCoderIdAndStatus(String coderId, String status) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfCoderIdAndUserId(String coderId, String userId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfCoderIdAndQuestionId(String coderId, String questionId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfCodeAndTime(String code, String time) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setTime(time);
        return insert(coder);
    }
    public int insertOfCodeAndStartTime(String code, String startTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStartTime(startTime);
        return insert(coder);
    }
    public int insertOfCodeAndEndTime(String code, String endTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setEndTime(endTime);
        return insert(coder);
    }
    public int insertOfCodeAndResult(String code, String result) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfCodeAndStatus(String code, String status) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfCodeAndUserId(String code, String userId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfCodeAndQuestionId(String code, String questionId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfTimeAndStartTime(String time, String startTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStartTime(startTime);
        return insert(coder);
    }
    public int insertOfTimeAndEndTime(String time, String endTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setEndTime(endTime);
        return insert(coder);
    }
    public int insertOfTimeAndResult(String time, String result) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfTimeAndStatus(String time, String status) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfTimeAndQuestionId(String time, String questionId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setEndTime(endTime);
        return insert(coder);
    }
    public int insertOfStartTimeAndResult(String startTime, String result) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfStartTimeAndStatus(String startTime, String status) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfStartTimeAndUserId(String startTime, String userId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfStartTimeAndQuestionId(String startTime, String questionId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfEndTimeAndResult(String endTime, String result) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setResult(result);
        return insert(coder);
    }
    public int insertOfEndTimeAndStatus(String endTime, String status) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfEndTimeAndUserId(String endTime, String userId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfEndTimeAndQuestionId(String endTime, String questionId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfResultAndStatus(String result, String status) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setStatus(status);
        return insert(coder);
    }
    public int insertOfResultAndUserId(String result, String userId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfResultAndQuestionId(String result, String questionId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfStatusAndUserId(String status, String userId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setUserId(userId);
        return insert(coder);
    }
    public int insertOfStatusAndQuestionId(String status, String questionId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public int insertOfUserIdAndQuestionId(String userId, String questionId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        coder.setQuestionId(questionId);
        return insert(coder);
    }
    public Coder getCoder(Coder coder) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(coder, "coder");
    }
    public Coder getCoderOfCoderId(String coderId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        return getCoder(coder);
    }
    public Coder getCoderOfCode(String code) {
        Coder coder = new Coder();
        coder.setCode(code);
        return getCoder(coder);
    }
    public Coder getCoderOfTime(String time) {
        Coder coder = new Coder();
        coder.setTime(time);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTime(String startTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        return getCoder(coder);
    }
    public Coder getCoderOfEndTime(String endTime) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        return getCoder(coder);
    }
    public Coder getCoderOfResult(String result) {
        Coder coder = new Coder();
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfStatus(String status) {
        Coder coder = new Coder();
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfUserId(String userId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfQuestionId(String questionId) {
        Coder coder = new Coder();
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndCode(String coderId, String code) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setCode(code);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndTime(String coderId, String time) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setTime(time);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndStartTime(String coderId, String startTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStartTime(startTime);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndEndTime(String coderId, String endTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setEndTime(endTime);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndResult(String coderId, String result) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndStatus(String coderId, String status) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndUserId(String coderId, String userId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfCoderIdAndQuestionId(String coderId, String questionId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndTime(String code, String time) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setTime(time);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndStartTime(String code, String startTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStartTime(startTime);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndEndTime(String code, String endTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setEndTime(endTime);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndResult(String code, String result) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndStatus(String code, String status) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndUserId(String code, String userId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfCodeAndQuestionId(String code, String questionId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndStartTime(String time, String startTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStartTime(startTime);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndEndTime(String time, String endTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setEndTime(endTime);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndResult(String time, String result) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndStatus(String time, String status) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndUserId(String time, String userId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfTimeAndQuestionId(String time, String questionId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTimeAndEndTime(String startTime, String endTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setEndTime(endTime);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTimeAndResult(String startTime, String result) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTimeAndStatus(String startTime, String status) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTimeAndUserId(String startTime, String userId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfStartTimeAndQuestionId(String startTime, String questionId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfEndTimeAndResult(String endTime, String result) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setResult(result);
        return getCoder(coder);
    }
    public Coder getCoderOfEndTimeAndStatus(String endTime, String status) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfEndTimeAndUserId(String endTime, String userId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfEndTimeAndQuestionId(String endTime, String questionId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfResultAndStatus(String result, String status) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setStatus(status);
        return getCoder(coder);
    }
    public Coder getCoderOfResultAndUserId(String result, String userId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfResultAndQuestionId(String result, String questionId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfStatusAndUserId(String status, String userId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setUserId(userId);
        return getCoder(coder);
    }
    public Coder getCoderOfStatusAndQuestionId(String status, String questionId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public Coder getCoderOfUserIdAndQuestionId(String userId, String questionId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        coder.setQuestionId(questionId);
        return getCoder(coder);
    }
    public List<Coder> getCoders(Coder coder) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(coder, "coder");
    }
    public List<Coder> getCodersOfCoderId(String coderId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCode(String code) {
        Coder coder = new Coder();
        coder.setCode(code);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTime(String time) {
        Coder coder = new Coder();
        coder.setTime(time);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTime(String startTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfEndTime(String endTime) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfResult(String result) {
        Coder coder = new Coder();
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStatus(String status) {
        Coder coder = new Coder();
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfUserId(String userId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfQuestionId(String questionId) {
        Coder coder = new Coder();
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndCode(String coderId, String code) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setCode(code);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndTime(String coderId, String time) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setTime(time);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndStartTime(String coderId, String startTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStartTime(startTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndEndTime(String coderId, String endTime) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setEndTime(endTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndResult(String coderId, String result) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndStatus(String coderId, String status) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndUserId(String coderId, String userId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCoderIdAndQuestionId(String coderId, String questionId) {
        Coder coder = new Coder();
        coder.setCoderId(coderId);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndTime(String code, String time) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setTime(time);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndStartTime(String code, String startTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStartTime(startTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndEndTime(String code, String endTime) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setEndTime(endTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndResult(String code, String result) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndStatus(String code, String status) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndUserId(String code, String userId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfCodeAndQuestionId(String code, String questionId) {
        Coder coder = new Coder();
        coder.setCode(code);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndStartTime(String time, String startTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStartTime(startTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndEndTime(String time, String endTime) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setEndTime(endTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndResult(String time, String result) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndStatus(String time, String status) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndUserId(String time, String userId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfTimeAndQuestionId(String time, String questionId) {
        Coder coder = new Coder();
        coder.setTime(time);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTimeAndEndTime(String startTime, String endTime) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setEndTime(endTime);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTimeAndResult(String startTime, String result) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTimeAndStatus(String startTime, String status) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTimeAndUserId(String startTime, String userId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStartTimeAndQuestionId(String startTime, String questionId) {
        Coder coder = new Coder();
        coder.setStartTime(startTime);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfEndTimeAndResult(String endTime, String result) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setResult(result);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfEndTimeAndStatus(String endTime, String status) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfEndTimeAndUserId(String endTime, String userId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfEndTimeAndQuestionId(String endTime, String questionId) {
        Coder coder = new Coder();
        coder.setEndTime(endTime);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfResultAndStatus(String result, String status) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setStatus(status);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfResultAndUserId(String result, String userId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfResultAndQuestionId(String result, String questionId) {
        Coder coder = new Coder();
        coder.setResult(result);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStatusAndUserId(String status, String userId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setUserId(userId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfStatusAndQuestionId(String status, String questionId) {
        Coder coder = new Coder();
        coder.setStatus(status);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
    public List<Coder> getCodersOfUserIdAndQuestionId(String userId, String questionId) {
        Coder coder = new Coder();
        coder.setUserId(userId);
        coder.setQuestionId(questionId);
        return getCoders(coder);
    }
}
