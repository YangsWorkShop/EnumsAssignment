package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String input;

    public DuongXinyuEvaluator(String input) {
        this.input = input;
    }

    public boolean isDuong(){
        return (input == "Duong");
    }

    public boolean isXinyu(){
        return (input == "Xinyu");
    }
}
