package Gradebook;

import java.util.ArrayList;
import java.util.Arrays;

public class Gradebook {
    public static void main(String[] args) {
        Student student = new Student("Rivaldo");
        Student student1 = new Student("Zidane");
        Student student2 = new Student("Baggio");
        Student student3 = new Student("Ronaldo");
        Student student4 = new Student("Nedved");
        Group group = new Group("Java", 4, 10);
        group.addStudent(student3);
        group.addStudent(student2);
        group.addStudent(student1);
        group.addStudent(student4);
        group.addStudent(student);

        student.rateStudent(student3, 2, 5);
        student.rateStudent(student1, 1, 5);
        student.rateStudent(student2, 5, 5);
        student.rateStudent(student3, 10, 4);
        group.printGroupMarks();
        group.removeStudentByName("Nedved");
        System.out.println();
        group.sortByName();
        group.printGroupMarks();
        group.groupContains("Zidane");
        group.clear();
        group.printGroupMarks();
    }
}



