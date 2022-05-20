package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private DuongXinyuEnum duongXinyuEnum;
    public DuongXinyuEvaluator(String input){
        try{
            duongXinyuEnum=DuongXinyuEnum.valueOf(input);
        }catch (IllegalArgumentException e){
            duongXinyuEnum=DuongXinyuEnum.def;
        }
    }
    public boolean isDuong(){
        return duongXinyuEnum.isDuong();
    }
    public boolean isXinyu(){
        return duongXinyuEnum.isXinyu();
    }

}
