package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Coder;

import com.oj.linglian.dao.ICoderDao;
import com.oj.linglian.daoImpl.ICoderDaoImpl;
import com.oj.linglian.service.ICoderService;

public class ICoderServiceImpl implements ICoderService {
	ICoderDao dao = null;

	public ICoderServiceImpl() {
		dao = new ICoderDaoImpl();
	}
    public int update(Coder coder, Coder keyCoder) {
        return dao.update(coder, keyCoder);
    }
    public int updateOfCoderId(Coder coder, String coderId) {
        return dao.updateOfCoderId(coder, coderId);
    }
    public int updateOfCode(Coder coder, String code) {
        return dao.updateOfCode(coder, code);
    }
    public int updateOfTime(Coder coder, String time) {
        return dao.updateOfTime(coder, time);
    }
    public int updateOfStartTime(Coder coder, String startTime) {
        return dao.updateOfStartTime(coder, startTime);
    }
    public int updateOfEndTime(Coder coder, String endTime) {
        return dao.updateOfEndTime(coder, endTime);
    }
    public int updateOfResult(Coder coder, String result) {
        return dao.updateOfResult(coder, result);
    }
    public int updateOfStatus(Coder coder, String status) {
        return dao.updateOfStatus(coder, status);
    }
    public int updateOfUserId(Coder coder, String userId) {
        return dao.updateOfUserId(coder, userId);
    }
    public int updateOfQuestionId(Coder coder, String questionId) {
        return dao.updateOfQuestionId(coder, questionId);
    }
    public int updateOfCoderIdAndCode(Coder coder, String coderId, String code) {
        return dao.updateOfCoderIdAndCode(coder, coderId, code);
    }
    public int updateOfCoderIdAndTime(Coder coder, String coderId, String time) {
        return dao.updateOfCoderIdAndTime(coder, coderId, time);
    }
    public int updateOfCoderIdAndStartTime(Coder coder, String coderId, String startTime) {
        return dao.updateOfCoderIdAndStartTime(coder, coderId, startTime);
    }
    public int updateOfCoderIdAndEndTime(Coder coder, String coderId, String endTime) {
        return dao.updateOfCoderIdAndEndTime(coder, coderId, endTime);
    }
    public int updateOfCoderIdAndResult(Coder coder, String coderId, String result) {
        return dao.updateOfCoderIdAndResult(coder, coderId, result);
    }
    public int updateOfCoderIdAndStatus(Coder coder, String coderId, String status) {
        return dao.updateOfCoderIdAndStatus(coder, coderId, status);
    }
    public int updateOfCoderIdAndUserId(Coder coder, String coderId, String userId) {
        return dao.updateOfCoderIdAndUserId(coder, coderId, userId);
    }
    public int updateOfCoderIdAndQuestionId(Coder coder, String coderId, String questionId) {
        return dao.updateOfCoderIdAndQuestionId(coder, coderId, questionId);
    }
    public int updateOfCodeAndTime(Coder coder, String code, String time) {
        return dao.updateOfCodeAndTime(coder, code, time);
    }
    public int updateOfCodeAndStartTime(Coder coder, String code, String startTime) {
        return dao.updateOfCodeAndStartTime(coder, code, startTime);
    }
    public int updateOfCodeAndEndTime(Coder coder, String code, String endTime) {
        return dao.updateOfCodeAndEndTime(coder, code, endTime);
    }
    public int updateOfCodeAndResult(Coder coder, String code, String result) {
        return dao.updateOfCodeAndResult(coder, code, result);
    }
    public int updateOfCodeAndStatus(Coder coder, String code, String status) {
        return dao.updateOfCodeAndStatus(coder, code, status);
    }
    public int updateOfCodeAndUserId(Coder coder, String code, String userId) {
        return dao.updateOfCodeAndUserId(coder, code, userId);
    }
    public int updateOfCodeAndQuestionId(Coder coder, String code, String questionId) {
        return dao.updateOfCodeAndQuestionId(coder, code, questionId);
    }
    public int updateOfTimeAndStartTime(Coder coder, String time, String startTime) {
        return dao.updateOfTimeAndStartTime(coder, time, startTime);
    }
    public int updateOfTimeAndEndTime(Coder coder, String time, String endTime) {
        return dao.updateOfTimeAndEndTime(coder, time, endTime);
    }
    public int updateOfTimeAndResult(Coder coder, String time, String result) {
        return dao.updateOfTimeAndResult(coder, time, result);
    }
    public int updateOfTimeAndStatus(Coder coder, String time, String status) {
        return dao.updateOfTimeAndStatus(coder, time, status);
    }
    public int updateOfTimeAndUserId(Coder coder, String time, String userId) {
        return dao.updateOfTimeAndUserId(coder, time, userId);
    }
    public int updateOfTimeAndQuestionId(Coder coder, String time, String questionId) {
        return dao.updateOfTimeAndQuestionId(coder, time, questionId);
    }
    public int updateOfStartTimeAndEndTime(Coder coder, String startTime, String endTime) {
        return dao.updateOfStartTimeAndEndTime(coder, startTime, endTime);
    }
    public int updateOfStartTimeAndResult(Coder coder, String startTime, String result) {
        return dao.updateOfStartTimeAndResult(coder, startTime, result);
    }
    public int updateOfStartTimeAndStatus(Coder coder, String startTime, String status) {
        return dao.updateOfStartTimeAndStatus(coder, startTime, status);
    }
    public int updateOfStartTimeAndUserId(Coder coder, String startTime, String userId) {
        return dao.updateOfStartTimeAndUserId(coder, startTime, userId);
    }
    public int updateOfStartTimeAndQuestionId(Coder coder, String startTime, String questionId) {
        return dao.updateOfStartTimeAndQuestionId(coder, startTime, questionId);
    }
    public int updateOfEndTimeAndResult(Coder coder, String endTime, String result) {
        return dao.updateOfEndTimeAndResult(coder, endTime, result);
    }
    public int updateOfEndTimeAndStatus(Coder coder, String endTime, String status) {
        return dao.updateOfEndTimeAndStatus(coder, endTime, status);
    }
    public int updateOfEndTimeAndUserId(Coder coder, String endTime, String userId) {
        return dao.updateOfEndTimeAndUserId(coder, endTime, userId);
    }
    public int updateOfEndTimeAndQuestionId(Coder coder, String endTime, String questionId) {
        return dao.updateOfEndTimeAndQuestionId(coder, endTime, questionId);
    }
    public int updateOfResultAndStatus(Coder coder, String result, String status) {
        return dao.updateOfResultAndStatus(coder, result, status);
    }
    public int updateOfResultAndUserId(Coder coder, String result, String userId) {
        return dao.updateOfResultAndUserId(coder, result, userId);
    }
    public int updateOfResultAndQuestionId(Coder coder, String result, String questionId) {
        return dao.updateOfResultAndQuestionId(coder, result, questionId);
    }
    public int updateOfStatusAndUserId(Coder coder, String status, String userId) {
        return dao.updateOfStatusAndUserId(coder, status, userId);
    }
    public int updateOfStatusAndQuestionId(Coder coder, String status, String questionId) {
        return dao.updateOfStatusAndQuestionId(coder, status, questionId);
    }
    public int updateOfUserIdAndQuestionId(Coder coder, String userId, String questionId) {
        return dao.updateOfUserIdAndQuestionId(coder, userId, questionId);
    }
    public int remove(Coder coder) {
        return dao.remove(coder);
    }
    public int removeOfCoderId(String coderId) {
        return dao.removeOfCoderId(coderId);
    }
    public int removeOfCode(String code) {
        return dao.removeOfCode(code);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfStartTime(String startTime) {
        return dao.removeOfStartTime(startTime);
    }
    public int removeOfEndTime(String endTime) {
        return dao.removeOfEndTime(endTime);
    }
    public int removeOfResult(String result) {
        return dao.removeOfResult(result);
    }
    public int removeOfStatus(String status) {
        return dao.removeOfStatus(status);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfQuestionId(String questionId) {
        return dao.removeOfQuestionId(questionId);
    }
    public int removeOfCoderIdAndCode(String coderId, String code) {
        return dao.removeOfCoderIdAndCode(coderId, code);
    }
    public int removeOfCoderIdAndTime(String coderId, String time) {
        return dao.removeOfCoderIdAndTime(coderId, time);
    }
    public int removeOfCoderIdAndStartTime(String coderId, String startTime) {
        return dao.removeOfCoderIdAndStartTime(coderId, startTime);
    }
    public int removeOfCoderIdAndEndTime(String coderId, String endTime) {
        return dao.removeOfCoderIdAndEndTime(coderId, endTime);
    }
    public int removeOfCoderIdAndResult(String coderId, String result) {
        return dao.removeOfCoderIdAndResult(coderId, result);
    }
    public int removeOfCoderIdAndStatus(String coderId, String status) {
        return dao.removeOfCoderIdAndStatus(coderId, status);
    }
    public int removeOfCoderIdAndUserId(String coderId, String userId) {
        return dao.removeOfCoderIdAndUserId(coderId, userId);
    }
    public int removeOfCoderIdAndQuestionId(String coderId, String questionId) {
        return dao.removeOfCoderIdAndQuestionId(coderId, questionId);
    }
    public int removeOfCodeAndTime(String code, String time) {
        return dao.removeOfCodeAndTime(code, time);
    }
    public int removeOfCodeAndStartTime(String code, String startTime) {
        return dao.removeOfCodeAndStartTime(code, startTime);
    }
    public int removeOfCodeAndEndTime(String code, String endTime) {
        return dao.removeOfCodeAndEndTime(code, endTime);
    }
    public int removeOfCodeAndResult(String code, String result) {
        return dao.removeOfCodeAndResult(code, result);
    }
    public int removeOfCodeAndStatus(String code, String status) {
        return dao.removeOfCodeAndStatus(code, status);
    }
    public int removeOfCodeAndUserId(String code, String userId) {
        return dao.removeOfCodeAndUserId(code, userId);
    }
    public int removeOfCodeAndQuestionId(String code, String questionId) {
        return dao.removeOfCodeAndQuestionId(code, questionId);
    }
    public int removeOfTimeAndStartTime(String time, String startTime) {
        return dao.removeOfTimeAndStartTime(time, startTime);
    }
    public int removeOfTimeAndEndTime(String time, String endTime) {
        return dao.removeOfTimeAndEndTime(time, endTime);
    }
    public int removeOfTimeAndResult(String time, String result) {
        return dao.removeOfTimeAndResult(time, result);
    }
    public int removeOfTimeAndStatus(String time, String status) {
        return dao.removeOfTimeAndStatus(time, status);
    }
    public int removeOfTimeAndUserId(String time, String userId) {
        return dao.removeOfTimeAndUserId(time, userId);
    }
    public int removeOfTimeAndQuestionId(String time, String questionId) {
        return dao.removeOfTimeAndQuestionId(time, questionId);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.removeOfStartTimeAndEndTime(startTime, endTime);
    }
    public int removeOfStartTimeAndResult(String startTime, String result) {
        return dao.removeOfStartTimeAndResult(startTime, result);
    }
    public int removeOfStartTimeAndStatus(String startTime, String status) {
        return dao.removeOfStartTimeAndStatus(startTime, status);
    }
    public int removeOfStartTimeAndUserId(String startTime, String userId) {
        return dao.removeOfStartTimeAndUserId(startTime, userId);
    }
    public int removeOfStartTimeAndQuestionId(String startTime, String questionId) {
        return dao.removeOfStartTimeAndQuestionId(startTime, questionId);
    }
    public int removeOfEndTimeAndResult(String endTime, String result) {
        return dao.removeOfEndTimeAndResult(endTime, result);
    }
    public int removeOfEndTimeAndStatus(String endTime, String status) {
        return dao.removeOfEndTimeAndStatus(endTime, status);
    }
    public int removeOfEndTimeAndUserId(String endTime, String userId) {
        return dao.removeOfEndTimeAndUserId(endTime, userId);
    }
    public int removeOfEndTimeAndQuestionId(String endTime, String questionId) {
        return dao.removeOfEndTimeAndQuestionId(endTime, questionId);
    }
    public int removeOfResultAndStatus(String result, String status) {
        return dao.removeOfResultAndStatus(result, status);
    }
    public int removeOfResultAndUserId(String result, String userId) {
        return dao.removeOfResultAndUserId(result, userId);
    }
    public int removeOfResultAndQuestionId(String result, String questionId) {
        return dao.removeOfResultAndQuestionId(result, questionId);
    }
    public int removeOfStatusAndUserId(String status, String userId) {
        return dao.removeOfStatusAndUserId(status, userId);
    }
    public int removeOfStatusAndQuestionId(String status, String questionId) {
        return dao.removeOfStatusAndQuestionId(status, questionId);
    }
    public int removeOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.removeOfUserIdAndQuestionId(userId, questionId);
    }
    public int insert(Coder coder) {
        return dao.insert(coder);
    }
    public int insertOfCoderId(String coderId) {
        return dao.insertOfCoderId(coderId);
    }
    public int insertOfCode(String code) {
        return dao.insertOfCode(code);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfStartTime(String startTime) {
        return dao.insertOfStartTime(startTime);
    }
    public int insertOfEndTime(String endTime) {
        return dao.insertOfEndTime(endTime);
    }
    public int insertOfResult(String result) {
        return dao.insertOfResult(result);
    }
    public int insertOfStatus(String status) {
        return dao.insertOfStatus(status);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfQuestionId(String questionId) {
        return dao.insertOfQuestionId(questionId);
    }
    public int insertOfCoderIdAndCode(String coderId, String code) {
        return dao.insertOfCoderIdAndCode(coderId, code);
    }
    public int insertOfCoderIdAndTime(String coderId, String time) {
        return dao.insertOfCoderIdAndTime(coderId, time);
    }
    public int insertOfCoderIdAndStartTime(String coderId, String startTime) {
        return dao.insertOfCoderIdAndStartTime(coderId, startTime);
    }
    public int insertOfCoderIdAndEndTime(String coderId, String endTime) {
        return dao.insertOfCoderIdAndEndTime(coderId, endTime);
    }
    public int insertOfCoderIdAndResult(String coderId, String result) {
        return dao.insertOfCoderIdAndResult(coderId, result);
    }
    public int insertOfCoderIdAndStatus(String coderId, String status) {
        return dao.insertOfCoderIdAndStatus(coderId, status);
    }
    public int insertOfCoderIdAndUserId(String coderId, String userId) {
        return dao.insertOfCoderIdAndUserId(coderId, userId);
    }
    public int insertOfCoderIdAndQuestionId(String coderId, String questionId) {
        return dao.insertOfCoderIdAndQuestionId(coderId, questionId);
    }
    public int insertOfCodeAndTime(String code, String time) {
        return dao.insertOfCodeAndTime(code, time);
    }
    public int insertOfCodeAndStartTime(String code, String startTime) {
        return dao.insertOfCodeAndStartTime(code, startTime);
    }
    public int insertOfCodeAndEndTime(String code, String endTime) {
        return dao.insertOfCodeAndEndTime(code, endTime);
    }
    public int insertOfCodeAndResult(String code, String result) {
        return dao.insertOfCodeAndResult(code, result);
    }
    public int insertOfCodeAndStatus(String code, String status) {
        return dao.insertOfCodeAndStatus(code, status);
    }
    public int insertOfCodeAndUserId(String code, String userId) {
        return dao.insertOfCodeAndUserId(code, userId);
    }
    public int insertOfCodeAndQuestionId(String code, String questionId) {
        return dao.insertOfCodeAndQuestionId(code, questionId);
    }
    public int insertOfTimeAndStartTime(String time, String startTime) {
        return dao.insertOfTimeAndStartTime(time, startTime);
    }
    public int insertOfTimeAndEndTime(String time, String endTime) {
        return dao.insertOfTimeAndEndTime(time, endTime);
    }
    public int insertOfTimeAndResult(String time, String result) {
        return dao.insertOfTimeAndResult(time, result);
    }
    public int insertOfTimeAndStatus(String time, String status) {
        return dao.insertOfTimeAndStatus(time, status);
    }
    public int insertOfTimeAndUserId(String time, String userId) {
        return dao.insertOfTimeAndUserId(time, userId);
    }
    public int insertOfTimeAndQuestionId(String time, String questionId) {
        return dao.insertOfTimeAndQuestionId(time, questionId);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.insertOfStartTimeAndEndTime(startTime, endTime);
    }
    public int insertOfStartTimeAndResult(String startTime, String result) {
        return dao.insertOfStartTimeAndResult(startTime, result);
    }
    public int insertOfStartTimeAndStatus(String startTime, String status) {
        return dao.insertOfStartTimeAndStatus(startTime, status);
    }
    public int insertOfStartTimeAndUserId(String startTime, String userId) {
        return dao.insertOfStartTimeAndUserId(startTime, userId);
    }
    public int insertOfStartTimeAndQuestionId(String startTime, String questionId) {
        return dao.insertOfStartTimeAndQuestionId(startTime, questionId);
    }
    public int insertOfEndTimeAndResult(String endTime, String result) {
        return dao.insertOfEndTimeAndResult(endTime, result);
    }
    public int insertOfEndTimeAndStatus(String endTime, String status) {
        return dao.insertOfEndTimeAndStatus(endTime, status);
    }
    public int insertOfEndTimeAndUserId(String endTime, String userId) {
        return dao.insertOfEndTimeAndUserId(endTime, userId);
    }
    public int insertOfEndTimeAndQuestionId(String endTime, String questionId) {
        return dao.insertOfEndTimeAndQuestionId(endTime, questionId);
    }
    public int insertOfResultAndStatus(String result, String status) {
        return dao.insertOfResultAndStatus(result, status);
    }
    public int insertOfResultAndUserId(String result, String userId) {
        return dao.insertOfResultAndUserId(result, userId);
    }
    public int insertOfResultAndQuestionId(String result, String questionId) {
        return dao.insertOfResultAndQuestionId(result, questionId);
    }
    public int insertOfStatusAndUserId(String status, String userId) {
        return dao.insertOfStatusAndUserId(status, userId);
    }
    public int insertOfStatusAndQuestionId(String status, String questionId) {
        return dao.insertOfStatusAndQuestionId(status, questionId);
    }
    public int insertOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.insertOfUserIdAndQuestionId(userId, questionId);
    }
    public Coder getCoder(Coder coder) {
        return dao.getCoder(coder);
    }
    public Coder getCoderOfCoderId(String coderId) {
        return dao.getCoderOfCoderId(coderId);
    }
    public Coder getCoderOfCode(String code) {
        return dao.getCoderOfCode(code);
    }
    public Coder getCoderOfTime(String time) {
        return dao.getCoderOfTime(time);
    }
    public Coder getCoderOfStartTime(String startTime) {
        return dao.getCoderOfStartTime(startTime);
    }
    public Coder getCoderOfEndTime(String endTime) {
        return dao.getCoderOfEndTime(endTime);
    }
    public Coder getCoderOfResult(String result) {
        return dao.getCoderOfResult(result);
    }
    public Coder getCoderOfStatus(String status) {
        return dao.getCoderOfStatus(status);
    }
    public Coder getCoderOfUserId(String userId) {
        return dao.getCoderOfUserId(userId);
    }
    public Coder getCoderOfQuestionId(String questionId) {
        return dao.getCoderOfQuestionId(questionId);
    }
    public Coder getCoderOfCoderIdAndCode(String coderId, String code) {
        return dao.getCoderOfCoderIdAndCode(coderId, code);
    }
    public Coder getCoderOfCoderIdAndTime(String coderId, String time) {
        return dao.getCoderOfCoderIdAndTime(coderId, time);
    }
    public Coder getCoderOfCoderIdAndStartTime(String coderId, String startTime) {
        return dao.getCoderOfCoderIdAndStartTime(coderId, startTime);
    }
    public Coder getCoderOfCoderIdAndEndTime(String coderId, String endTime) {
        return dao.getCoderOfCoderIdAndEndTime(coderId, endTime);
    }
    public Coder getCoderOfCoderIdAndResult(String coderId, String result) {
        return dao.getCoderOfCoderIdAndResult(coderId, result);
    }
    public Coder getCoderOfCoderIdAndStatus(String coderId, String status) {
        return dao.getCoderOfCoderIdAndStatus(coderId, status);
    }
    public Coder getCoderOfCoderIdAndUserId(String coderId, String userId) {
        return dao.getCoderOfCoderIdAndUserId(coderId, userId);
    }
    public Coder getCoderOfCoderIdAndQuestionId(String coderId, String questionId) {
        return dao.getCoderOfCoderIdAndQuestionId(coderId, questionId);
    }
    public Coder getCoderOfCodeAndTime(String code, String time) {
        return dao.getCoderOfCodeAndTime(code, time);
    }
    public Coder getCoderOfCodeAndStartTime(String code, String startTime) {
        return dao.getCoderOfCodeAndStartTime(code, startTime);
    }
    public Coder getCoderOfCodeAndEndTime(String code, String endTime) {
        return dao.getCoderOfCodeAndEndTime(code, endTime);
    }
    public Coder getCoderOfCodeAndResult(String code, String result) {
        return dao.getCoderOfCodeAndResult(code, result);
    }
    public Coder getCoderOfCodeAndStatus(String code, String status) {
        return dao.getCoderOfCodeAndStatus(code, status);
    }
    public Coder getCoderOfCodeAndUserId(String code, String userId) {
        return dao.getCoderOfCodeAndUserId(code, userId);
    }
    public Coder getCoderOfCodeAndQuestionId(String code, String questionId) {
        return dao.getCoderOfCodeAndQuestionId(code, questionId);
    }
    public Coder getCoderOfTimeAndStartTime(String time, String startTime) {
        return dao.getCoderOfTimeAndStartTime(time, startTime);
    }
    public Coder getCoderOfTimeAndEndTime(String time, String endTime) {
        return dao.getCoderOfTimeAndEndTime(time, endTime);
    }
    public Coder getCoderOfTimeAndResult(String time, String result) {
        return dao.getCoderOfTimeAndResult(time, result);
    }
    public Coder getCoderOfTimeAndStatus(String time, String status) {
        return dao.getCoderOfTimeAndStatus(time, status);
    }
    public Coder getCoderOfTimeAndUserId(String time, String userId) {
        return dao.getCoderOfTimeAndUserId(time, userId);
    }
    public Coder getCoderOfTimeAndQuestionId(String time, String questionId) {
        return dao.getCoderOfTimeAndQuestionId(time, questionId);
    }
    public Coder getCoderOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getCoderOfStartTimeAndEndTime(startTime, endTime);
    }
    public Coder getCoderOfStartTimeAndResult(String startTime, String result) {
        return dao.getCoderOfStartTimeAndResult(startTime, result);
    }
    public Coder getCoderOfStartTimeAndStatus(String startTime, String status) {
        return dao.getCoderOfStartTimeAndStatus(startTime, status);
    }
    public Coder getCoderOfStartTimeAndUserId(String startTime, String userId) {
        return dao.getCoderOfStartTimeAndUserId(startTime, userId);
    }
    public Coder getCoderOfStartTimeAndQuestionId(String startTime, String questionId) {
        return dao.getCoderOfStartTimeAndQuestionId(startTime, questionId);
    }
    public Coder getCoderOfEndTimeAndResult(String endTime, String result) {
        return dao.getCoderOfEndTimeAndResult(endTime, result);
    }
    public Coder getCoderOfEndTimeAndStatus(String endTime, String status) {
        return dao.getCoderOfEndTimeAndStatus(endTime, status);
    }
    public Coder getCoderOfEndTimeAndUserId(String endTime, String userId) {
        return dao.getCoderOfEndTimeAndUserId(endTime, userId);
    }
    public Coder getCoderOfEndTimeAndQuestionId(String endTime, String questionId) {
        return dao.getCoderOfEndTimeAndQuestionId(endTime, questionId);
    }
    public Coder getCoderOfResultAndStatus(String result, String status) {
        return dao.getCoderOfResultAndStatus(result, status);
    }
    public Coder getCoderOfResultAndUserId(String result, String userId) {
        return dao.getCoderOfResultAndUserId(result, userId);
    }
    public Coder getCoderOfResultAndQuestionId(String result, String questionId) {
        return dao.getCoderOfResultAndQuestionId(result, questionId);
    }
    public Coder getCoderOfStatusAndUserId(String status, String userId) {
        return dao.getCoderOfStatusAndUserId(status, userId);
    }
    public Coder getCoderOfStatusAndQuestionId(String status, String questionId) {
        return dao.getCoderOfStatusAndQuestionId(status, questionId);
    }
    public Coder getCoderOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.getCoderOfUserIdAndQuestionId(userId, questionId);
    }
    public List<Coder> getCoders(Coder coder) {
        return dao.getCoders(coder);
    }
    public List<Coder> getCodersOfCoderId(String coderId) {
        return dao.getCodersOfCoderId(coderId);
    }
    public List<Coder> getCodersOfCode(String code) {
        return dao.getCodersOfCode(code);
    }
    public List<Coder> getCodersOfTime(String time) {
        return dao.getCodersOfTime(time);
    }
    public List<Coder> getCodersOfStartTime(String startTime) {
        return dao.getCodersOfStartTime(startTime);
    }
    public List<Coder> getCodersOfEndTime(String endTime) {
        return dao.getCodersOfEndTime(endTime);
    }
    public List<Coder> getCodersOfResult(String result) {
        return dao.getCodersOfResult(result);
    }
    public List<Coder> getCodersOfStatus(String status) {
        return dao.getCodersOfStatus(status);
    }
    public List<Coder> getCodersOfUserId(String userId) {
        return dao.getCodersOfUserId(userId);
    }
    public List<Coder> getCodersOfQuestionId(String questionId) {
        return dao.getCodersOfQuestionId(questionId);
    }
    public List<Coder> getCodersOfCoderIdAndCode(String coderId, String code) {
        return dao.getCodersOfCoderIdAndCode(coderId, code);
    }
    public List<Coder> getCodersOfCoderIdAndTime(String coderId, String time) {
        return dao.getCodersOfCoderIdAndTime(coderId, time);
    }
    public List<Coder> getCodersOfCoderIdAndStartTime(String coderId, String startTime) {
        return dao.getCodersOfCoderIdAndStartTime(coderId, startTime);
    }
    public List<Coder> getCodersOfCoderIdAndEndTime(String coderId, String endTime) {
        return dao.getCodersOfCoderIdAndEndTime(coderId, endTime);
    }
    public List<Coder> getCodersOfCoderIdAndResult(String coderId, String result) {
        return dao.getCodersOfCoderIdAndResult(coderId, result);
    }
    public List<Coder> getCodersOfCoderIdAndStatus(String coderId, String status) {
        return dao.getCodersOfCoderIdAndStatus(coderId, status);
    }
    public List<Coder> getCodersOfCoderIdAndUserId(String coderId, String userId) {
        return dao.getCodersOfCoderIdAndUserId(coderId, userId);
    }
    public List<Coder> getCodersOfCoderIdAndQuestionId(String coderId, String questionId) {
        return dao.getCodersOfCoderIdAndQuestionId(coderId, questionId);
    }
    public List<Coder> getCodersOfCodeAndTime(String code, String time) {
        return dao.getCodersOfCodeAndTime(code, time);
    }
    public List<Coder> getCodersOfCodeAndStartTime(String code, String startTime) {
        return dao.getCodersOfCodeAndStartTime(code, startTime);
    }
    public List<Coder> getCodersOfCodeAndEndTime(String code, String endTime) {
        return dao.getCodersOfCodeAndEndTime(code, endTime);
    }
    public List<Coder> getCodersOfCodeAndResult(String code, String result) {
        return dao.getCodersOfCodeAndResult(code, result);
    }
    public List<Coder> getCodersOfCodeAndStatus(String code, String status) {
        return dao.getCodersOfCodeAndStatus(code, status);
    }
    public List<Coder> getCodersOfCodeAndUserId(String code, String userId) {
        return dao.getCodersOfCodeAndUserId(code, userId);
    }
    public List<Coder> getCodersOfCodeAndQuestionId(String code, String questionId) {
        return dao.getCodersOfCodeAndQuestionId(code, questionId);
    }
    public List<Coder> getCodersOfTimeAndStartTime(String time, String startTime) {
        return dao.getCodersOfTimeAndStartTime(time, startTime);
    }
    public List<Coder> getCodersOfTimeAndEndTime(String time, String endTime) {
        return dao.getCodersOfTimeAndEndTime(time, endTime);
    }
    public List<Coder> getCodersOfTimeAndResult(String time, String result) {
        return dao.getCodersOfTimeAndResult(time, result);
    }
    public List<Coder> getCodersOfTimeAndStatus(String time, String status) {
        return dao.getCodersOfTimeAndStatus(time, status);
    }
    public List<Coder> getCodersOfTimeAndUserId(String time, String userId) {
        return dao.getCodersOfTimeAndUserId(time, userId);
    }
    public List<Coder> getCodersOfTimeAndQuestionId(String time, String questionId) {
        return dao.getCodersOfTimeAndQuestionId(time, questionId);
    }
    public List<Coder> getCodersOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getCodersOfStartTimeAndEndTime(startTime, endTime);
    }
    public List<Coder> getCodersOfStartTimeAndResult(String startTime, String result) {
        return dao.getCodersOfStartTimeAndResult(startTime, result);
    }
    public List<Coder> getCodersOfStartTimeAndStatus(String startTime, String status) {
        return dao.getCodersOfStartTimeAndStatus(startTime, status);
    }
    public List<Coder> getCodersOfStartTimeAndUserId(String startTime, String userId) {
        return dao.getCodersOfStartTimeAndUserId(startTime, userId);
    }
    public List<Coder> getCodersOfStartTimeAndQuestionId(String startTime, String questionId) {
        return dao.getCodersOfStartTimeAndQuestionId(startTime, questionId);
    }
    public List<Coder> getCodersOfEndTimeAndResult(String endTime, String result) {
        return dao.getCodersOfEndTimeAndResult(endTime, result);
    }
    public List<Coder> getCodersOfEndTimeAndStatus(String endTime, String status) {
        return dao.getCodersOfEndTimeAndStatus(endTime, status);
    }
    public List<Coder> getCodersOfEndTimeAndUserId(String endTime, String userId) {
        return dao.getCodersOfEndTimeAndUserId(endTime, userId);
    }
    public List<Coder> getCodersOfEndTimeAndQuestionId(String endTime, String questionId) {
        return dao.getCodersOfEndTimeAndQuestionId(endTime, questionId);
    }
    public List<Coder> getCodersOfResultAndStatus(String result, String status) {
        return dao.getCodersOfResultAndStatus(result, status);
    }
    public List<Coder> getCodersOfResultAndUserId(String result, String userId) {
        return dao.getCodersOfResultAndUserId(result, userId);
    }
    public List<Coder> getCodersOfResultAndQuestionId(String result, String questionId) {
        return dao.getCodersOfResultAndQuestionId(result, questionId);
    }
    public List<Coder> getCodersOfStatusAndUserId(String status, String userId) {
        return dao.getCodersOfStatusAndUserId(status, userId);
    }
    public List<Coder> getCodersOfStatusAndQuestionId(String status, String questionId) {
        return dao.getCodersOfStatusAndQuestionId(status, questionId);
    }
    public List<Coder> getCodersOfUserIdAndQuestionId(String userId, String questionId) {
        return dao.getCodersOfUserIdAndQuestionId(userId, questionId);
    }
}
