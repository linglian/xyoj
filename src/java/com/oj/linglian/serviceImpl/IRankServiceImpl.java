package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.Rank;

import com.oj.linglian.dao.IRankDao;
import com.oj.linglian.daoImpl.IRankDaoImpl;
import com.oj.linglian.service.IRankService;

public class IRankServiceImpl implements IRankService {
	IRankDao dao = null;

	public IRankServiceImpl() {
		dao = new IRankDaoImpl();
	}
    public int update(Rank rank, Rank keyRank) {
        return dao.update(rank, keyRank);
    }
    public int updateOfRankId(Rank rank, String rankId) {
        return dao.updateOfRankId(rank, rankId);
    }
    public int updateOfContestId(Rank rank, String contestId) {
        return dao.updateOfContestId(rank, contestId);
    }
    public int updateOfUserId(Rank rank, String userId) {
        return dao.updateOfUserId(rank, userId);
    }
    public int updateOfScore(Rank rank, String score) {
        return dao.updateOfScore(rank, score);
    }
    public int updateOfTime(Rank rank, String time) {
        return dao.updateOfTime(rank, time);
    }
    public int updateOfPass(Rank rank, String pass) {
        return dao.updateOfPass(rank, pass);
    }
    public int updateOfRankIdAndContestId(Rank rank, String rankId, String contestId) {
        return dao.updateOfRankIdAndContestId(rank, rankId, contestId);
    }
    public int updateOfRankIdAndUserId(Rank rank, String rankId, String userId) {
        return dao.updateOfRankIdAndUserId(rank, rankId, userId);
    }
    public int updateOfRankIdAndScore(Rank rank, String rankId, String score) {
        return dao.updateOfRankIdAndScore(rank, rankId, score);
    }
    public int updateOfRankIdAndTime(Rank rank, String rankId, String time) {
        return dao.updateOfRankIdAndTime(rank, rankId, time);
    }
    public int updateOfRankIdAndPass(Rank rank, String rankId, String pass) {
        return dao.updateOfRankIdAndPass(rank, rankId, pass);
    }
    public int updateOfContestIdAndUserId(Rank rank, String contestId, String userId) {
        return dao.updateOfContestIdAndUserId(rank, contestId, userId);
    }
    public int updateOfContestIdAndScore(Rank rank, String contestId, String score) {
        return dao.updateOfContestIdAndScore(rank, contestId, score);
    }
    public int updateOfContestIdAndTime(Rank rank, String contestId, String time) {
        return dao.updateOfContestIdAndTime(rank, contestId, time);
    }
    public int updateOfContestIdAndPass(Rank rank, String contestId, String pass) {
        return dao.updateOfContestIdAndPass(rank, contestId, pass);
    }
    public int updateOfUserIdAndScore(Rank rank, String userId, String score) {
        return dao.updateOfUserIdAndScore(rank, userId, score);
    }
    public int updateOfUserIdAndTime(Rank rank, String userId, String time) {
        return dao.updateOfUserIdAndTime(rank, userId, time);
    }
    public int updateOfUserIdAndPass(Rank rank, String userId, String pass) {
        return dao.updateOfUserIdAndPass(rank, userId, pass);
    }
    public int updateOfScoreAndTime(Rank rank, String score, String time) {
        return dao.updateOfScoreAndTime(rank, score, time);
    }
    public int updateOfScoreAndPass(Rank rank, String score, String pass) {
        return dao.updateOfScoreAndPass(rank, score, pass);
    }
    public int updateOfTimeAndPass(Rank rank, String time, String pass) {
        return dao.updateOfTimeAndPass(rank, time, pass);
    }
    public int remove(Rank rank) {
        return dao.remove(rank);
    }
    public int removeOfRankId(String rankId) {
        return dao.removeOfRankId(rankId);
    }
    public int removeOfContestId(String contestId) {
        return dao.removeOfContestId(contestId);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfPass(String pass) {
        return dao.removeOfPass(pass);
    }
    public int removeOfRankIdAndContestId(String rankId, String contestId) {
        return dao.removeOfRankIdAndContestId(rankId, contestId);
    }
    public int removeOfRankIdAndUserId(String rankId, String userId) {
        return dao.removeOfRankIdAndUserId(rankId, userId);
    }
    public int removeOfRankIdAndScore(String rankId, String score) {
        return dao.removeOfRankIdAndScore(rankId, score);
    }
    public int removeOfRankIdAndTime(String rankId, String time) {
        return dao.removeOfRankIdAndTime(rankId, time);
    }
    public int removeOfRankIdAndPass(String rankId, String pass) {
        return dao.removeOfRankIdAndPass(rankId, pass);
    }
    public int removeOfContestIdAndUserId(String contestId, String userId) {
        return dao.removeOfContestIdAndUserId(contestId, userId);
    }
    public int removeOfContestIdAndScore(String contestId, String score) {
        return dao.removeOfContestIdAndScore(contestId, score);
    }
    public int removeOfContestIdAndTime(String contestId, String time) {
        return dao.removeOfContestIdAndTime(contestId, time);
    }
    public int removeOfContestIdAndPass(String contestId, String pass) {
        return dao.removeOfContestIdAndPass(contestId, pass);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        return dao.removeOfUserIdAndScore(userId, score);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        return dao.removeOfUserIdAndTime(userId, time);
    }
    public int removeOfUserIdAndPass(String userId, String pass) {
        return dao.removeOfUserIdAndPass(userId, pass);
    }
    public int removeOfScoreAndTime(String score, String time) {
        return dao.removeOfScoreAndTime(score, time);
    }
    public int removeOfScoreAndPass(String score, String pass) {
        return dao.removeOfScoreAndPass(score, pass);
    }
    public int removeOfTimeAndPass(String time, String pass) {
        return dao.removeOfTimeAndPass(time, pass);
    }
    public int insert(Rank rank) {
        return dao.insert(rank);
    }
    public int insertOfRankId(String rankId) {
        return dao.insertOfRankId(rankId);
    }
    public int insertOfContestId(String contestId) {
        return dao.insertOfContestId(contestId);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfPass(String pass) {
        return dao.insertOfPass(pass);
    }
    public int insertOfRankIdAndContestId(String rankId, String contestId) {
        return dao.insertOfRankIdAndContestId(rankId, contestId);
    }
    public int insertOfRankIdAndUserId(String rankId, String userId) {
        return dao.insertOfRankIdAndUserId(rankId, userId);
    }
    public int insertOfRankIdAndScore(String rankId, String score) {
        return dao.insertOfRankIdAndScore(rankId, score);
    }
    public int insertOfRankIdAndTime(String rankId, String time) {
        return dao.insertOfRankIdAndTime(rankId, time);
    }
    public int insertOfRankIdAndPass(String rankId, String pass) {
        return dao.insertOfRankIdAndPass(rankId, pass);
    }
    public int insertOfContestIdAndUserId(String contestId, String userId) {
        return dao.insertOfContestIdAndUserId(contestId, userId);
    }
    public int insertOfContestIdAndScore(String contestId, String score) {
        return dao.insertOfContestIdAndScore(contestId, score);
    }
    public int insertOfContestIdAndTime(String contestId, String time) {
        return dao.insertOfContestIdAndTime(contestId, time);
    }
    public int insertOfContestIdAndPass(String contestId, String pass) {
        return dao.insertOfContestIdAndPass(contestId, pass);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        return dao.insertOfUserIdAndScore(userId, score);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        return dao.insertOfUserIdAndTime(userId, time);
    }
    public int insertOfUserIdAndPass(String userId, String pass) {
        return dao.insertOfUserIdAndPass(userId, pass);
    }
    public int insertOfScoreAndTime(String score, String time) {
        return dao.insertOfScoreAndTime(score, time);
    }
    public int insertOfScoreAndPass(String score, String pass) {
        return dao.insertOfScoreAndPass(score, pass);
    }
    public int insertOfTimeAndPass(String time, String pass) {
        return dao.insertOfTimeAndPass(time, pass);
    }
    public Rank getRank(Rank rank) {
        return dao.getRank(rank);
    }
    public Rank getRankOfRankId(String rankId) {
        return dao.getRankOfRankId(rankId);
    }
    public Rank getRankOfContestId(String contestId) {
        return dao.getRankOfContestId(contestId);
    }
    public Rank getRankOfUserId(String userId) {
        return dao.getRankOfUserId(userId);
    }
    public Rank getRankOfScore(String score) {
        return dao.getRankOfScore(score);
    }
    public Rank getRankOfTime(String time) {
        return dao.getRankOfTime(time);
    }
    public Rank getRankOfPass(String pass) {
        return dao.getRankOfPass(pass);
    }
    public Rank getRankOfRankIdAndContestId(String rankId, String contestId) {
        return dao.getRankOfRankIdAndContestId(rankId, contestId);
    }
    public Rank getRankOfRankIdAndUserId(String rankId, String userId) {
        return dao.getRankOfRankIdAndUserId(rankId, userId);
    }
    public Rank getRankOfRankIdAndScore(String rankId, String score) {
        return dao.getRankOfRankIdAndScore(rankId, score);
    }
    public Rank getRankOfRankIdAndTime(String rankId, String time) {
        return dao.getRankOfRankIdAndTime(rankId, time);
    }
    public Rank getRankOfRankIdAndPass(String rankId, String pass) {
        return dao.getRankOfRankIdAndPass(rankId, pass);
    }
    public Rank getRankOfContestIdAndUserId(String contestId, String userId) {
        return dao.getRankOfContestIdAndUserId(contestId, userId);
    }
    public Rank getRankOfContestIdAndScore(String contestId, String score) {
        return dao.getRankOfContestIdAndScore(contestId, score);
    }
    public Rank getRankOfContestIdAndTime(String contestId, String time) {
        return dao.getRankOfContestIdAndTime(contestId, time);
    }
    public Rank getRankOfContestIdAndPass(String contestId, String pass) {
        return dao.getRankOfContestIdAndPass(contestId, pass);
    }
    public Rank getRankOfUserIdAndScore(String userId, String score) {
        return dao.getRankOfUserIdAndScore(userId, score);
    }
    public Rank getRankOfUserIdAndTime(String userId, String time) {
        return dao.getRankOfUserIdAndTime(userId, time);
    }
    public Rank getRankOfUserIdAndPass(String userId, String pass) {
        return dao.getRankOfUserIdAndPass(userId, pass);
    }
    public Rank getRankOfScoreAndTime(String score, String time) {
        return dao.getRankOfScoreAndTime(score, time);
    }
    public Rank getRankOfScoreAndPass(String score, String pass) {
        return dao.getRankOfScoreAndPass(score, pass);
    }
    public Rank getRankOfTimeAndPass(String time, String pass) {
        return dao.getRankOfTimeAndPass(time, pass);
    }
    public List<Rank> getRanks(Rank rank) {
        return dao.getRanks(rank);
    }
    public List<Rank> getRanksOfRankId(String rankId) {
        return dao.getRanksOfRankId(rankId);
    }
    public List<Rank> getRanksOfContestId(String contestId) {
        return dao.getRanksOfContestId(contestId);
    }
    public List<Rank> getRanksOfUserId(String userId) {
        return dao.getRanksOfUserId(userId);
    }
    public List<Rank> getRanksOfScore(String score) {
        return dao.getRanksOfScore(score);
    }
    public List<Rank> getRanksOfTime(String time) {
        return dao.getRanksOfTime(time);
    }
    public List<Rank> getRanksOfPass(String pass) {
        return dao.getRanksOfPass(pass);
    }
    public List<Rank> getRanksOfRankIdAndContestId(String rankId, String contestId) {
        return dao.getRanksOfRankIdAndContestId(rankId, contestId);
    }
    public List<Rank> getRanksOfRankIdAndUserId(String rankId, String userId) {
        return dao.getRanksOfRankIdAndUserId(rankId, userId);
    }
    public List<Rank> getRanksOfRankIdAndScore(String rankId, String score) {
        return dao.getRanksOfRankIdAndScore(rankId, score);
    }
    public List<Rank> getRanksOfRankIdAndTime(String rankId, String time) {
        return dao.getRanksOfRankIdAndTime(rankId, time);
    }
    public List<Rank> getRanksOfRankIdAndPass(String rankId, String pass) {
        return dao.getRanksOfRankIdAndPass(rankId, pass);
    }
    public List<Rank> getRanksOfContestIdAndUserId(String contestId, String userId) {
        return dao.getRanksOfContestIdAndUserId(contestId, userId);
    }
    public List<Rank> getRanksOfContestIdAndScore(String contestId, String score) {
        return dao.getRanksOfContestIdAndScore(contestId, score);
    }
    public List<Rank> getRanksOfContestIdAndTime(String contestId, String time) {
        return dao.getRanksOfContestIdAndTime(contestId, time);
    }
    public List<Rank> getRanksOfContestIdAndPass(String contestId, String pass) {
        return dao.getRanksOfContestIdAndPass(contestId, pass);
    }
    public List<Rank> getRanksOfUserIdAndScore(String userId, String score) {
        return dao.getRanksOfUserIdAndScore(userId, score);
    }
    public List<Rank> getRanksOfUserIdAndTime(String userId, String time) {
        return dao.getRanksOfUserIdAndTime(userId, time);
    }
    public List<Rank> getRanksOfUserIdAndPass(String userId, String pass) {
        return dao.getRanksOfUserIdAndPass(userId, pass);
    }
    public List<Rank> getRanksOfScoreAndTime(String score, String time) {
        return dao.getRanksOfScoreAndTime(score, time);
    }
    public List<Rank> getRanksOfScoreAndPass(String score, String pass) {
        return dao.getRanksOfScoreAndPass(score, pass);
    }
    public List<Rank> getRanksOfTimeAndPass(String time, String pass) {
        return dao.getRanksOfTimeAndPass(time, pass);
    }
}
