package day2;

import java.util.Random;
import java.util.Scanner;

public class Day2_3 {
	public static void main(String[] args) {
		
		Random r= new Random();
		Scanner sc=new Scanner(System.in);
		int answer;
		int score=0;
		int count=0;
		
		for(;;) {
			int i=r.nextInt(9)+1; //0~8 +1
			int j=r.nextInt(9)+1; //0~8 +1
			System.out.print(i+"*"+j+"=" );
			answer=sc.nextInt();
			
			if(i*j==answer) {
				System.out.println("정답!");
				score+=20;
				count++;
				
			}else {
				count++;
				System.out.println("오답! 정답은 : "+ i*j+"입니다.");
			}
			
			if(count==5) {
				System.out.println(count+"문제 풀이 끝!");
				System.out.println(score+"점 입니다!(한문제당 20점)");
				break;
			}
		}
	}
}
