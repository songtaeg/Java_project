package day7;

import java.util.Arrays;

public class ArrayUtil {
	
	 public static int[] concat(int []arr1,int []arr2){
		int[] arr3=new int[arr1.length+arr2.length];
		int index=0; //현재 위치

		for(int i=0; i<arr1.length; i++) {
			arr3[index++]=arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr3[index++]=arr2[i];
		}
		return arr3;
	}
	
	public static void main(String[] args) {
		int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayUtil.concat(array1,array2);
        System.out.println(Arrays.toString(array3));
	}
}
