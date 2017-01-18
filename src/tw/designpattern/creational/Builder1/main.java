package tw.designpattern.creational.Builder1;

/**
 * Created by chiachen on 2017/1/17.
 */
public class main {
    public static void main(String[] args) {
        new Student.StudentBuilder(98131296, "ee")
                .setAddress("林森南路")
                .setAge(25)
                .setGender(2)
                .build();

    }
}
