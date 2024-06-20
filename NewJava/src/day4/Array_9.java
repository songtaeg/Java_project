package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5]; //[0,0,0,0,0]
		Scanner sc=new Scanner(System.in);
		int maxindex=0; //큰 숫자 위치
		int minindex=0; //작은 숫자 위치
		int temp=0; //빈 공간
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			arr[i]=sc.nextInt();
		}System.out.println("초기 배열: "+Arrays.toString(arr));
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>arr[maxindex]) {
				maxindex=j;
			}
		}System.out.println("큰 수 위치:"+maxindex);
		
		for(int k=0; k<arr.length; k++) {
			if(arr[k]<arr[minindex]) {
				minindex=k;
			}
		}System.out.println("작은 수 위치:"+minindex);
		
		temp=arr[minindex];
		arr[minindex]=arr[maxindex];
		arr[maxindex]=temp;
		
		System.out.println("======");
		System.out.println("현재 배열: "+Arrays.toString(arr));
		}
	
}

