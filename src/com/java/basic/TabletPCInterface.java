package com.java.basic;

public interface TabletPCInterface extends ComputerInterface,TabletInterface{
	
	String INPUT_KEY = "key";
	String INPUT_TOUCH = "Touch";
	
	void changedInput();

}
