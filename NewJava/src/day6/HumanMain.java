package day6;

public class HumanMain {

	public static void main(String[] args) {
		Human yuu=new Human("yuu", 43, "seoul");
		Human kim=new Human("kim", 32, "bucheon");
		Human lee=new Human("lee", 31, "suwon");
		
		yuu.age=40; System.out.println(kim.age);
		
		lee.money=140000;
		System.out.println(Human.money);
		
		//Human.staticname();
		
//		System.out.println(Math.PI);
//		final int num=20; //수정 X
//		num=10;
//		System.out.println(num);
//		
//		int n=Math.abs(-5); 

	}

}
