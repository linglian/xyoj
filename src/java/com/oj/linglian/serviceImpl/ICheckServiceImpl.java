package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Check;

import com.oj.linglian.dao.ICheckDao;
import com.oj.linglian.daoImpl.ICheckDaoImpl;
import com.oj.linglian.service.ICheckService;

public class ICheckServiceImpl implements ICheckService {
	ICheckDao dao = null;

	public ICheckServiceImpl() {
		dao = new ICheckDaoImpl();
	}
    public int update(Check check, Check keyCheck) {
        return dao.update(check, keyCheck);
    }
    public int updateOfCheckId(Check check, String checkId) {
        return dao.updateOfCheckId(check, checkId);
    }
    public int updateOfInput(Check check, String input) {
        return dao.updateOfInput(check, input);
    }
    public int updateOfOutput(Check check, String output) {
        return dao.updateOfOutput(check, output);
    }
    public int updateOfQuestionId(Check check, String questionId) {
        return dao.updateOfQuestionId(check, questionId);
    }
    public int updateOfCheckIdAndInput(Check check, String checkId, String input) {
        return dao.updateOfCheckIdAndInput(check, checkId, input);
    }
    public int updateOfCheckIdAndOutput(Check check, String checkId, String output) {
        return dao.updateOfCheckIdAndOutput(check, checkId, output);
    }
    public int updateOfCheckIdAndQuestionId(Check check, String checkId, String questionId) {
        return dao.updateOfCheckIdAndQuestionId(check, checkId, questionId);
    }
    public int updateOfInputAndOutput(Check check, String input, String output) {
        return dao.updateOfInputAndOutput(check, input, output);
    }
    public int updateOfInputAndQuestionId(Check check, String input, String questionId) {
        return dao.updateOfInputAndQuestionId(check, input, questionId);
    }
    public int updateOfOutputAndQuestionId(Check check, String output, String questionId) {
        return dao.updateOfOutputAndQuestionId(check, output, questionId);
    }
    public int remove(Check check) {
        return dao.remove(check);
    }
    public int removeOfCheckId(String checkId) {
        return dao.removeOfCheckId(checkId);
    }
    public int removeOfInput(String input) {
        return dao.removeOfInput(input);
    }
    public int removeOfOutput(String output) {
        return dao.removeOfOutput(output);
    }
    public int removeOfQuestionId(String questionId) {
        return dao.removeOfQuestionId(questionId);
    }
    public int removeOfCheckIdAndInput(String checkId, String input) {
        return dao.removeOfCheckIdAndInput(checkId, input);
    }
    public int removeOfCheckIdAndOutput(String checkId, String output) {
        return dao.removeOfCheckIdAndOutput(checkId, output);
    }
    public int removeOfCheckIdAndQuestionId(String checkId, String questionId) {
        return dao.removeOfCheckIdAndQuestionId(checkId, questionId);
    }
    public int removeOfInputAndOutput(String input, String output) {
        return dao.removeOfInputAndOutput(input, output);
    }
    public int removeOfInputAndQuestionId(String input, String questionId) {
        return dao.removeOfInputAndQuestionId(input, questionId);
    }
    public int removeOfOutputAndQuestionId(String output, String questionId) {
        return dao.removeOfOutputAndQuestionId(output, questionId);
    }
    public int insert(Check check) {
        return dao.insert(check);
    }
    public int insertOfCheckId(String checkId) {
        return dao.insertOfCheckId(checkId);
    }
    public int insertOfInput(String input) {
        return dao.insertOfInput(input);
    }
    public int insertOfOutput(String output) {
        return dao.insertOfOutput(output);
    }
    public int insertOfQuestionId(String questionId) {
        return dao.insertOfQuestionId(questionId);
    }
    public int insertOfCheckIdAndInput(String checkId, String input) {
        return dao.insertOfCheckIdAndInput(checkId, input);
    }
    public int insertOfCheckIdAndOutput(String checkId, String output) {
        return dao.insertOfCheckIdAndOutput(checkId, output);
    }
    public int insertOfCheckIdAndQuestionId(String checkId, String questionId) {
        return dao.insertOfCheckIdAndQuestionId(checkId, questionId);
    }
    public int insertOfInputAndOutput(String input, String output) {
        return dao.insertOfInputAndOutput(input, output);
    }
    public int insertOfInputAndQuestionId(String input, String questionId) {
        return dao.insertOfInputAndQuestionId(input, questionId);
    }
    public int insertOfOutputAndQuestionId(String output, String questionId) {
        return dao.insertOfOutputAndQuestionId(output, questionId);
    }
    public Check getCheck(Check check) {
        return dao.getCheck(check);
    }
    public Check getCheckOfCheckId(String checkId) {
        return dao.getCheckOfCheckId(checkId);
    }
    public Check getCheckOfInput(String input) {
        return dao.getCheckOfInput(input);
    }
    public Check getCheckOfOutput(String output) {
        return dao.getCheckOfOutput(output);
    }
    public Check getCheckOfQuestionId(String questionId) {
        return dao.getCheckOfQuestionId(questionId);
    }
    public Check getCheckOfCheckIdAndInput(String checkId, String input) {
        return dao.getCheckOfCheckIdAndInput(checkId, input);
    }
    public Check getCheckOfCheckIdAndOutput(String checkId, String output) {
        return dao.getCheckOfCheckIdAndOutput(checkId, output);
    }
    public Check getCheckOfCheckIdAndQuestionId(String checkId, String questionId) {
        return dao.getCheckOfCheckIdAndQuestionId(checkId, questionId);
    }
    public Check getCheckOfInputAndOutput(String input, String output) {
        return dao.getCheckOfInputAndOutput(input, output);
    }
    public Check getCheckOfInputAndQuestionId(String input, String questionId) {
        return dao.getCheckOfInputAndQuestionId(input, questionId);
    }
    public Check getCheckOfOutputAndQuestionId(String output, String questionId) {
        return dao.getCheckOfOutputAndQuestionId(output, questionId);
    }
    public List<Check> getChecks(Check check) {
        return dao.getChecks(check);
    }
    public List<Check> getChecksOfCheckId(String checkId) {
        return dao.getChecksOfCheckId(checkId);
    }
    public List<Check> getChecksOfInput(String input) {
        return dao.getChecksOfInput(input);
    }
    public List<Check> getChecksOfOutput(String output) {
        return dao.getChecksOfOutput(output);
    }
    public List<Check> getChecksOfQuestionId(String questionId) {
        return dao.getChecksOfQuestionId(questionId);
    }
    public List<Check> getChecksOfCheckIdAndInput(String checkId, String input) {
        return dao.getChecksOfCheckIdAndInput(checkId, input);
    }
    public List<Check> getChecksOfCheckIdAndOutput(String checkId, String output) {
        return dao.getChecksOfCheckIdAndOutput(checkId, output);
    }
    public List<Check> getChecksOfCheckIdAndQuestionId(String checkId, String questionId) {
        return dao.getChecksOfCheckIdAndQuestionId(checkId, questionId);
    }
    public List<Check> getChecksOfInputAndOutput(String input, String output) {
        return dao.getChecksOfInputAndOutput(input, output);
    }
    public List<Check> getChecksOfInputAndQuestionId(String input, String questionId) {
        return dao.getChecksOfInputAndQuestionId(input, questionId);
    }
    public List<Check> getChecksOfOutputAndQuestionId(String output, String questionId) {
        return dao.getChecksOfOutputAndQuestionId(output, questionId);
    }
}
