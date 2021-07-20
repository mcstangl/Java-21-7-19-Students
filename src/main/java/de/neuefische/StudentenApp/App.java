package de.neuefische.StudentenApp;

import de.neuefische.StudentenApp.model.Student;
import de.neuefische.StudentenApp.model.StudentDB;


public class App {

    public static void main(String[] args) {

        Student student = new Student("Hans", "Maier", 43);
        System.out.println(student);


        Student student2 = new Student("Peter", "Müller", 43);


        Student[] students = {student, student2};
        StudentDB studentDB = new StudentDB(students);

        Student retrievedRandomStudent = studentDB.getRandomStudent();

        System.out.println(retrievedRandomStudent.getFirstName());


    }
}
