package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5]; //[0,0,0,0,0]

		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			arr[i] =sc.nextInt(); //입력 받은 숫자	
			if(arr[i]<0) {
				System.out.println("다시 입력(0 이상만 가능)");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
