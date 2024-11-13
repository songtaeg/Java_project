package Review;

public class Method {

	public static void main(String[] args) {
		// sum 함수 호출
		
		/*
		 * int a=Calc.sum(1,2); System.out.println(a);
		 */
		 
		Calc c =new Calc();
		int b= c.sum(10, 20);
		System.out.println(b);
		
		int arr[]= {1,3,4,2,5};
		int arrSum=c.arraySum(arr);
		System.out.println(arrSum);

	}

}
