package ir.maktab.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MainService extends JpaRepository<MainService,Integer> {
    Optional<MainService> findByName(String name);

}
