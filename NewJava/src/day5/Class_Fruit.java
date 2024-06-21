package day5;

public class Class_Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit orange = new Fruit("오렌지", 1500);
		
		int price=orange.getPrice(3);
		
		System.out.println(price);
		
		Fruit apple =new Fruit("사과");
		
		Fruit temp =new Fruit();
		
	}

}
