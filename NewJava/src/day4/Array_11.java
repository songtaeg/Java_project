package day4;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,-5,-8,17};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		int sum=0;
		int cnt=0;
		//향상된 for문
		for(int num:arr) {
			if(num>0) {
				sum+=num;
				cnt++;
			}
		}
		System.out.println((double)sum/cnt);
	}

}
