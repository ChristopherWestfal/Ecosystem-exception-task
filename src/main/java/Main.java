public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        try {
            System.out.println(studentService.findByID("id"));
        }
        catch (IDNotFoundException e){
            System.out.println("Fehler");
        }
    }
}
