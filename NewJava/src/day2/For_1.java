package day2;

public class For_1 {

	public static void main(String[] args) {
		//반복문 (초기 조건 증감)
		int i=0; 
		int sum=0;
		for(i=1; i<=30; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
				sum+=i;
				
			}
		}
		System.out.println("합:"+sum);
	}

}

