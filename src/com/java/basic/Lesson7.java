package com.java.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson7 {

	public static void main(String[] args) {
		
		// ディレクトリのパス
		File dir = new File("C:\\java-basic\\lesson7");
		//　ディレクトリのパス
		File file = new File("C:\\java-basic\\lesson7\\months.txt");
		//　dirのファイルパスのディレクトリを作成するコードを記載
		dir.mkdirs();
		try {
			//fileのファイルパスのファイルを作成するコードを記載
			file.createNewFile();
		}catch(IOException e) {
			System.out.println("テキストファイルの作成に失敗しました。");
		}
		
		//ファイルの書き込み:ストリームfwのインスタンスを生成
		try (FileWriter fw  = new FileWriter("C:\\java-basic\\lesson7\\months.txt",true);){
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
		
		//ファイルの読み込み:バッファリングフィルタで読み込む、いったんふつうのやついこか
		try(FileReader fr = new FileReader("C:\\java-basic\\lesson7\\months.txt")){
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine(); //1行読み込むコードを記述
			int month = 1;
			while(line != null) {
				System.out.println(month + "月:" + line);
				line = br.readLine(); //1行読み込むコードを記述
				month++;
			}
		}catch(IOException e) {
			System.out.println("テキストファイルの書き込みに失敗しました。");
		}
	}

}
