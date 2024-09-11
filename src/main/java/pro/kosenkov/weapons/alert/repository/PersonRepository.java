package pro.kosenkov.weapons.alert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.kosenkov.weapons.alert.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}
