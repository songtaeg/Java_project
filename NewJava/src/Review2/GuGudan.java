package Review2;

import java.util.Random;
import java.util.Scanner;

public class GuGudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		Scanner sc=new Scanner(System.in);
		int count=0;
	
		for(int i=0; i<5; i++) {
			int num1=r.nextInt(8)+2; //2~9 
			int num2=r.nextInt(9)+1; //1~9
			
			System.out.print(num1+ "*" +num2+"=");
			int answer= sc.nextInt();
			if(num1*num2==answer) {
				System.out.println("정답");
				count++;
			}else {
				System.out.println("오답! 정답은 "+(num1*num2));
			}
 		}
		System.out.println("문제 풀이 끝!");
		System.out.println("점수: " + (count*20));

	}

}
