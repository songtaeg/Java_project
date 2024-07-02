package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {
	static int scoreFunc(String s,int max) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		while(true) {
			System.out.print(s+">>");
			score=sc.nextInt();
			if(score<0||score>max) {
				System.out.print(s+"의 범위는 0부터"+max+"까지");
			}else {
				break;
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
		
		for(int i=0; i<3; i++) {
			HashMap<String, Object>map =new HashMap<String, Object>();
		
			System.out.print("사용자이름>>");
			map.put("name", sc.next());
		
			//System.out.print("자바점수>>");
			map.put("java", scoreFunc("자바", 40));
		
			//System.out.print("오라클점수>>");
			map.put("oracle", scoreFunc("오라클", 35));
			
			//System.out.print("html점수>>");
			map.put("html", scoreFunc("html", 25));
			
			list.add(map);
			System.out.println("=========");
		}
		for(int i=0; i<list.size(); i++) {
			HashMap<String,Object> user =list.get(i);
			int sum=(int) user.get("java")+(int) user.get("oracle")+(int) user.get("html");
			System.out.println("이름: "+user.get("name")+", 총점: "+sum);
		}
	}
}
