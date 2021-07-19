package de.neuefische.StudentenApp;

import de.neuefische.StudentenApp.model.Student;


public class App {

    public static void main(String[] args) {

        Student student = new Student("Hans", "Maier", 43);
        System.out.println(student);


        Student student2 = new Student("Hans", "Maier", 43);

        System.out.println(student2);
        System.out.println(student);

        System.out.println(student.hashCode());
        System.out.println(student.equals(student2));


    }
}
