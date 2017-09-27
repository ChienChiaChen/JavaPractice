package tw.designpattern.DataAccessObject;

import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
    List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public boolean deleteStudent(String name) {
        Student s = null;
        for (Student student : students) {
            if (student.getmName().equalsIgnoreCase(name)) {
                s = student;
                break;
            }
        }
        return students.remove(s);
    }

    @Override
    public boolean updateStudent(Student student) {
        students.add(student);
        return students.contains(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(String name) {
        Student s=null;
        for (Student student : students) {
            if (student.getmName().equalsIgnoreCase(name)) {
                s=student;
                break;
            }
        }
        return s;
    }
}
