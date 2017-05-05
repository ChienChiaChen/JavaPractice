package tw.designpattern.creational.builder1;

/**
 * Created by chiachen on 2017/1/17.
 */
public class Student {
    private final int stuId;
    private final String name;
    private final int age;
    private final int gender;
    private final String address;

    private Student(StudentBuilder builder) {
        this.stuId = builder.stuId;
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public int getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private  int stuId;
        private  String name;
        private int age;
        private int gender;
        private String address;

        public StudentBuilder(int stuId, String name) {
            this.stuId = stuId;
            this.name = name;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(int gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
