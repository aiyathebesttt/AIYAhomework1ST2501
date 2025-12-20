public class Employee extends Human {
    private String dolzhnost;


    private float creditindx;


    public Employee(int age, String name, boolean married, String dolzhnost, float creditindx){
        this.dolzhnost=dolzhnost;
        this.creditindx=creditindx;
        super(age, name, married); //hi:)
    }

    @Override
    public String toLive() {
        return "Employee is living!";
    }

    public float getCreditindx() {
        return creditindx;
    }

    public void setCreditindx(float creditindx) {
        this.creditindx = creditindx;
    }
    public String getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }
}
