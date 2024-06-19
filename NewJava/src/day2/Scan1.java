package day2;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name= sc.nextLine(); //개행문자 
		
		System.out.print("나이 입력: ");
		int age=sc.nextInt();
		
		System.out.println(name+"님의 나이는"+age);
		sc.close();
	}

}
