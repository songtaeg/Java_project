package day3;

import java.util.Random;
import java.util.Scanner;

public class While_4 {

	public static void main(String[] args) {
		Random r= new Random();
		Scanner sc=new Scanner(System.in);
		int count=0; //문제 
		int correct=0; //정답
		//수정 주석
		
		while(true) {
			System.out.print("구구단 시작(1), 채점(2), 종료(0) : ");
			int num=sc.nextInt();
			
			 if(num==1) {
				System.out.print("문제 갯수? : ");
				int question=sc.nextInt();
				for(int i=1; i<=question; i++) {
					count++;
					int x=r.nextInt(9)+1;
					int y=r.nextInt(9)+1;
					System.out.print(x+"*"+y+"=");
					
					int answer=sc.nextInt();
					if(x*y==answer) {
						System.out.println("정답!");
						correct++;
					}else {
						System.out.println("오답");
					}
				}
				
			}else if(num==2){
				System.out.println("현재까지 "+count+"문제 중 "+correct+"문제 맞추셨습니다.");
			}else if(num==0){
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 선택입니다. 다시 고르세요");
			}
		}
	}
}
