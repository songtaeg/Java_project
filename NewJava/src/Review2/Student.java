package Review2;

public class Student extends Human{
	String num;
	
	public Student(String name, int age,String addr,String num) {
		super(name,age,addr);
		this.num=num;
	}
	public void stuInfo() {
		System.out.println("학번은 "+num+"입니다.");
	}

	//오버라이딩 부모클래스 ->자식 클래스(재정의)
	public void info() {
		System.out.println("학번은 "+num+"입니다.");
		super.info();
//		System.out.println("이름: "+name);
//		System.out.println("나이: "+age);
//		System.out.println("주소: "+addr);
	}
}
