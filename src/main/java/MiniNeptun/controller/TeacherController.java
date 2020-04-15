package MiniNeptun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import MiniNeptun.model.Teacher;
import MiniNeptun.service.TeacherService;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher")
    private List<Teacher> getAllTeacher()
    {
        return teacherService.getAllTeacher();
    }

    @GetMapping("/teacher/{id}")
    private Teacher getTeacher(@PathVariable("id") int id)
    {
        return teacherService.getTeacherById(id);
    }

    @DeleteMapping("/teacher/{id}")
    private void deleteTeacher(@PathVariable("id") int id)
    {
        teacherService.delete(id);
    }

    @PostMapping("/teachers")
    private int saveTeacher(@RequestBody Teacher teacher)
    {
        teacherService.saveOrUpdate(teacher);
        return teacher.getId();
    }

    @PutMapping("/teachers")
    private Teacher update(@RequestBody Teacher teacher)
    {
        teacherService.saveOrUpdate(teacher);
        return teacher;
    }

}
