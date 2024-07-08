package javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		int c;
		try {
			fw=new FileWriter("file\\text.txt");
			while(true) {
				String line=sc.nextLine();
				if(line.length()==0)
					break;
				fw.write(line,0,line.length()); 
				fw.write("\r\n",0,2); //한 줄 띄기 위해 \r\n을 파일에 저장
			}
			fw.close();
			
		} catch (IOException e) {
			System.out.println("오류");
		}
		sc.close();
	}
}
