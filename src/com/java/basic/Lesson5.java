package com.java.basic;

public class Lesson5 {

	public static void main(String[] args) {

		// テストの点数
		int[] scores = { 10, 35, 42, 120, 99 };

		InputScore inputScore = new InputScore();

		// 点数の入力、合計点数を出力
		try {
			for (int score : scores) {
				inputScore.setScore(score);
			}
			System.out.println(String.format("作業が完了しました。合計点数は、%dです。", InputScore.sum));

		} catch (OutOfRangeTestScoreException e) {
			System.out.println(e.getMessage() + "作業を異常終了します。");

		}
	}
}
