package com.oj.linglian.service;

import java.util.List;

import com.oj.linglian.entity.Contest;

public interface IContestService {
    public int update(Contest contest, Contest keyContest);
    public int updateOfContestId(Contest contest, String contestId);
    public int updateOfQuestionIds(Contest contest, String questionIds);
    public int updateOfStartTime(Contest contest, String startTime);
    public int updateOfEndTime(Contest contest, String endTime);
    public int updateOfTitle(Contest contest, String title);
    public int updateOfBody(Contest contest, String body);
    public int updateOfContestIdAndQuestionIds(Contest contest, String contestId, String questionIds);
    public int updateOfContestIdAndStartTime(Contest contest, String contestId, String startTime);
    public int updateOfContestIdAndEndTime(Contest contest, String contestId, String endTime);
    public int updateOfContestIdAndTitle(Contest contest, String contestId, String title);
    public int updateOfContestIdAndBody(Contest contest, String contestId, String body);
    public int updateOfQuestionIdsAndStartTime(Contest contest, String questionIds, String startTime);
    public int updateOfQuestionIdsAndEndTime(Contest contest, String questionIds, String endTime);
    public int updateOfQuestionIdsAndTitle(Contest contest, String questionIds, String title);
    public int updateOfQuestionIdsAndBody(Contest contest, String questionIds, String body);
    public int updateOfStartTimeAndEndTime(Contest contest, String startTime, String endTime);
    public int updateOfStartTimeAndTitle(Contest contest, String startTime, String title);
    public int updateOfStartTimeAndBody(Contest contest, String startTime, String body);
    public int updateOfEndTimeAndTitle(Contest contest, String endTime, String title);
    public int updateOfEndTimeAndBody(Contest contest, String endTime, String body);
    public int updateOfTitleAndBody(Contest contest, String title, String body);
    public int remove(Contest contest);
    public int removeOfContestId(String contestId);
    public int removeOfQuestionIds(String questionIds);
    public int removeOfStartTime(String startTime);
    public int removeOfEndTime(String endTime);
    public int removeOfTitle(String title);
    public int removeOfBody(String body);
    public int removeOfContestIdAndQuestionIds(String contestId, String questionIds);
    public int removeOfContestIdAndStartTime(String contestId, String startTime);
    public int removeOfContestIdAndEndTime(String contestId, String endTime);
    public int removeOfContestIdAndTitle(String contestId, String title);
    public int removeOfContestIdAndBody(String contestId, String body);
    public int removeOfQuestionIdsAndStartTime(String questionIds, String startTime);
    public int removeOfQuestionIdsAndEndTime(String questionIds, String endTime);
    public int removeOfQuestionIdsAndTitle(String questionIds, String title);
    public int removeOfQuestionIdsAndBody(String questionIds, String body);
    public int removeOfStartTimeAndEndTime(String startTime, String endTime);
    public int removeOfStartTimeAndTitle(String startTime, String title);
    public int removeOfStartTimeAndBody(String startTime, String body);
    public int removeOfEndTimeAndTitle(String endTime, String title);
    public int removeOfEndTimeAndBody(String endTime, String body);
    public int removeOfTitleAndBody(String title, String body);
    public int insert(Contest contest);
    public int insertOfContestId(String contestId);
    public int insertOfQuestionIds(String questionIds);
    public int insertOfStartTime(String startTime);
    public int insertOfEndTime(String endTime);
    public int insertOfTitle(String title);
    public int insertOfBody(String body);
    public int insertOfContestIdAndQuestionIds(String contestId, String questionIds);
    public int insertOfContestIdAndStartTime(String contestId, String startTime);
    public int insertOfContestIdAndEndTime(String contestId, String endTime);
    public int insertOfContestIdAndTitle(String contestId, String title);
    public int insertOfContestIdAndBody(String contestId, String body);
    public int insertOfQuestionIdsAndStartTime(String questionIds, String startTime);
    public int insertOfQuestionIdsAndEndTime(String questionIds, String endTime);
    public int insertOfQuestionIdsAndTitle(String questionIds, String title);
    public int insertOfQuestionIdsAndBody(String questionIds, String body);
    public int insertOfStartTimeAndEndTime(String startTime, String endTime);
    public int insertOfStartTimeAndTitle(String startTime, String title);
    public int insertOfStartTimeAndBody(String startTime, String body);
    public int insertOfEndTimeAndTitle(String endTime, String title);
    public int insertOfEndTimeAndBody(String endTime, String body);
    public int insertOfTitleAndBody(String title, String body);
    public Contest getContest(Contest contest);
    public Contest getContestOfContestId(String contestId);
    public Contest getContestOfQuestionIds(String questionIds);
    public Contest getContestOfStartTime(String startTime);
    public Contest getContestOfEndTime(String endTime);
    public Contest getContestOfTitle(String title);
    public Contest getContestOfBody(String body);
    public Contest getContestOfContestIdAndQuestionIds(String contestId, String questionIds);
    public Contest getContestOfContestIdAndStartTime(String contestId, String startTime);
    public Contest getContestOfContestIdAndEndTime(String contestId, String endTime);
    public Contest getContestOfContestIdAndTitle(String contestId, String title);
    public Contest getContestOfContestIdAndBody(String contestId, String body);
    public Contest getContestOfQuestionIdsAndStartTime(String questionIds, String startTime);
    public Contest getContestOfQuestionIdsAndEndTime(String questionIds, String endTime);
    public Contest getContestOfQuestionIdsAndTitle(String questionIds, String title);
    public Contest getContestOfQuestionIdsAndBody(String questionIds, String body);
    public Contest getContestOfStartTimeAndEndTime(String startTime, String endTime);
    public Contest getContestOfStartTimeAndTitle(String startTime, String title);
    public Contest getContestOfStartTimeAndBody(String startTime, String body);
    public Contest getContestOfEndTimeAndTitle(String endTime, String title);
    public Contest getContestOfEndTimeAndBody(String endTime, String body);
    public Contest getContestOfTitleAndBody(String title, String body);
    public List<Contest> getContests(Contest contest);
    public List<Contest> getContestsOfContestId(String contestId);
    public List<Contest> getContestsOfQuestionIds(String questionIds);
    public List<Contest> getContestsOfStartTime(String startTime);
    public List<Contest> getContestsOfEndTime(String endTime);
    public List<Contest> getContestsOfTitle(String title);
    public List<Contest> getContestsOfBody(String body);
    public List<Contest> getContestsOfContestIdAndQuestionIds(String contestId, String questionIds);
    public List<Contest> getContestsOfContestIdAndStartTime(String contestId, String startTime);
    public List<Contest> getContestsOfContestIdAndEndTime(String contestId, String endTime);
    public List<Contest> getContestsOfContestIdAndTitle(String contestId, String title);
    public List<Contest> getContestsOfContestIdAndBody(String contestId, String body);
    public List<Contest> getContestsOfQuestionIdsAndStartTime(String questionIds, String startTime);
    public List<Contest> getContestsOfQuestionIdsAndEndTime(String questionIds, String endTime);
    public List<Contest> getContestsOfQuestionIdsAndTitle(String questionIds, String title);
    public List<Contest> getContestsOfQuestionIdsAndBody(String questionIds, String body);
    public List<Contest> getContestsOfStartTimeAndEndTime(String startTime, String endTime);
    public List<Contest> getContestsOfStartTimeAndTitle(String startTime, String title);
    public List<Contest> getContestsOfStartTimeAndBody(String startTime, String body);
    public List<Contest> getContestsOfEndTimeAndTitle(String endTime, String title);
    public List<Contest> getContestsOfEndTimeAndBody(String endTime, String body);
    public List<Contest> getContestsOfTitleAndBody(String title, String body);
}
