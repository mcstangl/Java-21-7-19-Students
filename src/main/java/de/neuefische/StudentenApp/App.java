package de.neuefische.StudentenApp;

import de.neuefische.StudentenApp.model.Student;


public class App {

    public static void main(String[] args) {

        Student student = new Student("Hans", "Maier", 43);
        student.setQualified(true);
        System.out.println(student);


    }
}
