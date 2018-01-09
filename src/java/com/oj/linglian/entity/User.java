/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oj.linglian.entity;

/**
 *
 * @author lol
 */
public class User {

    private String userId; // 主键
    private String password; // 必选
    private String email;
    private String phone;
    private String sex;
    private String passQuestions; // 通过的题号，使用,来进行分割。
    private String score; // 答题得到的分数
    private String lastCode;
    private String lastQuestionId;

    public String getLastCode() {
        return lastCode;
    }

    public void setLastCode(String lastCode) {
        this.lastCode = lastCode;
    }

    public String getLastQuestionId() {
        return lastQuestionId;
    }

    public void setLastQuestionId(String lastQuestionId) {
        this.lastQuestionId = lastQuestionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassQuestions() {
        return passQuestions;
    }

    public void setPassQuestions(String passQuestions) {
        this.passQuestions = passQuestions;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", password=" + password + ", email=" + email + ", phone=" + phone + ", sex=" + sex + ", passQuestions=" + passQuestions + ", score=" + score + ", lastCode=" + lastCode + ", lastQuestionId=" + lastQuestionId + '}';
    }

}
