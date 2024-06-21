package Test;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,1,8,2}; 
		int min=arr[0]; //가장 작은 수 
		int minindex=0;
		int temp=0; 
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[minindex]>arr[j]) {
				minindex=j;
			}
		}
		
		System.out.println(min);
		System.out.println(minindex);
		
		temp=arr[minindex];
		arr[minindex]=arr[0];
		arr[0]=temp;
		
		System.out.println(Arrays.toString(arr));
	}
	

}
