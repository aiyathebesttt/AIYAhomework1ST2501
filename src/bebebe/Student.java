package bebebe;
public final class Student extends Human implements ILearn {

    private String speciality;
    private float gpa;

    private static String university = "AITU";
    private final int studentId;

    public Student(int age, String name, boolean isMarried,
                   String speciality, float gpa, int studentId) {

        super(age, name, isMarried);
        this.speciality = speciality;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public String toLive() {
        return "Student is alive wow.";
    }

    @Override
    public String introduce() {
        return "Student: " + name + ", " + speciality;
    }

    @Override
    public void learn() {
        System.out.println("Student learns some stuff");
    }

    @Override
    public void passExam() {
        System.out.println("Student passed exam and passed out");
    }

    public final void showStudentId() {
        System.out.println("Student id: " + studentId);
    }

    public String getUniversity() {
        return university;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getStudentId() {
        return studentId;
    }
}
