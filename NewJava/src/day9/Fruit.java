package day9;

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
	static void Box(Fruit f) {
		System.out.println(f.name+"을 포장");
	}
	
	public static void main(String[] args) {
		Banana b=new Banana("바나나", "yellow", 1000);
		Orange o =new Orange("오렌지", "orange", 1500);
		Apple a=new Apple("사과", "red", 4000);
		Candy candy=new Candy();
		Box(a);
	}
}
