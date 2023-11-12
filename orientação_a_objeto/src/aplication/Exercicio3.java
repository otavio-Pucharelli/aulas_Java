package aplication;

import entities.Student;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Grade 3: ");
        student.grade3 = sc.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println(student);
        if (finalGrade < 60.0) {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.0 - finalGrade) + " POINTS");
        } else if (finalGrade >= 60.0) {
            System.out.println("PASS");
        }

        sc.close();
    }
}
