package day2;

import java.util.Scanner;

public class For_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int i=sc.nextInt(); 
		
		int sum=0;
		for(int num=1; num<=i; num++) {
			if(num>10) {
				break;
			}
			sum+=num; 
		}
		System.out.println("1부터 "+i+"까지 합: "+sum);
		sc.close();
	}

}
