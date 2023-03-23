package ch.blend.Fullstack.service;

import ch.blend.Fullstack.modell.Student;

import java.util.List;

//3. Step: The Service class is typically used as an intermediary between the application's user interface and the database.
public interface StudentService {
    public Student saveStudent(Student student);
    //7. Step: Geting data from the database
    public List<Student> getAllStudents();
}
