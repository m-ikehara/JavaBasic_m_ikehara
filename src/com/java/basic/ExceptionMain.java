package com.java.basic;

public class ExceptionMain {

	public static void main(String[] args) {
		
		try {
			//インスタンス化
			Task task = new Task();
			
			//処理
			task.doTask(-10);
			
			//正常終了
			System.out.println("作業を正常に終了しました。");
		}catch(NotPlusException e) {
			//異常終了
			System.out.println(e.getMessage() + "作業にエラーが発生しました。作業は完了しておりません。");
		}

	}

}
