package Test;

public class Test6 {

	public static void main(String[] args) {
		int arr[]= {3,5,1,8,2};
		int sum=0; int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=3) {
				sum+=arr[i];
				count++;
			}
		}System.out.println("평균:"+(double)sum/count);

	}

}
