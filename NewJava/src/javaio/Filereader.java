package javaio;
import java.io.*;
public class Filereader {

	public static void main(String[] args) {
		FileReader fin=null;
		try {
			fin=new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=fin.read())!=-1) { // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println("오류");
		}
	}

}
