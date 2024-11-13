package Review;

public class Review9 {

	public static void printHello() {
		System.out.println("hello");
	}
	public static String returnHello() {
		return "Hello";
	}
	public static String returnStr(String str) {
		return str+ "리턴";
	}
	public static void main(String[] args) {
		
		//printHello(); //끝
		//String str= returnHello();
		//System.out.println(str); //되돌려 줘
		
		String str2= returnStr("안녕");
		System.out.println(str2);
	}

}
