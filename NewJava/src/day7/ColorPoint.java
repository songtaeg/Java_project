package day7;

public class ColorPoint extends Point{
	String color;
	
	 ColorPoint(int x, int y,String color) {
		 super(x, y);
		 this.color=color;
	 }	
	 
	 void setXY(int x,int y) {
		 move(x, y);
		 System.out.print(getX()+","+getY());
	 }
	 
	 void setColor(String color) {
		 System.out.print(color+"색의");
	 }
	 
	 
	 public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5, 5, "YELLOW");
		cp.setColor("RED");
		cp.setXY(10,20);
		
		//String str=cp.toString();
		//System.out.println(str+"입니다");
	}
}
