import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void setterGetterLastNameTest(){
        // Given
        Student testStudent = new Student();
        testStudent.setLastName("Maier");

        // When
        String actual = testStudent.getLastName();

        // Then
        assertEquals("Maier", actual);
    }

    @Test
    public void setterGetterFirstNameTest(){
        // Given
        Student testStudent = new Student();
        testStudent.setFirstName("Maier");

        // When
        String actual = testStudent.getFirstName();

        // Then
        assertEquals("Maier", actual);
    }

    @Test
    public void setterGetterAgeTest(){
        // Given
        Student testStudent = new Student();
        testStudent.setAge(23);

        // When
        int actual = testStudent.getAge();

        // Then
        assertEquals(23, actual);
    }

    @Test
    public void setterGetterIsQualifiedTest(){
        // Given
        Student testStudent = new Student();
        testStudent.setQualified(true);

        // When
        boolean actual = testStudent.isQualified();

        // Then
        assertTrue(actual);
    }
}