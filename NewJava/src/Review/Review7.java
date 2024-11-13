package Review;

public class Review7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,1,4,2};
		
		//배열에서 가장 큰 숫자 출력
		//배열에서 가장 큰 숫자의 위치(index) 출력
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("가장 큰 수: "+max);
		
		int index=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[index] < arr[i]) {
				index=i;
			}
		}
		System.out.print("큰 수 위치: "+index);
	}

}
