package Review2;

import java.util.Random;
import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =new Random();
		Scanner sc=new Scanner(System.in);
		int correct=0;
		int fail=0;
	
		while(true) {
			int num1=r.nextInt(8)+2; //2~9 
			int num2=r.nextInt(9)+1; //1~9
			
			System.out.print(num1+ "*" +num2+"=");
			int answer= sc.nextInt();
			if(num1*num2==answer) {
				System.out.println("정답");
				correct++;
			}else if(answer==-1){
				break;
			}else {
				System.out.println("오답! 정답은 "+(num1*num2));
				fail++;
			}
 		}
		System.out.println("정답:" + correct+"개, 오답:"+fail+"개");

	}

}
