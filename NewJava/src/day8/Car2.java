package day8;

public class Car2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car soanta1=new Car();
		Car soanta2;
		soanta2=soanta1;
		soanta1.speed=10;
		soanta2.speed=20;
		
		System.out.println(soanta1.speed);
		
		//값(별개,영향x) <--> 레퍼런스(영향,주소 공유) 

	}

}
