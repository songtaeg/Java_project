package day2;

import java.util.Scanner;

public class For_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//무한루프
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.print("숫자 입력(-1 입력 종료) : ");		
			int num=sc.nextInt();
			
			if(num==-1) {
				System.out.println("프로그램 종료");
				break;
			} else if(num>100||num<0) {
				System.out.println("잘못된 숫자 범위");
			}else if(num>=80) {
				System.out.println("A");
			}else if(num>=60) {
				System.out.println("B");
			}else{
				System.out.println("C");
			}
		}
	}

}
