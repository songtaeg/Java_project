package day4;

public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,-4,-8,22};
		
		int sum=0;

		//향상된 for문
		for(int num:arr) {
			sum+=num;
		}
		System.out.println(sum);
		System.out.println((double)sum/arr.length);
	}

}
