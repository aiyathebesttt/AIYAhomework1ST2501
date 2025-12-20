public class Human {
    private int age;
    private String name;
    private boolean married;


    public Human(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
    }

    public boolean isMarried() {                //all getters and setters were gotten automatically by alt+ins
        return married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }

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




    public String toLive(){
        return "Human is alive!!!";
    }
    public boolean whoAdult(){
        return age >=18;
    }
}
