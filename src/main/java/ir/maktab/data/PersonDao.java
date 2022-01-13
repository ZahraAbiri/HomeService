package ir.maktab.data;

import ir.maktab.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {
    void update(Person person);

    Optional<Person> findByEmailAddress(String emailAddress);
}
