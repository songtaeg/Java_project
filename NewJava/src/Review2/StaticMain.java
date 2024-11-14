package Review2;

public class StaticMain {

	public static void main(String[] args) {
		Static s =new Static();
		s.money1=9000;
		s.money2=9000; //static (공유)
		
		Static s2 =new Static();
		s2.money1 = s2.money1-2000;
		s2.money2 = s2.money2-2000;
		
		System.out.println(s.money1);
		System.out.println(s.money2);
	}

}
