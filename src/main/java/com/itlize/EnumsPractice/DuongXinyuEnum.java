package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong("Hey, my name is Duong!"),
    Xinyu("Hey, my name is Xinyu!");

    private String catchPharase;
    DuongXinyuEnum(String catchPharase) {
        this.catchPharase = catchPharase;
    }

    public String getCatchPhrase() {
        return this.catchPharase;
    }

    public boolean isDuong(){
        return this.name().equals("Duong");
    }

    public boolean isXinyu(){
        return this.name().equals("Xinyu");
    }
}