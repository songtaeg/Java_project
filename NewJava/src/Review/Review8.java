package Review;

import java.util.Arrays;

public class Review8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,4,3};
		
		//가장 큰 숫자,가장 작은 숫자 위치 변경
		
		int maxindex=arr[0];
		int minindex=arr[0];
		int temp=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[maxindex] < arr[i]) {
				maxindex=i;
			}
			if(arr[minindex] > arr[i]) {
				minindex=i;
			}
		}
		System.out.println("큰 수 위치:"+maxindex);
		System.out.println("작은 수 위치:"+minindex);
		
		temp=arr[maxindex];
		arr[maxindex]=arr[minindex];
		arr[minindex]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
