package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		ArrayList<HashMap<String,Object>> list =new ArrayList<>();
		
		while(true) {
			HashMap<String,Object> map =new HashMap<>();
			System.out.println("1.과일추가 2.판매 3.개수확인 그외 종료");
			System.out.print("메뉴 선택: ");
			String menu=sc.next();
			
			if(menu.equals("1")) {
				System.out.print("과일명 입력: ");
				map.put("name", sc.next());
				
				System.out.print("가격 입력: ");	
				map.put("price", sc.nextInt());
				
				System.out.print("갯수 입력: ");
				map.put("num", sc.nextInt());
				
				list.add(map);
				
			}else if(menu.equals("2")) {
				System.out.print("과일명 입력:");
				String name=sc.next();
				System.out.print("개수: ");
				int num=sc.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					String fruit =(String) list.get(i).get("name");
					if(name.equals(fruit)) {
						int fruitNum=(int) list.get(i).get("num");
						list.get(i).put("num", num-fruitNum);
						System.out.println("판매완료");
						System.out.println(name+"의 남은 개수 "+(num-fruitNum)+"개");
					}
				}
				
			}else if(menu.equals("3")){
				System.out.print("과일명 입력:");
				String name2=sc.next();
				
				for(int i=0; i<list.size(); i++) {
					String name=(String) list.get(i).get("name");
					if(name2.equals(name)) {
						int num=(int) list.get(i).get("num");
						System.out.println(name+"의 현재 남은 개수는 "+num+"개 입니다");	
					}
				}
			}else {
				System.out.println("종료");
				break;
			}		
		}
	}
}
