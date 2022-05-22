package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    private String input;

    public DuongXinyuEvaluator(String input) {
        this.input = input;
    }

    public boolean isDuong(){
        return this.input.equals(DuongXinyuEnum.Duong.name());
    }

    public boolean isXinyu(){
        return this.input.equals(DuongXinyuEnum.Xinyu.name());
    }
}
