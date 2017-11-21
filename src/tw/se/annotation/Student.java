package tw.se.annotation;

@Table(value = "tb_student")
public class Student {

    @Field(columnName = "id", type = "int", length = 10)
    private int id;
    @Field(columnName = "age", type = "int", length = 3)
    private int age;
    @Field(columnName = "sname", type = "varchar", length = 10)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
