package jdbc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
//		int arr[]=new int[6];
//		Random r=new Random();
//		int count=0;
//		
//		for(int i=0;i<arr.length; i++) {
//			count++;
//			arr[i]=r.nextInt(44)+1;
//			for(int j=0; j<i; j++) {
//				if(arr[i]==arr[j]) {
//					i--;
//				}
//			}
//		}
//		
//		System.out.println(count+"번 "+ Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[8];
		
		for(int i=0;i<arr.length; i++) {	
			System.out.print((i+1)+"번째 숫자 입력: ");
			arr[i] =sc.nextInt(); //입력 받은 숫자
			int count=0;
			for(int j=0; j<i;j++) {
				if(arr[i]==arr[j]) {
					count++;
					if(count==2) {
						System.out.println("다시 입력(같은 숫자 2개까지 허용");
						i--;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
