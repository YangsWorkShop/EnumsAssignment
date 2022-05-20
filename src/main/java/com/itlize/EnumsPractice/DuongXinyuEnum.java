package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong ("Duong", "Hey, my name is Duong!"),
    Xinyu ("Xinyu","Hey, my name is Xinyu!"),
    def ("default","default value");
    private final String name;
    private final String catchPhrase;
    DuongXinyuEnum(String name, String catchPhrase){
        this.name=name;
        this.catchPhrase=catchPhrase;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getName() {
        return name;
    }
    public boolean isDuong(){
        return this.equals(DuongXinyuEnum.Duong);
    }
    public boolean isXinyu(){
        return this.equals(DuongXinyuEnum.Xinyu);
    }
}
