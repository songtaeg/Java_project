package day10_Test;

public class Test {

	public static void main(String[] args) {
		ParentClass p = new ParentClass("홍길동");
		p.gugudan(3); // 구구단 3단 출력
		
		int arr[] = {3, 5 ,2, 4, 1};
		int bigNumber = p.arrBigNum(arr);
		System.out.println("배열에서 가장 큰 수는 " + bigNumber); // 배열에서 가장 큰 수는 5
		
		System.out.println("---------------\n");
		
		ChlidClass c= new ChlidClass();
		c.gugudan(6);
		
		c.objType("안녕"); 
		c.objType(123); 
		c.objType(p); 
	}	
}
