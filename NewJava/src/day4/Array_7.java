package day4;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,4,5,2};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}  //별 표시(배열 인덱스 만큼)
			System.out.println();
		}
	}
}
