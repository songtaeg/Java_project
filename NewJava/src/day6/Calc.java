package day6;

//static-객체를 생성하지 않고 사용가능
public class Calc {
	int num,num2,num3;
	
	static int sum(int num,int num2) {
		return num+num2;
	}
	
	static int multiple(int num,int num2) {
		return num*num2;
	}
	
	static double multiple(Double num,int num2) {
		return num*num2;
	}
	static int multiple(int num,int num2,int num3) {
		return num*num2*num3;
	}
}
