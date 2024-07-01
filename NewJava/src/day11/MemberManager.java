package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MemberManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
	while(true) {
		System.out.println("1.입력 2.검색 3.종료");
		System.out.print("메뉴 선택: ");
		String menu=sc.next();
		HashMap<String,Object> map=new HashMap<String, Object>();
			
		if(menu.equals("1")) {
			//입력
			System.out.print("이름: ");
			map.put("name", sc.next());
			System.out.print("나이: ");
			map.put("age", sc.nextInt());
			System.out.print("주소: ");
			map.put("addr", sc.next());
			System.out.print("핸드폰: ");
			map.put("phone", sc.next());
			System.out.println("저장 완료");
			//ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
			list.add(map);
			
		}else if(menu.equals("2")) {
			//검색
			System.out.println("검색할 이름: ");
			String name=sc.next();
			boolean find=false;
			for(int i=0; i<list.size(); i++) {
				 HashMap<String, Object> user=list.get(i);
				 String username=(String) user.get("name");
				 if(username.equals(name)) {
						System.out.println("이름: "+user.get("name"));
						System.out.println("나이: "+user.get("age"));
						System.out.println("주소: "+user.get("addr"));
						System.out.println("핸드폰: "+user.get("phone"));
						find =true;
						break;
				 } 
			}
			if(!find) {
				System.out.println("찾는 사람 없음");
				}

		}else if(menu.equals("3")) {
			break;
		}else {
			System.out.println("1,2,3중 하나 입력");
			}
		}
	}
}
