package secure;

public class secure2 {

	public static int maxNum(int[] arr) {
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,3,4,5};
		int max= maxNum(arr);
		System.out.println("큰 수: "+max);
	}

}
