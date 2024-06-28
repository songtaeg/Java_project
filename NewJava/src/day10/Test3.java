package day10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print(">>:");
			String a =sc.nextLine();
			
			if(a.equals("그만")) {
				System.out.println("종료");
				break;
			}
			
			StringTokenizer s=new StringTokenizer(a," ");
			int num=s.countTokens();
			System.out.println("어절 개수:"+num);	
		}
		sc.close();
	}
}
