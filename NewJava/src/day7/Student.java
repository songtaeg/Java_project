package day7;

public class Student extends Person{
	
	String stuno; //학번
	String studept; //학과
	
	Student(){
		System.out.println("student 기본 생성자");
	}
	Student(String name,int age){
		super(name,age);
		System.out.println("student 매개변수 있는 생성자");
	}
	
	 Student(String name, int age, String stuno,String studept){
		 super(name,age);
		 this.stuno=stuno;
		 this.studept=studept;
	 }
	void study() {
		System.out.println("공부 중");
	}

}
