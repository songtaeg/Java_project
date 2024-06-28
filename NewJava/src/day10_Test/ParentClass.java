package day10_Test;

public class ParentClass {
	String name;
	
	public ParentClass(String name) {	
		this.name=name;
	}
	
	void gugudan(int i) {
		System.out.println(name+"님 자바 클래스 테스트를 시작합니다.");
		int dan;
		for(dan=1; dan<=9; dan++) {
			System.out.println(i+"*"+dan+"="+i*dan);
		}
	}
	
	 int arrBigNum(int []a) {
		int max=a[0]; 

		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i]; 
			}
		}
		return max;	
	}
}
