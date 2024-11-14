package Review2;

import java.util.Arrays;

public class CalcMain2 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println(c.add(1, 2));
		
		int arr[]= {3,5,6,2,1};
		
		System.out.println(c.addArr(arr));
		Student s =c.studentInfo("홍",24, "서울", "32415");
		s.info();
		
		System.out.println(Arrays.toString(c.changeArr(arr)));
	}

}
