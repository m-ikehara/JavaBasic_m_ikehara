package com.java.basic;

public class ObjectMain1 {

	public static void main(String[] args) {
		
		//インスタンス化しているよ！
		Calculator calcuA = new Calculator("計算機A");
		Calculator calcuB = new Calculator("計算機B",1.5);
		
		calcuA.init(3);
		calcuA.add(2);
		calcuA.mult(6);
		
		calcuB.init(3);
		calcuB.add(2);
		calcuB.mult(6);
		
		System.out.println(calcuA.getName() + "の結果 :" + calcuA.getResult());
		System.out.println(calcuB.getName() + "の結果 :" + calcuB.getResult());
	}

}
