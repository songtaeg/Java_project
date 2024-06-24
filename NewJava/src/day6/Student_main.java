package day6;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1234, "홍길동");
		Student s2=new Student(1357, "유재석", "컴퓨터학과");
		
		s1.setInfo(20,"남");
		
		int age=s1.getAge();
		System.out.println(age);
	}

}