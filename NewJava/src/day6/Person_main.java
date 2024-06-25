package day6;

public class Person_main {

	public static void main(String[] args) {
		Person p=new Person("홍길동",20);
		p.setPhone("123-123");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPhone());
	}
}
