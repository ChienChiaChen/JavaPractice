package tw.designpattern.structural.composite1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/1/24.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return this.subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :" +
                "[ Name : " + name +
                ", dept : " + dept +
                ", salary :" + salary+" ]");
    }
}
