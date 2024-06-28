package day10_Test;

public class ChlidClass extends ParentClass{

	public ChlidClass(String name) {
		super(name);
	}
	
	ChlidClass(){
		this("");
	}
	
	void gugudan(int i) {
		System.out.println("===="+i+"단을 선택=====");
		int dan;
		for(dan=1; dan<=9; dan++) {
			System.out.println(i+"*"+dan+"="+i*dan);
		}
		System.out.println("===종료===");
	}

	void objType(Object o) {
		if(o instanceof String) {
			System.out.println("문자열입니다");
		}
		else if(o instanceof Integer) {
			System.out.println("정수입니다");
		}else {
			System.out.println("문자나 정수가 아닙니다");
		}
	}
}
