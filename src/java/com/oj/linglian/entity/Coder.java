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
public class Coder {

    private String coderId; // 主键
    private String code; // 必选
    private String time;
    private String startTime;
    private String endTime;
    private String result;
    private String status;
    private String userId; // 外键
    private String questionId; // 外键

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
        return "Coder{" + "codeId=" + coderId + ", code=" + code + ", time=" + time + ", startTime=" + startTime + ", endTime=" + endTime + ", result=" + result + ", status=" + status + ", userId=" + userId + ", questionId=" + questionId + '}';
    }

    /**
     * CoderBuilder 用于动态创建Coder 使用build()来获取Coder
     */
    public static class CoderBuilder {

        private Coder coder = null;

        public CoderBuilder() {
            coder = new Coder();
        }

        public CoderBuilder(Coder coder) {
            this.coder = coder;
        }

        public CoderBuilder setCoderId(String coderId) {
            coder.setCoderId(coderId);
            return this;
        }

        public CoderBuilder setCode(String code) {
            coder.setCode(code);
            return this;
        }

        public CoderBuilder setQuestionId(String questionId) {
            coder.setQuestionId(questionId);
            return this;
        }

        public CoderBuilder setUserId(String userId) {
            coder.setUserId(userId);
            return this;
        }

        public CoderBuilder setResult(String result) {
            coder.setResult(result);
            return this;
        }

        public CoderBuilder setStatus(String status) {
            coder.setStatus(status);
            return this;
        }

        public CoderBuilder setTime(String time) {
            coder.setTime(time);
            return this;
        }

        public CoderBuilder setStartTime(String startTime) {
            coder.setStartTime(startTime);
            return this;
        }

        public CoderBuilder setEndTime(String endTime) {
            coder.setEndTime(endTime);
            return this;
        }

        public Coder build() {
            return coder;
        }
    }

    public static void main(String[] args) {
        Coder coder = new CoderBuilder().setCode("asdas").build();
        System.out.println(coder);
        Coder coder2 = new CoderBuilder().setCode("asdasdasdas").build();
        System.out.println(coder2);
        System.out.println(coder);
        System.out.println(coder2);
    }
}
