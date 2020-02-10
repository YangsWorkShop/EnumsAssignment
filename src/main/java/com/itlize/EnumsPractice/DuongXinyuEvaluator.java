package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    String input;
    public DuongXinyuEvaluator(String input) {
        this.input = input;
    }

    public Boolean isDuong(){
        return input.equalsIgnoreCase("Duong");
    }

    public Boolean isXinyu(){ return input.equalsIgnoreCase("Xinyu"); }
}
