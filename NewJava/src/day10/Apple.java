package day10;

public class Apple extends Fruit{

	Apple(String name, String color, int price) {
		super(name, color, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void print() {
		super.print();
		System.out.println("비싸!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사과 클래스";
	}
}
