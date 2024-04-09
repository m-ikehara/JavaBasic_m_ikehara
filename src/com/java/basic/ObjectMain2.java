package com.java.basic;

public class ObjectMain2 {

	public static void main(String[] args) {

		// インスタンスの作成
		FeaturePhone garaophone = new FeaturePhone("ガラ男", "090-00000-0000", "garao@feature.mail.com");
		SmartPhone sumakoPhone = new SmartPhone("スマ子", "080-1111-1111", "sumako@smart.mail.com");

		// 電話をかける
		garaophone.call("0120-000-000");
		sumakoPhone.call("0120-111-111");

		// メールをする
		garaophone.sendMail("taro@pc.mail.com", "Hey,Taro! I get a new feature phone.");
		sumakoPhone.sendMail("taro@pc.mail.com", "Hey,Taro! I get a new feature phone.");

		// アプリを開く（スマホのみ）
		sumakoPhone.appOpen("Chat Application");
	}

}
