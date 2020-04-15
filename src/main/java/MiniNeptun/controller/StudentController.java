package MiniNeptun.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import MiniNeptun.model.Student;
import MiniNeptun.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    private List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    private Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        studentService.delete(id);
    }

    @PostMapping("/students")
    private int saveStudent(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student.getId();
    }

    @PutMapping("/students")
    private Student update(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student;
    }
}
