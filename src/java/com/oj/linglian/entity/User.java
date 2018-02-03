package com.oj.linglian.entity;

public class User {
    private String userId;
    private String password;
    private String email;
    private String phone;
    private String sex;
    private String passQuestions;
    private String score;
    private String lastCode;
    private String lastQuestionId;
    private String lvl;
    private String param;
    private String name;
    private String lastLogin;

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

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", phone=" + phone + ", sex=" + sex + ", passQuestions=" + passQuestions + ", score=" + score + ", lastCode=" + lastCode + ", lastQuestionId=" + lastQuestionId + ", lvl=" + lvl + ", param=" + param + ", name=" + name + ", lastLogin=" + lastLogin + ", ]";
    }

}
