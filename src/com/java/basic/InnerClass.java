package com.java.basic;

public class InnerClass {

	public static void main(String[] args) {
		MobilePhone yamadaphone = new MobilePhone("山田","080-1111-2222");
		yamadaphone.setLanguage("日本語");
		yamadaphone.sendMail("高橋","お久しぶりです。\n お元気ですか？");

	}

}
