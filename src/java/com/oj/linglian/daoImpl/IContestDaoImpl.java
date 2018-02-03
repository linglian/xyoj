package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Contest;

import com.oj.linglian.dao.IContestDao;
import db.DBMan;

public class IContestDaoImpl implements IContestDao {
    public int update(Contest contest, Contest keyContest) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(contest, keyContest, "contest");
    }
    public int updateOfContestId(Contest contest, String contestId) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        return update(contest, kContest);
    }
    public int updateOfQuestionIds(Contest contest, String questionIds) {
        Contest kContest = new Contest();
        kContest.setQuestionIds(questionIds);
        return update(contest, kContest);
    }
    public int updateOfStartTime(Contest contest, String startTime) {
        Contest kContest = new Contest();
        kContest.setStartTime(startTime);
        return update(contest, kContest);
    }
    public int updateOfEndTime(Contest contest, String endTime) {
        Contest kContest = new Contest();
        kContest.setEndTime(endTime);
        return update(contest, kContest);
    }
    public int updateOfTitle(Contest contest, String title) {
        Contest kContest = new Contest();
        kContest.setTitle(title);
        return update(contest, kContest);
    }
    public int updateOfBody(Contest contest, String body) {
        Contest kContest = new Contest();
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int updateOfContestIdAndQuestionIds(Contest contest, String contestId, String questionIds) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        kContest.setQuestionIds(questionIds);
        return update(contest, kContest);
    }
    public int updateOfContestIdAndStartTime(Contest contest, String contestId, String startTime) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        kContest.setStartTime(startTime);
        return update(contest, kContest);
    }
    public int updateOfContestIdAndEndTime(Contest contest, String contestId, String endTime) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        kContest.setEndTime(endTime);
        return update(contest, kContest);
    }
    public int updateOfContestIdAndTitle(Contest contest, String contestId, String title) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        kContest.setTitle(title);
        return update(contest, kContest);
    }
    public int updateOfContestIdAndBody(Contest contest, String contestId, String body) {
        Contest kContest = new Contest();
        kContest.setContestId(contestId);
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int updateOfQuestionIdsAndStartTime(Contest contest, String questionIds, String startTime) {
        Contest kContest = new Contest();
        kContest.setQuestionIds(questionIds);
        kContest.setStartTime(startTime);
        return update(contest, kContest);
    }
    public int updateOfQuestionIdsAndEndTime(Contest contest, String questionIds, String endTime) {
        Contest kContest = new Contest();
        kContest.setQuestionIds(questionIds);
        kContest.setEndTime(endTime);
        return update(contest, kContest);
    }
    public int updateOfQuestionIdsAndTitle(Contest contest, String questionIds, String title) {
        Contest kContest = new Contest();
        kContest.setQuestionIds(questionIds);
        kContest.setTitle(title);
        return update(contest, kContest);
    }
    public int updateOfQuestionIdsAndBody(Contest contest, String questionIds, String body) {
        Contest kContest = new Contest();
        kContest.setQuestionIds(questionIds);
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int updateOfStartTimeAndEndTime(Contest contest, String startTime, String endTime) {
        Contest kContest = new Contest();
        kContest.setStartTime(startTime);
        kContest.setEndTime(endTime);
        return update(contest, kContest);
    }
    public int updateOfStartTimeAndTitle(Contest contest, String startTime, String title) {
        Contest kContest = new Contest();
        kContest.setStartTime(startTime);
        kContest.setTitle(title);
        return update(contest, kContest);
    }
    public int updateOfStartTimeAndBody(Contest contest, String startTime, String body) {
        Contest kContest = new Contest();
        kContest.setStartTime(startTime);
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int updateOfEndTimeAndTitle(Contest contest, String endTime, String title) {
        Contest kContest = new Contest();
        kContest.setEndTime(endTime);
        kContest.setTitle(title);
        return update(contest, kContest);
    }
    public int updateOfEndTimeAndBody(Contest contest, String endTime, String body) {
        Contest kContest = new Contest();
        kContest.setEndTime(endTime);
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int updateOfTitleAndBody(Contest contest, String title, String body) {
        Contest kContest = new Contest();
        kContest.setTitle(title);
        kContest.setBody(body);
        return update(contest, kContest);
    }
    public int remove(Contest contest) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(contest, "contest");
    }
    public int removeOfContestId(String contestId) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        return remove(contest);
    }
    public int removeOfQuestionIds(String questionIds) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        return remove(contest);
    }
    public int removeOfStartTime(String startTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        return remove(contest);
    }
    public int removeOfEndTime(String endTime) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        return remove(contest);
    }
    public int removeOfTitle(String title) {
        Contest contest = new Contest();
        contest.setTitle(title);
        return remove(contest);
    }
    public int removeOfBody(String body) {
        Contest contest = new Contest();
        contest.setBody(body);
        return remove(contest);
    }
    public int removeOfContestIdAndQuestionIds(String contestId, String questionIds) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setQuestionIds(questionIds);
        return remove(contest);
    }
    public int removeOfContestIdAndStartTime(String contestId, String startTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setStartTime(startTime);
        return remove(contest);
    }
    public int removeOfContestIdAndEndTime(String contestId, String endTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setEndTime(endTime);
        return remove(contest);
    }
    public int removeOfContestIdAndTitle(String contestId, String title) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setTitle(title);
        return remove(contest);
    }
    public int removeOfContestIdAndBody(String contestId, String body) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setBody(body);
        return remove(contest);
    }
    public int removeOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setStartTime(startTime);
        return remove(contest);
    }
    public int removeOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setEndTime(endTime);
        return remove(contest);
    }
    public int removeOfQuestionIdsAndTitle(String questionIds, String title) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setTitle(title);
        return remove(contest);
    }
    public int removeOfQuestionIdsAndBody(String questionIds, String body) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setBody(body);
        return remove(contest);
    }
    public int removeOfStartTimeAndEndTime(String startTime, String endTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setEndTime(endTime);
        return remove(contest);
    }
    public int removeOfStartTimeAndTitle(String startTime, String title) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setTitle(title);
        return remove(contest);
    }
    public int removeOfStartTimeAndBody(String startTime, String body) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setBody(body);
        return remove(contest);
    }
    public int removeOfEndTimeAndTitle(String endTime, String title) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setTitle(title);
        return remove(contest);
    }
    public int removeOfEndTimeAndBody(String endTime, String body) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setBody(body);
        return remove(contest);
    }
    public int removeOfTitleAndBody(String title, String body) {
        Contest contest = new Contest();
        contest.setTitle(title);
        contest.setBody(body);
        return remove(contest);
    }
    public int insert(Contest contest) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(contest, "contest");
    }
    public int insertOfContestId(String contestId) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        return insert(contest);
    }
    public int insertOfQuestionIds(String questionIds) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        return insert(contest);
    }
    public int insertOfStartTime(String startTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        return insert(contest);
    }
    public int insertOfEndTime(String endTime) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        return insert(contest);
    }
    public int insertOfTitle(String title) {
        Contest contest = new Contest();
        contest.setTitle(title);
        return insert(contest);
    }
    public int insertOfBody(String body) {
        Contest contest = new Contest();
        contest.setBody(body);
        return insert(contest);
    }
    public int insertOfContestIdAndQuestionIds(String contestId, String questionIds) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setQuestionIds(questionIds);
        return insert(contest);
    }
    public int insertOfContestIdAndStartTime(String contestId, String startTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setStartTime(startTime);
        return insert(contest);
    }
    public int insertOfContestIdAndEndTime(String contestId, String endTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setEndTime(endTime);
        return insert(contest);
    }
    public int insertOfContestIdAndTitle(String contestId, String title) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setTitle(title);
        return insert(contest);
    }
    public int insertOfContestIdAndBody(String contestId, String body) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setBody(body);
        return insert(contest);
    }
    public int insertOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setStartTime(startTime);
        return insert(contest);
    }
    public int insertOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setEndTime(endTime);
        return insert(contest);
    }
    public int insertOfQuestionIdsAndTitle(String questionIds, String title) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setTitle(title);
        return insert(contest);
    }
    public int insertOfQuestionIdsAndBody(String questionIds, String body) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setBody(body);
        return insert(contest);
    }
    public int insertOfStartTimeAndEndTime(String startTime, String endTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setEndTime(endTime);
        return insert(contest);
    }
    public int insertOfStartTimeAndTitle(String startTime, String title) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setTitle(title);
        return insert(contest);
    }
    public int insertOfStartTimeAndBody(String startTime, String body) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setBody(body);
        return insert(contest);
    }
    public int insertOfEndTimeAndTitle(String endTime, String title) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setTitle(title);
        return insert(contest);
    }
    public int insertOfEndTimeAndBody(String endTime, String body) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setBody(body);
        return insert(contest);
    }
    public int insertOfTitleAndBody(String title, String body) {
        Contest contest = new Contest();
        contest.setTitle(title);
        contest.setBody(body);
        return insert(contest);
    }
    public Contest getContest(Contest contest) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(contest, "contest");
    }
    public Contest getContestOfContestId(String contestId) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        return getContest(contest);
    }
    public Contest getContestOfQuestionIds(String questionIds) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        return getContest(contest);
    }
    public Contest getContestOfStartTime(String startTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        return getContest(contest);
    }
    public Contest getContestOfEndTime(String endTime) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        return getContest(contest);
    }
    public Contest getContestOfTitle(String title) {
        Contest contest = new Contest();
        contest.setTitle(title);
        return getContest(contest);
    }
    public Contest getContestOfBody(String body) {
        Contest contest = new Contest();
        contest.setBody(body);
        return getContest(contest);
    }
    public Contest getContestOfContestIdAndQuestionIds(String contestId, String questionIds) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setQuestionIds(questionIds);
        return getContest(contest);
    }
    public Contest getContestOfContestIdAndStartTime(String contestId, String startTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setStartTime(startTime);
        return getContest(contest);
    }
    public Contest getContestOfContestIdAndEndTime(String contestId, String endTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setEndTime(endTime);
        return getContest(contest);
    }
    public Contest getContestOfContestIdAndTitle(String contestId, String title) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setTitle(title);
        return getContest(contest);
    }
    public Contest getContestOfContestIdAndBody(String contestId, String body) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setBody(body);
        return getContest(contest);
    }
    public Contest getContestOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setStartTime(startTime);
        return getContest(contest);
    }
    public Contest getContestOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setEndTime(endTime);
        return getContest(contest);
    }
    public Contest getContestOfQuestionIdsAndTitle(String questionIds, String title) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setTitle(title);
        return getContest(contest);
    }
    public Contest getContestOfQuestionIdsAndBody(String questionIds, String body) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setBody(body);
        return getContest(contest);
    }
    public Contest getContestOfStartTimeAndEndTime(String startTime, String endTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setEndTime(endTime);
        return getContest(contest);
    }
    public Contest getContestOfStartTimeAndTitle(String startTime, String title) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setTitle(title);
        return getContest(contest);
    }
    public Contest getContestOfStartTimeAndBody(String startTime, String body) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setBody(body);
        return getContest(contest);
    }
    public Contest getContestOfEndTimeAndTitle(String endTime, String title) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setTitle(title);
        return getContest(contest);
    }
    public Contest getContestOfEndTimeAndBody(String endTime, String body) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setBody(body);
        return getContest(contest);
    }
    public Contest getContestOfTitleAndBody(String title, String body) {
        Contest contest = new Contest();
        contest.setTitle(title);
        contest.setBody(body);
        return getContest(contest);
    }
    public List<Contest> getContests(Contest contest) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(contest, "contest");
    }
    public List<Contest> getContestsOfContestId(String contestId) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        return getContests(contest);
    }
    public List<Contest> getContestsOfQuestionIds(String questionIds) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        return getContests(contest);
    }
    public List<Contest> getContestsOfStartTime(String startTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfEndTime(String endTime) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfTitle(String title) {
        Contest contest = new Contest();
        contest.setTitle(title);
        return getContests(contest);
    }
    public List<Contest> getContestsOfBody(String body) {
        Contest contest = new Contest();
        contest.setBody(body);
        return getContests(contest);
    }
    public List<Contest> getContestsOfContestIdAndQuestionIds(String contestId, String questionIds) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setQuestionIds(questionIds);
        return getContests(contest);
    }
    public List<Contest> getContestsOfContestIdAndStartTime(String contestId, String startTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setStartTime(startTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfContestIdAndEndTime(String contestId, String endTime) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setEndTime(endTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfContestIdAndTitle(String contestId, String title) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setTitle(title);
        return getContests(contest);
    }
    public List<Contest> getContestsOfContestIdAndBody(String contestId, String body) {
        Contest contest = new Contest();
        contest.setContestId(contestId);
        contest.setBody(body);
        return getContests(contest);
    }
    public List<Contest> getContestsOfQuestionIdsAndStartTime(String questionIds, String startTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setStartTime(startTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfQuestionIdsAndEndTime(String questionIds, String endTime) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setEndTime(endTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfQuestionIdsAndTitle(String questionIds, String title) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setTitle(title);
        return getContests(contest);
    }
    public List<Contest> getContestsOfQuestionIdsAndBody(String questionIds, String body) {
        Contest contest = new Contest();
        contest.setQuestionIds(questionIds);
        contest.setBody(body);
        return getContests(contest);
    }
    public List<Contest> getContestsOfStartTimeAndEndTime(String startTime, String endTime) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setEndTime(endTime);
        return getContests(contest);
    }
    public List<Contest> getContestsOfStartTimeAndTitle(String startTime, String title) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setTitle(title);
        return getContests(contest);
    }
    public List<Contest> getContestsOfStartTimeAndBody(String startTime, String body) {
        Contest contest = new Contest();
        contest.setStartTime(startTime);
        contest.setBody(body);
        return getContests(contest);
    }
    public List<Contest> getContestsOfEndTimeAndTitle(String endTime, String title) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setTitle(title);
        return getContests(contest);
    }
    public List<Contest> getContestsOfEndTimeAndBody(String endTime, String body) {
        Contest contest = new Contest();
        contest.setEndTime(endTime);
        contest.setBody(body);
        return getContests(contest);
    }
    public List<Contest> getContestsOfTitleAndBody(String title, String body) {
        Contest contest = new Contest();
        contest.setTitle(title);
        contest.setBody(body);
        return getContests(contest);
    }
}
