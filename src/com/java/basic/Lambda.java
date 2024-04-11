package com.java.basic;

import java.util.function.IntToDoubleFunction;

public class Lambda {

	public static void main(String[] args) {
		
		int a = 5;
		
		IntToDoubleFunction func = x -> {return x * x * Math.PI;};
		
		System.out.println(func.applyAsDouble(a));
		
		System.out.println(func);

	}

}
