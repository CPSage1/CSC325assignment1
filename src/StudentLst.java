package org.example;

import java.util.Scanner;

public class StudentLst {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        Scanner inScanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);

            students[i] = student;
        }
        System.out.println(printOutput(students));
    }

    public static String printOutput(Student[] students) {
        String str = "";

        // To Do 03: Complete the implementation of this method
        for (Student student : students) {
            str += "Student Name: " + student.getName() + "\n";
        }

        return str;
    }
}