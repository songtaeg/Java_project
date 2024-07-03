package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_3 {
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
			stmt=conn.createStatement();
			
		while(true) {
			System.out.print("삭제할 학번 입력: ");
			int num=sc.nextInt();
			ResultSet rs=stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO="+num);
			if(rs.next()) {
				stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO="+num);
				System.out.println("삭제 완료");
			}else {
				System.out.println("해당 학번은 존재하지 않습니다");
				continue;
			}
		}
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

	}
