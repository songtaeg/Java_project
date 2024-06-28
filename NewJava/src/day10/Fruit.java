package day10;

public class Fruit {
	 String name; 
	 String color; 
	 int price;
	
	Fruit(String name,String color,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}

	void getPrice() {
		System.out.println(name+"는(은) "+price+"원");
	}
	void print() {
		System.out.println("과일은 맛있다!");
	}
	static void Box(Fruit f) {
		System.out.println(f.name+"을 포장");
	}
	
	public static void main(String[] args) {
		Apple a=new Apple("사과", "red", 4000);
		Apple a2=new Apple("사과", "red", 4000);
		
		System.out.println(a==a2);
		a.price=2000;
		
		
//		int num1=Integer.valueOf(19);
//		int num2=num1;
//		Integer num3=12;
		
		String n="2312";
		int n2=Integer.parseInt(n);
		
		int n3=n2+50;
		
		String s =new String("hello");
		s.concat("java");
		
		
		
		
	}
}
