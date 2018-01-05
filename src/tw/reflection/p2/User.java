package tw.reflection.p2;

public class User {
    private String id;
    private String name;
    private int age;


    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User(String id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
