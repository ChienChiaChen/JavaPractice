package tw.designpattern.DataAccessObject;

import java.util.List;

public interface StudentDao {
    boolean deleteStudent(String name);
    boolean updateStudent(Student student);
    List<Student> getAllStudents();
    Student getStudent(String name);

}
