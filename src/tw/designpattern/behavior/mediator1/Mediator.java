package tw.designpattern.behavior.mediator1;

public interface Mediator {
    void register(String departmentName, Department department);
    void command(String departmentName);
}
