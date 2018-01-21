package com.oj.linglian.entity;

public class Coder {
    private String coderId;
    private String code;
    private String time;
    private String startTime;
    private String endTime;
    private String result;
    private String status;
    private String userId;
    private String questionId;

    public String getCoderId() {
        return coderId;
    }

    public void setCoderId(String coderId) {
        this.coderId = coderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "Coder [coderId=" + coderId + ", code=" + code + ", time=" + time + ", startTime=" + startTime + ", endTime=" + endTime + ", result=" + result + ", status=" + status + ", userId=" + userId + ", questionId=" + questionId + ", ]";
    }

}
