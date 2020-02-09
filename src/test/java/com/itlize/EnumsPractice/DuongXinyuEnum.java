package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong("Hey, my name is Duong!"),
    Xinyu("Hey, my name is Xinyu!");

    private String getCatchPhrase;

    DuongXinyuEnum(String getCatchPhrase){
        this.getCatchPhrase = getCatchPhrase;
    }
     public String getCatchPhrase(){
        return getCatchPhrase;
     }

     public boolean isDuong(){
         if (this.name() == "Duong")
        return true;
         else return false;
     }
    public boolean isXinyu(){
        if (this.name() == "Xinyu")
            return true;
        else return false;
    }
}
