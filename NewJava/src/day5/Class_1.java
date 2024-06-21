package day5;

public class Class_1 {

	public static void main(String[] args) {
		Human h=new Human("성",32,"수원");
		//h.name="liam";
		System.out.println(h.name);
		h.eat("아침","과일"); 
		h.study();
		
		Human yu =new Human("유",52,"서울");
		h.name="김";
		System.out.println(yu.name);
	}

}
