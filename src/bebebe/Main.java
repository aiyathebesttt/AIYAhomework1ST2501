package bebebe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Is the student married(true/false):");
        boolean isMarried = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter student speciality:");
        String speciality = scanner.nextLine();

        System.out.println("Enter student gpa:");
        float gpa = scanner.nextFloat();

        System.out.println("Enter student id:");
        int studentId = scanner.nextInt();

        Student student = new Student(age, name, isMarried, speciality, gpa, studentId);
        Employee employee = new Employee(44, "Zhanar", true, "Cashier", 350000);

        Human h1 = student;
        Human h2 = employee;

        ILearn l1 = student;
        ILearn l2 = employee;

        IWork w1 = employee;

        System.out.println(student.toLive());
        System.out.println(student.introduce());
        System.out.println(student.isAdult());
        System.out.println(student.getUniversity());
        System.out.println(student.getGpa());
        student.learn();
        student.passExam();
        student.showStudentId();

        System.out.println();

        System.out.println(employee.toLive());
        System.out.println(employee.introduce());
        System.out.println(employee.isAdult());
        System.out.println(employee.getDolzhnost());
        employee.work();
        employee.getSalary();
        employee.learn();
        employee.passExam();

        System.out.println();

        System.out.println(h1.introduce());
        System.out.println(h2.introduce());

        l1.learn();
        l2.passExam();

        w1.work();
        w1.getSalary();
    }
}