package Gradebook;

import java.util.Arrays;


public class Group {
    private String groupName;
    private int groupCapacity;
    private Student[] students;
    private int numberOfLessons;

    public Group(String groupName, int groupCapacity, int numberOfLessons) {
        this.groupName = groupName;
        this.groupCapacity = groupCapacity;
        this.numberOfLessons = numberOfLessons;
        this.students = new Student[groupCapacity];
    }

    public void addStudent(Student student) {
        int counter = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                counter = i;
                break;
            }
        }
        if (counter == -1) {

            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = student;
        } else {
            students[counter] = student;
        }
        student.setMarks(new int[numberOfLessons]);
    }

    public void removeStudentByName(String name) {
        int counter = -1;
        for (int i = 0; i < students.length; i++) {
            if  (students[i].getName().equals(name)) {
                counter = i;
                break;
            }
        }
        Student[] newStudents = new Student[students.length - 1];
        int k = 0;
        for (int j = 0; j < students.length; j++) {
            if (j == counter)
                continue;
            newStudents[k++] = students[j];
        }
        students = newStudents;
    }



    public boolean groupContains(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name))
                return true;
        }
        return false;
    }

    public void sortByName() {
        Arrays.sort(students);
    }

    public void clear() {
        for (int i = 0; i <students.length ; i++) {
            students[i]=null;
        }
        System.out.println("group has been cleared");
    }


    public void printGroupMarks() {
        System.out.println("Surname\t\t Marks");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                continue;
            System.out.println(students[i].getName() + "\t\t" + Arrays.toString(students[i].getMarks()) + "\t\t");
        }
    }
}


