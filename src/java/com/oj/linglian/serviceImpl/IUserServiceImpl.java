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
    public int updateOfPassQuestionsAndScore(User user, String passQuestions, String score) {
        return dao.updateOfPassQuestionsAndScore(user, passQuestions, score);
    }
    public int updateOfPassQuestionsAndLastCode(User user, String passQuestions, String lastCode) {
        return dao.updateOfPassQuestionsAndLastCode(user, passQuestions, lastCode);
    }
    public int updateOfPassQuestionsAndLastQuestionId(User user, String passQuestions, String lastQuestionId) {
        return dao.updateOfPassQuestionsAndLastQuestionId(user, passQuestions, lastQuestionId);
    }
    public int updateOfScoreAndLastCode(User user, String score, String lastCode) {
        return dao.updateOfScoreAndLastCode(user, score, lastCode);
    }
    public int updateOfScoreAndLastQuestionId(User user, String score, String lastQuestionId) {
        return dao.updateOfScoreAndLastQuestionId(user, score, lastQuestionId);
    }
    public int updateOfLastCodeAndLastQuestionId(User user, String lastCode, String lastQuestionId) {
        return dao.updateOfLastCodeAndLastQuestionId(user, lastCode, lastQuestionId);
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
    public int removeOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.removeOfPassQuestionsAndScore(passQuestions, score);
    }
    public int removeOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.removeOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public int removeOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.removeOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public int removeOfScoreAndLastCode(String score, String lastCode) {
        return dao.removeOfScoreAndLastCode(score, lastCode);
    }
    public int removeOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.removeOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public int removeOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.removeOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
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
    public int insertOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.insertOfPassQuestionsAndScore(passQuestions, score);
    }
    public int insertOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.insertOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public int insertOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.insertOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public int insertOfScoreAndLastCode(String score, String lastCode) {
        return dao.insertOfScoreAndLastCode(score, lastCode);
    }
    public int insertOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.insertOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public int insertOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.insertOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
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
    public User getUserOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.getUserOfPassQuestionsAndScore(passQuestions, score);
    }
    public User getUserOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.getUserOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public User getUserOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.getUserOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public User getUserOfScoreAndLastCode(String score, String lastCode) {
        return dao.getUserOfScoreAndLastCode(score, lastCode);
    }
    public User getUserOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.getUserOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public User getUserOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.getUserOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
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
    public List<User> getUsersOfPassQuestionsAndScore(String passQuestions, String score) {
        return dao.getUsersOfPassQuestionsAndScore(passQuestions, score);
    }
    public List<User> getUsersOfPassQuestionsAndLastCode(String passQuestions, String lastCode) {
        return dao.getUsersOfPassQuestionsAndLastCode(passQuestions, lastCode);
    }
    public List<User> getUsersOfPassQuestionsAndLastQuestionId(String passQuestions, String lastQuestionId) {
        return dao.getUsersOfPassQuestionsAndLastQuestionId(passQuestions, lastQuestionId);
    }
    public List<User> getUsersOfScoreAndLastCode(String score, String lastCode) {
        return dao.getUsersOfScoreAndLastCode(score, lastCode);
    }
    public List<User> getUsersOfScoreAndLastQuestionId(String score, String lastQuestionId) {
        return dao.getUsersOfScoreAndLastQuestionId(score, lastQuestionId);
    }
    public List<User> getUsersOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        return dao.getUsersOfLastCodeAndLastQuestionId(lastCode, lastQuestionId);
    }
}
