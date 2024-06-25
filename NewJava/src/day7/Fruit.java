package day7;

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
}
