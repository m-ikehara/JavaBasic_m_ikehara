package com.java.basic;

public class Task {

	public void doTask(int time) throws NotPlusException {
	
		if(time <= 0) {
			throw new NotPlusException("プラスの値ではありません。");
		}
		
		for(int i = 0; i < time; i++) {
			System.out.println("タスクを実行します。");
		}
		System.out.println("タスクが完了しました。");
	}
}
