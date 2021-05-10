package management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, Double salary, String department,Double budget){
        super(name,niNumber,salary,department);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public double payBonus() {
        return this.salary * 0.02;
    }
}
