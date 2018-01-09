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
public class InputAndOutput {

    private String inputAndOutputId; // 主键
    private String input;
    private String output;
    private String questionId; // 外键

    public String getInputAndOutputId() {
        return inputAndOutputId;
    }

    public void setInputAndOutputId(String inputAndOutputId) {
        this.inputAndOutputId = inputAndOutputId;
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
        return "InputAndOutput{" + "inputAndOutputId=" + inputAndOutputId + ", input=" + input + ", output=" + output + ", questionId=" + questionId + '}';
    }

}
