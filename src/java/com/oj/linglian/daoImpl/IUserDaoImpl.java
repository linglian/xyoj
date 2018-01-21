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
    public int updateOfLastCodeAndLastQuestionId(User user, String lastCode, String lastQuestionId) {
        User kUser = new User();
        kUser.setLastCode(lastCode);
        kUser.setLastQuestionId(lastQuestionId);
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
    public int removeOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
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
    public int insertOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
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
    public User getUserOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
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
    public List<User> getUsersOfLastCodeAndLastQuestionId(String lastCode, String lastQuestionId) {
        User user = new User();
        user.setLastCode(lastCode);
        user.setLastQuestionId(lastQuestionId);
        return getUsers(user);
    }
}
