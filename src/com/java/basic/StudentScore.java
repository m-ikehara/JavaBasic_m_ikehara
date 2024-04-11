package com.java.basic;

import java.util.ArrayList;

public class StudentScore {
	
	private String studentName; //生徒名
	private ArrayList<Score> scorelist; //スコアリスト
	
	//コンストラクタ？
	StudentScore(String studentName){
		this.studentName = studentName;
		this.scorelist = new ArrayList<Score>();
	}
	
	//生徒のスコアを科目ごとに表示]
	void printStudentScores() {
		//ラムダ式を利用し、scorelistの要素を表示しなさい。②ラムダ式の表記違う
		scorelist.forEach(x -> System.out.println(String.format("生徒名: %s  科目 : %s 点数 : %d",studentName,x.getSubject(),x.score)));
	}
	
	//スコアを登録 ①移しただけ、タイプミスなし確認済み
	void setScore(Subject subject,int score) {
		Score s = new Score(subject,score);
		scorelist.add(s);
	}	//インナークラスScoreを定義
	private class Score {
		
		Subject subject;
		int score;
		
		//コンストラクタ
		Score(Subject subject,int score) {
			this.subject = subject;
			this.score = score;
		}
		
		String getSubject() { //③　subject取得できてない。
			switch(this.subject) {
			case JAPANESE:
				return "日本語";
			case ENGLISH:
				return "英語";
			case MATH:
				return "数学";
			case SOCIAL:
				return "社会";
			case SCIENCE:
				return "理科";
			default:
				return "その他";
			}
		}
	}
	
	//enum型で科目を定義
	enum Subject {
		JAPANESE,
		ENGLISH,
		MATH,
		SOCIAL,
		SCIENCE
	}
}
