package Review;

import java.util.Scanner;

public class Review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1; i<=10; i++) { System.out.println(i); }
		 * 
		 * int i=1; while(i<=10) { System.out.println(i); i++; }
		 */
		Scanner sc = new Scanner(System.in);
		int i=1;
		int sum=0;
		while(true) {
			System.out.print(i+"번째 숫자 입력: ");
			int num = sc.nextInt();
			sum += num;
			if(sum>100) {
				break;
			}
			i++;
		}
		System.out.println("숫자"+i+"개의 합은 "+sum+"입니다");
	}

}
