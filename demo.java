import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in Java: ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter Marks in Python: ");
        int pythonMarks = sc.nextInt();

        System.out.print("Enter Marks in SQL: ");
        int sqlMarks = sc.nextInt();

        int total = javaMarks + pythonMarks + sqlMarks;
        double average = total / 3.0;

        System.out.println("\n----- STUDENT REPORT -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average    : " + average);

        if (average >= 80) {
            System.out.println("Grade      : A");
        } else if (average >= 60) {
            System.out.println("Grade      : B");
        } else if (average >= 40) {
            System.out.println("Grade      : C");
        } else {
            System.out.println("Grade      : Fail");
        }

        sc.close();
    }
}