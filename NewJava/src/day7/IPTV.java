package day7;

public class IPTV extends ColorTV{
	String ip;
	
	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip=ip;
	}
	
	void printProperty() {
		System.out.print("나의 tv는 "+ip+" 주소의 ");
		super.printProperty();
	}
}
