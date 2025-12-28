package bebebe;


public abstract class Human {

    protected int age;
    protected String name;
    protected boolean isMarried;

    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }

    public String toLive() {
        return "Human is alive!!!";
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public abstract String introduce();

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

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
