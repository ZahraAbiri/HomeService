package ir.maktab.dao;

import ir.maktab.model.Expert;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class ExpertDao {
    private final SessionFactory sessionFactory;

    public void save(Expert expert) throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        File file = new File("image1.jpeg");
        byte[] picInBytes = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(picInBytes);
        fileInputStream.close();
        expert.setPhoto(picInBytes);
        session.save(expert);
        transaction.commit();
        session.close();
    }

    public Optional<Expert> findByEmailAddress(String email) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Expert> query = session.createQuery("FROM Expert expert WHERE expert.emailAddress=:emailValue");
        query.setParameter("emailValue", email);
        Optional<Expert> expert = Optional.ofNullable(query.uniqueResult());
        transaction.commit();
        session.close();
        return expert;
    }
}
