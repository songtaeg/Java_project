package day2;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수: ");		
		int score=sc.nextInt();
		
		if(score>100||score<0) {
			System.out.println("잘못된 숫자 범위");
		}else if(score>=80) {
			System.out.println("A");
		}else if(score>=60) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
	}

}
