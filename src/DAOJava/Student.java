package DAOJava;

public class Student {
	int rollNo;
	String Name;
	String address;
	String Status;
	String password;
	
	
	public Student(int rollNo, String Name, String address, String Status, String password) {
		// TODO Auto-generated constructor stub
		this.rollNo=rollNo;
		this.address=address;
		this.Name=Name;
		this.password=password;
		this.Status=Status;
	}
	public  int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
