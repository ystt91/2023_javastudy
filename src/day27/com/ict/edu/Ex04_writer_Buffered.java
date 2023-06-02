package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


//BufferedWriter : newLine() => 줄바꿈 기능
public class Ex04_writer_Buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			String pathname = "D:/ystt/ex02.txt";
			File file = new File(pathname);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 내용
			//String msg = "하이요\nㅁㄴㅇㄻㄴㅇㄻㄴㄹ\nHello";
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("123456787");
			bw.newLine();
			bw.write("Hello");
			fw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
