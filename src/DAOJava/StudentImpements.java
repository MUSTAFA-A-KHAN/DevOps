package DAOJava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentImpements implements StudentDao{
	
	
	
	private Connection con;
	 public StudentImpements(Connection con) {
		 this.con=con;
	 }

	@Override
	public void save(Student Student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst=con.prepareStatement("INSERT INTO Student values(?,?,?,?,?)");
			pst.setInt(1, Student.getRollNo());
			pst.setString(2, Student.getName());
			pst.setString(3,Student.getAddress());
			pst.setString(4, Student.getStatus());
			pst.setString(5, Student.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@Override
	public void update(Student Student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst1=con.prepareStatement("Update Student set rollNo=?, Name=?, address=?, Status=?, Password=? WHERE rollNo=?");
		
			pst1.setInt(1, Student.getRollNo());
			pst1.setString(2, Student.getName());
			pst1.setString(3,Student.getAddress());
			pst1.setString(4, Student.getStatus());
			pst1.setString(5, Student.getPassword());
			pst1.setInt(6, Student.getRollNo());
			pst1.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

	@Override
	public void delete(Student Student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst2=con.prepareStatement("DELETE FROM Student WHERE rollNo=?");
			pst2.setInt(1, Student.getRollNo());
			pst2.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> List=new ArrayList<Student>();
		try {
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("SELECT * FROM Student");
			while(rs.next()) {
				Student student=ResultSetToStudent(rs);
				List.add(student);
			}
		
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return List;
	}

	@Override
	public Student findbyId(int roll) {
		
		try {
			
			PreparedStatement pst3=con.prepareStatement("SELECT * FROM Student WHERE rollNo=?" );
			pst3.setInt(1,roll);
			ResultSet rs=pst3.executeQuery();
			if(rs.next()) {
				return ResultSetToStudent(rs);
			}
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return null ;
	}
	private Student ResultSetToStudent(ResultSet rs)throws SQLException{
		int roll=rs.getInt("rollNo");
		String Name=rs.getNString("Name");
		String address=rs.getString("address");
		String Status=rs.getString("Status");
		String Password=rs.getString("Password");
		return new Student(roll,Name,address,Status,Password);
	
		
	}
	

}
