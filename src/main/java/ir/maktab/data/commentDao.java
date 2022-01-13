package ir.maktab.data;

import ir.maktab.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commentDao extends JpaRepository<Comment,Integer> {
}
