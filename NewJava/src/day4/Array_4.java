package day4;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,8,3};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}System.out.println("합: "+sum);
	}

}
