package ir.maktab.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MainServiceDao extends JpaRepository<MainServiceDao,Integer> {
    Optional<MainServiceDao> findByName(String name);

}
