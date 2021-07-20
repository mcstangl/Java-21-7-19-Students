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
        Student[] arrayOfStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            arrayOfStudents[i] = students[i];
        }
        arrayOfStudents[arrayOfStudents.length - 1] = student;
        this.students = arrayOfStudents;
    }

    public void removeStudent(Student student) {
        int k = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                k++;
            }
        }
        if (k == 0) {
            return;
        }
        Student[] arrayOfStudents = new Student[students.length - k];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (!students[i].equals(student)) {
                arrayOfStudents[j] = students[i];
                j++;
            }
        }
        this.students = arrayOfStudents;

    }
}
