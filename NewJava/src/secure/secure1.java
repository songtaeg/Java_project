package secure;

import java.util.Scanner;

public class secure1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.print("1번째 숫자: ");
			int num1=sc.nextInt();
			System.out.print("2번째 숫자: ");
			int num2=sc.nextInt();
			try {
				System.out.println("1번째 숫자에서 2번째 숫자를 나눈 수는 " +(num1/num2)+"입니다.");
				break;
			}catch (Exception e) {
				System.out.println("0으로 나눌 수 없음");
			}
		}
		
	}

}
