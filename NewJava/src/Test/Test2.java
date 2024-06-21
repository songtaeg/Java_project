package Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("수 입력: ");
		int num=sc.nextInt();
		
		while(true) {
		if(num>100 || num<0) {
			System.out.println("다시 입력");
			System.out.print("수 입력: ");
			num=sc.nextInt();
			
		}else if(num>0 && num<30) {
			System.out.println("작은 수");
			break;
		}else if(num>=30 && num<65) {
			System.out.println("중간 수");
			break;
		}else {
			System.out.println("큰 수");
			break;
		}
		}
	}
}
