package MiniNeptun.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MiniNeptun.model.Teacher;
import MiniNeptun.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher()
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teacherRepository.findAll().forEach(teacher -> teachers.add(teacher));
        return teachers;
    }

    public Teacher getTeacherById(int id)
    {
        return teacherRepository.findById(id).get();
    }

    public void saveOrUpdate(Teacher teacher)
    {
        teacherRepository.save(teacher);
    }

    public void delete(int id)
    {
        teacherRepository.deleteById(id);
    }
}
