package Review2;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		int num1= calc.sum(); //0
		int num2= calc.sum(1,2);
		int num3 =calc.sum(1,2,3);
		double num4 =calc.sum(1.5, 2.5);
		double num5 = calc.sum(2.1, 2);
	}

}
