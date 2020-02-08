package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    String input;
    public DuongXinyuEvaluator(String input) {
        this.input = input;
    }

    public Boolean isDuong(){
        return "Duong" == this.input;
    }

    public Boolean isXingyu(){
        return "Xingyu" == this.input;
    }
}
