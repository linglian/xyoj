package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.Rank;

import com.oj.linglian.dao.IRankDao;
import db.DBMan;

public class IRankDaoImpl implements IRankDao {
    public int update(Rank rank, Rank keyRank) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(rank, keyRank, "rank");
    }
    public int updateOfRankId(Rank rank, String rankId) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        return update(rank, kRank);
    }
    public int updateOfContestId(Rank rank, String contestId) {
        Rank kRank = new Rank();
        kRank.setContestId(contestId);
        return update(rank, kRank);
    }
    public int updateOfUserId(Rank rank, String userId) {
        Rank kRank = new Rank();
        kRank.setUserId(userId);
        return update(rank, kRank);
    }
    public int updateOfScore(Rank rank, String score) {
        Rank kRank = new Rank();
        kRank.setScore(score);
        return update(rank, kRank);
    }
    public int updateOfTime(Rank rank, String time) {
        Rank kRank = new Rank();
        kRank.setTime(time);
        return update(rank, kRank);
    }
    public int updateOfPass(Rank rank, String pass) {
        Rank kRank = new Rank();
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int updateOfRankIdAndContestId(Rank rank, String rankId, String contestId) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        kRank.setContestId(contestId);
        return update(rank, kRank);
    }
    public int updateOfRankIdAndUserId(Rank rank, String rankId, String userId) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        kRank.setUserId(userId);
        return update(rank, kRank);
    }
    public int updateOfRankIdAndScore(Rank rank, String rankId, String score) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        kRank.setScore(score);
        return update(rank, kRank);
    }
    public int updateOfRankIdAndTime(Rank rank, String rankId, String time) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        kRank.setTime(time);
        return update(rank, kRank);
    }
    public int updateOfRankIdAndPass(Rank rank, String rankId, String pass) {
        Rank kRank = new Rank();
        kRank.setRankId(rankId);
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int updateOfContestIdAndUserId(Rank rank, String contestId, String userId) {
        Rank kRank = new Rank();
        kRank.setContestId(contestId);
        kRank.setUserId(userId);
        return update(rank, kRank);
    }
    public int updateOfContestIdAndScore(Rank rank, String contestId, String score) {
        Rank kRank = new Rank();
        kRank.setContestId(contestId);
        kRank.setScore(score);
        return update(rank, kRank);
    }
    public int updateOfContestIdAndTime(Rank rank, String contestId, String time) {
        Rank kRank = new Rank();
        kRank.setContestId(contestId);
        kRank.setTime(time);
        return update(rank, kRank);
    }
    public int updateOfContestIdAndPass(Rank rank, String contestId, String pass) {
        Rank kRank = new Rank();
        kRank.setContestId(contestId);
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int updateOfUserIdAndScore(Rank rank, String userId, String score) {
        Rank kRank = new Rank();
        kRank.setUserId(userId);
        kRank.setScore(score);
        return update(rank, kRank);
    }
    public int updateOfUserIdAndTime(Rank rank, String userId, String time) {
        Rank kRank = new Rank();
        kRank.setUserId(userId);
        kRank.setTime(time);
        return update(rank, kRank);
    }
    public int updateOfUserIdAndPass(Rank rank, String userId, String pass) {
        Rank kRank = new Rank();
        kRank.setUserId(userId);
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int updateOfScoreAndTime(Rank rank, String score, String time) {
        Rank kRank = new Rank();
        kRank.setScore(score);
        kRank.setTime(time);
        return update(rank, kRank);
    }
    public int updateOfScoreAndPass(Rank rank, String score, String pass) {
        Rank kRank = new Rank();
        kRank.setScore(score);
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int updateOfTimeAndPass(Rank rank, String time, String pass) {
        Rank kRank = new Rank();
        kRank.setTime(time);
        kRank.setPass(pass);
        return update(rank, kRank);
    }
    public int remove(Rank rank) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(rank, "rank");
    }
    public int removeOfRankId(String rankId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        return remove(rank);
    }
    public int removeOfContestId(String contestId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        return remove(rank);
    }
    public int removeOfUserId(String userId) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        return remove(rank);
    }
    public int removeOfScore(String score) {
        Rank rank = new Rank();
        rank.setScore(score);
        return remove(rank);
    }
    public int removeOfTime(String time) {
        Rank rank = new Rank();
        rank.setTime(time);
        return remove(rank);
    }
    public int removeOfPass(String pass) {
        Rank rank = new Rank();
        rank.setPass(pass);
        return remove(rank);
    }
    public int removeOfRankIdAndContestId(String rankId, String contestId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setContestId(contestId);
        return remove(rank);
    }
    public int removeOfRankIdAndUserId(String rankId, String userId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setUserId(userId);
        return remove(rank);
    }
    public int removeOfRankIdAndScore(String rankId, String score) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setScore(score);
        return remove(rank);
    }
    public int removeOfRankIdAndTime(String rankId, String time) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setTime(time);
        return remove(rank);
    }
    public int removeOfRankIdAndPass(String rankId, String pass) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setPass(pass);
        return remove(rank);
    }
    public int removeOfContestIdAndUserId(String contestId, String userId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setUserId(userId);
        return remove(rank);
    }
    public int removeOfContestIdAndScore(String contestId, String score) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setScore(score);
        return remove(rank);
    }
    public int removeOfContestIdAndTime(String contestId, String time) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setTime(time);
        return remove(rank);
    }
    public int removeOfContestIdAndPass(String contestId, String pass) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setPass(pass);
        return remove(rank);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setScore(score);
        return remove(rank);
    }
    public int removeOfUserIdAndTime(String userId, String time) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setTime(time);
        return remove(rank);
    }
    public int removeOfUserIdAndPass(String userId, String pass) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setPass(pass);
        return remove(rank);
    }
    public int removeOfScoreAndTime(String score, String time) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setTime(time);
        return remove(rank);
    }
    public int removeOfScoreAndPass(String score, String pass) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setPass(pass);
        return remove(rank);
    }
    public int removeOfTimeAndPass(String time, String pass) {
        Rank rank = new Rank();
        rank.setTime(time);
        rank.setPass(pass);
        return remove(rank);
    }
    public int insert(Rank rank) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(rank, "rank");
    }
    public int insertOfRankId(String rankId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        return insert(rank);
    }
    public int insertOfContestId(String contestId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        return insert(rank);
    }
    public int insertOfUserId(String userId) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        return insert(rank);
    }
    public int insertOfScore(String score) {
        Rank rank = new Rank();
        rank.setScore(score);
        return insert(rank);
    }
    public int insertOfTime(String time) {
        Rank rank = new Rank();
        rank.setTime(time);
        return insert(rank);
    }
    public int insertOfPass(String pass) {
        Rank rank = new Rank();
        rank.setPass(pass);
        return insert(rank);
    }
    public int insertOfRankIdAndContestId(String rankId, String contestId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setContestId(contestId);
        return insert(rank);
    }
    public int insertOfRankIdAndUserId(String rankId, String userId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setUserId(userId);
        return insert(rank);
    }
    public int insertOfRankIdAndScore(String rankId, String score) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setScore(score);
        return insert(rank);
    }
    public int insertOfRankIdAndTime(String rankId, String time) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setTime(time);
        return insert(rank);
    }
    public int insertOfRankIdAndPass(String rankId, String pass) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setPass(pass);
        return insert(rank);
    }
    public int insertOfContestIdAndUserId(String contestId, String userId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setUserId(userId);
        return insert(rank);
    }
    public int insertOfContestIdAndScore(String contestId, String score) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setScore(score);
        return insert(rank);
    }
    public int insertOfContestIdAndTime(String contestId, String time) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setTime(time);
        return insert(rank);
    }
    public int insertOfContestIdAndPass(String contestId, String pass) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setPass(pass);
        return insert(rank);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setScore(score);
        return insert(rank);
    }
    public int insertOfUserIdAndTime(String userId, String time) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setTime(time);
        return insert(rank);
    }
    public int insertOfUserIdAndPass(String userId, String pass) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setPass(pass);
        return insert(rank);
    }
    public int insertOfScoreAndTime(String score, String time) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setTime(time);
        return insert(rank);
    }
    public int insertOfScoreAndPass(String score, String pass) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setPass(pass);
        return insert(rank);
    }
    public int insertOfTimeAndPass(String time, String pass) {
        Rank rank = new Rank();
        rank.setTime(time);
        rank.setPass(pass);
        return insert(rank);
    }
    public Rank getRank(Rank rank) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(rank, "rank");
    }
    public Rank getRankOfRankId(String rankId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        return getRank(rank);
    }
    public Rank getRankOfContestId(String contestId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        return getRank(rank);
    }
    public Rank getRankOfUserId(String userId) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        return getRank(rank);
    }
    public Rank getRankOfScore(String score) {
        Rank rank = new Rank();
        rank.setScore(score);
        return getRank(rank);
    }
    public Rank getRankOfTime(String time) {
        Rank rank = new Rank();
        rank.setTime(time);
        return getRank(rank);
    }
    public Rank getRankOfPass(String pass) {
        Rank rank = new Rank();
        rank.setPass(pass);
        return getRank(rank);
    }
    public Rank getRankOfRankIdAndContestId(String rankId, String contestId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setContestId(contestId);
        return getRank(rank);
    }
    public Rank getRankOfRankIdAndUserId(String rankId, String userId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setUserId(userId);
        return getRank(rank);
    }
    public Rank getRankOfRankIdAndScore(String rankId, String score) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setScore(score);
        return getRank(rank);
    }
    public Rank getRankOfRankIdAndTime(String rankId, String time) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setTime(time);
        return getRank(rank);
    }
    public Rank getRankOfRankIdAndPass(String rankId, String pass) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setPass(pass);
        return getRank(rank);
    }
    public Rank getRankOfContestIdAndUserId(String contestId, String userId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setUserId(userId);
        return getRank(rank);
    }
    public Rank getRankOfContestIdAndScore(String contestId, String score) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setScore(score);
        return getRank(rank);
    }
    public Rank getRankOfContestIdAndTime(String contestId, String time) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setTime(time);
        return getRank(rank);
    }
    public Rank getRankOfContestIdAndPass(String contestId, String pass) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setPass(pass);
        return getRank(rank);
    }
    public Rank getRankOfUserIdAndScore(String userId, String score) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setScore(score);
        return getRank(rank);
    }
    public Rank getRankOfUserIdAndTime(String userId, String time) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setTime(time);
        return getRank(rank);
    }
    public Rank getRankOfUserIdAndPass(String userId, String pass) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setPass(pass);
        return getRank(rank);
    }
    public Rank getRankOfScoreAndTime(String score, String time) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setTime(time);
        return getRank(rank);
    }
    public Rank getRankOfScoreAndPass(String score, String pass) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setPass(pass);
        return getRank(rank);
    }
    public Rank getRankOfTimeAndPass(String time, String pass) {
        Rank rank = new Rank();
        rank.setTime(time);
        rank.setPass(pass);
        return getRank(rank);
    }
    public List<Rank> getRanks(Rank rank) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(rank, "rank");
    }
    public List<Rank> getRanksOfRankId(String rankId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfContestId(String contestId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfUserId(String userId) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfScore(String score) {
        Rank rank = new Rank();
        rank.setScore(score);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfTime(String time) {
        Rank rank = new Rank();
        rank.setTime(time);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfPass(String pass) {
        Rank rank = new Rank();
        rank.setPass(pass);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfRankIdAndContestId(String rankId, String contestId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setContestId(contestId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfRankIdAndUserId(String rankId, String userId) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setUserId(userId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfRankIdAndScore(String rankId, String score) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setScore(score);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfRankIdAndTime(String rankId, String time) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setTime(time);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfRankIdAndPass(String rankId, String pass) {
        Rank rank = new Rank();
        rank.setRankId(rankId);
        rank.setPass(pass);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfContestIdAndUserId(String contestId, String userId) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setUserId(userId);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfContestIdAndScore(String contestId, String score) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setScore(score);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfContestIdAndTime(String contestId, String time) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setTime(time);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfContestIdAndPass(String contestId, String pass) {
        Rank rank = new Rank();
        rank.setContestId(contestId);
        rank.setPass(pass);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfUserIdAndScore(String userId, String score) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setScore(score);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfUserIdAndTime(String userId, String time) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setTime(time);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfUserIdAndPass(String userId, String pass) {
        Rank rank = new Rank();
        rank.setUserId(userId);
        rank.setPass(pass);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfScoreAndTime(String score, String time) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setTime(time);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfScoreAndPass(String score, String pass) {
        Rank rank = new Rank();
        rank.setScore(score);
        rank.setPass(pass);
        return getRanks(rank);
    }
    public List<Rank> getRanksOfTimeAndPass(String time, String pass) {
        Rank rank = new Rank();
        rank.setTime(time);
        rank.setPass(pass);
        return getRanks(rank);
    }
}
