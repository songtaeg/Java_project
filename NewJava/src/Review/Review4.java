package Review;

import java.util.Arrays;
import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {
		// [] 사용자 값 입력받아서 채워넣기 
		Scanner sc =new Scanner(System.in);
		
		int arr[] =new int [5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( (i+1)+"번째 값: " );
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				System.out.println("다시 입력(음수 불가)!");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
