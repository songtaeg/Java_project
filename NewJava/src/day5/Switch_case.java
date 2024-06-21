package day5;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수 입력:");
		int score=sc.nextInt();
//		if(score>100) {
//			System.out.println("잘못된 범위");
//			 return;
//		}
		int a=score/10;
		
		switch(a) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
		}
//		int num=10;
//		switch (num) {
//		case 5:
//			System.out.println("5");
//			break;
//		case 10:
//			System.out.println("10");
//			break;
//		case 15:
//			System.out.println("15");
//			break;
//		default:
//			System.out.println("해당 없음");
//			
//		}
	}
}
