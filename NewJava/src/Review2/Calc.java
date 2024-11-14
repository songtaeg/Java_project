package Review2;

public class Calc {
	// 오버로딩 (동일한 이름의 메소드 여러개 정의), 파라미터 개수나 타입으로 구붐
	
	int sum() {
		return 0;
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	int sum(int x, int y,int z) {
		return x+y+z;
	}
	
	double sum(double x, double y) {
		return x+y;
	}
	
	double sum(double x, int y) {
		return x+y;
	}
}
