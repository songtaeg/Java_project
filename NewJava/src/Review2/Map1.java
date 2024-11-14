package Review2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<>();
		//map.put(1, "java"); map.put(2, "oracle"); map.put(3, "html");
		
		//System.out.println(map);
		//System.out.println(map.get(2));
		Scanner sc =new Scanner(System.in);
		ArrayList< HashMap<String, Object> > list =new ArrayList< HashMap<String,Object> >();
		
		//HashMap<String,Object> map2=new HashMap<String, Object>();
		//map2.put("name", "홍길동"); map2.put("age", 30); map2.put("addr", "인천");
		
		//list2.add(map2);
		//System.out.println(list2);
		
		for(int i=1; i<=3; i++) {
			HashMap<String,Object> map2=new HashMap<String, Object>(); //반복문, 새 객체
			System.out.println(i+"번째 사람 입력");
			System.out.print("이름: ");
			map2.put("name", sc.nextLine());
			
			System.out.print("나이: ");
			map2.put("age", sc.nextInt());
			
			list.add(map2);
		}
		System.out.println(list);
	}

}
