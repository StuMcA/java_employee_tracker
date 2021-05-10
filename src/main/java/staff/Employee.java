package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double payRise) {
        if (payRise > 0) {
            this.salary += payRise;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void updateName(String nameUpdate){
        if (!nameUpdate.equals("")){
            this.name = nameUpdate;
        }
    }
}
