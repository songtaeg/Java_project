package day2;

import java.util.Scanner;

public class Scan_Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("텍스트1: ");
		String txt=sc.next(); //엔터,스페이스 
		System.out.println(txt); //(test\n)
		
		sc.nextLine();
		System.out.println("텍스트2: "); //엔터 전까지
		String txt2=sc.nextLine(); 
		System.out.println(txt2);
		
		sc.close();
	}

}
