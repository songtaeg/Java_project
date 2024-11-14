package Review2;

public class Calculator implements CalcInterface{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int addArr(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	@Override
	public Student studentInfo(String name, int age, String addr, String num) {
		Student student =new Student(name,age,addr,num);
		
		return student;

	}

	@Override
	public int[] changeArr(int[] arr) {
		int maxindex=arr[0]; 
		int minindex=arr[0];
		int temp=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[maxindex]<arr[i]) {
				maxindex=i;
			} 
			if(arr[minindex]>arr[i]) {
				minindex=i;
			}
		}
		temp=arr[maxindex];
		arr[maxindex]=arr[minindex];
		arr[minindex]=temp;
		
		return arr;
	}

}
