package day10;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력:");
		String a =sc.nextLine(); //test estt
		//b=a.substring(1)+a.substring(0,1);
		
		for(int i=0; i<a.length(); i++) {
			a=a.substring(1)+a.substring(0,1);
			System.out.println(a);
		}
	}

}
