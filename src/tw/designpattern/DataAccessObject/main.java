package tw.designpattern.DataAccessObject;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.updateStudent(new Student("Jason", "26"));
        studentDao.updateStudent(new Student("Albee", "26"));
        studentDao.updateStudent(new Student("Rubbie", "27"));
        studentDao.updateStudent(new Student("ruby", "27"));
        studentDao.updateStudent(new Student("sarah", "25"));

        for (Student student : studentDao.getAllStudents()) {
            System.out.println(student.getmName() + "   " + student.getmAge());
        }


        studentDao.deleteStudent("Albee");
        System.out.println("\n\n");
        println(studentDao);
        studentDao.deleteStudent("Rubbie");
        System.out.println("\n\n");
        println(studentDao);
        studentDao.deleteStudent("ruby");
        System.out.println("\n\n");
        println(studentDao);
        studentDao.deleteStudent("sarah");
        System.out.println("\n\n");
        println(studentDao);

    }
    private static void println(StudentDao studentDao ){
        for (Student student : studentDao.getAllStudents()) {
            System.out.println(student.getmName() + "   " + student.getmAge());
        }
    }
}
