package com.java.basic;

public interface ComputerInterface {
	
	//フィールド
	String PC_TYPE = "Neumann";
	
	//メソッド
	void boot();
	void shutDown();
	void input(String key);
	String output();
	void calcurate();
	void memory();

}
