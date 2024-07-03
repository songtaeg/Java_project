package jdbc;

import java.util.Arrays;
import java.util.Random;

public class Test_3 {

	public static void main(String[] args) {
		int arr[]=new int[6];
		Random r=new Random();
		int count=0;
		
		for(int i=0;i<arr.length; i++) {
			count++;
			arr[i]=r.nextInt(44)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
		System.out.println(count+"번 "+ Arrays.toString(arr));
	}

}
