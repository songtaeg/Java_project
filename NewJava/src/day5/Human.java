package day5;

public class Human {
	String name;
	int age; 
	String addr;
	
	Human(String name,int age,String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
		System.out.println("생성자");
	}
	//기능
	void eat(String txt,String food){
		System.out.println(txt+"은"+food+"로 먹음!");
	}
	void study() {
		System.out.println("자바 공부");
	}
}
