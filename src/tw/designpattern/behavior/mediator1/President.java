package tw.designpattern.behavior.mediator1;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {


    private Map<String, Department> mDepartmentMap = new HashMap<>();


    @Override
    public void register(String departmentName, Department department) {
        mDepartmentMap.put(departmentName, department);
    }

    @Override
    public void command(String departmentName) {
        mDepartmentMap.get(departmentName).selfAction();
    }
}
