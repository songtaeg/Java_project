package array;

import java.util.Random;

public class Array_3 {

	public static void main(String[] args) {
		int arr[][]=new int [4][4];
		Random r=new Random();
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.println();
			for(int j=0; j<arr.length-1; j++) {
				arr[i][j]=r.nextInt(10)+1;
				arr[i][3]+=arr[i][j];
				arr[3][j]+=arr[j][j];
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
