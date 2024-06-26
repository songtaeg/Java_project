package day7;

public class ColorPoint2 extends Point{
	private String color;
	
	ColorPoint2(){
		this(0,0,"BLACK");
//		super(0,0);
//		this.color="BLACK";
	}
	
	ColorPoint2(int x, int y){
		this(x,y,"BLACK");
	}
	
	ColorPoint2(int x,int y,String color){
		super(x, y);
		this.color=color;
	}
	
	void setXY(int x,int y) {
		 move(x, y);
		 
	}
	
	void setColor(String color) {
		this.color=color;
	}
	 
	 @Override
	public String toString() {
		return color+"색의 "+ "("+getX()+","+getY()+")의 점"; 
	} 
	
	public static void main(String[] args) {
		   ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
		   
		   ColorPoint2 cp = new ColorPoint2(10, 10); // (10,10) 위치의 BLACK 색 점
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");
		}
}
