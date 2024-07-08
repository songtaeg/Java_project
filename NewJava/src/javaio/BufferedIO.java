package javaio;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedIO {

	public static void main(String[] args) {
		FileReader fin=null;
		int c;
		try {
			fin=new FileReader("file\\테스트.txt");
			BufferedOutputStream b=new BufferedOutputStream(System.out,5); //5바이트 크기 버퍼 설정
			//출력 스트림의 버퍼 크기가 5이므로 파일을 읽어 8개의 문자를 출력하였지만 5개의 문자만 출력되고 3개의 문자는 버퍼에 남아 있어 화면에 보이지 않음
			while((c=fin.read())!=-1) {
				b.write(c);//버퍼가 꽉 찰 때 문자가 화면에 출력
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine(); //<Enter> 키 기다림
			b.flush(); // 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
