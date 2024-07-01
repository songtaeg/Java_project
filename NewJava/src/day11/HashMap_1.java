package day11;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {
		HashMap <String,Object> h=new HashMap<String, Object>();
		h.put("name", "홍길동");
		h.put("age", 30);
		h.put("addr", "인천");
		h.put("phone", "010-1234-5678");
		
		HashMap <String,Object> k=new HashMap<String, Object>();
		k.put("name", "김");
		k.put("age", 25);
		k.put("addr", "광주");
		k.put("phone", "010-4356-2562");
		
		HashMap <String,Object> y=new HashMap<String, Object>();
		y.put("name", "유");
		y.put("age", 37);
		y.put("addr", "서울");
		y.put("phone", "010-3551-5436");
		
		//System.out.println(h);
		ArrayList<HashMap<String, Object>> list =new ArrayList<>();
		list.add(h);
		list.add(k);
		list.add(y);
		System.out.print(list);
	}

}
