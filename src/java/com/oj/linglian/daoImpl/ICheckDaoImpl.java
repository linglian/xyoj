package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Check;

import com.oj.linglian.dao.ICheckDao;
import db.DBMan;

public class ICheckDaoImpl implements ICheckDao {
    public int update(Check check, Check keyCheck) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(check, keyCheck, "check");
    }
    public int updateOfCheckId(Check check, String checkId) {
        Check kCheck = new Check();
        kCheck.setCheckId(checkId);
        return update(check, kCheck);
    }
    public int updateOfInput(Check check, String input) {
        Check kCheck = new Check();
        kCheck.setInput(input);
        return update(check, kCheck);
    }
    public int updateOfOutput(Check check, String output) {
        Check kCheck = new Check();
        kCheck.setOutput(output);
        return update(check, kCheck);
    }
    public int updateOfQuestionId(Check check, String questionId) {
        Check kCheck = new Check();
        kCheck.setQuestionId(questionId);
        return update(check, kCheck);
    }
    public int updateOfCheckIdAndInput(Check check, String checkId, String input) {
        Check kCheck = new Check();
        kCheck.setCheckId(checkId);
        kCheck.setInput(input);
        return update(check, kCheck);
    }
    public int updateOfCheckIdAndOutput(Check check, String checkId, String output) {
        Check kCheck = new Check();
        kCheck.setCheckId(checkId);
        kCheck.setOutput(output);
        return update(check, kCheck);
    }
    public int updateOfCheckIdAndQuestionId(Check check, String checkId, String questionId) {
        Check kCheck = new Check();
        kCheck.setCheckId(checkId);
        kCheck.setQuestionId(questionId);
        return update(check, kCheck);
    }
    public int updateOfInputAndOutput(Check check, String input, String output) {
        Check kCheck = new Check();
        kCheck.setInput(input);
        kCheck.setOutput(output);
        return update(check, kCheck);
    }
    public int updateOfInputAndQuestionId(Check check, String input, String questionId) {
        Check kCheck = new Check();
        kCheck.setInput(input);
        kCheck.setQuestionId(questionId);
        return update(check, kCheck);
    }
    public int updateOfOutputAndQuestionId(Check check, String output, String questionId) {
        Check kCheck = new Check();
        kCheck.setOutput(output);
        kCheck.setQuestionId(questionId);
        return update(check, kCheck);
    }
    public int remove(Check check) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(check, "check");
    }
    public int removeOfCheckId(String checkId) {
        Check check = new Check();
        check.setCheckId(checkId);
        return remove(check);
    }
    public int removeOfInput(String input) {
        Check check = new Check();
        check.setInput(input);
        return remove(check);
    }
    public int removeOfOutput(String output) {
        Check check = new Check();
        check.setOutput(output);
        return remove(check);
    }
    public int removeOfQuestionId(String questionId) {
        Check check = new Check();
        check.setQuestionId(questionId);
        return remove(check);
    }
    public int removeOfCheckIdAndInput(String checkId, String input) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setInput(input);
        return remove(check);
    }
    public int removeOfCheckIdAndOutput(String checkId, String output) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setOutput(output);
        return remove(check);
    }
    public int removeOfCheckIdAndQuestionId(String checkId, String questionId) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setQuestionId(questionId);
        return remove(check);
    }
    public int removeOfInputAndOutput(String input, String output) {
        Check check = new Check();
        check.setInput(input);
        check.setOutput(output);
        return remove(check);
    }
    public int removeOfInputAndQuestionId(String input, String questionId) {
        Check check = new Check();
        check.setInput(input);
        check.setQuestionId(questionId);
        return remove(check);
    }
    public int removeOfOutputAndQuestionId(String output, String questionId) {
        Check check = new Check();
        check.setOutput(output);
        check.setQuestionId(questionId);
        return remove(check);
    }
    public int insert(Check check) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(check, "check");
    }
    public int insertOfCheckId(String checkId) {
        Check check = new Check();
        check.setCheckId(checkId);
        return insert(check);
    }
    public int insertOfInput(String input) {
        Check check = new Check();
        check.setInput(input);
        return insert(check);
    }
    public int insertOfOutput(String output) {
        Check check = new Check();
        check.setOutput(output);
        return insert(check);
    }
    public int insertOfQuestionId(String questionId) {
        Check check = new Check();
        check.setQuestionId(questionId);
        return insert(check);
    }
    public int insertOfCheckIdAndInput(String checkId, String input) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setInput(input);
        return insert(check);
    }
    public int insertOfCheckIdAndOutput(String checkId, String output) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setOutput(output);
        return insert(check);
    }
    public int insertOfCheckIdAndQuestionId(String checkId, String questionId) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setQuestionId(questionId);
        return insert(check);
    }
    public int insertOfInputAndOutput(String input, String output) {
        Check check = new Check();
        check.setInput(input);
        check.setOutput(output);
        return insert(check);
    }
    public int insertOfInputAndQuestionId(String input, String questionId) {
        Check check = new Check();
        check.setInput(input);
        check.setQuestionId(questionId);
        return insert(check);
    }
    public int insertOfOutputAndQuestionId(String output, String questionId) {
        Check check = new Check();
        check.setOutput(output);
        check.setQuestionId(questionId);
        return insert(check);
    }
    public Check getCheck(Check check) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(check, "check");
    }
    public Check getCheckOfCheckId(String checkId) {
        Check check = new Check();
        check.setCheckId(checkId);
        return getCheck(check);
    }
    public Check getCheckOfInput(String input) {
        Check check = new Check();
        check.setInput(input);
        return getCheck(check);
    }
    public Check getCheckOfOutput(String output) {
        Check check = new Check();
        check.setOutput(output);
        return getCheck(check);
    }
    public Check getCheckOfQuestionId(String questionId) {
        Check check = new Check();
        check.setQuestionId(questionId);
        return getCheck(check);
    }
    public Check getCheckOfCheckIdAndInput(String checkId, String input) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setInput(input);
        return getCheck(check);
    }
    public Check getCheckOfCheckIdAndOutput(String checkId, String output) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setOutput(output);
        return getCheck(check);
    }
    public Check getCheckOfCheckIdAndQuestionId(String checkId, String questionId) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setQuestionId(questionId);
        return getCheck(check);
    }
    public Check getCheckOfInputAndOutput(String input, String output) {
        Check check = new Check();
        check.setInput(input);
        check.setOutput(output);
        return getCheck(check);
    }
    public Check getCheckOfInputAndQuestionId(String input, String questionId) {
        Check check = new Check();
        check.setInput(input);
        check.setQuestionId(questionId);
        return getCheck(check);
    }
    public Check getCheckOfOutputAndQuestionId(String output, String questionId) {
        Check check = new Check();
        check.setOutput(output);
        check.setQuestionId(questionId);
        return getCheck(check);
    }
    public List<Check> getChecks(Check check) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(check, "check");
    }
    public List<Check> getChecksOfCheckId(String checkId) {
        Check check = new Check();
        check.setCheckId(checkId);
        return getChecks(check);
    }
    public List<Check> getChecksOfInput(String input) {
        Check check = new Check();
        check.setInput(input);
        return getChecks(check);
    }
    public List<Check> getChecksOfOutput(String output) {
        Check check = new Check();
        check.setOutput(output);
        return getChecks(check);
    }
    public List<Check> getChecksOfQuestionId(String questionId) {
        Check check = new Check();
        check.setQuestionId(questionId);
        return getChecks(check);
    }
    public List<Check> getChecksOfCheckIdAndInput(String checkId, String input) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setInput(input);
        return getChecks(check);
    }
    public List<Check> getChecksOfCheckIdAndOutput(String checkId, String output) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setOutput(output);
        return getChecks(check);
    }
    public List<Check> getChecksOfCheckIdAndQuestionId(String checkId, String questionId) {
        Check check = new Check();
        check.setCheckId(checkId);
        check.setQuestionId(questionId);
        return getChecks(check);
    }
    public List<Check> getChecksOfInputAndOutput(String input, String output) {
        Check check = new Check();
        check.setInput(input);
        check.setOutput(output);
        return getChecks(check);
    }
    public List<Check> getChecksOfInputAndQuestionId(String input, String questionId) {
        Check check = new Check();
        check.setInput(input);
        check.setQuestionId(questionId);
        return getChecks(check);
    }
    public List<Check> getChecksOfOutputAndQuestionId(String output, String questionId) {
        Check check = new Check();
        check.setOutput(output);
        check.setQuestionId(questionId);
        return getChecks(check);
    }
}
