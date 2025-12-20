public class Student extends Human {
    private String speciality;



    private float gpa;


    private static String university = "AITU"; // got the example from google
    public Student(int age, String name, boolean married, String speciality, float gpa){
        this.gpa=gpa;
        this.speciality=speciality;
        super(age, name, married);
    }

    @Override
    public String toLive() {
        return "Student is omg alive too.";
    }
    public String getUniversity(){
        return university;
    }
    public String getSpeciality() {
        return speciality;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



}
