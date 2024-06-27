package day8;

public class Car_Test {
	String name;
	String color;
	int speed;
	
	Car_Test(){
		//this("기본차","하얀색",0);
		this.name="기본차";
		this.color="하얀색";
	}
	
	Car_Test(String name,String color,int speed){
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	
	void carInfo() {
		System.out.println("자동차의 이름은 "+name+", 색상은 "+color+"입니다.");
	}
	
	void setInfo(String name,String color,int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	
	void speedUp(int i) {
		//this.speed=this.speed+speed;
		//this.speed+=speed;
		speed+=i;
		if(speed>=200) {
			System.out.println("200 이상 속도 불가. 200으로 변경");
			speed=200;
		}

	}
	
	void speedDown(int i) {
		speed-=i;
		if(speed<0) {
			System.out.println("0 미만 속도 불가. 0으로 변경");
			speed=0;
		}
	}
	
	int getSpeed() {
		//System.out.println("현재 속도는 "+speed+"입니다.");
		return speed;
	}
	
	public static void main(String[] args) {
		Car_Test car1=new Car_Test(); //
		car1.carInfo();
		
		car1.setInfo("아반떼", "노란색", 0);
		car1.carInfo();
		
		Car_Test car2 = new Car_Test("소나타","파란색",0);
		car2.carInfo(); // 자동차의 이름은 소나타, 색상은 파란색 입니다.
		
		car2.speedUp(10); // 현재 속도는 10 입니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedUp(200); // 200 이상의 속도는 불가합니다. 200으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedDown(150); 
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		
		car2.speedDown(200); // 0 미만의 속도는 불가합니다. 0으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
	}
}
