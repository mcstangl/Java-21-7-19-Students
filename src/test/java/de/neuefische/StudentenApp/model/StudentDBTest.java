package de.neuefische.StudentenApp.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    Student student1;
    Student student2;
    Student student3;
    Student student4;

    @BeforeEach
    public void createStudentsForTest() {
        student1 = new Student("Hans", "Maier", 1);
        student2 = new Student("Markus", "Schneider", 2);
        student3 = new Student("Peter", "Heiner", 3);
        student4 = new Student("Horst", "König", 4);
    }


    @Test
    public void shouldReturnArrayOfStudents() {
        // Given
        Student[] students = {student1, student2, student3};
        StudentDB studentDB = new StudentDB(students);

        // When
        Student[] actual = studentDB.list();

        //Then
        Student[] expected = {
                new Student("Hans", "Maier", 1),
                new Student("Markus", "Schneider", 2),
                new Student("Peter", "Heiner", 3)};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAListOfStudentsAsString() {
        // Given
        Student[] students = {student1, student2, student3};
        StudentDB studentDB = new StudentDB(students);

        // When
        String actual = studentDB.toString();

        // Then
        String expected = "Hans Maier ID: 1\nMarkus Schneider ID: 2\nPeter Heiner ID: 3\n";
        assertEquals(expected, actual);

    }

    @Test
    public void shouldAddAStudentToDatabase() {
        // Given
        Student[] students = {student1, student2, student3};
        StudentDB studentDB = new StudentDB(students);

        // When
        studentDB.addStudent(student4);
        Student[] actual = studentDB.list();

        // Then
        Student[] expected = {
                new Student("Hans", "Maier", 1),
                new Student("Markus", "Schneider", 2),
                new Student("Peter", "Heiner", 3),
                new Student("Horst", "König", 4)};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAStudentFromDatabase() {
        // Given
        Student[] students = {student1, student2, student3, student4};
        StudentDB studentDB = new StudentDB(students);

        // When
        studentDB.removeStudent(student4);
        Student[] actual = studentDB.list();

        // Then
        Student[] expected = {
                new Student("Hans", "Maier", 1),
                new Student("Markus", "Schneider", 2),
                new Student("Peter", "Heiner", 3)};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDoNothingWhenTryToRemoveAStudentThatDoesNotExistInDb() {
        // Given
        Student[] students = {student1, student2, student3};
        StudentDB studentDB = new StudentDB(students);

        // When
        studentDB.removeStudent(student4);
        Student[] actual = studentDB.list();

        // Then
        Student[] expected = {
                new Student("Hans", "Maier", 1),
                new Student("Markus", "Schneider", 2),
                new Student("Peter", "Heiner", 3)};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAllEqualObjects() {
        // Given
        Student[] students = {student1, student2, student4, student3, student4};
        StudentDB studentDB = new StudentDB(students);

        // When
        studentDB.removeStudent(student4);
        Student[] actual = studentDB.list();

        // Then
        Student[] expected = {
                new Student("Hans", "Maier", 1),
                new Student("Markus", "Schneider", 2),
                new Student("Peter", "Heiner", 3)};
        assertArrayEquals(expected, actual);
    }

}