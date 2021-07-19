package de.neuefische.StudentenApp.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void setterGetterLastNameTest(){
        // Given
        Student testStudent = new Student("Hans", "Peter", 23);
        testStudent.setLastName("Maier");

        // When
        String actual = testStudent.getLastName();

        // Then
        assertEquals("Maier", actual);
    }

    @Test
    public void setterGetterFirstNameTest(){
        // Given
        Student testStudent = new Student("Hans", "Peter", 23);
        testStudent.setFirstName("Maier");

        // When
        String actual = testStudent.getFirstName();

        // Then
        assertEquals("Maier", actual);
    }

    @Test
    public void setterGetterAgeTest(){
        // Given
        Student testStudent = new Student("Hans", "Peter", 23);
        testStudent.setAge(23);

        // When
        int actual = testStudent.getAge();

        // Then
        assertEquals(23, actual);
    }

    @Test
    public void setterGetterIsQualifiedTest(){
        // Given
        Student testStudent = new Student("Hans", "Peter", 23);
        testStudent.setQualified(true);

        // When
        boolean actual = testStudent.isQualified();

        // Then
        assertTrue(actual);
    }

    @Test
    public void toStringTest(){
        // Given
        Student testStudent = new Student("Hans", "Peter", 23);
        testStudent.setQualified(true);

        // When
        String actual = testStudent.toString();

        // Then
        assertEquals("Hans Peter 23 true", actual);
    }

    @Test
    public void equalsTestWithEqualObjects(){
        // Given
        Student student1 = new Student("Hans", "Peter", 23);
        Student student2 = new Student("Hans", "Peter", 23);

        //When
        boolean actual = student1.equals(student2);

        // Then
        assertTrue(actual);
    }

    @Test
    public void equalsTestWithTwoDifferentObjects(){
        // Given
        Student student1 = new Student("Hans", "Peter", 23);
        Student student2 = new Student("Peter", "Maier", 25);

        //When
        boolean actual = student1.equals(student2);

        // Then
        assertFalse(actual);
    }
}