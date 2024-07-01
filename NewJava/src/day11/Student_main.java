package day11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student_main {

	public static void main(String[] args) {
		
		ArrayList<Student> a=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 이름,학과,학번,학점평균 입력");
		
		while(true) {
			System.out.print(">> ");
			String info=sc.nextLine();
			if(info.equals("그만")) {
				 break;
			}
			
			StringTokenizer st=new StringTokenizer(info,",");
			String name =st.nextToken();
			String dept =st.nextToken();
			String id =st.nextToken();
			String grade= st.nextToken();
			double g1=Double.parseDouble(grade);
			
			Student stu=new Student(name, dept, id, g1);
			a.add(stu);
		}
		
		for(int i=0; i<a.size(); i++) {
			System.out.println("=======");
			System.out.println("이름: "+a.get(i).getName());
			System.out.println("학과: "+a.get(i).getDepartment());
			System.out.println("학번: "+a.get(i).getId());
			System.out.println("학과평균: "+a.get(i).getGrade());
		}
	}
}
