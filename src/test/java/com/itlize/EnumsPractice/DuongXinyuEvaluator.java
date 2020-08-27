package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String input;
 DuongXinyuEvaluator(){}
 DuongXinyuEvaluator(String input){
     this.input = input;
 }
 public boolean isDuong(){
     DuongXinyuEnum x = DuongXinyuEnum.Duong;
     if(x.name() == input)
     return true;
     else return false;
 }
 public boolean isXinyu(){
     DuongXinyuEnum x = DuongXinyuEnum.Xinyu;
     if(x.name() == input)
         return true;
     else return false;
    }
}
