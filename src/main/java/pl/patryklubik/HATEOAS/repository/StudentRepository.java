package pl.patryklubik.HATEOAS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.patryklubik.HATEOAS.model.Student;


/**
 * Create by Patryk Łubik on 18.07.2021.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
