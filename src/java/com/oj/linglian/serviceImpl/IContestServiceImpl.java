package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Contest;

import com.oj.linglian.dao.IContestDao;
import com.oj.linglian.daoImpl.IContestDaoImpl;
import com.oj.linglian.service.IContestService;

public class IContestServiceImpl implements IContestService {
	IContestDao dao = null;

	public IContestServiceImpl() {
		dao = new IContestDaoImpl();
	}
    public int update(Contest contest, Contest keyContest) {
        return dao.update(contest, keyContest);
    }
    public int updateOfContestId(Contest contest, String contestId) {
        return dao.updateOfContestId(contest, contestId);
    }
    public int updateOfQuestionIds(Contest contest, String questionIds) {
        return dao.updateOfQuestionIds(contest, questionIds);
    }
    public int updateOfStartTime(Contest contest, String startTime) {
        return dao.updateOfStartTime(contest, startTime);
    }
    public int updateOfEndTime(Contest contest, String endTime) {
        return dao.updateOfEndTime(contest, endTime);
    }
    public int updateOfTitle(Contest contest, String title) {
        return dao.updateOfTitle(contest, title);
    }
    public int updateOfBody(Contest contest, String body) {
        return dao.updateOfBody(contest, body);
    }
    public int updateOfContestIdAndQuestionIds(Contest contest, String contestId, String questionIds) {
        return dao.updateOfContestIdAndQuestionIds(contest, contestId, questionIds);
    }
    public int updateOfContestIdAndStartTime(Contest contest, String contestId, String startTime) {
        return dao.updateOfContestIdAndStartTime(contest, contestId, startTime);
    }
    public int updateOfContestIdAndEndTime(Contest contest, String contestId, String endTime) {
        return dao.updateOfContestIdAndEndTime(contest, contestId, endTime);
    }
    public int updateOfContestIdAndTitle(Contest contest, String contestId, String title) {
        return dao.updateOfContestIdAndTitle(contest, contestId, title);
    }
    public int updateOfContestIdAndBody(Contest contest, String contestId, String body) {
        return dao.updateOfContestIdAndBody(contest, contestId, body);
    }
    public int updateOfQuestionIdsAndStartTime(Contest contest, String questionIds, String startTime) {
        return dao.updateOfQuestionIdsAndStartTime(contest, questionIds, startTime);
    }
    public int updateOfQuestionIdsAndEndTime(Contest contest, String questionIds, String endTime) {
        return dao.updateOfQuestionIdsAndEndTime(contest, questionIds, endTime);
    }
    public int updateOfQuestionIdsAndTitle(Contest contest, String questionIds, String title) {
        return dao.updateOfQuestionIdsAndTitle(contest, questionIds, title);
    }
    public int updateOfQuestionIdsAndBody(Contest contest, String questionIds, String body) {
        return dao.updateOfQuestionIdsAndBody(contest, questionIds, body);
    }
    public int updateOfStartTimeAndEndTime(Contest contest, String startTime, String endTime) {
        return dao.updateOfStartTimeAndEndTime(contest, startTime, endTime);
    }
    public int updateOfStartTimeAndTitle(Contest contest, String startTime, String title) {
        return dao.updateOfStartTimeAndTitle(contest, startTime, title);
    }
    public int updateOfStartTimeAndBody(Contest contest, String startTime, String body) {
        return dao.updateOfStartTimeAndBody(contest, startTime, body);
    }
    public int updateOfEndTimeAndTitle(Contest contest, String endTime, String title) {
        return dao.updateOfEndTimeAndTitle(contest, endTime, title);
    }
    public int updateOfEndTimeAndBody(Contest contest, String endTime, String body) {
        return dao.updateOfEndTimeAndBody(contest, endTime, body);
    }
    public int updateOfTitleAndBody(Contest contest, String title, String body) {
        return dao.updateOfTitleAndBody(contest, title, body);
    }
    public int remove(Contest contest) {
        return dao.remove(contest);
    }
    public int removeOfContestId(String contestId) {
        return dao.removeOfContestId(contestId);
    }
    public int removeOfQuestionIds(String questionIds) {
        return dao.removeOfQuestionIds(questionIds);
    }
    public int removeOfStartTime(String startTime) {
        return dao.removeOfStartTime(startTime);
    }
    public int removeOfEndTime(String endTime) {
        return dao.removeOfEndTime(endTime);
    }
    public int removeOfTitle(String title) {
        return dao.removeOfTitle(title);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfContestIdAndQuestionIds(String contestId, String questionIds) {
        return dao.removeOfContestIdAndQuestionIds(contestId, questionIds);
    }
    public int removeOfContestIdAndStartTime(String contestId, String startTime) {
        return dao.removeOfContestIdAndStartTime(contestId, startTime);
    }
    public int removeOfContestIdAndEndTime(String contestId, String endTime) {
        return dao.removeOfContestIdAndEndTime(contestId, endTime);
    }
    public int removeOfContestIdAndTitle(String contestId, String title) {
        return dao.removeOfContestIdAndTitle(contestId, title);
    }
    public int removeOfContestIdAndBody(String contestId, String body) {
        return dao.removeOfContestIdAndBody(contestId, body);
    }
    public int removeOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        return dao.removeOfQuestionIdsAndStartTime(questionIds, startTime);
    }
    public int removeOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        return dao.removeOfQuestionIdsAndEndTime(questionIds, endTime);
    }
    public int removeOfQuestionIdsAndTitle(String questionIds, String title) {
        return dao.removeOfQuestionIdsAndTitle(questionIds, title);
    }
    public int removeOfQuestionIdsAndBody(String questionIds, String body) {
        return dao.removeOfQuestionIdsAndBody(questionIds, body);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.removeOfStartTimeAndEndTime(startTime, endTime);
    }
    public int removeOfStartTimeAndTitle(String startTime, String title) {
        return dao.removeOfStartTimeAndTitle(startTime, title);
    }
    public int removeOfStartTimeAndBody(String startTime, String body) {
        return dao.removeOfStartTimeAndBody(startTime, body);
    }
    public int removeOfEndTimeAndTitle(String endTime, String title) {
        return dao.removeOfEndTimeAndTitle(endTime, title);
    }
    public int removeOfEndTimeAndBody(String endTime, String body) {
        return dao.removeOfEndTimeAndBody(endTime, body);
    }
    public int removeOfTitleAndBody(String title, String body) {
        return dao.removeOfTitleAndBody(title, body);
    }
    public int insert(Contest contest) {
        return dao.insert(contest);
    }
    public int insertOfContestId(String contestId) {
        return dao.insertOfContestId(contestId);
    }
    public int insertOfQuestionIds(String questionIds) {
        return dao.insertOfQuestionIds(questionIds);
    }
    public int insertOfStartTime(String startTime) {
        return dao.insertOfStartTime(startTime);
    }
    public int insertOfEndTime(String endTime) {
        return dao.insertOfEndTime(endTime);
    }
    public int insertOfTitle(String title) {
        return dao.insertOfTitle(title);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfContestIdAndQuestionIds(String contestId, String questionIds) {
        return dao.insertOfContestIdAndQuestionIds(contestId, questionIds);
    }
    public int insertOfContestIdAndStartTime(String contestId, String startTime) {
        return dao.insertOfContestIdAndStartTime(contestId, startTime);
    }
    public int insertOfContestIdAndEndTime(String contestId, String endTime) {
        return dao.insertOfContestIdAndEndTime(contestId, endTime);
    }
    public int insertOfContestIdAndTitle(String contestId, String title) {
        return dao.insertOfContestIdAndTitle(contestId, title);
    }
    public int insertOfContestIdAndBody(String contestId, String body) {
        return dao.insertOfContestIdAndBody(contestId, body);
    }
    public int insertOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        return dao.insertOfQuestionIdsAndStartTime(questionIds, startTime);
    }
    public int insertOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        return dao.insertOfQuestionIdsAndEndTime(questionIds, endTime);
    }
    public int insertOfQuestionIdsAndTitle(String questionIds, String title) {
        return dao.insertOfQuestionIdsAndTitle(questionIds, title);
    }
    public int insertOfQuestionIdsAndBody(String questionIds, String body) {
        return dao.insertOfQuestionIdsAndBody(questionIds, body);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.insertOfStartTimeAndEndTime(startTime, endTime);
    }
    public int insertOfStartTimeAndTitle(String startTime, String title) {
        return dao.insertOfStartTimeAndTitle(startTime, title);
    }
    public int insertOfStartTimeAndBody(String startTime, String body) {
        return dao.insertOfStartTimeAndBody(startTime, body);
    }
    public int insertOfEndTimeAndTitle(String endTime, String title) {
        return dao.insertOfEndTimeAndTitle(endTime, title);
    }
    public int insertOfEndTimeAndBody(String endTime, String body) {
        return dao.insertOfEndTimeAndBody(endTime, body);
    }
    public int insertOfTitleAndBody(String title, String body) {
        return dao.insertOfTitleAndBody(title, body);
    }
    public Contest getContest(Contest contest) {
        return dao.getContest(contest);
    }
    public Contest getContestOfContestId(String contestId) {
        return dao.getContestOfContestId(contestId);
    }
    public Contest getContestOfQuestionIds(String questionIds) {
        return dao.getContestOfQuestionIds(questionIds);
    }
    public Contest getContestOfStartTime(String startTime) {
        return dao.getContestOfStartTime(startTime);
    }
    public Contest getContestOfEndTime(String endTime) {
        return dao.getContestOfEndTime(endTime);
    }
    public Contest getContestOfTitle(String title) {
        return dao.getContestOfTitle(title);
    }
    public Contest getContestOfBody(String body) {
        return dao.getContestOfBody(body);
    }
    public Contest getContestOfContestIdAndQuestionIds(String contestId, String questionIds) {
        return dao.getContestOfContestIdAndQuestionIds(contestId, questionIds);
    }
    public Contest getContestOfContestIdAndStartTime(String contestId, String startTime) {
        return dao.getContestOfContestIdAndStartTime(contestId, startTime);
    }
    public Contest getContestOfContestIdAndEndTime(String contestId, String endTime) {
        return dao.getContestOfContestIdAndEndTime(contestId, endTime);
    }
    public Contest getContestOfContestIdAndTitle(String contestId, String title) {
        return dao.getContestOfContestIdAndTitle(contestId, title);
    }
    public Contest getContestOfContestIdAndBody(String contestId, String body) {
        return dao.getContestOfContestIdAndBody(contestId, body);
    }
    public Contest getContestOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        return dao.getContestOfQuestionIdsAndStartTime(questionIds, startTime);
    }
    public Contest getContestOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        return dao.getContestOfQuestionIdsAndEndTime(questionIds, endTime);
    }
    public Contest getContestOfQuestionIdsAndTitle(String questionIds, String title) {
        return dao.getContestOfQuestionIdsAndTitle(questionIds, title);
    }
    public Contest getContestOfQuestionIdsAndBody(String questionIds, String body) {
        return dao.getContestOfQuestionIdsAndBody(questionIds, body);
    }
    public Contest getContestOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getContestOfStartTimeAndEndTime(startTime, endTime);
    }
    public Contest getContestOfStartTimeAndTitle(String startTime, String title) {
        return dao.getContestOfStartTimeAndTitle(startTime, title);
    }
    public Contest getContestOfStartTimeAndBody(String startTime, String body) {
        return dao.getContestOfStartTimeAndBody(startTime, body);
    }
    public Contest getContestOfEndTimeAndTitle(String endTime, String title) {
        return dao.getContestOfEndTimeAndTitle(endTime, title);
    }
    public Contest getContestOfEndTimeAndBody(String endTime, String body) {
        return dao.getContestOfEndTimeAndBody(endTime, body);
    }
    public Contest getContestOfTitleAndBody(String title, String body) {
        return dao.getContestOfTitleAndBody(title, body);
    }
    public List<Contest> getContests(Contest contest) {
        return dao.getContests(contest);
    }
    public List<Contest> getContestsOfContestId(String contestId) {
        return dao.getContestsOfContestId(contestId);
    }
    public List<Contest> getContestsOfQuestionIds(String questionIds) {
        return dao.getContestsOfQuestionIds(questionIds);
    }
    public List<Contest> getContestsOfStartTime(String startTime) {
        return dao.getContestsOfStartTime(startTime);
    }
    public List<Contest> getContestsOfEndTime(String endTime) {
        return dao.getContestsOfEndTime(endTime);
    }
    public List<Contest> getContestsOfTitle(String title) {
        return dao.getContestsOfTitle(title);
    }
    public List<Contest> getContestsOfBody(String body) {
        return dao.getContestsOfBody(body);
    }
    public List<Contest> getContestsOfContestIdAndQuestionIds(String contestId, String questionIds) {
        return dao.getContestsOfContestIdAndQuestionIds(contestId, questionIds);
    }
    public List<Contest> getContestsOfContestIdAndStartTime(String contestId, String startTime) {
        return dao.getContestsOfContestIdAndStartTime(contestId, startTime);
    }
    public List<Contest> getContestsOfContestIdAndEndTime(String contestId, String endTime) {
        return dao.getContestsOfContestIdAndEndTime(contestId, endTime);
    }
    public List<Contest> getContestsOfContestIdAndTitle(String contestId, String title) {
        return dao.getContestsOfContestIdAndTitle(contestId, title);
    }
    public List<Contest> getContestsOfContestIdAndBody(String contestId, String body) {
        return dao.getContestsOfContestIdAndBody(contestId, body);
    }
    public List<Contest> getContestsOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        return dao.getContestsOfQuestionIdsAndStartTime(questionIds, startTime);
    }
    public List<Contest> getContestsOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        return dao.getContestsOfQuestionIdsAndEndTime(questionIds, endTime);
    }
    public List<Contest> getContestsOfQuestionIdsAndTitle(String questionIds, String title) {
        return dao.getContestsOfQuestionIdsAndTitle(questionIds, title);
    }
    public List<Contest> getContestsOfQuestionIdsAndBody(String questionIds, String body) {
        return dao.getContestsOfQuestionIdsAndBody(questionIds, body);
    }
    public List<Contest> getContestsOfStartTimeAndEndTime(String startTime, String endTime) {
        return dao.getContestsOfStartTimeAndEndTime(startTime, endTime);
    }
    public List<Contest> getContestsOfStartTimeAndTitle(String startTime, String title) {
        return dao.getContestsOfStartTimeAndTitle(startTime, title);
    }
    public List<Contest> getContestsOfStartTimeAndBody(String startTime, String body) {
        return dao.getContestsOfStartTimeAndBody(startTime, body);
    }
    public List<Contest> getContestsOfEndTimeAndTitle(String endTime, String title) {
        return dao.getContestsOfEndTimeAndTitle(endTime, title);
    }
    public List<Contest> getContestsOfEndTimeAndBody(String endTime, String body) {
        return dao.getContestsOfEndTimeAndBody(endTime, body);
    }
    public List<Contest> getContestsOfTitleAndBody(String title, String body) {
        return dao.getContestsOfTitleAndBody(title, body);
    }
}
