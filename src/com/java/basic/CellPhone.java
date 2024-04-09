package com.java.basic;

public class CellPhone {
	
	private String ownerName;
	private String phoneNumber;
	private String mailAddress;
	
	//携帯電輪のコンストラクタ
	CellPhone(String owner, String number, String mail) {
		this.ownerName = owner;
		this.phoneNumber = number;
		this.mailAddress = mail;
	}
	
	//電話をかけるメソッド
	public void call(String number) {
		System.out.println(this.getOwnerName() + "から" + number + "に電話をかけます。");
	}
	
	//メールを送るメソッド
	public void sendMail(String mailAddress,String Message) {
		System.out.println(this.getOwnerName() + "から" +mailAddress + "へ" + Message + "とメールを送ります。");
	}
	
	//オーナー情報取得
	public String getOwnerName() {
		return ownerName;
	}
	

}
