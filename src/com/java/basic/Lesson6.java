package com.java.basic;

public class Lesson6 {

	public static void main(String[] args) {
		
		//StudentScoreクラスをインスタンス化
		StudentScore yamadaScore = new StudentScore("山田");
		StudentScore satoScore = new StudentScore("佐藤");
		
		//山田さんのスコアを設定
		yamadaScore.setScore(StudentScore.Subject.JAPANESE,50);
		yamadaScore.setScore(StudentScore.Subject.ENGLISH,80);
		yamadaScore.setScore(StudentScore.Subject.MATH,35);
		yamadaScore.setScore(StudentScore.Subject.SOCIAL,65);
		yamadaScore.setScore(StudentScore.Subject.SCIENCE,30);
		
		//佐藤さんのスコアを認定
		satoScore.setScore(StudentScore.Subject.JAPANESE, 70);
		satoScore.setScore(StudentScore.Subject.ENGLISH,30);
		satoScore.setScore(StudentScore.Subject.MATH,55);
		
		//それぞれのスコアを表示
		yamadaScore.printStudentScores();
		satoScore.printStudentScores();
	}

}
