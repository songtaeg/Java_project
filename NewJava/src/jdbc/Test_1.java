package jdbc;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=0;
		
		Scanner sc=new Scanner(System.in);
		
	while(true) {
		System.out.print("숫자: ");
		int i=sc.nextInt();
		if(i>=num1) {
			num2=i;
			break;
		}else if(i<num1) {
			System.out.println("다시 입력");
			//num2 = -1;
			continue;
		}
	}
//		num2= i>=num1? i:-1; 
		System.out.println(num2);
	}

}
