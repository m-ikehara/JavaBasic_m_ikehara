package com.java.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lesson7 {

	public static void main(String[] args) {
		
		// ディレクトリのパス
		//　ディレクトリのパス
		//　dirのファイルパスのディレクトリを作成するコードを記載
		
		try {
			//fileのファイルパスのファイルを作成するコードを記載
		}catch() {
			
			
		}
		
		//ファイルの書き込み
		try ()){
			fw.write("January \n");
			fw.write("Febuary \n");
			fw.write("March \n");
			fw.write("April \n");
			fw.write("May \n");
			fw.write("June \n");
			fw.write("July \n");
			fw.write("August \n");
			fw.write("September \n");
			fw.write("October \n");
			fw.write("November \n");
			fw.write("December \n");
		}catch(IOException e) {
			System.out.println("テキストファイルの書き込みに失敗しました。");
		}
		
		//ファイルの読み込み
		try()){
			BufferedReader br = new BufferedReader(fr);
			String line = ; //1行読み込むコードを記述
			int month = 1;
			while(line != null) {
				System.out.println(month + "月:" + line);
				line = ; //1行読み込むコードを記述
				month++;
			}
		}catch(IOException e) {
			System.out.println("テキストファイルの書き込みに失敗しました。");
		}
	}

}
