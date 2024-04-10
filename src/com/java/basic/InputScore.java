package com.java.basic;

public class InputScore {
	
	static int sum;
	
	public void setScore(int score)throws OutOfRangeTestScoreException {
		
		if(score > 100) {
			throw new OutOfRangeTestScoreException("点数が不正な値です。 : " + score);
		}
		
		sum += score;
	}

}
