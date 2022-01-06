package ir.maktab.dao;

import ir.maktab.model.Order;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderDao {
    private final SessionFactory sessionFactory;
    public void save(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    public Order get(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        transaction.commit();
        session.close();
        return order;
    }

    public List<Order> findByCustomer(Order customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Order> query = session.createQuery("FROM Order i WHERE i.customer=:customerValue");
        query.setParameter("customerValue", customer);
        List<Order> orders = query.list();
        transaction.commit();
        session.close();
        return orders;
    }
}
