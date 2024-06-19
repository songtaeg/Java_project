package day2;

public class For_2 {

	public static void main(String[] args) {
		int i; int j;
		for(i=2; i<=9; i++) {// i=2..
			System.out.println("=="+i+"단==");
			for(j=1; j<=9; j++) { //j=1
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
