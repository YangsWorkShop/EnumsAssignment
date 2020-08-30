package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
	Duong("Duong"),Xinyu("Xinyu");
	
	DuongXinyuEnum(String name) {
		this.name = name;
	}

	private final String name;
	
	public String getCatchPhrase() {
		return "Hey, my name is " + this.name() + "!";
	}
	
	public boolean isDuong() {
		return this.name.equals("Duong");
	}
	
	public boolean isXinyu() {
		return this.name.equals("Xinyu");
	}
}