package day4;

import java.util.Arrays;

public class Array_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,4,5,2};
		//int max=arr[0]; int min=arr[0];
		int temp=0; //빈공간
		int maxindex=0;
		int minindex=0;
		
		for(int i=0; i<arr.length; i++) {//arr[0] > 0
			if(arr[i]>arr[maxindex]) { //arr[1]>arr[0]
				maxindex=i;
			}
		}System.out.println("큰 수 위치:"+maxindex);
		
		for(int j=0; j<arr.length; j++) {//arr[0] < 0 
			if(arr[j]<arr[minindex]) { //arr[1]<arr[0]
				minindex=j;
			}	
		}System.out.println("작은 수 위치:"+minindex);
		
		//자리 바꿈
		temp=arr[minindex];
		arr[minindex]=arr[maxindex];
		arr[maxindex]=temp;
		System.out.println(Arrays.toString(arr));
			
	}
}
