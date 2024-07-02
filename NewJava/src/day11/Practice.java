package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {	
		System.out.println("장학금관리시스템");
		ArrayList<HashMap<String,Object>>list=new ArrayList<HashMap<String,Object>>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			HashMap<String,Object> scoreMap =new HashMap<String, Object>();	
			System.out.print("이름과 학점>>");
			String name=sc.next();
			double score=sc.nextDouble();
			//scoreMap.put(name, d);
			scoreMap.put("name", name);
			scoreMap.put("score", score);
			list.add(scoreMap);
		}
		
		System.out.print("장학생 선발 학점 기준>>");
		double standdard=sc.nextDouble();
		System.out.println("장학생 명단: ");
		for(int i=0; i<list.size(); i++) {
			HashMap<String,Object> user =list.get(i);
			double score=(double) user.get("score");
			if(score>=standdard) {
				System.out.print(user.get("name")+" ");
			}
		}
	}
}
