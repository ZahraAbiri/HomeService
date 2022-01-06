package ir.maktab.service;

import ir.maktab.dao.OrderDao;
import ir.maktab.model.Customer;
import ir.maktab.model.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderService {
    private OrderDao orderDao;


    public void save(Order order) {
        orderDao.save(order);
    }

    public Order get(Integer id) {
        return orderDao.get(id);
    }

    public List<Order> findByCustomer(Customer customer) {
        return orderDao.findByCustomer(customer);
    }
}

