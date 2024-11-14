package Review2;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20); list.add(15);
		
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
