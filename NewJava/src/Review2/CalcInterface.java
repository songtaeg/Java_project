package Review2;

public interface CalcInterface {
	int add(int x,int y); //숫자 2개 받아서 더한 후 리턴 
	int addArr(int[] arr); //배열 받아 전체 합 구한 후 리턴
	Student studentInfo(String name, int age,String addr, String stu); //이름,나이,주소,학번을 받아서 student 객체 생성 후 리턴
	int [] changeArr(int[] arr); //배열을 받아서 가장 큰 수, 작은 수 위치 바꾼 후 리턴
}
