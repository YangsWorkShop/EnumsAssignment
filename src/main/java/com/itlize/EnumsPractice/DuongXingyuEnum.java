package com.itlize.EnumsPractice;

public enum DuongXingyuEnum {

    Xingyu("Xingyu"),
    Duong("Duong");

    private final String name;

    DuongXingyuEnum(String name) { this.name = name; }

    public String getCatchPhrase(){ return "Hey, my name is " + this.name + "!"; }

    public boolean isDuong(){ return "Duong" == this.name; }
    public boolean isXingyu(){ return "Xingyu" == this.name; }

}
