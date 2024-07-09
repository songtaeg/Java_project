package array;

import java.util.Arrays;
import java.util.Random;

public class Array_3 {

	public static void main(String[] args) {
		int arr[][]=new int [4][4];
		Random r=new Random();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][j]=r.nextInt(10)+1;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][3]+=arr[i][j];
				arr[3][i]+=arr[j][i];
			}	
		}

//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(Arrays.toString(arr[1]));
//		System.out.println(Arrays.toString(arr[2]));
//		System.out.println(Arrays.toString(arr[3]));
		
		for(int i=0; i<arr.length; i++) {
			System.out.println();
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
		}	
	}

}
