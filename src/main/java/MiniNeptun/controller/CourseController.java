package MiniNeptun.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import MiniNeptun.model.Course;
import MiniNeptun.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/course")
    private List<Course> getAllCourse()
    {
        return courseService.getAllCourse();
    }

    @GetMapping("/course/{id}")
    private Course getCourse(@PathVariable("id") int id)
    {
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/course/{id}")
    private void deleteCourse(@PathVariable("id") int id)
    {
        courseService.delete(id);
    }

    @PostMapping("/courses")
    private int saveCourses(@RequestBody Course course)
    {
        courseService.saveOrUpdate(course);
        return course.getId();
    }

    @PutMapping("/courses")
    private Course update(@RequestBody Course course)
    {
        courseService.saveOrUpdate(course);
        return course;
    }
}
