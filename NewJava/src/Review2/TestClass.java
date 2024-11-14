package Review2;

public class TestClass {
	public void info() {
		System.out.println("테스트 클래스입니다");
	}
	
	public int[] getArr() {
		int []arr= {3,5,2,1,4};
		return arr;
	}
	
	public String sumArr(int[] arr,int index1,int index2) {
		int sum=arr[index1]+arr[index2];
	
		return "배열의 " + index1+","+index2+"번째 인덱스 값의 합은 "+sum+"입니다";
	}
}
