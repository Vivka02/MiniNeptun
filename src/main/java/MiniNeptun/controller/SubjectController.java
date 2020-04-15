package MiniNeptun.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import MiniNeptun.model.Subject;
import MiniNeptun.service.SubjectService;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping("/subject")
    private List<Subject> getAllSubject()
    {
        return subjectService.getAllSubject();
    }

    @GetMapping("/subject/{id}")
    private Subject getSubject(@PathVariable("id") int id)
    {
        return subjectService.getSubjectById(id);
    }

    @DeleteMapping("/subject/{id}")
    private void deleteSubject(@PathVariable("id") int id)
    {
        subjectService.delete(id);
    }

    @PostMapping("/subjects")
    private int saveSubject(@RequestBody Subject subject)
    {
        subjectService.saveOrUpdate(subject);
        return subject.getId();
    }

    @PutMapping("/subjects")
    private Subject update(@RequestBody Subject subject)
    {
        subjectService.saveOrUpdate(subject);
        return subject;
    }
}
