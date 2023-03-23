package ch.blend.Fullstack.controller;

import ch.blend.Fullstack.modell.Student;
import ch.blend.Fullstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    // 5.Step: inject studentservice

    @Autowired
    private StudentService studentService;

    // 6. Step: Save the data into the database
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student added";
    }

    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
