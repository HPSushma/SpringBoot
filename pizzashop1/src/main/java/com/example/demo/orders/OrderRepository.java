package com.example.demo.orders;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Long> {

    public List<Orders> findByCustomer(Long customerId);
}
