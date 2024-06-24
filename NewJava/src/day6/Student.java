package day6;

//클래스: 객체 모양을 선언(설계도) 객체:클래스 모양대로 생성(구체화)
public class Student {
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	Student(int stuNo,String stuName){
		//this(stuno,stuname,"")
		this.stuNo=stuNo;
		this.stuName=stuName;
	}
	Student(int stuNo,String stuName,String stuDept){
		this.stuNo=stuNo;
		this.stuName=stuName;
		this.stuDept=stuDept;
	}
	
	void setInfo(int age,String gender) {
		this.age=age;
		this.gender=gender;
	}
	
	int getAge() {
		//System.out.println(age);
		return age;
	}
}
