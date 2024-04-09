package com.java.basic;

public class TestData {

	static int DEAD_LINE = 35;

	// メンバ変数の定義
	private int score;
	private String name;

	// コンストラクタ
	public TestData(String name) {
		this.name = name;
	}

//	public TestData(int score) {
//		this.score = score;
//	}

	// getterとsetterを定義
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 合否の取得メソッド
	public String getResult() {
		if (this.score >= DEAD_LINE) {
			return "合格";
		} else {
			return "不合格";
		}
	}

}
