package jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,3,4,10,0};	
//		System.out.println("숫자:");
//		int n=sc.nextInt();
//		boolean flag=false;
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==n) {
//				flag=true;
//				break;
//			}
//		}
		while(true) {
			System.out.print("숫자 입력: ");
			int n1=sc.nextInt();
			boolean flag=false;
			
			for(int i=0; i<arr.length; i++) {
				if( arr[i]==n1) {
					System.out.println("다시 입력");
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				arr[4]=n1;
				System.out.println("추가");
				break;
			}	
		}System.out.println(Arrays.toString(arr));
	}
}
