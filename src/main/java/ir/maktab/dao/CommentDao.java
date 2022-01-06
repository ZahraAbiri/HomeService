package ir.maktab.dao;

import ir.maktab.model.Comment;
import ir.maktab.util.HibernateUtil;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentDao {
    private SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();


    public void save(Comment comment) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(comment);
        transaction.commit();
        session.close();
    }
}
