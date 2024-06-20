package day4;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,67,56,22,11};
		int max=arr[0]; //가장 큰 수
		int min=arr[0]; //가장 작은 수
		
		//가장 큰 숫자는 00입니다 출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i]; //arr[0]=가장 큰 수
			}	
		}		
		System.out.print("가장 큰 숫자: "+max);
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("가장 작은 수: "+min);
	}

}
