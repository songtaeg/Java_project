package day3;

public class While_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단
		int i=2; 
		while(i<=9) {
			//i=2
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"=" +(i*j) );
				j++;
			}
			System.out.println("====");
			i++;
		}
	}
}
