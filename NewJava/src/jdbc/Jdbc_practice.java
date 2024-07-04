package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_practice {
	private static void printData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.print(rs.getString("ID"));
			System.out.print("\t|\t" + rs.getString("NAME"));
			System.out.println("\t|\t" + rs.getString("DEPT"));
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
			System.out.print("1.추가, 2.삭제, 3.수정, 4.확인, 5.끝내기>>");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.print("아이디 입력: ");
				String id=sc.next();
				System.out.print("이름 입력: ");
				String name=sc.next();
				System.out.print("학과 입력: ");
				String dept=sc.next();

				String q="INSERT INTO TBL_STUDENT(ID,NAME,DEPT) VALUES"+
				"("+"'"+id+"'"+","+"'"+name+"'"+","+"'"+dept+"'"+")";
				stmt.executeUpdate(q);
				System.out.println("추가되었습니다");
				
			}else if(menu==2) {
				System.out.print("삭제할 아이디 입력: ");
				String id=sc.next();
				ResultSet rs=stmt.executeQuery("SELECT * FROM TBL_STUDENT WHERE ID="+"'"+id+"'");
				if(rs.next()) {
					stmt.executeUpdate("DELETE FROM TBL_STUDENT WHERE ID="+"'"+id+"'");
					System.out.println("삭제 완료");
				}else {
					System.out.println("해당 아이디는 존재하지 않습니다");
					continue;
				}
				
			}else if(menu==3) {
				System.out.print("아이디 입력: ");
				String id=sc.next();
				ResultSet check=stmt.executeQuery("SELECT * FROM TBL_STUDENT WHERE ID="+"'"+id+"'");
				if(check.next()) {
					System.out.print("수정할 학과 입력: ");
					String d=sc.next();
					String update="UPDATE TBL_STUDENT SET DEPT="+"'"+d+"'" +"WHERE ID="+"'"+id+"'"; 
					stmt.executeUpdate(update);
					System.out.println("수정되었습니다.");
				}else {
					System.out.println("해당 아이디는 존재하지 않습니다");
					continue;
				}
			}else if(menu==4) {
				System.out.println("==학생 목록==");
				ResultSet rs2= stmt.executeQuery("SELECT * FROM TBL_STUDENT");
				printData(rs2);
			}else {
				System.out.println("종료");
				break;
			}
		}
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}

}
