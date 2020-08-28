package com.itlize.EnumsPractice;
import com.itlize.EnumsPractice.DuongXinyuEnum;
public class DuongXinyuEvaluator{
    String input;
    public DuongXinyuEvaluator(String input){
        this.input = input;
    }
    DuongXinyuEnum x;
    public boolean isDuong(){
        return input.equals(x.Duong.name());

    }
    public boolean isXinyu(){

        return input.equals(x.Xinyu.name());
    }
}