package com.java.basic;

public class Lesson3 {

	public static void main(String[] args) {

		
		// インスタンス化
		TestData dataA = new TestData("Mike");
		TestData dataB = new TestData("Cathy");
		TestData dataC = new TestData("Ichiro");

		// テストの点数をsetterを使用し、それぞれ入力
		dataA.setScore(90);
		dataB.setScore(30);
		dataC.setScore(50);

		// 出力
		System.out.println(dataA.getName() + "のテスト結果 :" + dataA.getResult());
		System.out.println(dataB.getName() + "のテスト結果 :" + dataB.getResult());
		System.out.println(dataC.getName() + "のテスト結果 :" + dataC.getResult());
	}

}
