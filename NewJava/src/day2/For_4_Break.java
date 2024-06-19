package day2;

public class For_4_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; int j;
		for(i=2;i<=9;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("");
			for(j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
