package array;

import java.util.Random;
import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		Random r=new Random();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println();
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=r.nextInt(10)+1;
				System.out.print(arr[i][j]+"\t");
			}
		}
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력>> ");
//		
//		for(int i=0; i<arr.length; i++) {
//			//System.out.println();
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}	
//		System.out.println();
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");	
//			}
//				System.out.println();
//		}
		
//		int intArray[][]=new int [4][4];
//		int num=0;
//		while(num<10) {
//			int row=(int) (Math.random()*4); //0-3
//			int col=(int) (Math.random()*4); //0-3
//			
//			if(intArray[row][col]!=0) {
//				continue;
//			}else {
//				intArray[row][col]=++num;
//			}
//		}	
//		for(int i=0; i<intArray.length; i++) {
//			for(int j=0; j<intArray[i].length; j++) {
//					System.out.print(arr[i][j]+"\t");
//			}
//				System.out.println();
//		}
	}		
}