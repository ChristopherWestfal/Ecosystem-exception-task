import lombok.Data;

import java.util.List;
import java.util.UUID;


@Data
public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findByID(String id) throws IDNotFoundException {

        return repo.findStudentById(id).orElseThrow(() -> new IDNotFoundException("Student with ID: " + id + " not found"));

//        if(repo.findStudentById(id).isEmpty())
//            throw new IDNotFoundException("No student found by id: " + id);
//        else
//            return repo.getStudents().get(id);

    }

}
