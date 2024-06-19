package day2;

import java.util.Scanner;

public class For_Training {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i=sc.nextInt();
		int dan;
		
		for(dan=1; dan<=9; dan++) {
			System.out.println(i+"*"+dan+"="+ i*dan);
		}
	}
}
