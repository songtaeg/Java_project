package day12;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("나눌 수: ");
		int num=sc.nextInt();
		System.out.print("나누는 수: ");
		int num2=sc.nextInt();
		int arr[]= {1,2,3};
		
		try {
			System.out.println(num/num2);
			arr[3]=10;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			System.out.println(e.getMessage());
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열 최대 인덱스 초과");
		}finally {
			System.out.println("무조건 실행");
		}
	}

}
