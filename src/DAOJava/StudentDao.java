package DAOJava;

import java.util.*;

public interface StudentDao {
		
	void save(Student Student);
    void update(Student Student);
    void delete(Student Student);
    List<Student> findAll();
    Student findbyId(int roll);
    
}
