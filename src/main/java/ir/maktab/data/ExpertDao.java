package ir.maktab.data;

import ir.maktab.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpertDao extends JpaRepository<Expert,Integer> {
    Optional<Expert> findByEmailAddress(String email);

}
