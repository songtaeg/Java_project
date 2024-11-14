package Review2;

public class Human {
	String name;
	int age;
	String addr;
	
	public Human() {}
	
	//생성자(리턴 타입 존재 X)
	public Human(String name, int age, String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
		
	}
	
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+addr);
	}
}
