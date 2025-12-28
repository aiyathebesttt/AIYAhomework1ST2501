package bebebe;

public class Employee extends Human implements ILearn, IWork {

    private String dolzhnost;
    private int salary;

    public Employee(int age, String name, boolean isMarried,
                    String dolzhnost, int salary) {

        super(age, name, isMarried);
        this.dolzhnost = dolzhnost;
        this.salary = salary;
    }

    @Override
    public String toLive() {
        return "Employee is living!";
    }

    @Override
    public String introduce() {
        return "Employee: " + name + ", " + dolzhnost;
    }

    @Override
    public void work() {
        System.out.println("Employee works");
    }

    @Override
    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public void learn() {
        System.out.println("Employee learns");
    }

    @Override
    public void passExam() {
        System.out.println("Employee passed test");
    }

    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    public int getSalaryValue() {
        return salary;
    }

    public void setSalaryValue(int salary) {
        this.salary = salary;
    }
}