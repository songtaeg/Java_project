package day4;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3}; //[1,2,3]
//		System.out.println(Arrays.toString(arr));
		
		//크기가 100인 배열, 1~100까지 순서대로 숫자 담기
		int arr2[]=new int[10];
		for(int i=0; i<10; i++) {
			arr2[i]=i+1; //arr2[10]=11
		}
		//System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr2));
	}

}
