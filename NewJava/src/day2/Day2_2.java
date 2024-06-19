package day2;

public class Day2_2 {

	public static void main(String[] args) {
		int i;
		int sum=0; //짝수
		int sum2=0; //홀수
		
		for(i=1; i<=30;i++) {
			if(i%2==0) {
				sum+=i;
			}else {
				sum2+=i;
			}
		}
		System.out.println("짝수 합: "+sum);
		System.out.println("홀수 합: "+sum2);
		
		if(sum2>sum) {
			System.out.println("차이:"+(sum2-sum));
		}else {
			System.out.println("차이:"+(sum-sum2));
		}
	}

}
