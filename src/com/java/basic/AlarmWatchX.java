package com.java.basic;

import java.util.Date;

// AlarmWatchを継承する処理を追加
public class AlarmWatchX extends AlarmWatch {
	static final String PRODUCT_NAME = "Alarm Watch X";
	private String ownerName;

	AlarmWatchX(String name) {
		// 親クラスのコンストラクタを呼ぶ処理を追加
		super();
		this.ownerName = name;
	}

	@Override
	public void alarm() {
		//親クラスのgetAlarmメソッドを呼ぶ処理を追加↓
		System.out.println(ownerName + "さんのアラームが鳴りました。 \n 時刻は、" + getAlarm());
	}
}
