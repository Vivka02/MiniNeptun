package MiniNeptun.repository;

import org.springframework.data.repository.CrudRepository;
import MiniNeptun.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
