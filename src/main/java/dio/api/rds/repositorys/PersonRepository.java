package dio.api.rds.repositorys;

import dio.api.rds.entitys.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
