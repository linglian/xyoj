package com.oj.linglian.entity;

public class Checker {
    private String checkerId;
    private String input;
    private String output;
    private String questionId;

    public String getCheckerId() {
        return checkerId;
    }

    public void setCheckerId(String checkerId) {
        this.checkerId = checkerId;
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
        return "Checker [checkerId=" + checkerId + ", input=" + input + ", output=" + output + ", questionId=" + questionId + ", ]";
    }

}
