package day2;

import java.util.Random;
import java.util.Scanner;

public class Random_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int num=r.nextInt(100)+1; //0~99 +1
		int count=0;
		
		for(;;) {
			count++;
			System.out.print("숫자입력:");
			int i=sc.nextInt();
			if(num>i) {
				System.out.println("up");
			}else if(num<i) {
				System.out.println("down");
			}else {
				System.out.println("corect");
				System.out.println(count+"번 만에 맞춤");
				break;			
			}sc.close();
		}
	}
}
