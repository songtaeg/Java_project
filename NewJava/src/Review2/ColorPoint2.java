package Review2;

public class ColorPoint2 {

	public static void main(String[] args) {
		   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
		   ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");

	}

}
