package day28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// 쓰는게 직렬화, 읽는게 역직렬화
// 객체 직렬화

//ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메소드
public class Ex03_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "D:/ystt/object01.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//역직렬화
			ArrayList<Ex03_VO> list = (ArrayList<Ex03_VO>) ois.readObject();
			
			for (Ex03_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getAddr() + "\t");
				if (k.isGender()) {
					System.out.print("남성\t");
				} else {
					System.out.print("여성\t");				
				}
				System.out.print(k.getHeight() + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
