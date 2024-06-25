package day7;

public class IPTV extends ColorTV{
	String ip;
	
	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip=ip;
	}
	
	void printProperty() {
		System.out.println("나의 tv는 "+ip+" 주소의 "+getSize()+"인치 "+color+"컬러");
	}
}
