package com.oj.linglian.daoImpl;

import java.util.List;

import com.oj.linglian.entity.User;

import com.oj.linglian.dao.IUserDao;
import db.DBMan;

public class IUserDaoImpl implements IUserDao {
    public int update(User user, User keyUser) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(user, keyUser, "user");
    }
    public int updateOfUserId(User user, String userId) {
        User kUser = new User();
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfPassword(User user, String password) {
        User kUser = new User();
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfEmail(User user, String email) {
        User kUser = new User();
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPhone(User user, String phone) {
        User kUser = new User();
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfSex(User user, String sex) {
        User kUser = new User();
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfPassQuestions(User user, String passQuestions) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfScore(User user, String score) {
        User kUser = new User();
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfLastCode(User user, String lastCode) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfLastQuestionId(User user, String lastQuestionId) {
        User kUser = new User();
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfLvl(User user, String lvl) {
        User kUser = new User();
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfParam(User user, String param) {
        User kUser = new User();
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfName(User user, String name) {
        User kUser = new User();
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLastLogin(User user, String lastLogin) {
        User kUser = new User();
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfUserIdAndSex(User user, String userId, String sex) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPassQuestions(User user, String userId, String passQuestions) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLastCode(User user, String userId, String lastCode) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLastQuestionId(User user, String userId, String lastQuestionId) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLvl(User user, String userId, String lvl) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLastLogin(User user, String userId, String lastLogin) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfPasswordAndSex(User user, String password, String sex) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfPasswordAndPassQuestions(User user, String password, String passQuestions) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLastCode(User user, String password, String lastCode) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLastQuestionId(User user, String password, String lastQuestionId) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLvl(User user, String password, String lvl) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLastLogin(User user, String password, String lastLogin) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfEmailAndPhone(User user, String email, String phone) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfEmailAndSex(User user, String email, String sex) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfEmailAndPassQuestions(User user, String email, String passQuestions) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfEmailAndScore(User user, String email, String score) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfEmailAndLastCode(User user, String email, String lastCode) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfEmailAndLastQuestionId(User user, String email, String lastQuestionId) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfEmailAndLvl(User user, String email, String lvl) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfEmailAndParam(User user, String email, String param) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfEmailAndName(User user, String email, String name) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfEmailAndLastLogin(User user, String email, String lastLogin) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfPhoneAndSex(User user, String phone, String sex) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfPhoneAndPassQuestions(User user, String phone, String passQuestions) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfPhoneAndScore(User user, String phone, String score) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPhoneAndLastCode(User user, String phone, String lastCode) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfPhoneAndLastQuestionId(User user, String phone, String lastQuestionId) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfPhoneAndLvl(User user, String phone, String lvl) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPhoneAndName(User user, String phone, String name) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPhoneAndLastLogin(User user, String phone, String lastLogin) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfSexAndPassQuestions(User user, String sex, String passQuestions) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setPassQuestions(passQuestions);
        return update(user, kUser);
    }
    public int updateOfSexAndScore(User user, String sex, String score) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfSexAndLastCode(User user, String sex, String lastCode) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfSexAndLastQuestionId(User user, String sex, String lastQuestionId) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfSexAndLvl(User user, String sex, String lvl) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfSexAndName(User user, String sex, String name) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfSexAndLastLogin(User user, String sex, String lastLogin) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndScore(User user, String passQuestions, String score) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndLastCode(User user, String passQuestions, String lastCode) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndLastQuestionId(User user, String passQuestions, String lastQuestionId) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndLvl(User user, String passQuestions, String lvl) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndParam(User user, String passQuestions, String param) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndName(User user, String passQuestions, String name) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPassQuestionsAndLastLogin(User user, String passQuestions, String lastLogin) {
        User kUser = new User();
        kUser.setPassQuestions(passQuestions);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfScoreAndLastCode(User user, String score, String lastCode) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setLastCode(lastCode);
        return update(user, kUser);
    }
    public int updateOfScoreAndLastQuestionId(User user, String score, String lastQuestionId) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfScoreAndLvl(User user, String score, String lvl) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfScoreAndName(User user, String score, String name) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfScoreAndLastLogin(User user, String score, String lastLogin) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfLastCodeAndLastQuestionId(User user, String lastCode, String lastQuestionId) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setLastQuestionId(lastQuestionId);
        return update(user, kUser);
    }
    public int updateOfLastCodeAndLvl(User user, String lastCode, String lvl) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfLastCodeAndParam(User user, String lastCode, String param) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLastCodeAndName(User user, String lastCode, String name) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLastCodeAndLastLogin(User user, String lastCode, String lastLogin) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfLastQuestionIdAndLvl(User user, String lastQuestionId, String lvl) {
        User kUser = new User();
        kUser.setLastQuestionId(lastQuestionId);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfLastQuestionIdAndParam(User user, String lastQuestionId, String param) {
        User kUser = new User();
        kUser.setLastQuestionId(lastQuestionId);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLastQuestionIdAndName(User user, String lastQuestionId, String name) {
        User kUser = new User();
        kUser.setLastQuestionId(lastQuestionId);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLastQuestionIdAndLastLogin(User user, String lastQuestionId, String lastLogin) {
        User kUser = new User();
        kUser.setLastQuestionId(lastQuestionId);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfLvlAndParam(User user, String lvl, String param) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLvlAndName(User user, String lvl, String name) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLvlAndLastLogin(User user, String lvl, String lastLogin) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfParamAndName(User user, String param, String name) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfParamAndLastLogin(User user, String param, String lastLogin) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int updateOfNameAndLastLogin(User user, String name, String lastLogin) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setLastLogin(lastLogin);
        return update(user, kUser);
    }
    public int remove(User user) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(user, "user");
    }
    public int removeOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfPassQuestions(String passQuestions) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return remove(user);
    }
    public int removeOfLastCode(String lastCode) {
        User user = new User();
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfLastQuestionId(String lastQuestionId) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return remove(user);
    }
    public int removeOfName(String name) {
        User user = new User();
        user.setName(name);
        return remove(user);
    }
    public int removeOfLastLogin(String lastLogin) {
        User user = new User();
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfUserIdAndPassQuestions(String userId, String passQuestions) {
        User user = new User();
        user.setUserId(userId);
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndLastCode(String userId, String lastCode) {
        User user = new User();
        user.setUserId(userId);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        User user = new User();
        user.setUserId(userId);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return remove(user);
    }
    public int removeOfUserIdAndLastLogin(String userId, String lastLogin) {
        User user = new User();
        user.setUserId(userId);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfPasswordAndPassQuestions(String password, String passQuestions) {
        User user = new User();
        user.setPassword(password);
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndLastCode(String password, String lastCode) {
        User user = new User();
        user.setPassword(password);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        User user = new User();
        user.setPassword(password);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPasswordAndLastLogin(String password, String lastLogin) {
        User user = new User();
        user.setPassword(password);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfEmailAndPhone(String email, String phone) {
        User user = new User();
        user.setEmail(email);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfEmailAndSex(String email, String sex) {
        User user = new User();
        user.setEmail(email);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfEmailAndPassQuestions(String email, String passQuestions) {
        User user = new User();
        user.setEmail(email);
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfEmailAndLastCode(String email, String lastCode) {
        User user = new User();
        user.setEmail(email);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        User user = new User();
        user.setEmail(email);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfEmailAndName(String email, String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return remove(user);
    }
    public int removeOfEmailAndLastLogin(String email, String lastLogin) {
        User user = new User();
        user.setEmail(email);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfPhoneAndSex(String phone, String sex) {
        User user = new User();
        user.setPhone(phone);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfPhoneAndPassQuestions(String phone, String passQuestions) {
        User user = new User();
        user.setPhone(phone);
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPhoneAndLastCode(String phone, String lastCode) {
        User user = new User();
        user.setPhone(phone);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        User user = new User();
        user.setPhone(phone);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPhoneAndLastLogin(String phone, String lastLogin) {
        User user = new User();
        user.setPhone(phone);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfSexAndPassQuestions(String sex, String passQuestions) {
        User user = new User();
        user.setSex(sex);
        user.setPassQuestions(passQuestions);
        return remove(user);
    }
    public int removeOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfSexAndLastCode(String sex, String lastCode) {
        User user = new User();
        user.setSex(sex);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        User user = new User();
        user.setSex(sex);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return remove(user);
    }
    public int removeOfSexAndLastLogin(String sex, String lastLogin) {
        User user = new User();
        user.setSex(sex);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfPassQuestionsAndScore(String passQuestions, String score) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPassQuestionsAndParam(String passQuestions, String param) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPassQuestionsAndName(String passQuestions, String name) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfScoreAndLastCode(String score, String lastCode) {
        User user = new User();
        user.setScore(score);
        user.setLastCode(lastCode);
        return remove(user);
    }
    public int removeOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        User user = new User();
        user.setScore(score);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return remove(user);
    }
    public int removeOfScoreAndLastLogin(String score, String lastLogin) {
        User user = new User();
        user.setScore(score);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
        return remove(user);
    }
    public int removeOfLastCodeAndLvl(String lastCode, String lvl) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfLastCodeAndParam(String lastCode, String param) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLastCodeAndName(String lastCode, String name) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setName(name);
        return remove(user);
    }
    public int removeOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLastQuestionIdAndName(String lastQuestionId, String name) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setName(name);
        return remove(user);
    }
    public int removeOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return remove(user);
    }
    public int removeOfLvlAndLastLogin(String lvl, String lastLogin) {
        User user = new User();
        user.setLvl(lvl);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return remove(user);
    }
    public int removeOfParamAndLastLogin(String param, String lastLogin) {
        User user = new User();
        user.setParam(param);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int removeOfNameAndLastLogin(String name, String lastLogin) {
        User user = new User();
        user.setName(name);
        user.setLastLogin(lastLogin);
        return remove(user);
    }
    public int insert(User user) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(user, "user");
    }
    public int insertOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfPassQuestions(String passQuestions) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return insert(user);
    }
    public int insertOfLastCode(String lastCode) {
        User user = new User();
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfLastQuestionId(String lastQuestionId) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return insert(user);
    }
    public int insertOfName(String name) {
        User user = new User();
        user.setName(name);
        return insert(user);
    }
    public int insertOfLastLogin(String lastLogin) {
        User user = new User();
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfUserIdAndPassQuestions(String userId, String passQuestions) {
        User user = new User();
        user.setUserId(userId);
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndLastCode(String userId, String lastCode) {
        User user = new User();
        user.setUserId(userId);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        User user = new User();
        user.setUserId(userId);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return insert(user);
    }
    public int insertOfUserIdAndLastLogin(String userId, String lastLogin) {
        User user = new User();
        user.setUserId(userId);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfPasswordAndPassQuestions(String password, String passQuestions) {
        User user = new User();
        user.setPassword(password);
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndLastCode(String password, String lastCode) {
        User user = new User();
        user.setPassword(password);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        User user = new User();
        user.setPassword(password);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPasswordAndLastLogin(String password, String lastLogin) {
        User user = new User();
        user.setPassword(password);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfEmailAndPhone(String email, String phone) {
        User user = new User();
        user.setEmail(email);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfEmailAndSex(String email, String sex) {
        User user = new User();
        user.setEmail(email);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfEmailAndPassQuestions(String email, String passQuestions) {
        User user = new User();
        user.setEmail(email);
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfEmailAndLastCode(String email, String lastCode) {
        User user = new User();
        user.setEmail(email);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        User user = new User();
        user.setEmail(email);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfEmailAndName(String email, String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return insert(user);
    }
    public int insertOfEmailAndLastLogin(String email, String lastLogin) {
        User user = new User();
        user.setEmail(email);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfPhoneAndSex(String phone, String sex) {
        User user = new User();
        user.setPhone(phone);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfPhoneAndPassQuestions(String phone, String passQuestions) {
        User user = new User();
        user.setPhone(phone);
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPhoneAndLastCode(String phone, String lastCode) {
        User user = new User();
        user.setPhone(phone);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        User user = new User();
        user.setPhone(phone);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPhoneAndLastLogin(String phone, String lastLogin) {
        User user = new User();
        user.setPhone(phone);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfSexAndPassQuestions(String sex, String passQuestions) {
        User user = new User();
        user.setSex(sex);
        user.setPassQuestions(passQuestions);
        return insert(user);
    }
    public int insertOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfSexAndLastCode(String sex, String lastCode) {
        User user = new User();
        user.setSex(sex);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        User user = new User();
        user.setSex(sex);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return insert(user);
    }
    public int insertOfSexAndLastLogin(String sex, String lastLogin) {
        User user = new User();
        user.setSex(sex);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfPassQuestionsAndScore(String passQuestions, String score) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPassQuestionsAndParam(String passQuestions, String param) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPassQuestionsAndName(String passQuestions, String name) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfScoreAndLastCode(String score, String lastCode) {
        User user = new User();
        user.setScore(score);
        user.setLastCode(lastCode);
        return insert(user);
    }
    public int insertOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        User user = new User();
        user.setScore(score);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return insert(user);
    }
    public int insertOfScoreAndLastLogin(String score, String lastLogin) {
        User user = new User();
        user.setScore(score);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
        return insert(user);
    }
    public int insertOfLastCodeAndLvl(String lastCode, String lvl) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfLastCodeAndParam(String lastCode, String param) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLastCodeAndName(String lastCode, String name) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setName(name);
        return insert(user);
    }
    public int insertOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLastQuestionIdAndName(String lastQuestionId, String name) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setName(name);
        return insert(user);
    }
    public int insertOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return insert(user);
    }
    public int insertOfLvlAndLastLogin(String lvl, String lastLogin) {
        User user = new User();
        user.setLvl(lvl);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return insert(user);
    }
    public int insertOfParamAndLastLogin(String param, String lastLogin) {
        User user = new User();
        user.setParam(param);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public int insertOfNameAndLastLogin(String name, String lastLogin) {
        User user = new User();
        user.setName(name);
        user.setLastLogin(lastLogin);
        return insert(user);
    }
    public User getUser(User user) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(user, "user");
    }
    public User getUserOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfPassQuestions(String passQuestions) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfLastCode(String lastCode) {
        User user = new User();
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfLastQuestionId(String lastQuestionId) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLastLogin(String lastLogin) {
        User user = new User();
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfUserIdAndPassQuestions(String userId, String passQuestions) {
        User user = new User();
        user.setUserId(userId);
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndLastCode(String userId, String lastCode) {
        User user = new User();
        user.setUserId(userId);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        User user = new User();
        user.setUserId(userId);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfUserIdAndLastLogin(String userId, String lastLogin) {
        User user = new User();
        user.setUserId(userId);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfPasswordAndPassQuestions(String password, String passQuestions) {
        User user = new User();
        user.setPassword(password);
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndLastCode(String password, String lastCode) {
        User user = new User();
        user.setPassword(password);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        User user = new User();
        user.setPassword(password);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPasswordAndLastLogin(String password, String lastLogin) {
        User user = new User();
        user.setPassword(password);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfEmailAndPhone(String email, String phone) {
        User user = new User();
        user.setEmail(email);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfEmailAndSex(String email, String sex) {
        User user = new User();
        user.setEmail(email);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfEmailAndPassQuestions(String email, String passQuestions) {
        User user = new User();
        user.setEmail(email);
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfEmailAndLastCode(String email, String lastCode) {
        User user = new User();
        user.setEmail(email);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        User user = new User();
        user.setEmail(email);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfEmailAndName(String email, String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfEmailAndLastLogin(String email, String lastLogin) {
        User user = new User();
        user.setEmail(email);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfPhoneAndSex(String phone, String sex) {
        User user = new User();
        user.setPhone(phone);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfPhoneAndPassQuestions(String phone, String passQuestions) {
        User user = new User();
        user.setPhone(phone);
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPhoneAndLastCode(String phone, String lastCode) {
        User user = new User();
        user.setPhone(phone);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        User user = new User();
        user.setPhone(phone);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPhoneAndLastLogin(String phone, String lastLogin) {
        User user = new User();
        user.setPhone(phone);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfSexAndPassQuestions(String sex, String passQuestions) {
        User user = new User();
        user.setSex(sex);
        user.setPassQuestions(passQuestions);
        return getUser(user);
    }
    public User getUserOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfSexAndLastCode(String sex, String lastCode) {
        User user = new User();
        user.setSex(sex);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        User user = new User();
        user.setSex(sex);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfSexAndLastLogin(String sex, String lastLogin) {
        User user = new User();
        user.setSex(sex);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndScore(String passQuestions, String score) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndParam(String passQuestions, String param) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndName(String passQuestions, String name) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfScoreAndLastCode(String score, String lastCode) {
        User user = new User();
        user.setScore(score);
        user.setLastCode(lastCode);
        return getUser(user);
    }
    public User getUserOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        User user = new User();
        user.setScore(score);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfScoreAndLastLogin(String score, String lastLogin) {
        User user = new User();
        user.setScore(score);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
        return getUser(user);
    }
    public User getUserOfLastCodeAndLvl(String lastCode, String lvl) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfLastCodeAndParam(String lastCode, String param) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLastCodeAndName(String lastCode, String name) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLastQuestionIdAndName(String lastQuestionId, String name) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLvlAndLastLogin(String lvl, String lastLogin) {
        User user = new User();
        user.setLvl(lvl);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfParamAndLastLogin(String param, String lastLogin) {
        User user = new User();
        user.setParam(param);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public User getUserOfNameAndLastLogin(String name, String lastLogin) {
        User user = new User();
        user.setName(name);
        user.setLastLogin(lastLogin);
        return getUser(user);
    }
    public List<User> getUsers(User user) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(user, "user");
    }
    public List<User> getUsersOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestions(String passQuestions) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCode(String lastCode) {
        User user = new User();
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfLastQuestionId(String lastQuestionId) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLastLogin(String lastLogin) {
        User user = new User();
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPassQuestions(String userId, String passQuestions) {
        User user = new User();
        user.setUserId(userId);
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLastCode(String userId, String lastCode) {
        User user = new User();
        user.setUserId(userId);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        User user = new User();
        user.setUserId(userId);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLastLogin(String userId, String lastLogin) {
        User user = new User();
        user.setUserId(userId);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndPassQuestions(String password, String passQuestions) {
        User user = new User();
        user.setPassword(password);
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLastCode(String password, String lastCode) {
        User user = new User();
        user.setPassword(password);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        User user = new User();
        user.setPassword(password);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLastLogin(String password, String lastLogin) {
        User user = new User();
        user.setPassword(password);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndPhone(String email, String phone) {
        User user = new User();
        user.setEmail(email);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndSex(String email, String sex) {
        User user = new User();
        user.setEmail(email);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndPassQuestions(String email, String passQuestions) {
        User user = new User();
        user.setEmail(email);
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndLastCode(String email, String lastCode) {
        User user = new User();
        user.setEmail(email);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        User user = new User();
        user.setEmail(email);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndName(String email, String name) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndLastLogin(String email, String lastLogin) {
        User user = new User();
        user.setEmail(email);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndSex(String phone, String sex) {
        User user = new User();
        user.setPhone(phone);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndPassQuestions(String phone, String passQuestions) {
        User user = new User();
        user.setPhone(phone);
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndLastCode(String phone, String lastCode) {
        User user = new User();
        user.setPhone(phone);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        User user = new User();
        user.setPhone(phone);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndLastLogin(String phone, String lastLogin) {
        User user = new User();
        user.setPhone(phone);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndPassQuestions(String sex, String passQuestions) {
        User user = new User();
        user.setSex(sex);
        user.setPassQuestions(passQuestions);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLastCode(String sex, String lastCode) {
        User user = new User();
        user.setSex(sex);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        User user = new User();
        user.setSex(sex);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLastLogin(String sex, String lastLogin) {
        User user = new User();
        user.setSex(sex);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndScore(String passQuestions, String score) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndParam(String passQuestions, String param) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndName(String passQuestions, String name) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        User user = new User();
        user.setPassQuestions(passQuestions);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndLastCode(String score, String lastCode) {
        User user = new User();
        user.setScore(score);
        user.setLastCode(lastCode);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        User user = new User();
        user.setScore(score);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndLastLogin(String score, String lastLogin) {
        User user = new User();
        user.setScore(score);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCodeAndLvl(String lastCode, String lvl) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCodeAndParam(String lastCode, String param) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCodeAndName(String lastCode, String name) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLastQuestionIdAndName(String lastQuestionId, String name) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        User user = new User();
        user.setLastQuestionId(lastQuestionId);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndLastLogin(String lvl, String lastLogin) {
        User user = new User();
        user.setLvl(lvl);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndLastLogin(String param, String lastLogin) {
        User user = new User();
        user.setParam(param);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndLastLogin(String name, String lastLogin) {
        User user = new User();
        user.setName(name);
        user.setLastLogin(lastLogin);
        return getUsers(user);
    }
}
