package Review;

import java.util.Scanner;

public class Review6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int sum=0;
		
		while(true) {
			System.out.print(i+"번째 숫자 입력: ");
			int num = sc.nextInt();
	
			if(num == -1) {
				break;
			}else {
				sum += num;
			}
			i++;
		}
		System.out.println("숫자"+(i-1)+"개의 합은 "+sum+"입니다");

	}

}
