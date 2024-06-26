package day8;

public class Car {
	String name; //차 종류
	String color; //색
	int speed;
	
	//메소드 1.단순히 실행,끝 
	void setName() {
		System.out.println("이름을 넣는 메소드");
	}
	
	//2.내가 원하는 값을 되돌려주는 (리턴타입과 동일)
	String getName() {
		return name;
	}
	
	void speedup(int i) {
		speed+=i;
	}
	
	void speeddown(int i) {
		speed-=i;
		if(speed<0) {
			speed=0;
		}
	}
	
	public static void main(String[] args) {
		Car c1=new Car();//객체 생성
		c1.name="좋은 차";
		c1.speed=10;
		c1.setName();
		String s= c1.getName();
		
		c1.speedup(5);
		
		Car c2=new Car();
		c2.name="불량";
	}
}

