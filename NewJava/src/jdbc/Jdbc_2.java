package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_2 {
	private static void printData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.print(rs.getString("STU_NAME"));
			System.out.print("\t|\t" + rs.getString("STU_NO"));
			System.out.println("\t|\t" + rs.getString("STU_DEPT"));
			//System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			//ip 컴퓨터주소(집주소) localhost 이름
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			//System.out.println("DB 연결 완료");
			stmt=conn.createStatement();
			
			System.out.print("이름 입력>>");
			String name=sc.next();
			
		while(true) {
			System.out.print("학번 입력>>");
			int num=sc.nextInt();
			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO="+num);
			if(rs.next()) {
				System.out.println("이미 등록된 학번");
			}else {
				String u="INSERT INTO STUDENT(STU_NAME,STU_NO) VALUES ("+"'"+name+"'"+","+num+")";
				stmt.executeUpdate(u);
				break;
			}
		}
		System.out.println("가입되었습니다.");
			
					
	
//			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");
//			printData(rs);
//			while(rs.next()) {
//				System.out.println(rs.getString("STU_NAME"));
//			}
//			String q="INSERT INTO STUDENT(STU_NAME,STU_NO) VALUES ('홍길동',12345678)";
//			stmt.executeUpdate(q);
			
//			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");
//			printData(rs);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

	}
