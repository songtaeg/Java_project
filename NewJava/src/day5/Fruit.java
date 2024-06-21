package day5;

public class Fruit {
	
	String name;
	int price;
	int num;
	
	Fruit(){
		System.out.println("정보없음");
	}
	
	Fruit(String name){
		this.name=name;
	}
	
	Fruit(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	 int getPrice(int num) {
		return price*num;
	}
}
