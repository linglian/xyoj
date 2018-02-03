package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Checker;

import com.oj.linglian.dao.ICheckerDao;
import db.DBMan;

public class ICheckerDaoImpl implements ICheckerDao {
    public int update(Checker checker, Checker keyChecker) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(checker, keyChecker, "checker");
    }
    public int updateOfCheckerId(Checker checker, String checkerId) {
        Checker kChecker = new Checker();
        kChecker.setCheckerId(checkerId);
        return update(checker, kChecker);
    }
    public int updateOfInput(Checker checker, String input) {
        Checker kChecker = new Checker();
        kChecker.setInput(input);
        return update(checker, kChecker);
    }
    public int updateOfOutput(Checker checker, String output) {
        Checker kChecker = new Checker();
        kChecker.setOutput(output);
        return update(checker, kChecker);
    }
    public int updateOfQuestionId(Checker checker, String questionId) {
        Checker kChecker = new Checker();
        kChecker.setQuestionId(questionId);
        return update(checker, kChecker);
    }
    public int updateOfCheckerIdAndInput(Checker checker, String checkerId, String input) {
        Checker kChecker = new Checker();
        kChecker.setCheckerId(checkerId);
        kChecker.setInput(input);
        return update(checker, kChecker);
    }
    public int updateOfCheckerIdAndOutput(Checker checker, String checkerId, String output) {
        Checker kChecker = new Checker();
        kChecker.setCheckerId(checkerId);
        kChecker.setOutput(output);
        return update(checker, kChecker);
    }
    public int updateOfCheckerIdAndQuestionId(Checker checker, String checkerId, String questionId) {
        Checker kChecker = new Checker();
        kChecker.setCheckerId(checkerId);
        kChecker.setQuestionId(questionId);
        return update(checker, kChecker);
    }
    public int updateOfInputAndOutput(Checker checker, String input, String output) {
        Checker kChecker = new Checker();
        kChecker.setInput(input);
        kChecker.setOutput(output);
        return update(checker, kChecker);
    }
    public int updateOfInputAndQuestionId(Checker checker, String input, String questionId) {
        Checker kChecker = new Checker();
        kChecker.setInput(input);
        kChecker.setQuestionId(questionId);
        return update(checker, kChecker);
    }
    public int updateOfOutputAndQuestionId(Checker checker, String output, String questionId) {
        Checker kChecker = new Checker();
        kChecker.setOutput(output);
        kChecker.setQuestionId(questionId);
        return update(checker, kChecker);
    }
    public int remove(Checker checker) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(checker, "checker");
    }
    public int removeOfCheckerId(String checkerId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        return remove(checker);
    }
    public int removeOfInput(String input) {
        Checker checker = new Checker();
        checker.setInput(input);
        return remove(checker);
    }
    public int removeOfOutput(String output) {
        Checker checker = new Checker();
        checker.setOutput(output);
        return remove(checker);
    }
    public int removeOfQuestionId(String questionId) {
        Checker checker = new Checker();
        checker.setQuestionId(questionId);
        return remove(checker);
    }
    public int removeOfCheckerIdAndInput(String checkerId, String input) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setInput(input);
        return remove(checker);
    }
    public int removeOfCheckerIdAndOutput(String checkerId, String output) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setOutput(output);
        return remove(checker);
    }
    public int removeOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setQuestionId(questionId);
        return remove(checker);
    }
    public int removeOfInputAndOutput(String input, String output) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setOutput(output);
        return remove(checker);
    }
    public int removeOfInputAndQuestionId(String input, String questionId) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setQuestionId(questionId);
        return remove(checker);
    }
    public int removeOfOutputAndQuestionId(String output, String questionId) {
        Checker checker = new Checker();
        checker.setOutput(output);
        checker.setQuestionId(questionId);
        return remove(checker);
    }
    public int insert(Checker checker) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(checker, "checker");
    }
    public int insertOfCheckerId(String checkerId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        return insert(checker);
    }
    public int insertOfInput(String input) {
        Checker checker = new Checker();
        checker.setInput(input);
        return insert(checker);
    }
    public int insertOfOutput(String output) {
        Checker checker = new Checker();
        checker.setOutput(output);
        return insert(checker);
    }
    public int insertOfQuestionId(String questionId) {
        Checker checker = new Checker();
        checker.setQuestionId(questionId);
        return insert(checker);
    }
    public int insertOfCheckerIdAndInput(String checkerId, String input) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setInput(input);
        return insert(checker);
    }
    public int insertOfCheckerIdAndOutput(String checkerId, String output) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setOutput(output);
        return insert(checker);
    }
    public int insertOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setQuestionId(questionId);
        return insert(checker);
    }
    public int insertOfInputAndOutput(String input, String output) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setOutput(output);
        return insert(checker);
    }
    public int insertOfInputAndQuestionId(String input, String questionId) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setQuestionId(questionId);
        return insert(checker);
    }
    public int insertOfOutputAndQuestionId(String output, String questionId) {
        Checker checker = new Checker();
        checker.setOutput(output);
        checker.setQuestionId(questionId);
        return insert(checker);
    }
    public Checker getChecker(Checker checker) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(checker, "checker");
    }
    public Checker getCheckerOfCheckerId(String checkerId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        return getChecker(checker);
    }
    public Checker getCheckerOfInput(String input) {
        Checker checker = new Checker();
        checker.setInput(input);
        return getChecker(checker);
    }
    public Checker getCheckerOfOutput(String output) {
        Checker checker = new Checker();
        checker.setOutput(output);
        return getChecker(checker);
    }
    public Checker getCheckerOfQuestionId(String questionId) {
        Checker checker = new Checker();
        checker.setQuestionId(questionId);
        return getChecker(checker);
    }
    public Checker getCheckerOfCheckerIdAndInput(String checkerId, String input) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setInput(input);
        return getChecker(checker);
    }
    public Checker getCheckerOfCheckerIdAndOutput(String checkerId, String output) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setOutput(output);
        return getChecker(checker);
    }
    public Checker getCheckerOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setQuestionId(questionId);
        return getChecker(checker);
    }
    public Checker getCheckerOfInputAndOutput(String input, String output) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setOutput(output);
        return getChecker(checker);
    }
    public Checker getCheckerOfInputAndQuestionId(String input, String questionId) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setQuestionId(questionId);
        return getChecker(checker);
    }
    public Checker getCheckerOfOutputAndQuestionId(String output, String questionId) {
        Checker checker = new Checker();
        checker.setOutput(output);
        checker.setQuestionId(questionId);
        return getChecker(checker);
    }
    public List<Checker> getCheckers(Checker checker) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(checker, "checker");
    }
    public List<Checker> getCheckersOfCheckerId(String checkerId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfInput(String input) {
        Checker checker = new Checker();
        checker.setInput(input);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfOutput(String output) {
        Checker checker = new Checker();
        checker.setOutput(output);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfQuestionId(String questionId) {
        Checker checker = new Checker();
        checker.setQuestionId(questionId);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfCheckerIdAndInput(String checkerId, String input) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setInput(input);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfCheckerIdAndOutput(String checkerId, String output) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setOutput(output);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        Checker checker = new Checker();
        checker.setCheckerId(checkerId);
        checker.setQuestionId(questionId);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfInputAndOutput(String input, String output) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setOutput(output);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfInputAndQuestionId(String input, String questionId) {
        Checker checker = new Checker();
        checker.setInput(input);
        checker.setQuestionId(questionId);
        return getCheckers(checker);
    }
    public List<Checker> getCheckersOfOutputAndQuestionId(String output, String questionId) {
        Checker checker = new Checker();
        checker.setOutput(output);
        checker.setQuestionId(questionId);
        return getCheckers(checker);
    }
}
