package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src=new File("file\\star.jpg");
		File dest=new File("file\\copy.jpg");
		int c;
		try {
			FileInputStream fi=new FileInputStream(src);
			FileOutputStream fo=new FileOutputStream(dest);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close(); fo.close();
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} catch (Exception e) {
			System.out.println("파일 복사 오류");
		}
	}

}
