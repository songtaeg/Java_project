package day9;

public class Human {
	static int paper=100; //공동 사용 a4용지 ,객체 필요x 
	String name;
	int age;
	
	Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Human h1=new Human("hong", 30);
		Human h2=new Human("kim", 31);
		Human h3=new Human("song", 29);
		
		h1.age=32;
		System.out.println(h1.age);
		
		h1.paper-=10;
		System.out.println(h2.paper);
		
		Human.paper+=20;
		System.out.println(h3.paper);
	}
}
