package ch.blend.Fullstack.repository;

import ch.blend.Fullstack.modell.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 2. Step: Set the Repository and extend with JpaRepository, the class is Student and the primary key of Student is the id and
    the class is Student and the primary key of Student is the id, so it is an Integer.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
