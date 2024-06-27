package day9;

public class Dog extends Animal{
	private String species;
	
	Dog(){
		super("정보없음",0);
	}
	Dog(String ani,int age,String species){
		super(ani, age);
		this.species=species;
	}
	
	void sound() {
		System.out.println("멍멍!");
	}

	String getBreed() {
		return species;
	}
	
	public static void main(String[] args) {
        Animal animal = new Animal("동물", 5);
        animal.info(); // 이름 : 동물, 나이: 5
        animal.sound(); // 동물이 소리를 냅니다.
        
        // Dog 객체 생성
        Dog dog = new Dog("바둑이", 3, "진돗개");
        dog.info(); // 이름 : 바둑이, 나이 : 3
        dog.sound(); // 멍멍!
        System.out.println("품종 : " + dog.getBreed()); // 품종 : 진돗개
        
        Dog dog2 = new Dog();
        dog2.info(); // 이름 : 정보없음, 나이 : 0
	}
}
