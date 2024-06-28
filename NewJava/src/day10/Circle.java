package day10;

public class Circle {
	int x,y,radius;
	Circle(int x,int y,int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	@Override
	public boolean equals(Object obj) {
		Circle c=(Circle) obj;
		if(x==c.x && y==c.y)
			return true;
		else return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "circle("+x+","+y+") 반지름"+radius;
	}
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)){
			System.out.println("같은 원");
		} else {
			System.out.println("서로 다른 원");
		}

	}
}
