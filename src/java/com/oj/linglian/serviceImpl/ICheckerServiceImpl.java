package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Checker;

import com.oj.linglian.dao.ICheckerDao;
import com.oj.linglian.daoImpl.ICheckerDaoImpl;
import com.oj.linglian.service.ICheckerService;

public class ICheckerServiceImpl implements ICheckerService {
	ICheckerDao dao = null;

	public ICheckerServiceImpl() {
		dao = new ICheckerDaoImpl();
	}
    public int update(Checker checker, Checker keyChecker) {
        return dao.update(checker, keyChecker);
    }
    public int updateOfCheckerId(Checker checker, String checkerId) {
        return dao.updateOfCheckerId(checker, checkerId);
    }
    public int updateOfInput(Checker checker, String input) {
        return dao.updateOfInput(checker, input);
    }
    public int updateOfOutput(Checker checker, String output) {
        return dao.updateOfOutput(checker, output);
    }
    public int updateOfQuestionId(Checker checker, String questionId) {
        return dao.updateOfQuestionId(checker, questionId);
    }
    public int updateOfCheckerIdAndInput(Checker checker, String checkerId, String input) {
        return dao.updateOfCheckerIdAndInput(checker, checkerId, input);
    }
    public int updateOfCheckerIdAndOutput(Checker checker, String checkerId, String output) {
        return dao.updateOfCheckerIdAndOutput(checker, checkerId, output);
    }
    public int updateOfCheckerIdAndQuestionId(Checker checker, String checkerId, String questionId) {
        return dao.updateOfCheckerIdAndQuestionId(checker, checkerId, questionId);
    }
    public int updateOfInputAndOutput(Checker checker, String input, String output) {
        return dao.updateOfInputAndOutput(checker, input, output);
    }
    public int updateOfInputAndQuestionId(Checker checker, String input, String questionId) {
        return dao.updateOfInputAndQuestionId(checker, input, questionId);
    }
    public int updateOfOutputAndQuestionId(Checker checker, String output, String questionId) {
        return dao.updateOfOutputAndQuestionId(checker, output, questionId);
    }
    public int remove(Checker checker) {
        return dao.remove(checker);
    }
    public int removeOfCheckerId(String checkerId) {
        return dao.removeOfCheckerId(checkerId);
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
    public int removeOfCheckerIdAndInput(String checkerId, String input) {
        return dao.removeOfCheckerIdAndInput(checkerId, input);
    }
    public int removeOfCheckerIdAndOutput(String checkerId, String output) {
        return dao.removeOfCheckerIdAndOutput(checkerId, output);
    }
    public int removeOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        return dao.removeOfCheckerIdAndQuestionId(checkerId, questionId);
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
    public int insert(Checker checker) {
        return dao.insert(checker);
    }
    public int insertOfCheckerId(String checkerId) {
        return dao.insertOfCheckerId(checkerId);
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
    public int insertOfCheckerIdAndInput(String checkerId, String input) {
        return dao.insertOfCheckerIdAndInput(checkerId, input);
    }
    public int insertOfCheckerIdAndOutput(String checkerId, String output) {
        return dao.insertOfCheckerIdAndOutput(checkerId, output);
    }
    public int insertOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        return dao.insertOfCheckerIdAndQuestionId(checkerId, questionId);
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
    public Checker getChecker(Checker checker) {
        return dao.getChecker(checker);
    }
    public Checker getCheckerOfCheckerId(String checkerId) {
        return dao.getCheckerOfCheckerId(checkerId);
    }
    public Checker getCheckerOfInput(String input) {
        return dao.getCheckerOfInput(input);
    }
    public Checker getCheckerOfOutput(String output) {
        return dao.getCheckerOfOutput(output);
    }
    public Checker getCheckerOfQuestionId(String questionId) {
        return dao.getCheckerOfQuestionId(questionId);
    }
    public Checker getCheckerOfCheckerIdAndInput(String checkerId, String input) {
        return dao.getCheckerOfCheckerIdAndInput(checkerId, input);
    }
    public Checker getCheckerOfCheckerIdAndOutput(String checkerId, String output) {
        return dao.getCheckerOfCheckerIdAndOutput(checkerId, output);
    }
    public Checker getCheckerOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        return dao.getCheckerOfCheckerIdAndQuestionId(checkerId, questionId);
    }
    public Checker getCheckerOfInputAndOutput(String input, String output) {
        return dao.getCheckerOfInputAndOutput(input, output);
    }
    public Checker getCheckerOfInputAndQuestionId(String input, String questionId) {
        return dao.getCheckerOfInputAndQuestionId(input, questionId);
    }
    public Checker getCheckerOfOutputAndQuestionId(String output, String questionId) {
        return dao.getCheckerOfOutputAndQuestionId(output, questionId);
    }
    public List<Checker> getCheckers(Checker checker) {
        return dao.getCheckers(checker);
    }
    public List<Checker> getCheckersOfCheckerId(String checkerId) {
        return dao.getCheckersOfCheckerId(checkerId);
    }
    public List<Checker> getCheckersOfInput(String input) {
        return dao.getCheckersOfInput(input);
    }
    public List<Checker> getCheckersOfOutput(String output) {
        return dao.getCheckersOfOutput(output);
    }
    public List<Checker> getCheckersOfQuestionId(String questionId) {
        return dao.getCheckersOfQuestionId(questionId);
    }
    public List<Checker> getCheckersOfCheckerIdAndInput(String checkerId, String input) {
        return dao.getCheckersOfCheckerIdAndInput(checkerId, input);
    }
    public List<Checker> getCheckersOfCheckerIdAndOutput(String checkerId, String output) {
        return dao.getCheckersOfCheckerIdAndOutput(checkerId, output);
    }
    public List<Checker> getCheckersOfCheckerIdAndQuestionId(String checkerId, String questionId) {
        return dao.getCheckersOfCheckerIdAndQuestionId(checkerId, questionId);
    }
    public List<Checker> getCheckersOfInputAndOutput(String input, String output) {
        return dao.getCheckersOfInputAndOutput(input, output);
    }
    public List<Checker> getCheckersOfInputAndQuestionId(String input, String questionId) {
        return dao.getCheckersOfInputAndQuestionId(input, questionId);
    }
    public List<Checker> getCheckersOfOutputAndQuestionId(String output, String questionId) {
        return dao.getCheckersOfOutputAndQuestionId(output, questionId);
    }
}
