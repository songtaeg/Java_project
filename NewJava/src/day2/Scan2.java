package day2;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num=sc.nextInt();
		if(num>5) {
			System.out.println("만족");
		}else {
			System.out.println("불만족");
		}
		sc.close();
	}

}
