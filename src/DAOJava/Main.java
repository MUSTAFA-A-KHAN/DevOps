package DAOJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Main")
public class Main extends HttpServlet{

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr=resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profound","root","Datamato@123");
			StudentDao stD=new StudentImpements(con);
			int roll=Integer.parseInt(req.getParameter("rollNo"));
			String name=req.getParameter("name");
			String address=req.getParameter("address");
			String status=req.getParameter("status");
			String password=req.getParameter("password");
			 Student student=new Student(roll,name,address,status,password);
			//stD.save(student);
			
			stD.update(student);
			//stD.delete(student);
			/*List <Student> alluser=stD.findAll();
			for (int i = 0; i < alluser.size(); i++) {
				System.out.println(alluser.get(i).getName()+" | "+alluser.get(i).getAddress()+" | "+alluser.get(i).getRollNo()+" | "+alluser.get(i).getStatus()+" | "+alluser.get(i).getPassword());
				System.out.println();
			}
			*/
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}}
	
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profound","root","Datamato@123");
			StudentDao stD=new StudentImpements(con);
			
			 Student student=new Student(1,"Mustafa","Khan","3","6");
			//stD.save(student);
			
			//stD.update(student);
			//stD.delete(student);
			List <Student> alluser=stD.findAll();
			for (int i = 0; i < alluser.size(); i++) {
				System.out.println(alluser.get(i).getName()+" | "+alluser.get(i).getAddress()+" | "+alluser.get(i).getRollNo()+" | "+alluser.get(i).getStatus()+" | "+alluser.get(i).getPassword());
				System.out.println();
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
	stD*/


