package day11;

import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("자바");
		v.add("오라클");
		v.add("html/css");
		v.add(2, "자바스크립트");
		
		//System.out.println(v);
		//System.out.println(v.get(1));
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
	}

}
