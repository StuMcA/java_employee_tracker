package management;

import staff.Employee;

public class Manager extends Employee {
    private String department;


    public Manager(String name, String niNumber, Double salary, String department){
        super(name,niNumber,salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

}
