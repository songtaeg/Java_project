package Test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,1,8,2};
		int sum=0; int sum2=0;

		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				 sum+=arr[i];
			}else {
				sum2+=arr[i];
			}
			
		}
		System.out.println("짝수 합:"+sum);
		System.out.println("홀수 합:"+sum2);
		
		if(sum>sum2) {
			System.out.println(sum-sum2);
		}else {
			System.out.println(sum2-sum);
		}
		
	}

}
