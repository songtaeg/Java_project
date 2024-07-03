package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_1 {
	
	private static void printData(ResultSet rs) throws SQLException {
			while (rs.next()) {
				System.out.print(rs.getString("STU_NAME"));
				System.out.print("\t|\t" + rs.getString("STU_NO"));
				System.out.println("\t|\t" + rs.getString("STU_DEPT"));
				//System.out.println();
			}
		}
	
	public static void main(String[] args) {
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
			
			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");
			printData(rs);
//			while(rs.next()) {
//				System.out.println(rs.getString("STU_NAME"));
//			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
