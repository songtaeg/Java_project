package day7;

public class TV_main {

	public static void main(String[] args) {
		ColorTV my=new ColorTV(32, 1024);
		my.printProperty();
		
		IPTV ip=new IPTV("192.1.1.2", 32, 2048);
		ip.printProperty();
	}

}
