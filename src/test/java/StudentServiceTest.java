import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @org.junit.jupiter.api.Test
    void findByID_shouldThrowIDNotFoundExceprion_whenGivenInvalidID() {
        StudentService studentService = new StudentService();

        assertThrows(IDNotFoundException.class, () -> studentService.findByID("1"));
    }
}