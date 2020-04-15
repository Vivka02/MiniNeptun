package MiniNeptun.service;

import java.util.ArrayList;
import java.util.List;

import MiniNeptun.model.Subject;
import MiniNeptun.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubject()
    {
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subject -> subjects.add(subject));
        return subjects;
    }

    public Subject getSubjectById(int id)
    {
        return subjectRepository.findById(id).get();
    }

    public void saveOrUpdate(Subject subject)
    {
        subjectRepository.save(subject);
    }

    public void delete(int id)
    {
        subjectRepository.deleteById(id);
    }
}
