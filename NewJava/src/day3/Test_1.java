package day3;

import java.util.Random;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		//1.
//		for(int i=1; i<=30; i++) {
//			if(i%2==0&&i%3==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		//2.
//		Scanner sc=new Scanner(System.in);
//		System.out.print("숫자 입력1: ");
//		int num1=sc.nextInt(); 
//		System.out.print("숫자 입력2: ");
//		int num2=sc.nextInt();
//		int sum=num1+num2;
//		if(sum>10) { 
//			System.out.println("큰 수");
//		}else {
//			System.out.println("작은 수");
//		}
		
		//3.
//		Scanner sc2=new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num=sc2.nextInt(); 
//		for(int i=1; i<=9; i++) {
//			System.out.println(num+"*"+i+"="+num*i);
//		}
		
		//4.
//		Random r= new Random();
//		Scanner s3=new Scanner(System.in);
//		int randomNum=r.nextInt(99)+1;
//		
//		System.out.print("숫자 입력: ");
//		int Num=s3.nextInt();
//		if(randomNum<Num) {
//			System.out.println("랜덤 수: "+randomNum);
//			System.out.println("입력한 수가 더 큽니다.");
//		}else {
//			System.out.println("랜덤 수: "+randomNum);
//			System.out.println("입력한 수가 더 작습니다.");
//		}
		
		//5
//		for(int i=1; i<=30; i++) {
//			if(i>9 && i<20) {
//				continue; 
//			}System.out.print(i+" "); 
//		}
		
		//6
		int i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
