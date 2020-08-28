package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong,
    Xinyu;

    public String getCatchPhrase() {
        return "Hey, my name is " + this.name() + "!";
    }

    public boolean isDuong() {
        return (this.name() == Duong.name());
    }

    public boolean isXinyu() {
        return (this.name() == Xinyu.name());
    }
}
