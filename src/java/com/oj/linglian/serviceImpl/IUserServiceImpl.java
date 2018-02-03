package com.oj.linglian.serviceImpl;

import java.util.List;

import com.oj.linglian.entity.User;

import com.oj.linglian.dao.IUserDao;
import com.oj.linglian.daoImpl.IUserDaoImpl;
import com.oj.linglian.service.IUserService;

public class IUserServiceImpl implements IUserService {
	IUserDao dao = null;

	public IUserServiceImpl() {
		dao = new IUserDaoImpl();
	}
    public int update(User user, User keyUser) {
        return dao.update(user, keyUser);
    }
    public int updateOfUserId(User user, String userId) {
        return dao.updateOfUserId(user, userId);
    }
    public int updateOfPassword(User user, String password) {
        return dao.updateOfPassword(user, password);
    }
    public int updateOfEmail(User user, String email) {
        return dao.updateOfEmail(user, email);
    }
    public int updateOfPhone(User user, String phone) {
        return dao.updateOfPhone(user, phone);
    }
    public int updateOfSex(User user, String sex) {
        return dao.updateOfSex(user, sex);
    }
    public int updateOfPassQuestions(User user, String passQuestions) {
        return dao.updateOfPassQuestions(user, passQuestions);
    }
    public int updateOfScore(User user, String score) {
        return dao.updateOfScore(user, score);
    }
    public int updateOfLastCode(User user, String lastCode) {
        return dao.updateOfLastCode(user, lastCode);
    }
    public int updateOfLastQuestionId(User user, String lastQuestionId) {
        return dao.updateOfLastQuestionId(user, lastQuestionId);
    }
    public int updateOfLvl(User user, String lvl) {
        return dao.updateOfLvl(user, lvl);
    }
    public int updateOfParam(User user, String param) {
        return dao.updateOfParam(user, param);
    }
    public int updateOfName(User user, String name) {
        return dao.updateOfName(user, name);
    }
    public int updateOfLastLogin(User user, String lastLogin) {
        return dao.updateOfLastLogin(user, lastLogin);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        return dao.updateOfUserIdAndPassword(user, userId, password);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        return dao.updateOfUserIdAndEmail(user, userId, email);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        return dao.updateOfUserIdAndPhone(user, userId, phone);
    }
    public int updateOfUserIdAndSex(User user, String userId, String sex) {
        return dao.updateOfUserIdAndSex(user, userId, sex);
    }
    public int updateOfUserIdAndPassQuestions(User user, String userId, String passQuestions) {
        return dao.updateOfUserIdAndPassQuestions(user, userId, passQuestions);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        return dao.updateOfUserIdAndScore(user, userId, score);
    }
    public int updateOfUserIdAndLastCode(User user, String userId, String lastCode) {
        return dao.updateOfUserIdAndLastCode(user, userId, lastCode);
    }
    public int updateOfUserIdAndLastQuestionId(User user, String userId, String lastQuestionId) {
        return dao.updateOfUserIdAndLastQuestionId(user, userId, lastQuestionId);
    }
    public int updateOfUserIdAndLvl(User user, String userId, String lvl) {
        return dao.updateOfUserIdAndLvl(user, userId, lvl);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        return dao.updateOfUserIdAndParam(user, userId, param);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        return dao.updateOfUserIdAndName(user, userId, name);
    }
    public int updateOfUserIdAndLastLogin(User user, String userId, String lastLogin) {
        return dao.updateOfUserIdAndLastLogin(user, userId, lastLogin);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        return dao.updateOfPasswordAndEmail(user, password, email);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        return dao.updateOfPasswordAndPhone(user, password, phone);
    }
    public int updateOfPasswordAndSex(User user, String password, String sex) {
        return dao.updateOfPasswordAndSex(user, password, sex);
    }
    public int updateOfPasswordAndPassQuestions(User user, String password, String passQuestions) {
        return dao.updateOfPasswordAndPassQuestions(user, password, passQuestions);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        return dao.updateOfPasswordAndScore(user, password, score);
    }
    public int updateOfPasswordAndLastCode(User user, String password, String lastCode) {
        return dao.updateOfPasswordAndLastCode(user, password, lastCode);
    }
    public int updateOfPasswordAndLastQuestionId(User user, String password, String lastQuestionId) {
        return dao.updateOfPasswordAndLastQuestionId(user, password, lastQuestionId);
    }
    public int updateOfPasswordAndLvl(User user, String password, String lvl) {
        return dao.updateOfPasswordAndLvl(user, password, lvl);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        return dao.updateOfPasswordAndParam(user, password, param);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        return dao.updateOfPasswordAndName(user, password, name);
    }
    public int updateOfPasswordAndLastLogin(User user, String password, String lastLogin) {
        return dao.updateOfPasswordAndLastLogin(user, password, lastLogin);
    }
    public int updateOfEmailAndPhone(User user, String email, String phone) {
        return dao.updateOfEmailAndPhone(user, email, phone);
    }
    public int updateOfEmailAndSex(User user, String email, String sex) {
        return dao.updateOfEmailAndSex(user, email, sex);
    }
    public int updateOfEmailAndPassQuestions(User user, String email, String passQuestions) {
        return dao.updateOfEmailAndPassQuestions(user, email, passQuestions);
    }
    public int updateOfEmailAndScore(User user, String email, String score) {
        return dao.updateOfEmailAndScore(user, email, score);
    }
    public int updateOfEmailAndLastCode(User user, String email, String lastCode) {
        return dao.updateOfEmailAndLastCode(user, email, lastCode);
    }
    public int updateOfEmailAndLastQuestionId(User user, String email, String lastQuestionId) {
        return dao.updateOfEmailAndLastQuestionId(user, email, lastQuestionId);
    }
    public int updateOfEmailAndLvl(User user, String email, String lvl) {
        return dao.updateOfEmailAndLvl(user, email, lvl);
    }
    public int updateOfEmailAndParam(User user, String email, String param) {
        return dao.updateOfEmailAndParam(user, email, param);
    }
    public int updateOfEmailAndName(User user, String email, String name) {
        return dao.updateOfEmailAndName(user, email, name);
    }
    public int updateOfEmailAndLastLogin(User user, String email, String lastLogin) {
        return dao.updateOfEmailAndLastLogin(user, email, lastLogin);
    }
    public int updateOfPhoneAndSex(User user, String phone, String sex) {
        return dao.updateOfPhoneAndSex(user, phone, sex);
    }
    public int updateOfPhoneAndPassQuestions(User user, String phone, String passQuestions) {
        return dao.updateOfPhoneAndPassQuestions(user, phone, passQuestions);
    }
    public int updateOfPhoneAndScore(User user, String phone, String score) {
        return dao.updateOfPhoneAndScore(user, phone, score);
    }
    public int updateOfPhoneAndLastCode(User user, String phone, String lastCode) {
        return dao.updateOfPhoneAndLastCode(user, phone, lastCode);
    }
    public int updateOfPhoneAndLastQuestionId(User user, String phone, String lastQuestionId) {
        return dao.updateOfPhoneAndLastQuestionId(user, phone, lastQuestionId);
    }
    public int updateOfPhoneAndLvl(User user, String phone, String lvl) {
        return dao.updateOfPhoneAndLvl(user, phone, lvl);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        return dao.updateOfPhoneAndParam(user, phone, param);
    }
    public int updateOfPhoneAndName(User user, String phone, String name) {
        return dao.updateOfPhoneAndName(user, phone, name);
    }
    public int updateOfPhoneAndLastLogin(User user, String phone, String lastLogin) {
        return dao.updateOfPhoneAndLastLogin(user, phone, lastLogin);
    }
    public int updateOfSexAndPassQuestions(User user, String sex, String passQuestions) {
        return dao.updateOfSexAndPassQuestions(user, sex, passQuestions);
    }
    public int updateOfSexAndScore(User user, String sex, String score) {
        return dao.updateOfSexAndScore(user, sex, score);
    }
    public int updateOfSexAndLastCode(User user, String sex, String lastCode) {
        return dao.updateOfSexAndLastCode(user, sex, lastCode);
    }
    public int updateOfSexAndLastQuestionId(User user, String sex, String lastQuestionId) {
        return dao.updateOfSexAndLastQuestionId(user, sex, lastQuestionId);
    }
    public int updateOfSexAndLvl(User user, String sex, String lvl) {
        return dao.updateOfSexAndLvl(user, sex, lvl);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        return dao.updateOfSexAndParam(user, sex, param);
    }
    public int updateOfSexAndName(User user, String sex, String name) {
        return dao.updateOfSexAndName(user, sex, name);
    }
    public int updateOfSexAndLastLogin(User user, String sex, String lastLogin) {
        return dao.updateOfSexAndLastLogin(user, sex, lastLogin);
    }
    public int updateOfPassQuestionsAndScore(User user, String passQuestions, String score) {
        return dao.updateOfPassQuestionsAndScore(user, passQuestions, score);
    }
    public int updateOfPassQuestionsAndLastCode(User user, String passQuestions, String lastCode) {
        return dao.updateOfPassQuestionsAndLastCode(user, passQuestions, lastCode);
    }
    public int updateOfPassQuestionsAndLastQuestionId(User user, String passQuestions, String lastQuestionId) {
        return dao.updateOfPassQuestionsAndLastQuestionId(user, passQuestions, lastQuestionId);
    }
    public int updateOfPassQuestionsAndLvl(User user, String passQuestions, String lvl) {
        return dao.updateOfPassQuestionsAndLvl(user, passQuestions, lvl);
    }
    public int updateOfPassQuestionsAndParam(User user, String passQuestions, String param) {
        return dao.updateOfPassQuestionsAndParam(user, passQuestions, param);
    }
    public int updateOfPassQuestionsAndName(User user, String passQuestions, String name) {
        return dao.updateOfPassQuestionsAndName(user, passQuestions, name);
    }
    public int updateOfPassQuestionsAndLastLogin(User user, String passQuestions, String lastLogin) {
        return dao.updateOfPassQuestionsAndLastLogin(user, passQuestions, lastLogin);
    }
    public int updateOfScoreAndLastCode(User user, String score, String lastCode) {
        return dao.updateOfScoreAndLastCode(user, score, lastCode);
    }
    public int updateOfScoreAndLastQuestionId(User user, String score, String lastQuestionId) {
        return dao.updateOfScoreAndLastQuestionId(user, score, lastQuestionId);
    }
    public int updateOfScoreAndLvl(User user, String score, String lvl) {
        return dao.updateOfScoreAndLvl(user, score, lvl);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        return dao.updateOfScoreAndParam(user, score, param);
    }
    public int updateOfScoreAndName(User user, String score, String name) {
        return dao.updateOfScoreAndName(user, score, name);
    }
    public int updateOfScoreAndLastLogin(User user, String score, String lastLogin) {
        return dao.updateOfScoreAndLastLogin(user, score, lastLogin);
    }
    public int updateOfLastCodeAndLastQuestionId(User user, String lastCode, String lastQuestionId) {
        return dao.updateOfLastCodeAndLastQuestionId(user, lastCode, lastQuestionId);
    }
    public int updateOfLastCodeAndLvl(User user, String lastCode, String lvl) {
        return dao.updateOfLastCodeAndLvl(user, lastCode, lvl);
    }
    public int updateOfLastCodeAndParam(User user, String lastCode, String param) {
        return dao.updateOfLastCodeAndParam(user, lastCode, param);
    }
    public int updateOfLastCodeAndName(User user, String lastCode, String name) {
        return dao.updateOfLastCodeAndName(user, lastCode, name);
    }
    public int updateOfLastCodeAndLastLogin(User user, String lastCode, String lastLogin) {
        return dao.updateOfLastCodeAndLastLogin(user, lastCode, lastLogin);
    }
    public int updateOfLastQuestionIdAndLvl(User user, String lastQuestionId, String lvl) {
        return dao.updateOfLastQuestionIdAndLvl(user, lastQuestionId, lvl);
    }
    public int updateOfLastQuestionIdAndParam(User user, String lastQuestionId, String param) {
        return dao.updateOfLastQuestionIdAndParam(user, lastQuestionId, param);
    }
    public int updateOfLastQuestionIdAndName(User user, String lastQuestionId, String name) {
        return dao.updateOfLastQuestionIdAndName(user, lastQuestionId, name);
    }
    public int updateOfLastQuestionIdAndLastLogin(User user, String lastQuestionId, String lastLogin) {
        return dao.updateOfLastQuestionIdAndLastLogin(user, lastQuestionId, lastLogin);
    }
    public int updateOfLvlAndParam(User user, String lvl, String param) {
        return dao.updateOfLvlAndParam(user, lvl, param);
    }
    public int updateOfLvlAndName(User user, String lvl, String name) {
        return dao.updateOfLvlAndName(user, lvl, name);
    }
    public int updateOfLvlAndLastLogin(User user, String lvl, String lastLogin) {
        return dao.updateOfLvlAndLastLogin(user, lvl, lastLogin);
    }
    public int updateOfParamAndName(User user, String param, String name) {
        return dao.updateOfParamAndName(user, param, name);
    }
    public int updateOfParamAndLastLogin(User user, String param, String lastLogin) {
        return dao.updateOfParamAndLastLogin(user, param, lastLogin);
    }
    public int updateOfNameAndLastLogin(User user, String name, String lastLogin) {
        return dao.updateOfNameAndLastLogin(user, name, lastLogin);
    }
    public int remove(User user) {
        return dao.remove(user);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfPassword(String password) {
        return dao.removeOfPassword(password);
    }
    public int removeOfEmail(String email) {
        return dao.removeOfEmail(email);
    }
    public int removeOfPhone(String phone) {
        return dao.removeOfPhone(phone);
    }
    public int removeOfSex(String sex) {
        return dao.removeOfSex(sex);
    }
    public int removeOfPassQuestions(String passQuestions) {
        return dao.removeOfPassQuestions(passQuestions);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfLastCode(String lastCode) {
        return dao.removeOfLastCode(lastCode);
    }
    public int removeOfLastQuestionId(String lastQuestionId) {
        return dao.removeOfLastQuestionId(lastQuestionId);
    }
    public int removeOfLvl(String lvl) {
        return dao.removeOfLvl(lvl);
    }
    public int removeOfParam(String param) {
        return dao.removeOfParam(param);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfLastLogin(String lastLogin) {
        return dao.removeOfLastLogin(lastLogin);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        return dao.removeOfUserIdAndPassword(userId, password);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        return dao.removeOfUserIdAndEmail(userId, email);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        return dao.removeOfUserIdAndPhone(userId, phone);
    }
    public int removeOfUserIdAndSex(String userId, String sex) {
        return dao.removeOfUserIdAndSex(userId, sex);
    }
    public int removeOfUserIdAndPassQuestions(String userId, String passQuestions) {
        return dao.removeOfUserIdAndPassQuestions(userId, passQuestions);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        return dao.removeOfUserIdAndScore(userId, score);
    }
    public int removeOfUserIdAndLastCode(String userId, String lastCode) {
        return dao.removeOfUserIdAndLastCode(userId, lastCode);
    }
    public int removeOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        return dao.removeOfUserIdAndLastQuestionId(userId, lastQuestionId);
    }
    public int removeOfUserIdAndLvl(String userId, String lvl) {
        return dao.removeOfUserIdAndLvl(userId, lvl);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        return dao.removeOfUserIdAndParam(userId, param);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        return dao.removeOfUserIdAndName(userId, name);
    }
    public int removeOfUserIdAndLastLogin(String userId, String lastLogin) {
        return dao.removeOfUserIdAndLastLogin(userId, lastLogin);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        return dao.removeOfPasswordAndEmail(password, email);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        return dao.removeOfPasswordAndPhone(password, phone);
    }
    public int removeOfPasswordAndSex(String password, String sex) {
        return dao.removeOfPasswordAndSex(password, sex);
    }
    public int removeOfPasswordAndPassQuestions(String password, String passQuestions) {
        return dao.removeOfPasswordAndPassQuestions(password, passQuestions);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        return dao.removeOfPasswordAndScore(password, score);
    }
    public int removeOfPasswordAndLastCode(String password, String lastCode) {
        return dao.removeOfPasswordAndLastCode(password, lastCode);
    }
    public int removeOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        return dao.removeOfPasswordAndLastQuestionId(password, lastQuestionId);
    }
    public int removeOfPasswordAndLvl(String password, String lvl) {
        return dao.removeOfPasswordAndLvl(password, lvl);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        return dao.removeOfPasswordAndParam(password, param);
    }
    public int removeOfPasswordAndName(String password, String name) {
        return dao.removeOfPasswordAndName(password, name);
    }
    public int removeOfPasswordAndLastLogin(String password, String lastLogin) {
        return dao.removeOfPasswordAndLastLogin(password, lastLogin);
    }
    public int removeOfEmailAndPhone(String email, String phone) {
        return dao.removeOfEmailAndPhone(email, phone);
    }
    public int removeOfEmailAndSex(String email, String sex) {
        return dao.removeOfEmailAndSex(email, sex);
    }
    public int removeOfEmailAndPassQuestions(String email, String passQuestions) {
        return dao.removeOfEmailAndPassQuestions(email, passQuestions);
    }
    public int removeOfEmailAndScore(String email, String score) {
        return dao.removeOfEmailAndScore(email, score);
    }
    public int removeOfEmailAndLastCode(String email, String lastCode) {
        return dao.removeOfEmailAndLastCode(email, lastCode);
    }
    public int removeOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        return dao.removeOfEmailAndLastQuestionId(email, lastQuestionId);
    }
    public int removeOfEmailAndLvl(String email, String lvl) {
        return dao.removeOfEmailAndLvl(email, lvl);
    }
    public int removeOfEmailAndParam(String email, String param) {
        return dao.removeOfEmailAndParam(email, param);
    }
    public int removeOfEmailAndName(String email, String name) {
        return dao.removeOfEmailAndName(email, name);
    }
    public int removeOfEmailAndLastLogin(String email, String lastLogin) {
        return dao.removeOfEmailAndLastLogin(email, lastLogin);
    }
    public int removeOfPhoneAndSex(String phone, String sex) {
        return dao.removeOfPhoneAndSex(phone, sex);
    }
    public int removeOfPhoneAndPassQuestions(String phone, String passQuestions) {
        return dao.removeOfPhoneAndPassQuestions(phone, passQuestions);
    }
    public int removeOfPhoneAndScore(String phone, String score) {
        return dao.removeOfPhoneAndScore(phone, score);
    }
    public int removeOfPhoneAndLastCode(String phone, String lastCode) {
        return dao.removeOfPhoneAndLastCode(phone, lastCode);
    }
    public int removeOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        return dao.removeOfPhoneAndLastQuestionId(phone, lastQuestionId);
    }
    public int removeOfPhoneAndLvl(String phone, String lvl) {
        return dao.removeOfPhoneAndLvl(phone, lvl);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        return dao.removeOfPhoneAndParam(phone, param);
    }
    public int removeOfPhoneAndName(String phone, String name) {
        return dao.removeOfPhoneAndName(phone, name);
    }
    public int removeOfPhoneAndLastLogin(String phone, String lastLogin) {
        return dao.removeOfPhoneAndLastLogin(phone, lastLogin);
    }
    public int removeOfSexAndPassQuestions(String sex, String passQuestions) {
        return dao.removeOfSexAndPassQuestions(sex, passQuestions);
    }
    public int removeOfSexAndScore(String sex, String score) {
        return dao.removeOfSexAndScore(sex, score);
    }
    public int removeOfSexAndLastCode(String sex, String lastCode) {
        return dao.removeOfSexAndLastCode(sex, lastCode);
    }
    public int removeOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        return dao.removeOfSexAndLastQuestionId(sex, lastQuestionId);
    }
    public int removeOfSexAndLvl(String sex, String lvl) {
        return dao.removeOfSexAndLvl(sex, lvl);
    }
    public int removeOfSexAndParam(String sex, String param) {
        return dao.removeOfSexAndParam(sex, param);
    }
    public int removeOfSexAndName(String sex, String name) {
        return dao.removeOfSexAndName(sex, name);
    }
    public int removeOfSexAndLastLogin(String sex, String lastLogin) {
        return dao.removeOfSexAndLastLogin(sex, lastLogin);
    }
    public int removeOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.removeOfPassQuestionsAndScore(passQuestions, score);
    }
    public int removeOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.removeOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public int removeOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.removeOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public int removeOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        return dao.removeOfPassQuestionsAndLvl(passQuestions, lvl);
    }
    public int removeOfPassQuestionsAndParam(String passQuestions, String param) {
        return dao.removeOfPassQuestionsAndParam(passQuestions, param);
    }
    public int removeOfPassQuestionsAndName(String passQuestions, String name) {
        return dao.removeOfPassQuestionsAndName(passQuestions, name);
    }
    public int removeOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        return dao.removeOfPassQuestionsAndLastLogin(passQuestions, lastLogin);
    }
    public int removeOfScoreAndLastCode(String score, String lastCode) {
        return dao.removeOfScoreAndLastCode(score, lastCode);
    }
    public int removeOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.removeOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public int removeOfScoreAndLvl(String score, String lvl) {
        return dao.removeOfScoreAndLvl(score, lvl);
    }
    public int removeOfScoreAndParam(String score, String param) {
        return dao.removeOfScoreAndParam(score, param);
    }
    public int removeOfScoreAndName(String score, String name) {
        return dao.removeOfScoreAndName(score, name);
    }
    public int removeOfScoreAndLastLogin(String score, String lastLogin) {
        return dao.removeOfScoreAndLastLogin(score, lastLogin);
    }
    public int removeOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.removeOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
    }
    public int removeOfLastCodeAndLvl(String lastCode, String lvl) {
        return dao.removeOfLastCodeAndLvl(lastCode, lvl);
    }
    public int removeOfLastCodeAndParam(String lastCode, String param) {
        return dao.removeOfLastCodeAndParam(lastCode, param);
    }
    public int removeOfLastCodeAndName(String lastCode, String name) {
        return dao.removeOfLastCodeAndName(lastCode, name);
    }
    public int removeOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        return dao.removeOfLastCodeAndLastLogin(lastCode, lastLogin);
    }
    public int removeOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        return dao.removeOfLastQuestionIdAndLvl(lastQuestionId, lvl);
    }
    public int removeOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        return dao.removeOfLastQuestionIdAndParam(lastQuestionId, param);
    }
    public int removeOfLastQuestionIdAndName(String lastQuestionId, String name) {
        return dao.removeOfLastQuestionIdAndName(lastQuestionId, name);
    }
    public int removeOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        return dao.removeOfLastQuestionIdAndLastLogin(lastQuestionId, lastLogin);
    }
    public int removeOfLvlAndParam(String lvl, String param) {
        return dao.removeOfLvlAndParam(lvl, param);
    }
    public int removeOfLvlAndName(String lvl, String name) {
        return dao.removeOfLvlAndName(lvl, name);
    }
    public int removeOfLvlAndLastLogin(String lvl, String lastLogin) {
        return dao.removeOfLvlAndLastLogin(lvl, lastLogin);
    }
    public int removeOfParamAndName(String param, String name) {
        return dao.removeOfParamAndName(param, name);
    }
    public int removeOfParamAndLastLogin(String param, String lastLogin) {
        return dao.removeOfParamAndLastLogin(param, lastLogin);
    }
    public int removeOfNameAndLastLogin(String name, String lastLogin) {
        return dao.removeOfNameAndLastLogin(name, lastLogin);
    }
    public int insert(User user) {
        return dao.insert(user);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfPassword(String password) {
        return dao.insertOfPassword(password);
    }
    public int insertOfEmail(String email) {
        return dao.insertOfEmail(email);
    }
    public int insertOfPhone(String phone) {
        return dao.insertOfPhone(phone);
    }
    public int insertOfSex(String sex) {
        return dao.insertOfSex(sex);
    }
    public int insertOfPassQuestions(String passQuestions) {
        return dao.insertOfPassQuestions(passQuestions);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfLastCode(String lastCode) {
        return dao.insertOfLastCode(lastCode);
    }
    public int insertOfLastQuestionId(String lastQuestionId) {
        return dao.insertOfLastQuestionId(lastQuestionId);
    }
    public int insertOfLvl(String lvl) {
        return dao.insertOfLvl(lvl);
    }
    public int insertOfParam(String param) {
        return dao.insertOfParam(param);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfLastLogin(String lastLogin) {
        return dao.insertOfLastLogin(lastLogin);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        return dao.insertOfUserIdAndPassword(userId, password);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        return dao.insertOfUserIdAndEmail(userId, email);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        return dao.insertOfUserIdAndPhone(userId, phone);
    }
    public int insertOfUserIdAndSex(String userId, String sex) {
        return dao.insertOfUserIdAndSex(userId, sex);
    }
    public int insertOfUserIdAndPassQuestions(String userId, String passQuestions) {
        return dao.insertOfUserIdAndPassQuestions(userId, passQuestions);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        return dao.insertOfUserIdAndScore(userId, score);
    }
    public int insertOfUserIdAndLastCode(String userId, String lastCode) {
        return dao.insertOfUserIdAndLastCode(userId, lastCode);
    }
    public int insertOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        return dao.insertOfUserIdAndLastQuestionId(userId, lastQuestionId);
    }
    public int insertOfUserIdAndLvl(String userId, String lvl) {
        return dao.insertOfUserIdAndLvl(userId, lvl);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        return dao.insertOfUserIdAndParam(userId, param);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        return dao.insertOfUserIdAndName(userId, name);
    }
    public int insertOfUserIdAndLastLogin(String userId, String lastLogin) {
        return dao.insertOfUserIdAndLastLogin(userId, lastLogin);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        return dao.insertOfPasswordAndEmail(password, email);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        return dao.insertOfPasswordAndPhone(password, phone);
    }
    public int insertOfPasswordAndSex(String password, String sex) {
        return dao.insertOfPasswordAndSex(password, sex);
    }
    public int insertOfPasswordAndPassQuestions(String password, String passQuestions) {
        return dao.insertOfPasswordAndPassQuestions(password, passQuestions);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        return dao.insertOfPasswordAndScore(password, score);
    }
    public int insertOfPasswordAndLastCode(String password, String lastCode) {
        return dao.insertOfPasswordAndLastCode(password, lastCode);
    }
    public int insertOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        return dao.insertOfPasswordAndLastQuestionId(password, lastQuestionId);
    }
    public int insertOfPasswordAndLvl(String password, String lvl) {
        return dao.insertOfPasswordAndLvl(password, lvl);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        return dao.insertOfPasswordAndParam(password, param);
    }
    public int insertOfPasswordAndName(String password, String name) {
        return dao.insertOfPasswordAndName(password, name);
    }
    public int insertOfPasswordAndLastLogin(String password, String lastLogin) {
        return dao.insertOfPasswordAndLastLogin(password, lastLogin);
    }
    public int insertOfEmailAndPhone(String email, String phone) {
        return dao.insertOfEmailAndPhone(email, phone);
    }
    public int insertOfEmailAndSex(String email, String sex) {
        return dao.insertOfEmailAndSex(email, sex);
    }
    public int insertOfEmailAndPassQuestions(String email, String passQuestions) {
        return dao.insertOfEmailAndPassQuestions(email, passQuestions);
    }
    public int insertOfEmailAndScore(String email, String score) {
        return dao.insertOfEmailAndScore(email, score);
    }
    public int insertOfEmailAndLastCode(String email, String lastCode) {
        return dao.insertOfEmailAndLastCode(email, lastCode);
    }
    public int insertOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        return dao.insertOfEmailAndLastQuestionId(email, lastQuestionId);
    }
    public int insertOfEmailAndLvl(String email, String lvl) {
        return dao.insertOfEmailAndLvl(email, lvl);
    }
    public int insertOfEmailAndParam(String email, String param) {
        return dao.insertOfEmailAndParam(email, param);
    }
    public int insertOfEmailAndName(String email, String name) {
        return dao.insertOfEmailAndName(email, name);
    }
    public int insertOfEmailAndLastLogin(String email, String lastLogin) {
        return dao.insertOfEmailAndLastLogin(email, lastLogin);
    }
    public int insertOfPhoneAndSex(String phone, String sex) {
        return dao.insertOfPhoneAndSex(phone, sex);
    }
    public int insertOfPhoneAndPassQuestions(String phone, String passQuestions) {
        return dao.insertOfPhoneAndPassQuestions(phone, passQuestions);
    }
    public int insertOfPhoneAndScore(String phone, String score) {
        return dao.insertOfPhoneAndScore(phone, score);
    }
    public int insertOfPhoneAndLastCode(String phone, String lastCode) {
        return dao.insertOfPhoneAndLastCode(phone, lastCode);
    }
    public int insertOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        return dao.insertOfPhoneAndLastQuestionId(phone, lastQuestionId);
    }
    public int insertOfPhoneAndLvl(String phone, String lvl) {
        return dao.insertOfPhoneAndLvl(phone, lvl);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        return dao.insertOfPhoneAndParam(phone, param);
    }
    public int insertOfPhoneAndName(String phone, String name) {
        return dao.insertOfPhoneAndName(phone, name);
    }
    public int insertOfPhoneAndLastLogin(String phone, String lastLogin) {
        return dao.insertOfPhoneAndLastLogin(phone, lastLogin);
    }
    public int insertOfSexAndPassQuestions(String sex, String passQuestions) {
        return dao.insertOfSexAndPassQuestions(sex, passQuestions);
    }
    public int insertOfSexAndScore(String sex, String score) {
        return dao.insertOfSexAndScore(sex, score);
    }
    public int insertOfSexAndLastCode(String sex, String lastCode) {
        return dao.insertOfSexAndLastCode(sex, lastCode);
    }
    public int insertOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        return dao.insertOfSexAndLastQuestionId(sex, lastQuestionId);
    }
    public int insertOfSexAndLvl(String sex, String lvl) {
        return dao.insertOfSexAndLvl(sex, lvl);
    }
    public int insertOfSexAndParam(String sex, String param) {
        return dao.insertOfSexAndParam(sex, param);
    }
    public int insertOfSexAndName(String sex, String name) {
        return dao.insertOfSexAndName(sex, name);
    }
    public int insertOfSexAndLastLogin(String sex, String lastLogin) {
        return dao.insertOfSexAndLastLogin(sex, lastLogin);
    }
    public int insertOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.insertOfPassQuestionsAndScore(passQuestions, score);
    }
    public int insertOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.insertOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public int insertOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.insertOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public int insertOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        return dao.insertOfPassQuestionsAndLvl(passQuestions, lvl);
    }
    public int insertOfPassQuestionsAndParam(String passQuestions, String param) {
        return dao.insertOfPassQuestionsAndParam(passQuestions, param);
    }
    public int insertOfPassQuestionsAndName(String passQuestions, String name) {
        return dao.insertOfPassQuestionsAndName(passQuestions, name);
    }
    public int insertOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        return dao.insertOfPassQuestionsAndLastLogin(passQuestions, lastLogin);
    }
    public int insertOfScoreAndLastCode(String score, String lastCode) {
        return dao.insertOfScoreAndLastCode(score, lastCode);
    }
    public int insertOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.insertOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public int insertOfScoreAndLvl(String score, String lvl) {
        return dao.insertOfScoreAndLvl(score, lvl);
    }
    public int insertOfScoreAndParam(String score, String param) {
        return dao.insertOfScoreAndParam(score, param);
    }
    public int insertOfScoreAndName(String score, String name) {
        return dao.insertOfScoreAndName(score, name);
    }
    public int insertOfScoreAndLastLogin(String score, String lastLogin) {
        return dao.insertOfScoreAndLastLogin(score, lastLogin);
    }
    public int insertOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.insertOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
    }
    public int insertOfLastCodeAndLvl(String lastCode, String lvl) {
        return dao.insertOfLastCodeAndLvl(lastCode, lvl);
    }
    public int insertOfLastCodeAndParam(String lastCode, String param) {
        return dao.insertOfLastCodeAndParam(lastCode, param);
    }
    public int insertOfLastCodeAndName(String lastCode, String name) {
        return dao.insertOfLastCodeAndName(lastCode, name);
    }
    public int insertOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        return dao.insertOfLastCodeAndLastLogin(lastCode, lastLogin);
    }
    public int insertOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        return dao.insertOfLastQuestionIdAndLvl(lastQuestionId, lvl);
    }
    public int insertOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        return dao.insertOfLastQuestionIdAndParam(lastQuestionId, param);
    }
    public int insertOfLastQuestionIdAndName(String lastQuestionId, String name) {
        return dao.insertOfLastQuestionIdAndName(lastQuestionId, name);
    }
    public int insertOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        return dao.insertOfLastQuestionIdAndLastLogin(lastQuestionId, lastLogin);
    }
    public int insertOfLvlAndParam(String lvl, String param) {
        return dao.insertOfLvlAndParam(lvl, param);
    }
    public int insertOfLvlAndName(String lvl, String name) {
        return dao.insertOfLvlAndName(lvl, name);
    }
    public int insertOfLvlAndLastLogin(String lvl, String lastLogin) {
        return dao.insertOfLvlAndLastLogin(lvl, lastLogin);
    }
    public int insertOfParamAndName(String param, String name) {
        return dao.insertOfParamAndName(param, name);
    }
    public int insertOfParamAndLastLogin(String param, String lastLogin) {
        return dao.insertOfParamAndLastLogin(param, lastLogin);
    }
    public int insertOfNameAndLastLogin(String name, String lastLogin) {
        return dao.insertOfNameAndLastLogin(name, lastLogin);
    }
    public User getUser(User user) {
        return dao.getUser(user);
    }
    public User getUserOfUserId(String userId) {
        return dao.getUserOfUserId(userId);
    }
    public User getUserOfPassword(String password) {
        return dao.getUserOfPassword(password);
    }
    public User getUserOfEmail(String email) {
        return dao.getUserOfEmail(email);
    }
    public User getUserOfPhone(String phone) {
        return dao.getUserOfPhone(phone);
    }
    public User getUserOfSex(String sex) {
        return dao.getUserOfSex(sex);
    }
    public User getUserOfPassQuestions(String passQuestions) {
        return dao.getUserOfPassQuestions(passQuestions);
    }
    public User getUserOfScore(String score) {
        return dao.getUserOfScore(score);
    }
    public User getUserOfLastCode(String lastCode) {
        return dao.getUserOfLastCode(lastCode);
    }
    public User getUserOfLastQuestionId(String lastQuestionId) {
        return dao.getUserOfLastQuestionId(lastQuestionId);
    }
    public User getUserOfLvl(String lvl) {
        return dao.getUserOfLvl(lvl);
    }
    public User getUserOfParam(String param) {
        return dao.getUserOfParam(param);
    }
    public User getUserOfName(String name) {
        return dao.getUserOfName(name);
    }
    public User getUserOfLastLogin(String lastLogin) {
        return dao.getUserOfLastLogin(lastLogin);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        return dao.getUserOfUserIdAndPassword(userId, password);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        return dao.getUserOfUserIdAndEmail(userId, email);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        return dao.getUserOfUserIdAndPhone(userId, phone);
    }
    public User getUserOfUserIdAndSex(String userId, String sex) {
        return dao.getUserOfUserIdAndSex(userId, sex);
    }
    public User getUserOfUserIdAndPassQuestions(String userId, String passQuestions) {
        return dao.getUserOfUserIdAndPassQuestions(userId, passQuestions);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        return dao.getUserOfUserIdAndScore(userId, score);
    }
    public User getUserOfUserIdAndLastCode(String userId, String lastCode) {
        return dao.getUserOfUserIdAndLastCode(userId, lastCode);
    }
    public User getUserOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        return dao.getUserOfUserIdAndLastQuestionId(userId, lastQuestionId);
    }
    public User getUserOfUserIdAndLvl(String userId, String lvl) {
        return dao.getUserOfUserIdAndLvl(userId, lvl);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        return dao.getUserOfUserIdAndParam(userId, param);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        return dao.getUserOfUserIdAndName(userId, name);
    }
    public User getUserOfUserIdAndLastLogin(String userId, String lastLogin) {
        return dao.getUserOfUserIdAndLastLogin(userId, lastLogin);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        return dao.getUserOfPasswordAndEmail(password, email);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        return dao.getUserOfPasswordAndPhone(password, phone);
    }
    public User getUserOfPasswordAndSex(String password, String sex) {
        return dao.getUserOfPasswordAndSex(password, sex);
    }
    public User getUserOfPasswordAndPassQuestions(String password, String passQuestions) {
        return dao.getUserOfPasswordAndPassQuestions(password, passQuestions);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        return dao.getUserOfPasswordAndScore(password, score);
    }
    public User getUserOfPasswordAndLastCode(String password, String lastCode) {
        return dao.getUserOfPasswordAndLastCode(password, lastCode);
    }
    public User getUserOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        return dao.getUserOfPasswordAndLastQuestionId(password, lastQuestionId);
    }
    public User getUserOfPasswordAndLvl(String password, String lvl) {
        return dao.getUserOfPasswordAndLvl(password, lvl);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        return dao.getUserOfPasswordAndParam(password, param);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        return dao.getUserOfPasswordAndName(password, name);
    }
    public User getUserOfPasswordAndLastLogin(String password, String lastLogin) {
        return dao.getUserOfPasswordAndLastLogin(password, lastLogin);
    }
    public User getUserOfEmailAndPhone(String email, String phone) {
        return dao.getUserOfEmailAndPhone(email, phone);
    }
    public User getUserOfEmailAndSex(String email, String sex) {
        return dao.getUserOfEmailAndSex(email, sex);
    }
    public User getUserOfEmailAndPassQuestions(String email, String passQuestions) {
        return dao.getUserOfEmailAndPassQuestions(email, passQuestions);
    }
    public User getUserOfEmailAndScore(String email, String score) {
        return dao.getUserOfEmailAndScore(email, score);
    }
    public User getUserOfEmailAndLastCode(String email, String lastCode) {
        return dao.getUserOfEmailAndLastCode(email, lastCode);
    }
    public User getUserOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        return dao.getUserOfEmailAndLastQuestionId(email, lastQuestionId);
    }
    public User getUserOfEmailAndLvl(String email, String lvl) {
        return dao.getUserOfEmailAndLvl(email, lvl);
    }
    public User getUserOfEmailAndParam(String email, String param) {
        return dao.getUserOfEmailAndParam(email, param);
    }
    public User getUserOfEmailAndName(String email, String name) {
        return dao.getUserOfEmailAndName(email, name);
    }
    public User getUserOfEmailAndLastLogin(String email, String lastLogin) {
        return dao.getUserOfEmailAndLastLogin(email, lastLogin);
    }
    public User getUserOfPhoneAndSex(String phone, String sex) {
        return dao.getUserOfPhoneAndSex(phone, sex);
    }
    public User getUserOfPhoneAndPassQuestions(String phone, String passQuestions) {
        return dao.getUserOfPhoneAndPassQuestions(phone, passQuestions);
    }
    public User getUserOfPhoneAndScore(String phone, String score) {
        return dao.getUserOfPhoneAndScore(phone, score);
    }
    public User getUserOfPhoneAndLastCode(String phone, String lastCode) {
        return dao.getUserOfPhoneAndLastCode(phone, lastCode);
    }
    public User getUserOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        return dao.getUserOfPhoneAndLastQuestionId(phone, lastQuestionId);
    }
    public User getUserOfPhoneAndLvl(String phone, String lvl) {
        return dao.getUserOfPhoneAndLvl(phone, lvl);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        return dao.getUserOfPhoneAndParam(phone, param);
    }
    public User getUserOfPhoneAndName(String phone, String name) {
        return dao.getUserOfPhoneAndName(phone, name);
    }
    public User getUserOfPhoneAndLastLogin(String phone, String lastLogin) {
        return dao.getUserOfPhoneAndLastLogin(phone, lastLogin);
    }
    public User getUserOfSexAndPassQuestions(String sex, String passQuestions) {
        return dao.getUserOfSexAndPassQuestions(sex, passQuestions);
    }
    public User getUserOfSexAndScore(String sex, String score) {
        return dao.getUserOfSexAndScore(sex, score);
    }
    public User getUserOfSexAndLastCode(String sex, String lastCode) {
        return dao.getUserOfSexAndLastCode(sex, lastCode);
    }
    public User getUserOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        return dao.getUserOfSexAndLastQuestionId(sex, lastQuestionId);
    }
    public User getUserOfSexAndLvl(String sex, String lvl) {
        return dao.getUserOfSexAndLvl(sex, lvl);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        return dao.getUserOfSexAndParam(sex, param);
    }
    public User getUserOfSexAndName(String sex, String name) {
        return dao.getUserOfSexAndName(sex, name);
    }
    public User getUserOfSexAndLastLogin(String sex, String lastLogin) {
        return dao.getUserOfSexAndLastLogin(sex, lastLogin);
    }
    public User getUserOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.getUserOfPassQuestionsAndScore(passQuestions, score);
    }
    public User getUserOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.getUserOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public User getUserOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.getUserOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public User getUserOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        return dao.getUserOfPassQuestionsAndLvl(passQuestions, lvl);
    }
    public User getUserOfPassQuestionsAndParam(String passQuestions, String param) {
        return dao.getUserOfPassQuestionsAndParam(passQuestions, param);
    }
    public User getUserOfPassQuestionsAndName(String passQuestions, String name) {
        return dao.getUserOfPassQuestionsAndName(passQuestions, name);
    }
    public User getUserOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        return dao.getUserOfPassQuestionsAndLastLogin(passQuestions, lastLogin);
    }
    public User getUserOfScoreAndLastCode(String score, String lastCode) {
        return dao.getUserOfScoreAndLastCode(score, lastCode);
    }
    public User getUserOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.getUserOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public User getUserOfScoreAndLvl(String score, String lvl) {
        return dao.getUserOfScoreAndLvl(score, lvl);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        return dao.getUserOfScoreAndParam(score, param);
    }
    public User getUserOfScoreAndName(String score, String name) {
        return dao.getUserOfScoreAndName(score, name);
    }
    public User getUserOfScoreAndLastLogin(String score, String lastLogin) {
        return dao.getUserOfScoreAndLastLogin(score, lastLogin);
    }
    public User getUserOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.getUserOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
    }
    public User getUserOfLastCodeAndLvl(String lastCode, String lvl) {
        return dao.getUserOfLastCodeAndLvl(lastCode, lvl);
    }
    public User getUserOfLastCodeAndParam(String lastCode, String param) {
        return dao.getUserOfLastCodeAndParam(lastCode, param);
    }
    public User getUserOfLastCodeAndName(String lastCode, String name) {
        return dao.getUserOfLastCodeAndName(lastCode, name);
    }
    public User getUserOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        return dao.getUserOfLastCodeAndLastLogin(lastCode, lastLogin);
    }
    public User getUserOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        return dao.getUserOfLastQuestionIdAndLvl(lastQuestionId, lvl);
    }
    public User getUserOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        return dao.getUserOfLastQuestionIdAndParam(lastQuestionId, param);
    }
    public User getUserOfLastQuestionIdAndName(String lastQuestionId, String name) {
        return dao.getUserOfLastQuestionIdAndName(lastQuestionId, name);
    }
    public User getUserOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        return dao.getUserOfLastQuestionIdAndLastLogin(lastQuestionId, lastLogin);
    }
    public User getUserOfLvlAndParam(String lvl, String param) {
        return dao.getUserOfLvlAndParam(lvl, param);
    }
    public User getUserOfLvlAndName(String lvl, String name) {
        return dao.getUserOfLvlAndName(lvl, name);
    }
    public User getUserOfLvlAndLastLogin(String lvl, String lastLogin) {
        return dao.getUserOfLvlAndLastLogin(lvl, lastLogin);
    }
    public User getUserOfParamAndName(String param, String name) {
        return dao.getUserOfParamAndName(param, name);
    }
    public User getUserOfParamAndLastLogin(String param, String lastLogin) {
        return dao.getUserOfParamAndLastLogin(param, lastLogin);
    }
    public User getUserOfNameAndLastLogin(String name, String lastLogin) {
        return dao.getUserOfNameAndLastLogin(name, lastLogin);
    }
    public List<User> getUsers(User user) {
        return dao.getUsers(user);
    }
    public List<User> getUsersOfUserId(String userId) {
        return dao.getUsersOfUserId(userId);
    }
    public List<User> getUsersOfPassword(String password) {
        return dao.getUsersOfPassword(password);
    }
    public List<User> getUsersOfEmail(String email) {
        return dao.getUsersOfEmail(email);
    }
    public List<User> getUsersOfPhone(String phone) {
        return dao.getUsersOfPhone(phone);
    }
    public List<User> getUsersOfSex(String sex) {
        return dao.getUsersOfSex(sex);
    }
    public List<User> getUsersOfPassQuestions(String passQuestions) {
        return dao.getUsersOfPassQuestions(passQuestions);
    }
    public List<User> getUsersOfScore(String score) {
        return dao.getUsersOfScore(score);
    }
    public List<User> getUsersOfLastCode(String lastCode) {
        return dao.getUsersOfLastCode(lastCode);
    }
    public List<User> getUsersOfLastQuestionId(String lastQuestionId) {
        return dao.getUsersOfLastQuestionId(lastQuestionId);
    }
    public List<User> getUsersOfLvl(String lvl) {
        return dao.getUsersOfLvl(lvl);
    }
    public List<User> getUsersOfParam(String param) {
        return dao.getUsersOfParam(param);
    }
    public List<User> getUsersOfName(String name) {
        return dao.getUsersOfName(name);
    }
    public List<User> getUsersOfLastLogin(String lastLogin) {
        return dao.getUsersOfLastLogin(lastLogin);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        return dao.getUsersOfUserIdAndPassword(userId, password);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        return dao.getUsersOfUserIdAndEmail(userId, email);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        return dao.getUsersOfUserIdAndPhone(userId, phone);
    }
    public List<User> getUsersOfUserIdAndSex(String userId, String sex) {
        return dao.getUsersOfUserIdAndSex(userId, sex);
    }
    public List<User> getUsersOfUserIdAndPassQuestions(String userId, String passQuestions) {
        return dao.getUsersOfUserIdAndPassQuestions(userId, passQuestions);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        return dao.getUsersOfUserIdAndScore(userId, score);
    }
    public List<User> getUsersOfUserIdAndLastCode(String userId, String lastCode) {
        return dao.getUsersOfUserIdAndLastCode(userId, lastCode);
    }
    public List<User> getUsersOfUserIdAndLastQuestionId(String userId, String lastQuestionId) {
        return dao.getUsersOfUserIdAndLastQuestionId(userId, lastQuestionId);
    }
    public List<User> getUsersOfUserIdAndLvl(String userId, String lvl) {
        return dao.getUsersOfUserIdAndLvl(userId, lvl);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        return dao.getUsersOfUserIdAndParam(userId, param);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        return dao.getUsersOfUserIdAndName(userId, name);
    }
    public List<User> getUsersOfUserIdAndLastLogin(String userId, String lastLogin) {
        return dao.getUsersOfUserIdAndLastLogin(userId, lastLogin);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        return dao.getUsersOfPasswordAndEmail(password, email);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        return dao.getUsersOfPasswordAndPhone(password, phone);
    }
    public List<User> getUsersOfPasswordAndSex(String password, String sex) {
        return dao.getUsersOfPasswordAndSex(password, sex);
    }
    public List<User> getUsersOfPasswordAndPassQuestions(String password, String passQuestions) {
        return dao.getUsersOfPasswordAndPassQuestions(password, passQuestions);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        return dao.getUsersOfPasswordAndScore(password, score);
    }
    public List<User> getUsersOfPasswordAndLastCode(String password, String lastCode) {
        return dao.getUsersOfPasswordAndLastCode(password, lastCode);
    }
    public List<User> getUsersOfPasswordAndLastQuestionId(String password, String lastQuestionId) {
        return dao.getUsersOfPasswordAndLastQuestionId(password, lastQuestionId);
    }
    public List<User> getUsersOfPasswordAndLvl(String password, String lvl) {
        return dao.getUsersOfPasswordAndLvl(password, lvl);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        return dao.getUsersOfPasswordAndParam(password, param);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        return dao.getUsersOfPasswordAndName(password, name);
    }
    public List<User> getUsersOfPasswordAndLastLogin(String password, String lastLogin) {
        return dao.getUsersOfPasswordAndLastLogin(password, lastLogin);
    }
    public List<User> getUsersOfEmailAndPhone(String email, String phone) {
        return dao.getUsersOfEmailAndPhone(email, phone);
    }
    public List<User> getUsersOfEmailAndSex(String email, String sex) {
        return dao.getUsersOfEmailAndSex(email, sex);
    }
    public List<User> getUsersOfEmailAndPassQuestions(String email, String passQuestions) {
        return dao.getUsersOfEmailAndPassQuestions(email, passQuestions);
    }
    public List<User> getUsersOfEmailAndScore(String email, String score) {
        return dao.getUsersOfEmailAndScore(email, score);
    }
    public List<User> getUsersOfEmailAndLastCode(String email, String lastCode) {
        return dao.getUsersOfEmailAndLastCode(email, lastCode);
    }
    public List<User> getUsersOfEmailAndLastQuestionId(String email, String lastQuestionId) {
        return dao.getUsersOfEmailAndLastQuestionId(email, lastQuestionId);
    }
    public List<User> getUsersOfEmailAndLvl(String email, String lvl) {
        return dao.getUsersOfEmailAndLvl(email, lvl);
    }
    public List<User> getUsersOfEmailAndParam(String email, String param) {
        return dao.getUsersOfEmailAndParam(email, param);
    }
    public List<User> getUsersOfEmailAndName(String email, String name) {
        return dao.getUsersOfEmailAndName(email, name);
    }
    public List<User> getUsersOfEmailAndLastLogin(String email, String lastLogin) {
        return dao.getUsersOfEmailAndLastLogin(email, lastLogin);
    }
    public List<User> getUsersOfPhoneAndSex(String phone, String sex) {
        return dao.getUsersOfPhoneAndSex(phone, sex);
    }
    public List<User> getUsersOfPhoneAndPassQuestions(String phone, String passQuestions) {
        return dao.getUsersOfPhoneAndPassQuestions(phone, passQuestions);
    }
    public List<User> getUsersOfPhoneAndScore(String phone, String score) {
        return dao.getUsersOfPhoneAndScore(phone, score);
    }
    public List<User> getUsersOfPhoneAndLastCode(String phone, String lastCode) {
        return dao.getUsersOfPhoneAndLastCode(phone, lastCode);
    }
    public List<User> getUsersOfPhoneAndLastQuestionId(String phone, String lastQuestionId) {
        return dao.getUsersOfPhoneAndLastQuestionId(phone, lastQuestionId);
    }
    public List<User> getUsersOfPhoneAndLvl(String phone, String lvl) {
        return dao.getUsersOfPhoneAndLvl(phone, lvl);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        return dao.getUsersOfPhoneAndParam(phone, param);
    }
    public List<User> getUsersOfPhoneAndName(String phone, String name) {
        return dao.getUsersOfPhoneAndName(phone, name);
    }
    public List<User> getUsersOfPhoneAndLastLogin(String phone, String lastLogin) {
        return dao.getUsersOfPhoneAndLastLogin(phone, lastLogin);
    }
    public List<User> getUsersOfSexAndPassQuestions(String sex, String passQuestions) {
        return dao.getUsersOfSexAndPassQuestions(sex, passQuestions);
    }
    public List<User> getUsersOfSexAndScore(String sex, String score) {
        return dao.getUsersOfSexAndScore(sex, score);
    }
    public List<User> getUsersOfSexAndLastCode(String sex, String lastCode) {
        return dao.getUsersOfSexAndLastCode(sex, lastCode);
    }
    public List<User> getUsersOfSexAndLastQuestionId(String sex, String lastQuestionId) {
        return dao.getUsersOfSexAndLastQuestionId(sex, lastQuestionId);
    }
    public List<User> getUsersOfSexAndLvl(String sex, String lvl) {
        return dao.getUsersOfSexAndLvl(sex, lvl);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        return dao.getUsersOfSexAndParam(sex, param);
    }
    public List<User> getUsersOfSexAndName(String sex, String name) {
        return dao.getUsersOfSexAndName(sex, name);
    }
    public List<User> getUsersOfSexAndLastLogin(String sex, String lastLogin) {
        return dao.getUsersOfSexAndLastLogin(sex, lastLogin);
    }
    public List<User> getUsersOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.getUsersOfPassQuestionsAndScore(passQuestions, score);
    }
    public List<User> getUsersOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.getUsersOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public List<User> getUsersOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.getUsersOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public List<User> getUsersOfPassQuestionsAndLvl(String passQuestions, String lvl) {
        return dao.getUsersOfPassQuestionsAndLvl(passQuestions, lvl);
    }
    public List<User> getUsersOfPassQuestionsAndParam(String passQuestions, String param) {
        return dao.getUsersOfPassQuestionsAndParam(passQuestions, param);
    }
    public List<User> getUsersOfPassQuestionsAndName(String passQuestions, String name) {
        return dao.getUsersOfPassQuestionsAndName(passQuestions, name);
    }
    public List<User> getUsersOfPassQuestionsAndLastLogin(String passQuestions, String lastLogin) {
        return dao.getUsersOfPassQuestionsAndLastLogin(passQuestions, lastLogin);
    }
    public List<User> getUsersOfScoreAndLastCode(String score, String lastCode) {
        return dao.getUsersOfScoreAndLastCode(score, lastCode);
    }
    public List<User> getUsersOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.getUsersOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public List<User> getUsersOfScoreAndLvl(String score, String lvl) {
        return dao.getUsersOfScoreAndLvl(score, lvl);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        return dao.getUsersOfScoreAndParam(score, param);
    }
    public List<User> getUsersOfScoreAndName(String score, String name) {
        return dao.getUsersOfScoreAndName(score, name);
    }
    public List<User> getUsersOfScoreAndLastLogin(String score, String lastLogin) {
        return dao.getUsersOfScoreAndLastLogin(score, lastLogin);
    }
    public List<User> getUsersOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.getUsersOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
    }
    public List<User> getUsersOfLastCodeAndLvl(String lastCode, String lvl) {
        return dao.getUsersOfLastCodeAndLvl(lastCode, lvl);
    }
    public List<User> getUsersOfLastCodeAndParam(String lastCode, String param) {
        return dao.getUsersOfLastCodeAndParam(lastCode, param);
    }
    public List<User> getUsersOfLastCodeAndName(String lastCode, String name) {
        return dao.getUsersOfLastCodeAndName(lastCode, name);
    }
    public List<User> getUsersOfLastCodeAndLastLogin(String lastCode, String lastLogin) {
        return dao.getUsersOfLastCodeAndLastLogin(lastCode, lastLogin);
    }
    public List<User> getUsersOfLastQuestionIdAndLvl(String lastQuestionId, String lvl) {
        return dao.getUsersOfLastQuestionIdAndLvl(lastQuestionId, lvl);
    }
    public List<User> getUsersOfLastQuestionIdAndParam(String lastQuestionId, String param) {
        return dao.getUsersOfLastQuestionIdAndParam(lastQuestionId, param);
    }
    public List<User> getUsersOfLastQuestionIdAndName(String lastQuestionId, String name) {
        return dao.getUsersOfLastQuestionIdAndName(lastQuestionId, name);
    }
    public List<User> getUsersOfLastQuestionIdAndLastLogin(String lastQuestionId, String lastLogin) {
        return dao.getUsersOfLastQuestionIdAndLastLogin(lastQuestionId, lastLogin);
    }
    public List<User> getUsersOfLvlAndParam(String lvl, String param) {
        return dao.getUsersOfLvlAndParam(lvl, param);
    }
    public List<User> getUsersOfLvlAndName(String lvl, String name) {
        return dao.getUsersOfLvlAndName(lvl, name);
    }
    public List<User> getUsersOfLvlAndLastLogin(String lvl, String lastLogin) {
        return dao.getUsersOfLvlAndLastLogin(lvl, lastLogin);
    }
    public List<User> getUsersOfParamAndName(String param, String name) {
        return dao.getUsersOfParamAndName(param, name);
    }
    public List<User> getUsersOfParamAndLastLogin(String param, String lastLogin) {
        return dao.getUsersOfParamAndLastLogin(param, lastLogin);
    }
    public List<User> getUsersOfNameAndLastLogin(String name, String lastLogin) {
        return dao.getUsersOfNameAndLastLogin(name, lastLogin);
    }
}
