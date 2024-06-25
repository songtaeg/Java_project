package day7;

public class Person {
	private String name;
	private int age;
	
	Person(){
		System.out.println("person 기본 생성자");
	}
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("person 매개 변수");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void talk() {
		System.out.println("말한다");
	}
	
	void eat() {
		System.out.println("먹는다");
	}
	void walk() {
		System.out.println("걷는다");
	}
}
