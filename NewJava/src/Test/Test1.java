package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("수 입력: ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}

}
