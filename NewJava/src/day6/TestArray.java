package day6;

import java.util.Arrays;

public class TestArray {
	
	static void changeArray(int arr[]) {
		//int arr[]= {2,5,3,1,4};
		int maxindex=0; //가장 큰 수 위치
		int minindex=0; //가장 작은 수 위치
		int temp=0; //빈 공간

		for(int i=1; i<arr.length; i++) { //arr[0] > 0
			if(arr[i]>arr[maxindex]) { //arr[1]>arr[0]
				maxindex=i;
			}		
			if(arr[i]<arr[minindex]) {//arr[1]<arr[0]
				minindex=i;
			}					
		}

		//자리 바꿈
		temp=arr[maxindex];
		arr[maxindex]=arr[minindex];
		arr[minindex]=temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
