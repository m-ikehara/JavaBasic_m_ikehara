package com.java.basic;

import java.util.Calendar;

public class Lesson4 {

	public static void main(String[] args) {
		// AlarmwatchXのインスタンス化、これにより実体化されて以下で処理を行うことができるようになる
		AlarmWatchX watchX = new AlarmWatchX("Tom");
		
		//現在時刻の表示
		System.out.println(watchX.getTime());
		
		//2020/1/1をアラームにセッティング
		Calendar cal = Calendar.getInstance();
		cal.set(2020,0,1);
		watchX.setAlarm(cal.getTime());
		
		//アラームを鳴らす
		watchX.alarm();
	}
}
