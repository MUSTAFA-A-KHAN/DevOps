package DAOJava;

import java.sql.*;

public class StudentDaoJDBCimpl {
	public Connection JDBC() {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profound","root","Datamato@123");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		return con;
		}
	
}
