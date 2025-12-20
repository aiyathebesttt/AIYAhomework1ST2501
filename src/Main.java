//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Human human= new Human(32, "Nicolas", false);
        Employee employee = new Employee(44, "Zhanar", true, "Cashier", 256.78f);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Is the student married(true/false):");
        boolean married = scanner.hasNext();

        System.out.println("Enter student speciality:");
        String speciality = scanner.nextLine();
        scanner.nextLine();                 //if i dont write these i cannot input data properly, got the help from examples from internet
        System.out.println("Enter student gpa:");
        float gpa = scanner.nextFloat();

        Student student = new Student(age, name, married, speciality, gpa);


        System.out.println(student.whoAdult());
        System.out.println(human.getAge());
        System.out.println(employee.toLive());
        System.out.println(employee.whoAdult());
        System.out.println(student.getUniversity());
        System.out.println(student.getGpa());
        System.out.println(human.whoAdult());
        System.out.println(employee.getCreditindx());

    }
}