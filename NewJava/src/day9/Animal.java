package day9;

public class Animal {
	private String ani;
	private int age;
	
	Animal(String ani,int age){
		this.ani=ani;
		this.age=age;
	}
	void info() {
		System.out.println("이름: "+ani+", 나이: "+age);
	}
	void sound() {
		System.out.println(ani+"이 소리를 냅니다.");
	}
}
