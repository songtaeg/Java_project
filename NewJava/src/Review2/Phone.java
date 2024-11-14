package Review2;

public class Phone implements PhoneInterface{

	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("calling");
	}

	@Override
	public void receivecall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다");
	}
	
	public void flash() {
		System.out.println("불이 켜졌습니다");
	}

}
