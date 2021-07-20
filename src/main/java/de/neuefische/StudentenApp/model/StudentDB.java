package de.neuefische.StudentenApp.model;

import java.util.Random;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return this.students;
    }

    @Override
    public String toString() {
        String listOfStudents = "";
        for (int i = 0; i < students.length; i++) {
            listOfStudents +=
                    students[i].getFirstName() + " " +
                            students[i].getLastName() + " ID: " +
                            students[i].getId() + "\n";
        }
        return listOfStudents;
    }

    public Student getRandomStudent() {
        int index = new Random().nextInt(students.length);
        return students[index];
    }

    public void addStudent(Student student) {
        Student[] newArrayOfStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newArrayOfStudents[i] = students[i];
        }
        newArrayOfStudents[newArrayOfStudents.length - 1] = student;
        this.students = newArrayOfStudents;
    }

    public void removeStudent(Student student) {
        if (countStudentInDatabase(student) == 0) {
            return;
        }
        Student[] newArrayOfStudents = new Student[students.length - countStudentInDatabase(student)];
        int newStudentArrayIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (!students[i].equals(student)) {
                newArrayOfStudents[newStudentArrayIndex] = students[i];
                newStudentArrayIndex++;
            }

        }
        this.students = newArrayOfStudents;

    }

    private int countStudentInDatabase(Student student) {
        int amountOfStudentsToBeRemoved = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                amountOfStudentsToBeRemoved++;
            }
        }
        return amountOfStudentsToBeRemoved;
    }
}
