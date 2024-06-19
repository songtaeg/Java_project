package day3;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r =new Random();
		int question; 
		
		while(true) {
			System.out.print("문제풒이(1), 종료 (그외 숫자): ");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.print("몇 문제?: ");
				question=sc.nextInt();
				
				for(int i=1; i<=question; i++) {
					int x=r.nextInt(8)+2;
					int y=r.nextInt(9)+1;
				
					System.out.print(x+"*"+y+"=");
					
					int answer=sc.nextInt();
					if(x*y==answer) {
						System.out.println("정답!");
						
					}else {
						System.out.println("오답!");		
					}
				}
					
			}else {
				System.out.println("종료");
				break;
			}
		}
	}
}
