package com.oj.linglian.entity;

public class Question {
    private String questionId;
    private String title;
    private String body;
    private String score;
    private String demoCode;
    private String rightPeople;
    private String mainPeople;
    private String startTime;
    private String endTime;
    private String inputFormat;
    private String outputFormat;
    private String inputTest;
    private String outputTest;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDemoCode() {
        return demoCode;
    }

    public void setDemoCode(String demoCode) {
        this.demoCode = demoCode;
    }

    public String getRightPeople() {
        return rightPeople;
    }

    public void setRightPeople(String rightPeople) {
        this.rightPeople = rightPeople;
    }

    public String getMainPeople() {
        return mainPeople;
    }

    public void setMainPeople(String mainPeople) {
        this.mainPeople = mainPeople;
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

    public String getInputFormat() {
        return inputFormat;
    }

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getInputTest() {
        return inputTest;
    }

    public void setInputTest(String inputTest) {
        this.inputTest = inputTest;
    }

    public String getOutputTest() {
        return outputTest;
    }

    public void setOutputTest(String outputTest) {
        this.outputTest = outputTest;
    }

    @Override
    public String toString() {
        return "Question [questionId=" + questionId + ", title=" + title + ", body=" + body + ", score=" + score + ", demoCode=" + demoCode + ", rightPeople=" + rightPeople + ", mainPeople=" + mainPeople + ", startTime=" + startTime + ", endTime=" + endTime + ", inputFormat=" + inputFormat + ", outputFormat=" + outputFormat + ", inputTest=" + inputTest + ", outputTest=" + outputTest + ", ]";
    }

}
