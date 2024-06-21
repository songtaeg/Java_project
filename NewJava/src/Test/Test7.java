package Test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r= new Random();
		int win=0; int lose=0;

	while(true) {
		System.out.print("가위(0), 바위(1), 보(2) 입력: ");
		int player=sc.nextInt();
		int computer=r.nextInt(2);
	
		if(player==0 && computer==0) {
			System.out.println("player: 가위");
			System.out.println("com: 가위");
			System.out.println("비겼습니다.");
			System.out.println("player==>"+win+"승"+lose+"패");
		}
		else if(player==1 && computer==0) {
			System.out.println("player: 바위");
			System.out.println("com: 가위");
			System.out.println("이겼습니다.");
			win++;
			System.out.println("player==>"+win+"승"+lose+"패");
			
		}else if(player==2 && computer==0) {
			System.out.println("player: 보");
			System.out.println("com: 가위");
			System.out.println("졌습니다.");
			lose++;
			System.out.println("player==>"+win+"승"+lose+"패");
			
		}
		else if(player==1 && computer==1) {
			System.out.println("player: 바위");
			System.out.println("com: 바위");
			System.out.println("비겼습니다.");
			System.out.println("player==>"+win+"승"+lose+"패");
			
		}else if(player==1 && computer==0) {
			System.out.println("player: 바위");
			System.out.println("com: 가위");
			System.out.println("이겼습니다.");
			win++;
			System.out.println("player==>"+win+"승"+lose+"패");
			
		}else if(player==1 && computer==2) {
			System.out.println("player: 바위");
			System.out.println("com: 보");
			System.out.println("졌습니다.");
			lose++;
			System.out.println("player==>"+win+"승"+lose+"패");
			
		}else if(player==2 && computer==2) {
			System.out.println("player:보");
			System.out.println("com: 보");
			System.out.println("비겼습니다.");
			System.out.println("player==>"+win+"승"+lose+"패");
		}	
		
	}
		
	}
}
