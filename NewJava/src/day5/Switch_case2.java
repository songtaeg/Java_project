package day5;

import java.util.Scanner;

public class Switch_case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1번째 숫자: ");
		int num=sc.nextInt();
		System.out.print("2번째 숫자: ");
		int num2=sc.nextInt();
		
		System.out.print("연산자: ");
		String op=sc.next();
		
		switch(op) {
		case "+":
			System.out.println(num+op+num2+"="+(num+num2));
			break;
		case "-":
			System.out.println(num+op+num2+"="+(num-num2));
			break;
		case "*":
			System.out.println(num+op+num2+"="+(num*num2));
			break;
		case "/":
			System.out.println(num+op+num2+"="+(num/num2));
			break;
		default:
			System.out.println("오류");
		}
	}

}
