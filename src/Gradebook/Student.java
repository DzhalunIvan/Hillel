package Gradebook;


public class Student implements Comparable<Student> {
    private String name;
    private int[] marks;


    public Student(String name) {

        this.setName(name);
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
       if (name.isBlank()){
           System.out.println("Wrong format of  the name!");
       }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rateStudent(Student student, int numberOfLesson, int mark) {
        student.marks[--numberOfLesson] = mark;
    }


    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        return result;
    }


}

