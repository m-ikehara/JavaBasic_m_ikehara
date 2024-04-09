package com.java.basic;

public class ObjectMain1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 7;
		
		
		//インスタンス化しているよ！
		Calculator calcuA = new Calculator("計算機A");
		Calculator calcuB = new Calculator("計算機B",1.5);
		
		System.out.println("計算機の製造個数 :" + Calculator.countCalcu);
		
		System.out.println(calcuA.getName() + "の結果 :" + calcuA.getResult());
		System.out.println(calcuB.getName() + "の結果 :" + calcuB.getResult());
		
		calcuA.init(x);
		calcuA.mult(y);
		calcuA.div(2);
		
		calcuB.init(x);
		calcuB.add(y);
		calcuB.sqrt();
		
		System.out.println(calcuA.getName() + "の結果 :" + calcuA.getResult());
		System.out.println(calcuB.getName() + "の結果 :" + calcuB.getResult());
	}

}
