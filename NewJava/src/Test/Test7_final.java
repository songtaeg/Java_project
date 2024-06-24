package Test;

import java.util.Random;
import java.util.Scanner;

public class Test7_final {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r =new Random();
		int win=0; int lose=0; int draw=0;
			
		while(true) {
			System.out.print("가위(0),바위(1),보(2):");
			int player=sc.nextInt();
			int com=r.nextInt(2);
				
			if(player>=3) {
				System.out.println("잘못된 값 입력");
				continue;
			}
			else if(player==0) {
				System.out.println("player: 가위");
			}else if(player==1) {
				System.out.println("player:바위");
			}else {
				System.out.println("player:보");
			}
				
			if(com==0) {
				System.out.println("computer: 가위");
			}else if(com==1) {
				System.out.println("computer:바위");
			}else {
				System.out.println("computer:보");
			}
				
			if(player==0) {//사용자 가위
			    if(com==0) {//컴 가위
				System.out.println("비겼습니다");
				draw++;
				System.out.println("player==>"+win+"승"+lose+"패");
			}else if(com==1) {//컴 주먹
				System.out.println("졌습니다");
				lose++;
				System.out.println("player==>"+win+"승"+lose+"패");
			}else{
				System.out.println("이겼습니다");
				win++;
				System.out.println("player==>"+win+"승"+lose+"패");
			    }
			}
			else if(player==1) { //사용자 바위
			 if(com==1) {//컴 바위
				System.out.println("비겼습니다");
				draw++;
				System.out.println("player==>"+win+"승"+lose+"패");
			  }else if(com==2) {//컴 보
				System.out.println("졌습니다");
				lose++;
				System.out.println("player==>"+win+"승"+lose+"패");
			  }else {
				System.out.println("이겼습니다");
				win++;
				System.out.println("player==>"+win+"승"+lose+"패");
			    }			
			}
			else{ // 사용자 보
			  if(com==2) {//컴 보
				System.out.println("비겼습니다");
				draw++;
				System.out.println("player==>"+win+"승"+lose+"패");
			    }else if(com==0) {//컴 가위
				System.out.println("졌습니다");
				lose++;
				System.out.println("player==>"+win+"승"+lose+"패");
			    }else{
				System.out.println("이겼습니다");
				win++;
				System.out.println("player==>"+win+"승"+lose+"패");
			    }
			 }
				
			if(draw>0 || win>0 || lose>0) {
				System.out.println("재대결(1), 종료(2)");
				int choice=sc.nextInt();
				if(choice==2) {
					System.out.println("종료");
					break;
				}
			}
		}

	}
}