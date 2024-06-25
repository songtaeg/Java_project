package day7;

public class Fruit_main {
	
	static void FruitBox(Fruit f, int num) {
		if(f instanceof Banana) {
			System.out.println(f.name +" "+ num+"개 포장");
			System.out.println("바나나 박스");
		}
		if(f instanceof Orange) {
			System.out.println(f.name +" "+ num+"개 포장");
			System.out.println("오렌지 박스");
		}
		if(f instanceof Apple) {
			System.out.println(f.name +" "+ num+"개 포장");
			System.out.println("사과 박스");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Banana("바나나", "yellow", 1000);
		Orange o =new Orange("오렌지", "orange", 1500);
		Apple a=new Apple("사과", "red", 4000);
		
		//b.getPrice();
		
		FruitBox(b,3);
		FruitBox(o,2);
	}
}