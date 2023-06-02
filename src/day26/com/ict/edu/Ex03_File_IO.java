package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// D:/ystt/test01.txt 읽어서 D:/ystt/test02.txt 내용 추가

public class Ex03_File_IO {
	public static void main(String[] args) {
		
		String pathname = "D:/ystt/test01.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		String pathname2 = "D:/ystt/text02.txt";
		File file2 = new File(pathname2);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
//			byte[] b = new byte[(int) file.length()];
//			bis.read(b);
			
//			String msg = new String(b);
//			System.out.println(msg);
			
			fos = new FileOutputStream(file2,true);
			bos = new BufferedOutputStream(fos);
			
//			byte[] arr = msg.getBytes();
//			bos.write(arr);
//			bos.flush();
			
			// 모든 파일의 복사, 이동은 해당 방식으로 해야 된다.
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
	
	
}

