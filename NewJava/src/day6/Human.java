package day6;

public class Human {
		String name;
		int age; 
		String addr;
		static int money; //공유O
		
//		static void staticname() {
//			name="유";
//		}
		
		Human(String name,int age,String addr){
			this.name=name;
			this.age=age;
			this.addr=addr;
			money=150000;
		}
		//기능
		void eat(String txt,String food){
			System.out.println(txt+"은"+food+"로 먹음!");
		}
		void study() {
			System.out.println("자바 공부");
		}
}
