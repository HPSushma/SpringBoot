package com.example.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getAllOrdersByCustId(Long customerId){
        List<Orders> order=new ArrayList<>();
        orderRepository.findByCustomer(customerId).forEach(order::add);
        return order;
    }
    //@Override
    //public List<Orders> getAllOrdersByOrdStatus
    public Orders getAllOrders(Long orderId){
        return orderRepository.findById(orderId).get();
    }
    public void addOrder(Orders order){
        orderRepository.save(order);
    }
    public void updateOrder(Orders order){
        orderRepository.save(order);
    }
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
