package Review;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,2,4};
		
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]); //1,3,5,2,4
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
