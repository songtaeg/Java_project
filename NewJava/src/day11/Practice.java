package day11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) {
		HashMap<String,Object> score =new HashMap<String, Object>();		
		System.out.println("장학금관리시스템");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=4; i++) {
			System.out.print("이름과 학점>>");
			score.put("name", sc.next());
			String s=sc.next();
			StringTokenizer st=new StringTokenizer(s," ");
			String score2=st.nextToken();
			double s1=Double.parseDouble(score2);
		}
		System.out.print("장학생 선발 학점 기준>>");
		String st=sc.next();
	}

}
