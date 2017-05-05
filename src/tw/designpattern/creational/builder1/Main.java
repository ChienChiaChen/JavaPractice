package tw.designpattern.creational.builder1;

/**
 * Created by chiachen on 2017/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder(98131296, "ee")
                .setAddress("林森南路")
                .setAge(25)
                .setGender(2)
                .build();

        System.out.println(student.toString());

    }
}
