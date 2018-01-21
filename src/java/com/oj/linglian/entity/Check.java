package com.oj.linglian.entity;

public class Check {
    private String checkId;
    private String input;
    private String output;
    private String questionId;

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "Check [checkId=" + checkId + ", input=" + input + ", output=" + output + ", questionId=" + questionId + ", ]";
    }

}
