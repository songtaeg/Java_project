package array;

public class Array_1 {

	public static void main(String[] args) {
		//int arr[][]=new int [2][5];
		//{1,2,3,4,5} 
		//{3,2,5,4,1}
		int arr[][]= {{1,2,3,4,5},{1,6,8},{3,2,5,4,1},{4,6}};
		
		int sum=0; int num=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
				num++;
			}
		}System.out.println(sum/num);
		
		
	}

}
