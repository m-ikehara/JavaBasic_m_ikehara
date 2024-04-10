package com.java.basic;

public class JavaException {

	public static void main(String[] args) {
		
		String str = null;
		int a = 10;
		int b = 2;
		int result = 0;
		
		try {
			result = a/b;
			System.out.println(result);
			System.out.println(str.length());
					
		}catch(NullPointerException e) {
			System.out.println("NullPointExceptionエラーが発生しました。");
		}catch(ArithmeticException e) {
			System.out.println("AeithmeticExceptionエラーが発生しました。");
		}finally {
			System.out.println("データを保存しました。");
		}
	}

}
