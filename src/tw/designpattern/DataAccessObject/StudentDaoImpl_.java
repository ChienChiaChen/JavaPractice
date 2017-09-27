package tw.designpattern.DataAccessObject;

public class StudentDaoImpl_ extends StudentDaoImpl {

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
}
