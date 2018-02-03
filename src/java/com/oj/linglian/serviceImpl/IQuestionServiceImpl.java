package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Question;

import com.oj.linglian.dao.IQuestionDao;
import com.oj.linglian.daoImpl.IQuestionDaoImpl;
import com.oj.linglian.service.IQuestionService;

public class IQuestionServiceImpl implements IQuestionService {
	IQuestionDao dao = null;

	public IQuestionServiceImpl() {
		dao = new IQuestionDaoImpl();
	}
    public int update(Question question, Question keyQuestion) {
        return dao.update(question, keyQuestion);
    }
    public int updateOfQuestionId(Question question, String questionId) {
        return dao.updateOfQuestionId(question, questionId);
    }
    public int updateOfTitle(Question question, String title) {
        return dao.updateOfTitle(question, title);
    }
    public int updateOfBody(Question question, String body) {
        return dao.updateOfBody(question, body);
    }
    public int updateOfScore(Question question, String score) {
        return dao.updateOfScore(question, score);
    }
    public int updateOfDemoCode(Question question, String demoCode) {
        return dao.updateOfDemoCode(question, demoCode);
    }
    public int updateOfRightPeople(Question question, String rightPeople) {
        return dao.updateOfRightPeople(question, rightPeople);
    }
    public int updateOfMainPeople(Question question, String mainPeople) {
        return dao.updateOfMainPeople(question, mainPeople);
    }
    public int updateOfStartTime(Question question, String startTime) {
        return dao.updateOfStartTime(question, startTime);
    }
    public int updateOfEndTime(Question question, String endTime) {
        return dao.updateOfEndTime(question, endTime);
    }
    public int updateOfInputFormat(Question question, String inputFormat) {
        return dao.updateOfInputFormat(question, inputFormat);
    }
    public int updateOfOutputFormat(Question question, String outputFormat) {
        return dao.updateOfOutputFormat(question, outputFormat);
    }
    public int updateOfInputTest(Question question, String inputTest) {
        return dao.updateOfInputTest(question, inputTest);
    }
    public int updateOfOutputTest(Question question, String outputTest) {
        return dao.updateOfOutputTest(question, outputTest);
    }
    public int updateOfContestId(Question question, String contestId) {
        return dao.updateOfContestId(question, contestId);
    }
    public int updateOfUserId(Question question, String userId) {
        return dao.updateOfUserId(question, userId);
    }
    public int updateOfQuestionIdAndTitle(Question question, String questionId, String title) {
        return dao.updateOfQuestionIdAndTitle(question, questionId, title);
    }
    public int updateOfQuestionIdAndBody(Question question, String questionId, String body) {
        return dao.updateOfQuestionIdAndBody(question, questionId, body);
    }
    public int updateOfQuestionIdAndScore(Question question, String questionId, String score) {
        return dao.updateOfQuestionIdAndScore(question, questionId, score);
    }
    public int updateOfQuestionIdAndDemoCode(Question question, String questionId, String demoCode) {
        return dao.updateOfQuestionIdAndDemoCode(question, questionId, demoCode);
    }
    public int updateOfQuestionIdAndRightPeople(Question question, String questionId, String rightPeople) {
        return dao.updateOfQuestionIdAndRightPeople(question, questionId, rightPeople);
    }
    public int updateOfQuestionIdAndMainPeople(Question question, String questionId, String mainPeople) {
        return dao.updateOfQuestionIdAndMainPeople(question, questionId, mainPeople);
    }
    public int updateOfQuestionIdAndStartTime(Question question, String questionId, String startTime) {
        return dao.updateOfQuestionIdAndStartTime(question, questionId, startTime);
    }
    public int updateOfQuestionIdAndEndTime(Question question, String questionId, String endTime) {
        return dao.updateOfQuestionIdAndEndTime(question, questionId, endTime);
    }
    public int updateOfQuestionIdAndInputFormat(Question question, String questionId, String inputFormat) {
        return dao.updateOfQuestionIdAndInputFormat(question, questionId, inputFormat);
    }
    public int updateOfQuestionIdAndOutputFormat(Question question, String questionId, String outputFormat) {
        return dao.updateOfQuestionIdAndOutputFormat(question, questionId, outputFormat);
    }
    public int updateOfQuestionIdAndInputTest(Question question, String questionId, String inputTest) {
        return dao.updateOfQuestionIdAndInputTest(question, questionId, inputTest);
    }
    public int updateOfQuestionIdAndOutputTest(Question question, String questionId, String outputTest) {
        return dao.updateOfQuestionIdAndOutputTest(question, questionId, outputTest);
    }
    public int updateOfQuestionIdAndContestId(Question question, String questionId, String contestId) {
        return dao.updateOfQuestionIdAndContestId(question, questionId, contestId);
    }
    public int updateOfQuestionIdAndUserId(Question question, String questionId, String userId) {
        return dao.updateOfQuestionIdAndUserId(question, questionId, userId);
    }
    public int updateOfTitleAndBody(Question question, String title, String body) {
        return dao.updateOfTitleAndBody(question, title, body);
    }
    public int updateOfTitleAndScore(Question question, String title, String score) {
        return dao.updateOfTitleAndScore(question, title, score);
    }
    public int updateOfTitleAndDemoCode(Question question, String title, String demoCode) {
        return dao.updateOfTitleAndDemoCode(question, title, demoCode);
    }
    public int updateOfTitleAndRightPeople(Question question, String title, String rightPeople) {
        return dao.updateOfTitleAndRightPeople(question, title, rightPeople);
    }
    public int updateOfTitleAndMainPeople(Question question, String title, String mainPeople) {
        return dao.updateOfTitleAndMainPeople(question, title, mainPeople);
    }
    public int updateOfTitleAndStartTime(Question question, String title, String startTime) {
        return dao.updateOfTitleAndStartTime(question, title, startTime);
    }
    public int updateOfTitleAndEndTime(Question question, String title, String endTime) {
        return dao.updateOfTitleAndEndTime(question, title, endTime);
    }
    public int updateOfTitleAndInputFormat(Question question, String title, String inputFormat) {
        return dao.updateOfTitleAndInputFormat(question, title, inputFormat);
    }
    public int updateOfTitleAndOutputFormat(Question question, String title, String outputFormat) {
        return dao.updateOfTitleAndOutputFormat(question, title, outputFormat);
    }
    public int updateOfTitleAndInputTest(Question question, String title, String inputTest) {
        return dao.updateOfTitleAndInputTest(question, title, inputTest);
    }
    public int updateOfTitleAndOutputTest(Question question, String title, String outputTest) {
        return dao.updateOfTitleAndOutputTest(question, title, outputTest);
    }
    public int updateOfTitleAndContestId(Question question, String title, String contestId) {
        return dao.updateOfTitleAndContestId(question, title, contestId);
    }
    public int updateOfTitleAndUserId(Question question, String title, String userId) {
        return dao.updateOfTitleAndUserId(question, title, userId);
    }
    public int updateOfBodyAndScore(Question question, String body, String score) {
        return dao.updateOfBodyAndScore(question, body, score);
    }
    public int updateOfBodyAndDemoCode(Question question, String body, String demoCode) {
        return dao.updateOfBodyAndDemoCode(question, body, demoCode);
    }
    public int updateOfBodyAndRightPeople(Question question, String body, String rightPeople) {
        return dao.updateOfBodyAndRightPeople(question, body, rightPeople);
    }
    public int updateOfBodyAndMainPeople(Question question, String body, String mainPeople) {
        return dao.updateOfBodyAndMainPeople(question, body, mainPeople);
    }
    public int updateOfBodyAndStartTime(Question question, String body, String startTime) {
        return dao.updateOfBodyAndStartTime(question, body, startTime);
    }
    public int updateOfBodyAndEndTime(Question question, String body, String endTime) {
        return dao.updateOfBodyAndEndTime(question, body, endTime);
    }
    public int updateOfBodyAndInputFormat(Question question, String body, String inputFormat) {
        return dao.updateOfBodyAndInputFormat(question, body, inputFormat);
    }
    public int updateOfBodyAndOutputFormat(Question question, String body, String outputFormat) {
        return dao.updateOfBodyAndOutputFormat(question, body, outputFormat);
    }
    public int updateOfBodyAndInputTest(Question question, String body, String inputTest) {
        return dao.updateOfBodyAndInputTest(question, body, inputTest);
    }
    public int updateOfBodyAndOutputTest(Question question, String body, String outputTest) {
        return dao.updateOfBodyAndOutputTest(question, body, outputTest);
    }
    public int updateOfBodyAndContestId(Question question, String body, String contestId) {
        return dao.updateOfBodyAndContestId(question, body, contestId);
    }
    public int updateOfBodyAndUserId(Question question, String body, String userId) {
        return dao.updateOfBodyAndUserId(question, body, userId);
    }
    public int updateOfScoreAndDemoCode(Question question, String score, String demoCode) {
        return dao.updateOfScoreAndDemoCode(question, score, demoCode);
    }
    public int updateOfScoreAndRightPeople(Question question, String score, String rightPeople) {
        return dao.updateOfScoreAndRightPeople(question, score, rightPeople);
    }
    public int updateOfScoreAndMainPeople(Question question, String score, String mainPeople) {
        return dao.updateOfScoreAndMainPeople(question, score, mainPeople);
    }
    public int updateOfScoreAndStartTime(Question question, String score, String startTime) {
        return dao.updateOfScoreAndStartTime(question, score, startTime);
    }
    public int updateOfScoreAndEndTime(Question question, String score, String endTime) {
        return dao.updateOfScoreAndEndTime(question, score, endTime);
    }
    public int updateOfScoreAndInputFormat(Question question, String score, String inputFormat) {
        return dao.updateOfScoreAndInputFormat(question, score, inputFormat);
    }
    public int updateOfScoreAndOutputFormat(Question question, String score, String outputFormat) {
        return dao.updateOfScoreAndOutputFormat(question, score, outputFormat);
    }
    public int updateOfScoreAndInputTest(Question question, String score, String inputTest) {
        return dao.updateOfScoreAndInputTest(question, score, inputTest);
    }
    public int updateOfScoreAndOutputTest(Question question, String score, String outputTest) {
        return dao.updateOfScoreAndOutputTest(question, score, outputTest);
    }
    public int updateOfScoreAndContestId(Question question, String score, String contestId) {
        return dao.updateOfScoreAndContestId(question, score, contestId);
    }
    public int updateOfScoreAndUserId(Question question, String score, String userId) {
        return dao.updateOfScoreAndUserId(question, score, userId);
    }
    public int updateOfDemoCodeAndRightPeople(Question question, String demoCode, String rightPeople) {
        return dao.updateOfDemoCodeAndRightPeople(question, demoCode, rightPeople);
    }
    public int updateOfDemoCodeAndMainPeople(Question question, String demoCode, String mainPeople) {
        return dao.updateOfDemoCodeAndMainPeople(question, demoCode, mainPeople);
    }
    public int updateOfDemoCodeAndStartTime(Question question, String demoCode, String startTime) {
        return dao.updateOfDemoCodeAndStartTime(question, demoCode, startTime);
    }
    public int updateOfDemoCodeAndEndTime(Question question, String demoCode, String endTime) {
        return dao.updateOfDemoCodeAndEndTime(question, demoCode, endTime);
    }
    public int updateOfDemoCodeAndInputFormat(Question question, String demoCode, String inputFormat) {
        return dao.updateOfDemoCodeAndInputFormat(question, demoCode, inputFormat);
    }
    public int updateOfDemoCodeAndOutputFormat(Question question, String demoCode, String outputFormat) {
        return dao.updateOfDemoCodeAndOutputFormat(question, demoCode, outputFormat);
    }
    public int updateOfDemoCodeAndInputTest(Question question, String demoCode, String inputTest) {
        return dao.updateOfDemoCodeAndInputTest(question, demoCode, inputTest);
    }
    public int updateOfDemoCodeAndOutputTest(Question question, String demoCode, String outputTest) {
        return dao.updateOfDemoCodeAndOutputTest(question, demoCode, outputTest);
    }
    public int updateOfDemoCodeAndContestId(Question question, String demoCode, String contestId) {
        return dao.updateOfDemoCodeAndContestId(question, demoCode, contestId);
    }
    public int updateOfDemoCodeAndUserId(Question question, String demoCode, String userId) {
        return dao.updateOfDemoCodeAndUserId(question, demoCode, userId);
    }
    public int updateOfRightPeopleAndMainPeople(Question question, String rightPeople, String mainPeople) {
        return dao.updateOfRightPeopleAndMainPeople(question, rightPeople, mainPeople);
    }
    public int updateOfRightPeopleAndStartTime(Question question, String rightPeople, String startTime) {
        return dao.updateOfRightPeopleAndStartTime(question, rightPeople, startTime);
    }
    public int updateOfRightPeopleAndEndTime(Question question, String rightPeople, String endTime) {
        return dao.updateOfRightPeopleAndEndTime(question, rightPeople, endTime);
    }
    public int updateOfRightPeopleAndInputFormat(Question question, String rightPeople, String inputFormat) {
        return dao.updateOfRightPeopleAndInputFormat(question, rightPeople, inputFormat);
    }
    public int updateOfRightPeopleAndOutputFormat(Question question, String rightPeople, String outputFormat) {
        return dao.updateOfRightPeopleAndOutputFormat(question, rightPeople, outputFormat);
    }
    public int updateOfRightPeopleAndInputTest(Question question, String rightPeople, String inputTest) {
        return dao.updateOfRightPeopleAndInputTest(question, rightPeople, inputTest);
    }
    public int updateOfRightPeopleAndOutputTest(Question question, String rightPeople, String outputTest) {
        return dao.updateOfRightPeopleAndOutputTest(question, rightPeople, outputTest);
    }
    public int updateOfRightPeopleAndContestId(Question question, String rightPeople, String contestId) {
        return dao.updateOfRightPeopleAndContestId(question, rightPeople, contestId);
    }
    public int updateOfRightPeopleAndUserId(Question question, String rightPeople, String userId) {
        return dao.updateOfRightPeopleAndUserId(question, rightPeople, userId);
    }
    public int updateOfMainPeopleAndStartTime(Question question, String mainPeople, String startTime) {
        return dao.updateOfMainPeopleAndStartTime(question, mainPeople, startTime);
    }
    public int updateOfMainPeopleAndEndTime(Question question, String mainPeople, String endTime) {
        return dao.updateOfMainPeopleAndEndTime(question, mainPeople, endTime);
    }
    public int updateOfMainPeopleAndInputFormat(Question question, String mainPeople, String inputFormat) {
        return dao.updateOfMainPeopleAndInputFormat(question, mainPeople, inputFormat);
    }
    public int updateOfMainPeopleAndOutputFormat(Question question, String mainPeople, String outputFormat) {
        return dao.updateOfMainPeopleAndOutputFormat(question, mainPeople, outputFormat);
    }
    public int updateOfMainPeopleAndInputTest(Question question, String mainPeople, String inputTest) {
        return dao.updateOfMainPeopleAndInputTest(question, mainPeople, inputTest);
    }
    public int updateOfMainPeopleAndOutputTest(Question question, String mainPeople, String outputTest) {
        return dao.updateOfMainPeopleAndOutputTest(question, mainPeople, outputTest);
    }
    public int updateOfMainPeopleAndContestId(Question question, String mainPeople, String contestId) {
        return dao.updateOfMainPeopleAndContestId(question, mainPeople, contestId);
    }
    public int updateOfMainPeopleAndUserId(Question question, String mainPeople, String userId) {
        return dao.updateOfMainPeopleAndUserId(question, mainPeople, userId);
    }
    public int updateOfStartTimeAndEndTime(Question question, String startTime, String endTime) {
        return dao.updateOfStartTimeAndEndTime(question, startTime, endTime);
    }
    public int updateOfStartTimeAndInputFormat(Question question, String startTime, String inputFormat) {
        return dao.updateOfStartTimeAndInputFormat(question, startTime, inputFormat);
    }
    public int updateOfStartTimeAndOutputFormat(Question question, String startTime, String outputFormat) {
        return dao.updateOfStartTimeAndOutputFormat(question, startTime, outputFormat);
    }
    public int updateOfStartTimeAndInputTest(Question question, String startTime, String inputTest) {
        return dao.updateOfStartTimeAndInputTest(question, startTime, inputTest);
    }
    public int updateOfStartTimeAndOutputTest(Question question, String startTime, String outputTest) {
        return dao.updateOfStartTimeAndOutputTest(question, startTime, outputTest);
    }
    public int updateOfStartTimeAndContestId(Question question, String startTime, String contestId) {
        return dao.updateOfStartTimeAndContestId(question, startTime, contestId);
    }
    public int updateOfStartTimeAndUserId(Question question, String startTime, String userId) {
        return dao.updateOfStartTimeAndUserId(question, startTime, userId);
    }
    public int updateOfEndTimeAndInputFormat(Question question, String endTime, String inputFormat) {
        return dao.updateOfEndTimeAndInputFormat(question, endTime, inputFormat);
    }
    public int updateOfEndTimeAndOutputFormat(Question question, String endTime, String outputFormat) {
        return dao.updateOfEndTimeAndOutputFormat(question, endTime, outputFormat);
    }
    public int updateOfEndTimeAndInputTest(Question question, String endTime, String inputTest) {
        return dao.updateOfEndTimeAndInputTest(question, endTime, inputTest);
    }
    public int updateOfEndTimeAndOutputTest(Question question, String endTime, String outputTest) {
        return dao.updateOfEndTimeAndOutputTest(question, endTime, outputTest);
    }
    public int updateOfEndTimeAndContestId(Question question, String endTime, String contestId) {
        return dao.updateOfEndTimeAndContestId(question, endTime, contestId);
    }
    public int updateOfEndTimeAndUserId(Question question, String endTime, String userId) {
        return dao.updateOfEndTimeAndUserId(question, endTime, userId);
    }
    public int updateOfInputFormatAndOutputFormat(Question question, String inputFormat, String outputFormat) {
        return dao.updateOfInputFormatAndOutputFormat(question, inputFormat, outputFormat);
    }
    public int updateOfInputFormatAndInputTest(Question question, String inputFormat, String inputTest) {
        return dao.updateOfInputFormatAndInputTest(question, inputFormat, inputTest);
    }
    public int updateOfInputFormatAndOutputTest(Question question, String inputFormat, String outputTest) {
        return dao.updateOfInputFormatAndOutputTest(question, inputFormat, outputTest);
    }
    public int updateOfInputFormatAndContestId(Question question, String inputFormat, String contestId) {
        return dao.updateOfInputFormatAndContestId(question, inputFormat, contestId);
    }
    public int updateOfInputFormatAndUserId(Question question, String inputFormat, String userId) {
        return dao.updateOfInputFormatAndUserId(question, inputFormat, userId);
    }
    public int updateOfOutputFormatAndInputTest(Question question, String outputFormat, String inputTest) {
        return dao.updateOfOutputFormatAndInputTest(question, outputFormat, inputTest);
    }
    public int updateOfOutputFormatAndOutputTest(Question question, String outputFormat, String outputTest) {
        return dao.updateOfOutputFormatAndOutputTest(question, outputFormat, outputTest);
    }
    public int updateOfOutputFormatAndContestId(Question question, String outputFormat, String contestId) {
        return dao.updateOfOutputFormatAndContestId(question, outputFormat, contestId);
    }
    public int updateOfOutputFormatAndUserId(Question question, String outputFormat, String userId) {
        return dao.updateOfOutputFormatAndUserId(question, outputFormat, userId);
    }
    public int updateOfInputTestAndOutputTest(Question question, String inputTest, String outputTest) {
        return dao.updateOfInputTestAndOutputTest(question, inputTest, outputTest);
    }
    public int updateOfInputTestAndContestId(Question question, String inputTest, String contestId) {
        return dao.updateOfInputTestAndContestId(question, inputTest, contestId);
    }
    public int updateOfInputTestAndUserId(Question question, String inputTest, String userId) {
        return dao.updateOfInputTestAndUserId(question, inputTest, userId);
    }
    public int updateOfOutputTestAndContestId(Question question, String outputTest, String contestId) {
        return dao.updateOfOutputTestAndContestId(question, outputTest, contestId);
    }
    public int updateOfOutputTestAndUserId(Question question, String outputTest, String userId) {
        return dao.updateOfOutputTestAndUserId(question, outputTest, userId);
    }
    public int updateOfContestIdAndUserId(Question question, String contestId, String userId) {
        return dao.updateOfContestIdAndUserId(question, contestId, userId);
    }
    public int remove(Question question) {
        return dao.remove(question);
    }
    public int removeOfQuestionId(String questionId) {
        return dao.removeOfQuestionId(questionId);
    }
    public int removeOfTitle(String title) {
        return dao.removeOfTitle(title);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfDemoCode(String demoCode) {
        return dao.removeOfDemoCode(demoCode);
    }
    public int removeOfRightPeople(String rightPeople) {
        return dao.removeOfRightPeople(rightPeople);
    }
    public int removeOfMainPeople(String mainPeople) {
        return dao.removeOfMainPeople(mainPeople);
    }
    public int removeOfStartTime(String startTime) {
        return dao.removeOfStartTime(startTime);
    }
    public int removeOfEndTime(String endTime) {
        return dao.removeOfEndTime(endTime);
    }
    public int removeOfInputFormat(String inputFormat) {
        return dao.removeOfInputFormat(inputFormat);
    }
    public int removeOfOutputFormat(String outputFormat) {
        return dao.removeOfOutputFormat(outputFormat);
    }
    public int removeOfInputTest(String inputTest) {
        return dao.removeOfInputTest(inputTest);
    }
    public int removeOfOutputTest(String outputTest) {
        return dao.removeOfOutputTest(outputTest);
    }
    public int removeOfContestId(String contestId) {
        return dao.removeOfContestId(contestId);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfQuestionIdAndTitle(String questionId, String title) {
        return dao.removeOfQuestionIdAndTitle(questionId, title);
    }
    public int removeOfQuestionIdAndBody(String questionId, String body) {
        return dao.removeOfQuestionIdAndBody(questionId, body);
    }
    public int removeOfQuestionIdAndScore(String questionId, String score) {
        return dao.removeOfQuestionIdAndScore(questionId, score);
    }
    public int removeOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        return dao.removeOfQuestionIdAndDemoCode(questionId, demoCode);
    }
    public int removeOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        return dao.removeOfQuestionIdAndRightPeople(questionId, rightPeople);
    }
    public int removeOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        return dao.removeOfQuestionIdAndMainPeople(questionId, mainPeople);
    }
    public int removeOfQuestionIdAndStartTime(String questionId, String startTime) {
        return dao.removeOfQuestionIdAndStartTime(questionId, startTime);
    }
    public int removeOfQuestionIdAndEndTime(String questionId, String endTime) {
        return dao.removeOfQuestionIdAndEndTime(questionId, endTime);
    }
    public int removeOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        return dao.removeOfQuestionIdAndInputFormat(questionId, inputFormat);
    }
    public int removeOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        return dao.removeOfQuestionIdAndOutputFormat(questionId, outputFormat);
    }
    public int removeOfQuestionIdAndInputTest(String questionId, String inputTest) {
        return dao.removeOfQuestionIdAndInputTest(questionId, inputTest);
    }
    public int removeOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        return dao.removeOfQuestionIdAndOutputTest(questionId, outputTest);
    }
    public int removeOfQuestionIdAndContestId(String questionId, String contestId) {
        return dao.removeOfQuestionIdAndContestId(questionId, contestId);
    }
    public int removeOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.removeOfQuestionIdAndUserId(questionId, userId);
    }
    public int removeOfTitleAndBody(String title, String body) {
        return dao.removeOfTitleAndBody(title, body);
    }
    public int removeOfTitleAndScore(String title, String score) {
        return dao.removeOfTitleAndScore(title, score);
    }
    public int removeOfTitleAndDemoCode(String title, String demoCode) {
        return dao.removeOfTitleAndDemoCode(title, demoCode);
    }
    public int removeOfTitleAndRightPeople(String title, String rightPeople) {
        return dao.removeOfTitleAndRightPeople(title, rightPeople);
    }
    public int removeOfTitleAndMainPeople(String title, String mainPeople) {
        return dao.removeOfTitleAndMainPeople(title, mainPeople);
    }
    public int removeOfTitleAndStartTime(String title, String startTime) {
        return dao.removeOfTitleAndStartTime(title, startTime);
    }
    public int removeOfTitleAndEndTime(String title, String endTime) {
        return dao.removeOfTitleAndEndTime(title, endTime);
    }
    public int removeOfTitleAndInputFormat(String title, String inputFormat) {
        return dao.removeOfTitleAndInputFormat(title, inputFormat);
    }
    public int removeOfTitleAndOutputFormat(String title, String outputFormat) {
        return dao.removeOfTitleAndOutputFormat(title, outputFormat);
    }
    public int removeOfTitleAndInputTest(String title, String inputTest) {
        return dao.removeOfTitleAndInputTest(title, inputTest);
    }
    public int removeOfTitleAndOutputTest(String title, String outputTest) {
        return dao.removeOfTitleAndOutputTest(title, outputTest);
    }
    public int removeOfTitleAndContestId(String title, String contestId) {
        return dao.removeOfTitleAndContestId(title, contestId);
    }
    public int removeOfTitleAndUserId(String title, String userId) {
        return dao.removeOfTitleAndUserId(title, userId);
    }
    public int removeOfBodyAndScore(String body, String score) {
        return dao.removeOfBodyAndScore(body, score);
    }
    public int removeOfBodyAndDemoCode(String body, String demoCode) {
        return dao.removeOfBodyAndDemoCode(body, demoCode);
    }
    public int removeOfBodyAndRightPeople(String body, String rightPeople) {
        return dao.removeOfBodyAndRightPeople(body, rightPeople);
    }
    public int removeOfBodyAndMainPeople(String body, String mainPeople) {
        return dao.removeOfBodyAndMainPeople(body, mainPeople);
    }
    public int removeOfBodyAndStartTime(String body, String startTime) {
        return dao.removeOfBodyAndStartTime(body, startTime);
    }
    public int removeOfBodyAndEndTime(String body, String endTime) {
        return dao.removeOfBodyAndEndTime(body, endTime);
    }
    public int removeOfBodyAndInputFormat(String body, String inputFormat) {
        return dao.removeOfBodyAndInputFormat(body, inputFormat);
    }
    public int removeOfBodyAndOutputFormat(String body, String outputFormat) {
        return dao.removeOfBodyAndOutputFormat(body, outputFormat);
    }
    public int removeOfBodyAndInputTest(String body, String inputTest) {
        return dao.removeOfBodyAndInputTest(body, inputTest);
    }
    public int removeOfBodyAndOutputTest(String body, String outputTest) {
        return dao.removeOfBodyAndOutputTest(body, outputTest);
    }
    public int removeOfBodyAndContestId(String body, String contestId) {
        return dao.removeOfBodyAndContestId(body, contestId);
    }
    public int removeOfBodyAndUserId(String body, String userId) {
        return dao.removeOfBodyAndUserId(body, userId);
    }
    public int removeOfScoreAndDemoCode(String score, String demoCode) {
        return dao.removeOfScoreAndDemoCode(score, demoCode);
    }
    public int removeOfScoreAndRightPeople(String score, String rightPeople) {
        return dao.removeOfScoreAndRightPeople(score, rightPeople);
    }
    public int removeOfScoreAndMainPeople(String score, String mainPeople) {
        return dao.removeOfScoreAndMainPeople(score, mainPeople);
    }
    public int removeOfScoreAndStartTime(String score, String startTime) {
        return dao.removeOfScoreAndStartTime(score, startTime);
    }
    public int removeOfScoreAndEndTime(String score, String endTime) {
        return dao.removeOfScoreAndEndTime(score, endTime);
    }
    public int removeOfScoreAndInputFormat(String score, String inputFormat) {
        return dao.removeOfScoreAndInputFormat(score, inputFormat);
    }
    public int removeOfScoreAndOutputFormat(String score, String outputFormat) {
        return dao.removeOfScoreAndOutputFormat(score, outputFormat);
    }
    public int removeOfScoreAndInputTest(String score, String inputTest) {
        return dao.removeOfScoreAndInputTest(score, inputTest);
    }
    public int removeOfScoreAndOutputTest(String score, String outputTest) {
        return dao.removeOfScoreAndOutputTest(score, outputTest);
    }
    public int removeOfScoreAndContestId(String score, String contestId) {
        return dao.removeOfScoreAndContestId(score, contestId);
    }
    public int removeOfScoreAndUserId(String score, String userId) {
        return dao.removeOfScoreAndUserId(score, userId);
    }
    public int removeOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        return dao.removeOfDemoCodeAndRightPeople(demoCode, rightPeople);
    }
    public int removeOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        return dao.removeOfDemoCodeAndMainPeople(demoCode, mainPeople);
    }
    public int removeOfDemoCodeAndStartTime(String demoCode, String startTime) {
        return dao.removeOfDemoCodeAndStartTime(demoCode, startTime);
    }
    public int removeOfDemoCodeAndEndTime(String demoCode, String endTime) {
        return dao.removeOfDemoCodeAndEndTime(demoCode, endTime);
    }
    public int removeOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        return dao.removeOfDemoCodeAndInputFormat(demoCode, inputFormat);
    }
    public int removeOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        return dao.removeOfDemoCodeAndOutputFormat(demoCode, outputFormat);
    }
    public int removeOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        return dao.removeOfDemoCodeAndInputTest(demoCode, inputTest);
    }
    public int removeOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        return dao.removeOfDemoCodeAndOutputTest(demoCode, outputTest);
    }
    public int removeOfDemoCodeAndContestId(String demoCode, String contestId) {
        return dao.removeOfDemoCodeAndContestId(demoCode, contestId);
    }
    public int removeOfDemoCodeAndUserId(String demoCode, String userId) {
        return dao.removeOfDemoCodeAndUserId(demoCode, userId);
    }
    public int removeOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        return dao.removeOfRightPeopleAndMainPeople(rightPeople, mainPeople);
    }
    public int removeOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        return dao.removeOfRightPeopleAndStartTime(rightPeople, startTime);
    }
    public int removeOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        return dao.removeOfRightPeopleAndEndTime(rightPeople, endTime);
    }
    public int removeOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        return dao.removeOfRightPeopleAndInputFormat(rightPeople, inputFormat);
    }
    public int removeOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        return dao.removeOfRightPeopleAndOutputFormat(rightPeople, outputFormat);
    }
    public int removeOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        return dao.removeOfRightPeopleAndInputTest(rightPeople, inputTest);
    }
    public int removeOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        return dao.removeOfRightPeopleAndOutputTest(rightPeople, outputTest);
    }
    public int removeOfRightPeopleAndContestId(String rightPeople, String contestId) {
        return dao.removeOfRightPeopleAndContestId(rightPeople, contestId);
    }
    public int removeOfRightPeopleAndUserId(String rightPeople, String userId) {
        return dao.removeOfRightPeopleAndUserId(rightPeople, userId);
    }
    public int removeOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        return dao.removeOfMainPeopleAndStartTime(mainPeople, startTime);
    }
    public int removeOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        return dao.removeOfMainPeopleAndEndTime(mainPeople, endTime);
    }
    public int removeOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        return dao.removeOfMainPeopleAndInputFormat(mainPeople, inputFormat);
    }
    public int removeOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        return dao.removeOfMainPeopleAndOutputFormat(mainPeople, outputFormat);
    }
    public int removeOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        return dao.removeOfMainPeopleAndInputTest(mainPeople, inputTest);
    }
    public int removeOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        return dao.removeOfMainPeopleAndOutputTest(mainPeople, outputTest);
    }
    public int removeOfMainPeopleAndContestId(String mainPeople, String contestId) {
        return dao.removeOfMainPeopleAndContestId(mainPeople, contestId);
    }
    public int removeOfMainPeopleAndUserId(String mainPeople, String userId) {
        return dao.removeOfMainPeopleAndUserId(mainPeople, userId);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.removeOfStartTimeAndEndTime(startTime, endTime);
    }
    public int removeOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        return dao.removeOfStartTimeAndInputFormat(startTime, inputFormat);
    }
    public int removeOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        return dao.removeOfStartTimeAndOutputFormat(startTime, outputFormat);
    }
    public int removeOfStartTimeAndInputTest(String startTime, String inputTest) {
        return dao.removeOfStartTimeAndInputTest(startTime, inputTest);
    }
    public int removeOfStartTimeAndOutputTest(String startTime, String outputTest) {
        return dao.removeOfStartTimeAndOutputTest(startTime, outputTest);
    }
    public int removeOfStartTimeAndContestId(String startTime, String contestId) {
        return dao.removeOfStartTimeAndContestId(startTime, contestId);
    }
    public int removeOfStartTimeAndUserId(String startTime, String userId) {
        return dao.removeOfStartTimeAndUserId(startTime, userId);
    }
    public int removeOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        return dao.removeOfEndTimeAndInputFormat(endTime, inputFormat);
    }
    public int removeOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        return dao.removeOfEndTimeAndOutputFormat(endTime, outputFormat);
    }
    public int removeOfEndTimeAndInputTest(String endTime, String inputTest) {
        return dao.removeOfEndTimeAndInputTest(endTime, inputTest);
    }
    public int removeOfEndTimeAndOutputTest(String endTime, String outputTest) {
        return dao.removeOfEndTimeAndOutputTest(endTime, outputTest);
    }
    public int removeOfEndTimeAndContestId(String endTime, String contestId) {
        return dao.removeOfEndTimeAndContestId(endTime, contestId);
    }
    public int removeOfEndTimeAndUserId(String endTime, String userId) {
        return dao.removeOfEndTimeAndUserId(endTime, userId);
    }
    public int removeOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        return dao.removeOfInputFormatAndOutputFormat(inputFormat, outputFormat);
    }
    public int removeOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        return dao.removeOfInputFormatAndInputTest(inputFormat, inputTest);
    }
    public int removeOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        return dao.removeOfInputFormatAndOutputTest(inputFormat, outputTest);
    }
    public int removeOfInputFormatAndContestId(String inputFormat, String contestId) {
        return dao.removeOfInputFormatAndContestId(inputFormat, contestId);
    }
    public int removeOfInputFormatAndUserId(String inputFormat, String userId) {
        return dao.removeOfInputFormatAndUserId(inputFormat, userId);
    }
    public int removeOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        return dao.removeOfOutputFormatAndInputTest(outputFormat, inputTest);
    }
    public int removeOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        return dao.removeOfOutputFormatAndOutputTest(outputFormat, outputTest);
    }
    public int removeOfOutputFormatAndContestId(String outputFormat, String contestId) {
        return dao.removeOfOutputFormatAndContestId(outputFormat, contestId);
    }
    public int removeOfOutputFormatAndUserId(String outputFormat, String userId) {
        return dao.removeOfOutputFormatAndUserId(outputFormat, userId);
    }
    public int removeOfInputTestAndOutputTest(String inputTest, String outputTest) {
        return dao.removeOfInputTestAndOutputTest(inputTest, outputTest);
    }
    public int removeOfInputTestAndContestId(String inputTest, String contestId) {
        return dao.removeOfInputTestAndContestId(inputTest, contestId);
    }
    public int removeOfInputTestAndUserId(String inputTest, String userId) {
        return dao.removeOfInputTestAndUserId(inputTest, userId);
    }
    public int removeOfOutputTestAndContestId(String outputTest, String contestId) {
        return dao.removeOfOutputTestAndContestId(outputTest, contestId);
    }
    public int removeOfOutputTestAndUserId(String outputTest, String userId) {
        return dao.removeOfOutputTestAndUserId(outputTest, userId);
    }
    public int removeOfContestIdAndUserId(String contestId, String userId) {
        return dao.removeOfContestIdAndUserId(contestId, userId);
    }
    public int insert(Question question) {
        return dao.insert(question);
    }
    public int insertOfQuestionId(String questionId) {
        return dao.insertOfQuestionId(questionId);
    }
    public int insertOfTitle(String title) {
        return dao.insertOfTitle(title);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfDemoCode(String demoCode) {
        return dao.insertOfDemoCode(demoCode);
    }
    public int insertOfRightPeople(String rightPeople) {
        return dao.insertOfRightPeople(rightPeople);
    }
    public int insertOfMainPeople(String mainPeople) {
        return dao.insertOfMainPeople(mainPeople);
    }
    public int insertOfStartTime(String startTime) {
        return dao.insertOfStartTime(startTime);
    }
    public int insertOfEndTime(String endTime) {
        return dao.insertOfEndTime(endTime);
    }
    public int insertOfInputFormat(String inputFormat) {
        return dao.insertOfInputFormat(inputFormat);
    }
    public int insertOfOutputFormat(String outputFormat) {
        return dao.insertOfOutputFormat(outputFormat);
    }
    public int insertOfInputTest(String inputTest) {
        return dao.insertOfInputTest(inputTest);
    }
    public int insertOfOutputTest(String outputTest) {
        return dao.insertOfOutputTest(outputTest);
    }
    public int insertOfContestId(String contestId) {
        return dao.insertOfContestId(contestId);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfQuestionIdAndTitle(String questionId, String title) {
        return dao.insertOfQuestionIdAndTitle(questionId, title);
    }
    public int insertOfQuestionIdAndBody(String questionId, String body) {
        return dao.insertOfQuestionIdAndBody(questionId, body);
    }
    public int insertOfQuestionIdAndScore(String questionId, String score) {
        return dao.insertOfQuestionIdAndScore(questionId, score);
    }
    public int insertOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        return dao.insertOfQuestionIdAndDemoCode(questionId, demoCode);
    }
    public int insertOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        return dao.insertOfQuestionIdAndRightPeople(questionId, rightPeople);
    }
    public int insertOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        return dao.insertOfQuestionIdAndMainPeople(questionId, mainPeople);
    }
    public int insertOfQuestionIdAndStartTime(String questionId, String startTime) {
        return dao.insertOfQuestionIdAndStartTime(questionId, startTime);
    }
    public int insertOfQuestionIdAndEndTime(String questionId, String endTime) {
        return dao.insertOfQuestionIdAndEndTime(questionId, endTime);
    }
    public int insertOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        return dao.insertOfQuestionIdAndInputFormat(questionId, inputFormat);
    }
    public int insertOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        return dao.insertOfQuestionIdAndOutputFormat(questionId, outputFormat);
    }
    public int insertOfQuestionIdAndInputTest(String questionId, String inputTest) {
        return dao.insertOfQuestionIdAndInputTest(questionId, inputTest);
    }
    public int insertOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        return dao.insertOfQuestionIdAndOutputTest(questionId, outputTest);
    }
    public int insertOfQuestionIdAndContestId(String questionId, String contestId) {
        return dao.insertOfQuestionIdAndContestId(questionId, contestId);
    }
    public int insertOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.insertOfQuestionIdAndUserId(questionId, userId);
    }
    public int insertOfTitleAndBody(String title, String body) {
        return dao.insertOfTitleAndBody(title, body);
    }
    public int insertOfTitleAndScore(String title, String score) {
        return dao.insertOfTitleAndScore(title, score);
    }
    public int insertOfTitleAndDemoCode(String title, String demoCode) {
        return dao.insertOfTitleAndDemoCode(title, demoCode);
    }
    public int insertOfTitleAndRightPeople(String title, String rightPeople) {
        return dao.insertOfTitleAndRightPeople(title, rightPeople);
    }
    public int insertOfTitleAndMainPeople(String title, String mainPeople) {
        return dao.insertOfTitleAndMainPeople(title, mainPeople);
    }
    public int insertOfTitleAndStartTime(String title, String startTime) {
        return dao.insertOfTitleAndStartTime(title, startTime);
    }
    public int insertOfTitleAndEndTime(String title, String endTime) {
        return dao.insertOfTitleAndEndTime(title, endTime);
    }
    public int insertOfTitleAndInputFormat(String title, String inputFormat) {
        return dao.insertOfTitleAndInputFormat(title, inputFormat);
    }
    public int insertOfTitleAndOutputFormat(String title, String outputFormat) {
        return dao.insertOfTitleAndOutputFormat(title, outputFormat);
    }
    public int insertOfTitleAndInputTest(String title, String inputTest) {
        return dao.insertOfTitleAndInputTest(title, inputTest);
    }
    public int insertOfTitleAndOutputTest(String title, String outputTest) {
        return dao.insertOfTitleAndOutputTest(title, outputTest);
    }
    public int insertOfTitleAndContestId(String title, String contestId) {
        return dao.insertOfTitleAndContestId(title, contestId);
    }
    public int insertOfTitleAndUserId(String title, String userId) {
        return dao.insertOfTitleAndUserId(title, userId);
    }
    public int insertOfBodyAndScore(String body, String score) {
        return dao.insertOfBodyAndScore(body, score);
    }
    public int insertOfBodyAndDemoCode(String body, String demoCode) {
        return dao.insertOfBodyAndDemoCode(body, demoCode);
    }
    public int insertOfBodyAndRightPeople(String body, String rightPeople) {
        return dao.insertOfBodyAndRightPeople(body, rightPeople);
    }
    public int insertOfBodyAndMainPeople(String body, String mainPeople) {
        return dao.insertOfBodyAndMainPeople(body, mainPeople);
    }
    public int insertOfBodyAndStartTime(String body, String startTime) {
        return dao.insertOfBodyAndStartTime(body, startTime);
    }
    public int insertOfBodyAndEndTime(String body, String endTime) {
        return dao.insertOfBodyAndEndTime(body, endTime);
    }
    public int insertOfBodyAndInputFormat(String body, String inputFormat) {
        return dao.insertOfBodyAndInputFormat(body, inputFormat);
    }
    public int insertOfBodyAndOutputFormat(String body, String outputFormat) {
        return dao.insertOfBodyAndOutputFormat(body, outputFormat);
    }
    public int insertOfBodyAndInputTest(String body, String inputTest) {
        return dao.insertOfBodyAndInputTest(body, inputTest);
    }
    public int insertOfBodyAndOutputTest(String body, String outputTest) {
        return dao.insertOfBodyAndOutputTest(body, outputTest);
    }
    public int insertOfBodyAndContestId(String body, String contestId) {
        return dao.insertOfBodyAndContestId(body, contestId);
    }
    public int insertOfBodyAndUserId(String body, String userId) {
        return dao.insertOfBodyAndUserId(body, userId);
    }
    public int insertOfScoreAndDemoCode(String score, String demoCode) {
        return dao.insertOfScoreAndDemoCode(score, demoCode);
    }
    public int insertOfScoreAndRightPeople(String score, String rightPeople) {
        return dao.insertOfScoreAndRightPeople(score, rightPeople);
    }
    public int insertOfScoreAndMainPeople(String score, String mainPeople) {
        return dao.insertOfScoreAndMainPeople(score, mainPeople);
    }
    public int insertOfScoreAndStartTime(String score, String startTime) {
        return dao.insertOfScoreAndStartTime(score, startTime);
    }
    public int insertOfScoreAndEndTime(String score, String endTime) {
        return dao.insertOfScoreAndEndTime(score, endTime);
    }
    public int insertOfScoreAndInputFormat(String score, String inputFormat) {
        return dao.insertOfScoreAndInputFormat(score, inputFormat);
    }
    public int insertOfScoreAndOutputFormat(String score, String outputFormat) {
        return dao.insertOfScoreAndOutputFormat(score, outputFormat);
    }
    public int insertOfScoreAndInputTest(String score, String inputTest) {
        return dao.insertOfScoreAndInputTest(score, inputTest);
    }
    public int insertOfScoreAndOutputTest(String score, String outputTest) {
        return dao.insertOfScoreAndOutputTest(score, outputTest);
    }
    public int insertOfScoreAndContestId(String score, String contestId) {
        return dao.insertOfScoreAndContestId(score, contestId);
    }
    public int insertOfScoreAndUserId(String score, String userId) {
        return dao.insertOfScoreAndUserId(score, userId);
    }
    public int insertOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        return dao.insertOfDemoCodeAndRightPeople(demoCode, rightPeople);
    }
    public int insertOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        return dao.insertOfDemoCodeAndMainPeople(demoCode, mainPeople);
    }
    public int insertOfDemoCodeAndStartTime(String demoCode, String startTime) {
        return dao.insertOfDemoCodeAndStartTime(demoCode, startTime);
    }
    public int insertOfDemoCodeAndEndTime(String demoCode, String endTime) {
        return dao.insertOfDemoCodeAndEndTime(demoCode, endTime);
    }
    public int insertOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        return dao.insertOfDemoCodeAndInputFormat(demoCode, inputFormat);
    }
    public int insertOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        return dao.insertOfDemoCodeAndOutputFormat(demoCode, outputFormat);
    }
    public int insertOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        return dao.insertOfDemoCodeAndInputTest(demoCode, inputTest);
    }
    public int insertOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        return dao.insertOfDemoCodeAndOutputTest(demoCode, outputTest);
    }
    public int insertOfDemoCodeAndContestId(String demoCode, String contestId) {
        return dao.insertOfDemoCodeAndContestId(demoCode, contestId);
    }
    public int insertOfDemoCodeAndUserId(String demoCode, String userId) {
        return dao.insertOfDemoCodeAndUserId(demoCode, userId);
    }
    public int insertOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        return dao.insertOfRightPeopleAndMainPeople(rightPeople, mainPeople);
    }
    public int insertOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        return dao.insertOfRightPeopleAndStartTime(rightPeople, startTime);
    }
    public int insertOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        return dao.insertOfRightPeopleAndEndTime(rightPeople, endTime);
    }
    public int insertOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        return dao.insertOfRightPeopleAndInputFormat(rightPeople, inputFormat);
    }
    public int insertOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        return dao.insertOfRightPeopleAndOutputFormat(rightPeople, outputFormat);
    }
    public int insertOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        return dao.insertOfRightPeopleAndInputTest(rightPeople, inputTest);
    }
    public int insertOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        return dao.insertOfRightPeopleAndOutputTest(rightPeople, outputTest);
    }
    public int insertOfRightPeopleAndContestId(String rightPeople, String contestId) {
        return dao.insertOfRightPeopleAndContestId(rightPeople, contestId);
    }
    public int insertOfRightPeopleAndUserId(String rightPeople, String userId) {
        return dao.insertOfRightPeopleAndUserId(rightPeople, userId);
    }
    public int insertOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        return dao.insertOfMainPeopleAndStartTime(mainPeople, startTime);
    }
    public int insertOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        return dao.insertOfMainPeopleAndEndTime(mainPeople, endTime);
    }
    public int insertOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        return dao.insertOfMainPeopleAndInputFormat(mainPeople, inputFormat);
    }
    public int insertOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        return dao.insertOfMainPeopleAndOutputFormat(mainPeople, outputFormat);
    }
    public int insertOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        return dao.insertOfMainPeopleAndInputTest(mainPeople, inputTest);
    }
    public int insertOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        return dao.insertOfMainPeopleAndOutputTest(mainPeople, outputTest);
    }
    public int insertOfMainPeopleAndContestId(String mainPeople, String contestId) {
        return dao.insertOfMainPeopleAndContestId(mainPeople, contestId);
    }
    public int insertOfMainPeopleAndUserId(String mainPeople, String userId) {
        return dao.insertOfMainPeopleAndUserId(mainPeople, userId);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.insertOfStartTimeAndEndTime(startTime, endTime);
    }
    public int insertOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        return dao.insertOfStartTimeAndInputFormat(startTime, inputFormat);
    }
    public int insertOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        return dao.insertOfStartTimeAndOutputFormat(startTime, outputFormat);
    }
    public int insertOfStartTimeAndInputTest(String startTime, String inputTest) {
        return dao.insertOfStartTimeAndInputTest(startTime, inputTest);
    }
    public int insertOfStartTimeAndOutputTest(String startTime, String outputTest) {
        return dao.insertOfStartTimeAndOutputTest(startTime, outputTest);
    }
    public int insertOfStartTimeAndContestId(String startTime, String contestId) {
        return dao.insertOfStartTimeAndContestId(startTime, contestId);
    }
    public int insertOfStartTimeAndUserId(String startTime, String userId) {
        return dao.insertOfStartTimeAndUserId(startTime, userId);
    }
    public int insertOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        return dao.insertOfEndTimeAndInputFormat(endTime, inputFormat);
    }
    public int insertOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        return dao.insertOfEndTimeAndOutputFormat(endTime, outputFormat);
    }
    public int insertOfEndTimeAndInputTest(String endTime, String inputTest) {
        return dao.insertOfEndTimeAndInputTest(endTime, inputTest);
    }
    public int insertOfEndTimeAndOutputTest(String endTime, String outputTest) {
        return dao.insertOfEndTimeAndOutputTest(endTime, outputTest);
    }
    public int insertOfEndTimeAndContestId(String endTime, String contestId) {
        return dao.insertOfEndTimeAndContestId(endTime, contestId);
    }
    public int insertOfEndTimeAndUserId(String endTime, String userId) {
        return dao.insertOfEndTimeAndUserId(endTime, userId);
    }
    public int insertOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        return dao.insertOfInputFormatAndOutputFormat(inputFormat, outputFormat);
    }
    public int insertOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        return dao.insertOfInputFormatAndInputTest(inputFormat, inputTest);
    }
    public int insertOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        return dao.insertOfInputFormatAndOutputTest(inputFormat, outputTest);
    }
    public int insertOfInputFormatAndContestId(String inputFormat, String contestId) {
        return dao.insertOfInputFormatAndContestId(inputFormat, contestId);
    }
    public int insertOfInputFormatAndUserId(String inputFormat, String userId) {
        return dao.insertOfInputFormatAndUserId(inputFormat, userId);
    }
    public int insertOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        return dao.insertOfOutputFormatAndInputTest(outputFormat, inputTest);
    }
    public int insertOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        return dao.insertOfOutputFormatAndOutputTest(outputFormat, outputTest);
    }
    public int insertOfOutputFormatAndContestId(String outputFormat, String contestId) {
        return dao.insertOfOutputFormatAndContestId(outputFormat, contestId);
    }
    public int insertOfOutputFormatAndUserId(String outputFormat, String userId) {
        return dao.insertOfOutputFormatAndUserId(outputFormat, userId);
    }
    public int insertOfInputTestAndOutputTest(String inputTest, String outputTest) {
        return dao.insertOfInputTestAndOutputTest(inputTest, outputTest);
    }
    public int insertOfInputTestAndContestId(String inputTest, String contestId) {
        return dao.insertOfInputTestAndContestId(inputTest, contestId);
    }
    public int insertOfInputTestAndUserId(String inputTest, String userId) {
        return dao.insertOfInputTestAndUserId(inputTest, userId);
    }
    public int insertOfOutputTestAndContestId(String outputTest, String contestId) {
        return dao.insertOfOutputTestAndContestId(outputTest, contestId);
    }
    public int insertOfOutputTestAndUserId(String outputTest, String userId) {
        return dao.insertOfOutputTestAndUserId(outputTest, userId);
    }
    public int insertOfContestIdAndUserId(String contestId, String userId) {
        return dao.insertOfContestIdAndUserId(contestId, userId);
    }
    public Question getQuestion(Question question) {
        return dao.getQuestion(question);
    }
    public Question getQuestionOfQuestionId(String questionId) {
        return dao.getQuestionOfQuestionId(questionId);
    }
    public Question getQuestionOfTitle(String title) {
        return dao.getQuestionOfTitle(title);
    }
    public Question getQuestionOfBody(String body) {
        return dao.getQuestionOfBody(body);
    }
    public Question getQuestionOfScore(String score) {
        return dao.getQuestionOfScore(score);
    }
    public Question getQuestionOfDemoCode(String demoCode) {
        return dao.getQuestionOfDemoCode(demoCode);
    }
    public Question getQuestionOfRightPeople(String rightPeople) {
        return dao.getQuestionOfRightPeople(rightPeople);
    }
    public Question getQuestionOfMainPeople(String mainPeople) {
        return dao.getQuestionOfMainPeople(mainPeople);
    }
    public Question getQuestionOfStartTime(String startTime) {
        return dao.getQuestionOfStartTime(startTime);
    }
    public Question getQuestionOfEndTime(String endTime) {
        return dao.getQuestionOfEndTime(endTime);
    }
    public Question getQuestionOfInputFormat(String inputFormat) {
        return dao.getQuestionOfInputFormat(inputFormat);
    }
    public Question getQuestionOfOutputFormat(String outputFormat) {
        return dao.getQuestionOfOutputFormat(outputFormat);
    }
    public Question getQuestionOfInputTest(String inputTest) {
        return dao.getQuestionOfInputTest(inputTest);
    }
    public Question getQuestionOfOutputTest(String outputTest) {
        return dao.getQuestionOfOutputTest(outputTest);
    }
    public Question getQuestionOfContestId(String contestId) {
        return dao.getQuestionOfContestId(contestId);
    }
    public Question getQuestionOfUserId(String userId) {
        return dao.getQuestionOfUserId(userId);
    }
    public Question getQuestionOfQuestionIdAndTitle(String questionId, String title) {
        return dao.getQuestionOfQuestionIdAndTitle(questionId, title);
    }
    public Question getQuestionOfQuestionIdAndBody(String questionId, String body) {
        return dao.getQuestionOfQuestionIdAndBody(questionId, body);
    }
    public Question getQuestionOfQuestionIdAndScore(String questionId, String score) {
        return dao.getQuestionOfQuestionIdAndScore(questionId, score);
    }
    public Question getQuestionOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        return dao.getQuestionOfQuestionIdAndDemoCode(questionId, demoCode);
    }
    public Question getQuestionOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        return dao.getQuestionOfQuestionIdAndRightPeople(questionId, rightPeople);
    }
    public Question getQuestionOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        return dao.getQuestionOfQuestionIdAndMainPeople(questionId, mainPeople);
    }
    public Question getQuestionOfQuestionIdAndStartTime(String questionId, String startTime) {
        return dao.getQuestionOfQuestionIdAndStartTime(questionId, startTime);
    }
    public Question getQuestionOfQuestionIdAndEndTime(String questionId, String endTime) {
        return dao.getQuestionOfQuestionIdAndEndTime(questionId, endTime);
    }
    public Question getQuestionOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        return dao.getQuestionOfQuestionIdAndInputFormat(questionId, inputFormat);
    }
    public Question getQuestionOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        return dao.getQuestionOfQuestionIdAndOutputFormat(questionId, outputFormat);
    }
    public Question getQuestionOfQuestionIdAndInputTest(String questionId, String inputTest) {
        return dao.getQuestionOfQuestionIdAndInputTest(questionId, inputTest);
    }
    public Question getQuestionOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        return dao.getQuestionOfQuestionIdAndOutputTest(questionId, outputTest);
    }
    public Question getQuestionOfQuestionIdAndContestId(String questionId, String contestId) {
        return dao.getQuestionOfQuestionIdAndContestId(questionId, contestId);
    }
    public Question getQuestionOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.getQuestionOfQuestionIdAndUserId(questionId, userId);
    }
    public Question getQuestionOfTitleAndBody(String title, String body) {
        return dao.getQuestionOfTitleAndBody(title, body);
    }
    public Question getQuestionOfTitleAndScore(String title, String score) {
        return dao.getQuestionOfTitleAndScore(title, score);
    }
    public Question getQuestionOfTitleAndDemoCode(String title, String demoCode) {
        return dao.getQuestionOfTitleAndDemoCode(title, demoCode);
    }
    public Question getQuestionOfTitleAndRightPeople(String title, String rightPeople) {
        return dao.getQuestionOfTitleAndRightPeople(title, rightPeople);
    }
    public Question getQuestionOfTitleAndMainPeople(String title, String mainPeople) {
        return dao.getQuestionOfTitleAndMainPeople(title, mainPeople);
    }
    public Question getQuestionOfTitleAndStartTime(String title, String startTime) {
        return dao.getQuestionOfTitleAndStartTime(title, startTime);
    }
    public Question getQuestionOfTitleAndEndTime(String title, String endTime) {
        return dao.getQuestionOfTitleAndEndTime(title, endTime);
    }
    public Question getQuestionOfTitleAndInputFormat(String title, String inputFormat) {
        return dao.getQuestionOfTitleAndInputFormat(title, inputFormat);
    }
    public Question getQuestionOfTitleAndOutputFormat(String title, String outputFormat) {
        return dao.getQuestionOfTitleAndOutputFormat(title, outputFormat);
    }
    public Question getQuestionOfTitleAndInputTest(String title, String inputTest) {
        return dao.getQuestionOfTitleAndInputTest(title, inputTest);
    }
    public Question getQuestionOfTitleAndOutputTest(String title, String outputTest) {
        return dao.getQuestionOfTitleAndOutputTest(title, outputTest);
    }
    public Question getQuestionOfTitleAndContestId(String title, String contestId) {
        return dao.getQuestionOfTitleAndContestId(title, contestId);
    }
    public Question getQuestionOfTitleAndUserId(String title, String userId) {
        return dao.getQuestionOfTitleAndUserId(title, userId);
    }
    public Question getQuestionOfBodyAndScore(String body, String score) {
        return dao.getQuestionOfBodyAndScore(body, score);
    }
    public Question getQuestionOfBodyAndDemoCode(String body, String demoCode) {
        return dao.getQuestionOfBodyAndDemoCode(body, demoCode);
    }
    public Question getQuestionOfBodyAndRightPeople(String body, String rightPeople) {
        return dao.getQuestionOfBodyAndRightPeople(body, rightPeople);
    }
    public Question getQuestionOfBodyAndMainPeople(String body, String mainPeople) {
        return dao.getQuestionOfBodyAndMainPeople(body, mainPeople);
    }
    public Question getQuestionOfBodyAndStartTime(String body, String startTime) {
        return dao.getQuestionOfBodyAndStartTime(body, startTime);
    }
    public Question getQuestionOfBodyAndEndTime(String body, String endTime) {
        return dao.getQuestionOfBodyAndEndTime(body, endTime);
    }
    public Question getQuestionOfBodyAndInputFormat(String body, String inputFormat) {
        return dao.getQuestionOfBodyAndInputFormat(body, inputFormat);
    }
    public Question getQuestionOfBodyAndOutputFormat(String body, String outputFormat) {
        return dao.getQuestionOfBodyAndOutputFormat(body, outputFormat);
    }
    public Question getQuestionOfBodyAndInputTest(String body, String inputTest) {
        return dao.getQuestionOfBodyAndInputTest(body, inputTest);
    }
    public Question getQuestionOfBodyAndOutputTest(String body, String outputTest) {
        return dao.getQuestionOfBodyAndOutputTest(body, outputTest);
    }
    public Question getQuestionOfBodyAndContestId(String body, String contestId) {
        return dao.getQuestionOfBodyAndContestId(body, contestId);
    }
    public Question getQuestionOfBodyAndUserId(String body, String userId) {
        return dao.getQuestionOfBodyAndUserId(body, userId);
    }
    public Question getQuestionOfScoreAndDemoCode(String score, String demoCode) {
        return dao.getQuestionOfScoreAndDemoCode(score, demoCode);
    }
    public Question getQuestionOfScoreAndRightPeople(String score, String rightPeople) {
        return dao.getQuestionOfScoreAndRightPeople(score, rightPeople);
    }
    public Question getQuestionOfScoreAndMainPeople(String score, String mainPeople) {
        return dao.getQuestionOfScoreAndMainPeople(score, mainPeople);
    }
    public Question getQuestionOfScoreAndStartTime(String score, String startTime) {
        return dao.getQuestionOfScoreAndStartTime(score, startTime);
    }
    public Question getQuestionOfScoreAndEndTime(String score, String endTime) {
        return dao.getQuestionOfScoreAndEndTime(score, endTime);
    }
    public Question getQuestionOfScoreAndInputFormat(String score, String inputFormat) {
        return dao.getQuestionOfScoreAndInputFormat(score, inputFormat);
    }
    public Question getQuestionOfScoreAndOutputFormat(String score, String outputFormat) {
        return dao.getQuestionOfScoreAndOutputFormat(score, outputFormat);
    }
    public Question getQuestionOfScoreAndInputTest(String score, String inputTest) {
        return dao.getQuestionOfScoreAndInputTest(score, inputTest);
    }
    public Question getQuestionOfScoreAndOutputTest(String score, String outputTest) {
        return dao.getQuestionOfScoreAndOutputTest(score, outputTest);
    }
    public Question getQuestionOfScoreAndContestId(String score, String contestId) {
        return dao.getQuestionOfScoreAndContestId(score, contestId);
    }
    public Question getQuestionOfScoreAndUserId(String score, String userId) {
        return dao.getQuestionOfScoreAndUserId(score, userId);
    }
    public Question getQuestionOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        return dao.getQuestionOfDemoCodeAndRightPeople(demoCode, rightPeople);
    }
    public Question getQuestionOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        return dao.getQuestionOfDemoCodeAndMainPeople(demoCode, mainPeople);
    }
    public Question getQuestionOfDemoCodeAndStartTime(String demoCode, String startTime) {
        return dao.getQuestionOfDemoCodeAndStartTime(demoCode, startTime);
    }
    public Question getQuestionOfDemoCodeAndEndTime(String demoCode, String endTime) {
        return dao.getQuestionOfDemoCodeAndEndTime(demoCode, endTime);
    }
    public Question getQuestionOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        return dao.getQuestionOfDemoCodeAndInputFormat(demoCode, inputFormat);
    }
    public Question getQuestionOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        return dao.getQuestionOfDemoCodeAndOutputFormat(demoCode, outputFormat);
    }
    public Question getQuestionOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        return dao.getQuestionOfDemoCodeAndInputTest(demoCode, inputTest);
    }
    public Question getQuestionOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        return dao.getQuestionOfDemoCodeAndOutputTest(demoCode, outputTest);
    }
    public Question getQuestionOfDemoCodeAndContestId(String demoCode, String contestId) {
        return dao.getQuestionOfDemoCodeAndContestId(demoCode, contestId);
    }
    public Question getQuestionOfDemoCodeAndUserId(String demoCode, String userId) {
        return dao.getQuestionOfDemoCodeAndUserId(demoCode, userId);
    }
    public Question getQuestionOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        return dao.getQuestionOfRightPeopleAndMainPeople(rightPeople, mainPeople);
    }
    public Question getQuestionOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        return dao.getQuestionOfRightPeopleAndStartTime(rightPeople, startTime);
    }
    public Question getQuestionOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        return dao.getQuestionOfRightPeopleAndEndTime(rightPeople, endTime);
    }
    public Question getQuestionOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        return dao.getQuestionOfRightPeopleAndInputFormat(rightPeople, inputFormat);
    }
    public Question getQuestionOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        return dao.getQuestionOfRightPeopleAndOutputFormat(rightPeople, outputFormat);
    }
    public Question getQuestionOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        return dao.getQuestionOfRightPeopleAndInputTest(rightPeople, inputTest);
    }
    public Question getQuestionOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        return dao.getQuestionOfRightPeopleAndOutputTest(rightPeople, outputTest);
    }
    public Question getQuestionOfRightPeopleAndContestId(String rightPeople, String contestId) {
        return dao.getQuestionOfRightPeopleAndContestId(rightPeople, contestId);
    }
    public Question getQuestionOfRightPeopleAndUserId(String rightPeople, String userId) {
        return dao.getQuestionOfRightPeopleAndUserId(rightPeople, userId);
    }
    public Question getQuestionOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        return dao.getQuestionOfMainPeopleAndStartTime(mainPeople, startTime);
    }
    public Question getQuestionOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        return dao.getQuestionOfMainPeopleAndEndTime(mainPeople, endTime);
    }
    public Question getQuestionOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        return dao.getQuestionOfMainPeopleAndInputFormat(mainPeople, inputFormat);
    }
    public Question getQuestionOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        return dao.getQuestionOfMainPeopleAndOutputFormat(mainPeople, outputFormat);
    }
    public Question getQuestionOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        return dao.getQuestionOfMainPeopleAndInputTest(mainPeople, inputTest);
    }
    public Question getQuestionOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        return dao.getQuestionOfMainPeopleAndOutputTest(mainPeople, outputTest);
    }
    public Question getQuestionOfMainPeopleAndContestId(String mainPeople, String contestId) {
        return dao.getQuestionOfMainPeopleAndContestId(mainPeople, contestId);
    }
    public Question getQuestionOfMainPeopleAndUserId(String mainPeople, String userId) {
        return dao.getQuestionOfMainPeopleAndUserId(mainPeople, userId);
    }
    public Question getQuestionOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getQuestionOfStartTimeAndEndTime(startTime, endTime);
    }
    public Question getQuestionOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        return dao.getQuestionOfStartTimeAndInputFormat(startTime, inputFormat);
    }
    public Question getQuestionOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        return dao.getQuestionOfStartTimeAndOutputFormat(startTime, outputFormat);
    }
    public Question getQuestionOfStartTimeAndInputTest(String startTime, String inputTest) {
        return dao.getQuestionOfStartTimeAndInputTest(startTime, inputTest);
    }
    public Question getQuestionOfStartTimeAndOutputTest(String startTime, String outputTest) {
        return dao.getQuestionOfStartTimeAndOutputTest(startTime, outputTest);
    }
    public Question getQuestionOfStartTimeAndContestId(String startTime, String contestId) {
        return dao.getQuestionOfStartTimeAndContestId(startTime, contestId);
    }
    public Question getQuestionOfStartTimeAndUserId(String startTime, String userId) {
        return dao.getQuestionOfStartTimeAndUserId(startTime, userId);
    }
    public Question getQuestionOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        return dao.getQuestionOfEndTimeAndInputFormat(endTime, inputFormat);
    }
    public Question getQuestionOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        return dao.getQuestionOfEndTimeAndOutputFormat(endTime, outputFormat);
    }
    public Question getQuestionOfEndTimeAndInputTest(String endTime, String inputTest) {
        return dao.getQuestionOfEndTimeAndInputTest(endTime, inputTest);
    }
    public Question getQuestionOfEndTimeAndOutputTest(String endTime, String outputTest) {
        return dao.getQuestionOfEndTimeAndOutputTest(endTime, outputTest);
    }
    public Question getQuestionOfEndTimeAndContestId(String endTime, String contestId) {
        return dao.getQuestionOfEndTimeAndContestId(endTime, contestId);
    }
    public Question getQuestionOfEndTimeAndUserId(String endTime, String userId) {
        return dao.getQuestionOfEndTimeAndUserId(endTime, userId);
    }
    public Question getQuestionOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        return dao.getQuestionOfInputFormatAndOutputFormat(inputFormat, outputFormat);
    }
    public Question getQuestionOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        return dao.getQuestionOfInputFormatAndInputTest(inputFormat, inputTest);
    }
    public Question getQuestionOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        return dao.getQuestionOfInputFormatAndOutputTest(inputFormat, outputTest);
    }
    public Question getQuestionOfInputFormatAndContestId(String inputFormat, String contestId) {
        return dao.getQuestionOfInputFormatAndContestId(inputFormat, contestId);
    }
    public Question getQuestionOfInputFormatAndUserId(String inputFormat, String userId) {
        return dao.getQuestionOfInputFormatAndUserId(inputFormat, userId);
    }
    public Question getQuestionOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        return dao.getQuestionOfOutputFormatAndInputTest(outputFormat, inputTest);
    }
    public Question getQuestionOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        return dao.getQuestionOfOutputFormatAndOutputTest(outputFormat, outputTest);
    }
    public Question getQuestionOfOutputFormatAndContestId(String outputFormat, String contestId) {
        return dao.getQuestionOfOutputFormatAndContestId(outputFormat, contestId);
    }
    public Question getQuestionOfOutputFormatAndUserId(String outputFormat, String userId) {
        return dao.getQuestionOfOutputFormatAndUserId(outputFormat, userId);
    }
    public Question getQuestionOfInputTestAndOutputTest(String inputTest, String outputTest) {
        return dao.getQuestionOfInputTestAndOutputTest(inputTest, outputTest);
    }
    public Question getQuestionOfInputTestAndContestId(String inputTest, String contestId) {
        return dao.getQuestionOfInputTestAndContestId(inputTest, contestId);
    }
    public Question getQuestionOfInputTestAndUserId(String inputTest, String userId) {
        return dao.getQuestionOfInputTestAndUserId(inputTest, userId);
    }
    public Question getQuestionOfOutputTestAndContestId(String outputTest, String contestId) {
        return dao.getQuestionOfOutputTestAndContestId(outputTest, contestId);
    }
    public Question getQuestionOfOutputTestAndUserId(String outputTest, String userId) {
        return dao.getQuestionOfOutputTestAndUserId(outputTest, userId);
    }
    public Question getQuestionOfContestIdAndUserId(String contestId, String userId) {
        return dao.getQuestionOfContestIdAndUserId(contestId, userId);
    }
    public List<Question> getQuestions(Question question) {
        return dao.getQuestions(question);
    }
    public List<Question> getQuestionsOfQuestionId(String questionId) {
        return dao.getQuestionsOfQuestionId(questionId);
    }
    public List<Question> getQuestionsOfTitle(String title) {
        return dao.getQuestionsOfTitle(title);
    }
    public List<Question> getQuestionsOfBody(String body) {
        return dao.getQuestionsOfBody(body);
    }
    public List<Question> getQuestionsOfScore(String score) {
        return dao.getQuestionsOfScore(score);
    }
    public List<Question> getQuestionsOfDemoCode(String demoCode) {
        return dao.getQuestionsOfDemoCode(demoCode);
    }
    public List<Question> getQuestionsOfRightPeople(String rightPeople) {
        return dao.getQuestionsOfRightPeople(rightPeople);
    }
    public List<Question> getQuestionsOfMainPeople(String mainPeople) {
        return dao.getQuestionsOfMainPeople(mainPeople);
    }
    public List<Question> getQuestionsOfStartTime(String startTime) {
        return dao.getQuestionsOfStartTime(startTime);
    }
    public List<Question> getQuestionsOfEndTime(String endTime) {
        return dao.getQuestionsOfEndTime(endTime);
    }
    public List<Question> getQuestionsOfInputFormat(String inputFormat) {
        return dao.getQuestionsOfInputFormat(inputFormat);
    }
    public List<Question> getQuestionsOfOutputFormat(String outputFormat) {
        return dao.getQuestionsOfOutputFormat(outputFormat);
    }
    public List<Question> getQuestionsOfInputTest(String inputTest) {
        return dao.getQuestionsOfInputTest(inputTest);
    }
    public List<Question> getQuestionsOfOutputTest(String outputTest) {
        return dao.getQuestionsOfOutputTest(outputTest);
    }
    public List<Question> getQuestionsOfContestId(String contestId) {
        return dao.getQuestionsOfContestId(contestId);
    }
    public List<Question> getQuestionsOfUserId(String userId) {
        return dao.getQuestionsOfUserId(userId);
    }
    public List<Question> getQuestionsOfQuestionIdAndTitle(String questionId, String title) {
        return dao.getQuestionsOfQuestionIdAndTitle(questionId, title);
    }
    public List<Question> getQuestionsOfQuestionIdAndBody(String questionId, String body) {
        return dao.getQuestionsOfQuestionIdAndBody(questionId, body);
    }
    public List<Question> getQuestionsOfQuestionIdAndScore(String questionId, String score) {
        return dao.getQuestionsOfQuestionIdAndScore(questionId, score);
    }
    public List<Question> getQuestionsOfQuestionIdAndDemoCode(String questionId, String demoCode) {
        return dao.getQuestionsOfQuestionIdAndDemoCode(questionId, demoCode);
    }
    public List<Question> getQuestionsOfQuestionIdAndRightPeople(String questionId, String rightPeople) {
        return dao.getQuestionsOfQuestionIdAndRightPeople(questionId, rightPeople);
    }
    public List<Question> getQuestionsOfQuestionIdAndMainPeople(String questionId, String mainPeople) {
        return dao.getQuestionsOfQuestionIdAndMainPeople(questionId, mainPeople);
    }
    public List<Question> getQuestionsOfQuestionIdAndStartTime(String questionId, String startTime) {
        return dao.getQuestionsOfQuestionIdAndStartTime(questionId, startTime);
    }
    public List<Question> getQuestionsOfQuestionIdAndEndTime(String questionId, String endTime) {
        return dao.getQuestionsOfQuestionIdAndEndTime(questionId, endTime);
    }
    public List<Question> getQuestionsOfQuestionIdAndInputFormat(String questionId, String inputFormat) {
        return dao.getQuestionsOfQuestionIdAndInputFormat(questionId, inputFormat);
    }
    public List<Question> getQuestionsOfQuestionIdAndOutputFormat(String questionId, String outputFormat) {
        return dao.getQuestionsOfQuestionIdAndOutputFormat(questionId, outputFormat);
    }
    public List<Question> getQuestionsOfQuestionIdAndInputTest(String questionId, String inputTest) {
        return dao.getQuestionsOfQuestionIdAndInputTest(questionId, inputTest);
    }
    public List<Question> getQuestionsOfQuestionIdAndOutputTest(String questionId, String outputTest) {
        return dao.getQuestionsOfQuestionIdAndOutputTest(questionId, outputTest);
    }
    public List<Question> getQuestionsOfQuestionIdAndContestId(String questionId, String contestId) {
        return dao.getQuestionsOfQuestionIdAndContestId(questionId, contestId);
    }
    public List<Question> getQuestionsOfQuestionIdAndUserId(String questionId, String userId) {
        return dao.getQuestionsOfQuestionIdAndUserId(questionId, userId);
    }
    public List<Question> getQuestionsOfTitleAndBody(String title, String body) {
        return dao.getQuestionsOfTitleAndBody(title, body);
    }
    public List<Question> getQuestionsOfTitleAndScore(String title, String score) {
        return dao.getQuestionsOfTitleAndScore(title, score);
    }
    public List<Question> getQuestionsOfTitleAndDemoCode(String title, String demoCode) {
        return dao.getQuestionsOfTitleAndDemoCode(title, demoCode);
    }
    public List<Question> getQuestionsOfTitleAndRightPeople(String title, String rightPeople) {
        return dao.getQuestionsOfTitleAndRightPeople(title, rightPeople);
    }
    public List<Question> getQuestionsOfTitleAndMainPeople(String title, String mainPeople) {
        return dao.getQuestionsOfTitleAndMainPeople(title, mainPeople);
    }
    public List<Question> getQuestionsOfTitleAndStartTime(String title, String startTime) {
        return dao.getQuestionsOfTitleAndStartTime(title, startTime);
    }
    public List<Question> getQuestionsOfTitleAndEndTime(String title, String endTime) {
        return dao.getQuestionsOfTitleAndEndTime(title, endTime);
    }
    public List<Question> getQuestionsOfTitleAndInputFormat(String title, String inputFormat) {
        return dao.getQuestionsOfTitleAndInputFormat(title, inputFormat);
    }
    public List<Question> getQuestionsOfTitleAndOutputFormat(String title, String outputFormat) {
        return dao.getQuestionsOfTitleAndOutputFormat(title, outputFormat);
    }
    public List<Question> getQuestionsOfTitleAndInputTest(String title, String inputTest) {
        return dao.getQuestionsOfTitleAndInputTest(title, inputTest);
    }
    public List<Question> getQuestionsOfTitleAndOutputTest(String title, String outputTest) {
        return dao.getQuestionsOfTitleAndOutputTest(title, outputTest);
    }
    public List<Question> getQuestionsOfTitleAndContestId(String title, String contestId) {
        return dao.getQuestionsOfTitleAndContestId(title, contestId);
    }
    public List<Question> getQuestionsOfTitleAndUserId(String title, String userId) {
        return dao.getQuestionsOfTitleAndUserId(title, userId);
    }
    public List<Question> getQuestionsOfBodyAndScore(String body, String score) {
        return dao.getQuestionsOfBodyAndScore(body, score);
    }
    public List<Question> getQuestionsOfBodyAndDemoCode(String body, String demoCode) {
        return dao.getQuestionsOfBodyAndDemoCode(body, demoCode);
    }
    public List<Question> getQuestionsOfBodyAndRightPeople(String body, String rightPeople) {
        return dao.getQuestionsOfBodyAndRightPeople(body, rightPeople);
    }
    public List<Question> getQuestionsOfBodyAndMainPeople(String body, String mainPeople) {
        return dao.getQuestionsOfBodyAndMainPeople(body, mainPeople);
    }
    public List<Question> getQuestionsOfBodyAndStartTime(String body, String startTime) {
        return dao.getQuestionsOfBodyAndStartTime(body, startTime);
    }
    public List<Question> getQuestionsOfBodyAndEndTime(String body, String endTime) {
        return dao.getQuestionsOfBodyAndEndTime(body, endTime);
    }
    public List<Question> getQuestionsOfBodyAndInputFormat(String body, String inputFormat) {
        return dao.getQuestionsOfBodyAndInputFormat(body, inputFormat);
    }
    public List<Question> getQuestionsOfBodyAndOutputFormat(String body, String outputFormat) {
        return dao.getQuestionsOfBodyAndOutputFormat(body, outputFormat);
    }
    public List<Question> getQuestionsOfBodyAndInputTest(String body, String inputTest) {
        return dao.getQuestionsOfBodyAndInputTest(body, inputTest);
    }
    public List<Question> getQuestionsOfBodyAndOutputTest(String body, String outputTest) {
        return dao.getQuestionsOfBodyAndOutputTest(body, outputTest);
    }
    public List<Question> getQuestionsOfBodyAndContestId(String body, String contestId) {
        return dao.getQuestionsOfBodyAndContestId(body, contestId);
    }
    public List<Question> getQuestionsOfBodyAndUserId(String body, String userId) {
        return dao.getQuestionsOfBodyAndUserId(body, userId);
    }
    public List<Question> getQuestionsOfScoreAndDemoCode(String score, String demoCode) {
        return dao.getQuestionsOfScoreAndDemoCode(score, demoCode);
    }
    public List<Question> getQuestionsOfScoreAndRightPeople(String score, String rightPeople) {
        return dao.getQuestionsOfScoreAndRightPeople(score, rightPeople);
    }
    public List<Question> getQuestionsOfScoreAndMainPeople(String score, String mainPeople) {
        return dao.getQuestionsOfScoreAndMainPeople(score, mainPeople);
    }
    public List<Question> getQuestionsOfScoreAndStartTime(String score, String startTime) {
        return dao.getQuestionsOfScoreAndStartTime(score, startTime);
    }
    public List<Question> getQuestionsOfScoreAndEndTime(String score, String endTime) {
        return dao.getQuestionsOfScoreAndEndTime(score, endTime);
    }
    public List<Question> getQuestionsOfScoreAndInputFormat(String score, String inputFormat) {
        return dao.getQuestionsOfScoreAndInputFormat(score, inputFormat);
    }
    public List<Question> getQuestionsOfScoreAndOutputFormat(String score, String outputFormat) {
        return dao.getQuestionsOfScoreAndOutputFormat(score, outputFormat);
    }
    public List<Question> getQuestionsOfScoreAndInputTest(String score, String inputTest) {
        return dao.getQuestionsOfScoreAndInputTest(score, inputTest);
    }
    public List<Question> getQuestionsOfScoreAndOutputTest(String score, String outputTest) {
        return dao.getQuestionsOfScoreAndOutputTest(score, outputTest);
    }
    public List<Question> getQuestionsOfScoreAndContestId(String score, String contestId) {
        return dao.getQuestionsOfScoreAndContestId(score, contestId);
    }
    public List<Question> getQuestionsOfScoreAndUserId(String score, String userId) {
        return dao.getQuestionsOfScoreAndUserId(score, userId);
    }
    public List<Question> getQuestionsOfDemoCodeAndRightPeople(String demoCode, String rightPeople) {
        return dao.getQuestionsOfDemoCodeAndRightPeople(demoCode, rightPeople);
    }
    public List<Question> getQuestionsOfDemoCodeAndMainPeople(String demoCode, String mainPeople) {
        return dao.getQuestionsOfDemoCodeAndMainPeople(demoCode, mainPeople);
    }
    public List<Question> getQuestionsOfDemoCodeAndStartTime(String demoCode, String startTime) {
        return dao.getQuestionsOfDemoCodeAndStartTime(demoCode, startTime);
    }
    public List<Question> getQuestionsOfDemoCodeAndEndTime(String demoCode, String endTime) {
        return dao.getQuestionsOfDemoCodeAndEndTime(demoCode, endTime);
    }
    public List<Question> getQuestionsOfDemoCodeAndInputFormat(String demoCode, String inputFormat) {
        return dao.getQuestionsOfDemoCodeAndInputFormat(demoCode, inputFormat);
    }
    public List<Question> getQuestionsOfDemoCodeAndOutputFormat(String demoCode, String outputFormat) {
        return dao.getQuestionsOfDemoCodeAndOutputFormat(demoCode, outputFormat);
    }
    public List<Question> getQuestionsOfDemoCodeAndInputTest(String demoCode, String inputTest) {
        return dao.getQuestionsOfDemoCodeAndInputTest(demoCode, inputTest);
    }
    public List<Question> getQuestionsOfDemoCodeAndOutputTest(String demoCode, String outputTest) {
        return dao.getQuestionsOfDemoCodeAndOutputTest(demoCode, outputTest);
    }
    public List<Question> getQuestionsOfDemoCodeAndContestId(String demoCode, String contestId) {
        return dao.getQuestionsOfDemoCodeAndContestId(demoCode, contestId);
    }
    public List<Question> getQuestionsOfDemoCodeAndUserId(String demoCode, String userId) {
        return dao.getQuestionsOfDemoCodeAndUserId(demoCode, userId);
    }
    public List<Question> getQuestionsOfRightPeopleAndMainPeople(String rightPeople, String mainPeople) {
        return dao.getQuestionsOfRightPeopleAndMainPeople(rightPeople, mainPeople);
    }
    public List<Question> getQuestionsOfRightPeopleAndStartTime(String rightPeople, String startTime) {
        return dao.getQuestionsOfRightPeopleAndStartTime(rightPeople, startTime);
    }
    public List<Question> getQuestionsOfRightPeopleAndEndTime(String rightPeople, String endTime) {
        return dao.getQuestionsOfRightPeopleAndEndTime(rightPeople, endTime);
    }
    public List<Question> getQuestionsOfRightPeopleAndInputFormat(String rightPeople, String inputFormat) {
        return dao.getQuestionsOfRightPeopleAndInputFormat(rightPeople, inputFormat);
    }
    public List<Question> getQuestionsOfRightPeopleAndOutputFormat(String rightPeople, String outputFormat) {
        return dao.getQuestionsOfRightPeopleAndOutputFormat(rightPeople, outputFormat);
    }
    public List<Question> getQuestionsOfRightPeopleAndInputTest(String rightPeople, String inputTest) {
        return dao.getQuestionsOfRightPeopleAndInputTest(rightPeople, inputTest);
    }
    public List<Question> getQuestionsOfRightPeopleAndOutputTest(String rightPeople, String outputTest) {
        return dao.getQuestionsOfRightPeopleAndOutputTest(rightPeople, outputTest);
    }
    public List<Question> getQuestionsOfRightPeopleAndContestId(String rightPeople, String contestId) {
        return dao.getQuestionsOfRightPeopleAndContestId(rightPeople, contestId);
    }
    public List<Question> getQuestionsOfRightPeopleAndUserId(String rightPeople, String userId) {
        return dao.getQuestionsOfRightPeopleAndUserId(rightPeople, userId);
    }
    public List<Question> getQuestionsOfMainPeopleAndStartTime(String mainPeople, String startTime) {
        return dao.getQuestionsOfMainPeopleAndStartTime(mainPeople, startTime);
    }
    public List<Question> getQuestionsOfMainPeopleAndEndTime(String mainPeople, String endTime) {
        return dao.getQuestionsOfMainPeopleAndEndTime(mainPeople, endTime);
    }
    public List<Question> getQuestionsOfMainPeopleAndInputFormat(String mainPeople, String inputFormat) {
        return dao.getQuestionsOfMainPeopleAndInputFormat(mainPeople, inputFormat);
    }
    public List<Question> getQuestionsOfMainPeopleAndOutputFormat(String mainPeople, String outputFormat) {
        return dao.getQuestionsOfMainPeopleAndOutputFormat(mainPeople, outputFormat);
    }
    public List<Question> getQuestionsOfMainPeopleAndInputTest(String mainPeople, String inputTest) {
        return dao.getQuestionsOfMainPeopleAndInputTest(mainPeople, inputTest);
    }
    public List<Question> getQuestionsOfMainPeopleAndOutputTest(String mainPeople, String outputTest) {
        return dao.getQuestionsOfMainPeopleAndOutputTest(mainPeople, outputTest);
    }
    public List<Question> getQuestionsOfMainPeopleAndContestId(String mainPeople, String contestId) {
        return dao.getQuestionsOfMainPeopleAndContestId(mainPeople, contestId);
    }
    public List<Question> getQuestionsOfMainPeopleAndUserId(String mainPeople, String userId) {
        return dao.getQuestionsOfMainPeopleAndUserId(mainPeople, userId);
    }
    public List<Question> getQuestionsOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getQuestionsOfStartTimeAndEndTime(startTime, endTime);
    }
    public List<Question> getQuestionsOfStartTimeAndInputFormat(String startTime, String inputFormat) {
        return dao.getQuestionsOfStartTimeAndInputFormat(startTime, inputFormat);
    }
    public List<Question> getQuestionsOfStartTimeAndOutputFormat(String startTime, String outputFormat) {
        return dao.getQuestionsOfStartTimeAndOutputFormat(startTime, outputFormat);
    }
    public List<Question> getQuestionsOfStartTimeAndInputTest(String startTime, String inputTest) {
        return dao.getQuestionsOfStartTimeAndInputTest(startTime, inputTest);
    }
    public List<Question> getQuestionsOfStartTimeAndOutputTest(String startTime, String outputTest) {
        return dao.getQuestionsOfStartTimeAndOutputTest(startTime, outputTest);
    }
    public List<Question> getQuestionsOfStartTimeAndContestId(String startTime, String contestId) {
        return dao.getQuestionsOfStartTimeAndContestId(startTime, contestId);
    }
    public List<Question> getQuestionsOfStartTimeAndUserId(String startTime, String userId) {
        return dao.getQuestionsOfStartTimeAndUserId(startTime, userId);
    }
    public List<Question> getQuestionsOfEndTimeAndInputFormat(String endTime, String inputFormat) {
        return dao.getQuestionsOfEndTimeAndInputFormat(endTime, inputFormat);
    }
    public List<Question> getQuestionsOfEndTimeAndOutputFormat(String endTime, String outputFormat) {
        return dao.getQuestionsOfEndTimeAndOutputFormat(endTime, outputFormat);
    }
    public List<Question> getQuestionsOfEndTimeAndInputTest(String endTime, String inputTest) {
        return dao.getQuestionsOfEndTimeAndInputTest(endTime, inputTest);
    }
    public List<Question> getQuestionsOfEndTimeAndOutputTest(String endTime, String outputTest) {
        return dao.getQuestionsOfEndTimeAndOutputTest(endTime, outputTest);
    }
    public List<Question> getQuestionsOfEndTimeAndContestId(String endTime, String contestId) {
        return dao.getQuestionsOfEndTimeAndContestId(endTime, contestId);
    }
    public List<Question> getQuestionsOfEndTimeAndUserId(String endTime, String userId) {
        return dao.getQuestionsOfEndTimeAndUserId(endTime, userId);
    }
    public List<Question> getQuestionsOfInputFormatAndOutputFormat(String inputFormat, String outputFormat) {
        return dao.getQuestionsOfInputFormatAndOutputFormat(inputFormat, outputFormat);
    }
    public List<Question> getQuestionsOfInputFormatAndInputTest(String inputFormat, String inputTest) {
        return dao.getQuestionsOfInputFormatAndInputTest(inputFormat, inputTest);
    }
    public List<Question> getQuestionsOfInputFormatAndOutputTest(String inputFormat, String outputTest) {
        return dao.getQuestionsOfInputFormatAndOutputTest(inputFormat, outputTest);
    }
    public List<Question> getQuestionsOfInputFormatAndContestId(String inputFormat, String contestId) {
        return dao.getQuestionsOfInputFormatAndContestId(inputFormat, contestId);
    }
    public List<Question> getQuestionsOfInputFormatAndUserId(String inputFormat, String userId) {
        return dao.getQuestionsOfInputFormatAndUserId(inputFormat, userId);
    }
    public List<Question> getQuestionsOfOutputFormatAndInputTest(String outputFormat, String inputTest) {
        return dao.getQuestionsOfOutputFormatAndInputTest(outputFormat, inputTest);
    }
    public List<Question> getQuestionsOfOutputFormatAndOutputTest(String outputFormat, String outputTest) {
        return dao.getQuestionsOfOutputFormatAndOutputTest(outputFormat, outputTest);
    }
    public List<Question> getQuestionsOfOutputFormatAndContestId(String outputFormat, String contestId) {
        return dao.getQuestionsOfOutputFormatAndContestId(outputFormat, contestId);
    }
    public List<Question> getQuestionsOfOutputFormatAndUserId(String outputFormat, String userId) {
        return dao.getQuestionsOfOutputFormatAndUserId(outputFormat, userId);
    }
    public List<Question> getQuestionsOfInputTestAndOutputTest(String inputTest, String outputTest) {
        return dao.getQuestionsOfInputTestAndOutputTest(inputTest, outputTest);
    }
    public List<Question> getQuestionsOfInputTestAndContestId(String inputTest, String contestId) {
        return dao.getQuestionsOfInputTestAndContestId(inputTest, contestId);
    }
    public List<Question> getQuestionsOfInputTestAndUserId(String inputTest, String userId) {
        return dao.getQuestionsOfInputTestAndUserId(inputTest, userId);
    }
    public List<Question> getQuestionsOfOutputTestAndContestId(String outputTest, String contestId) {
        return dao.getQuestionsOfOutputTestAndContestId(outputTest, contestId);
    }
    public List<Question> getQuestionsOfOutputTestAndUserId(String outputTest, String userId) {
        return dao.getQuestionsOfOutputTestAndUserId(outputTest, userId);
    }
    public List<Question> getQuestionsOfContestIdAndUserId(String contestId, String userId) {
        return dao.getQuestionsOfContestIdAndUserId(contestId, userId);
    }
}
