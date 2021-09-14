package com.example.demo.orders;

import com.example.demo.customers.Customers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
    @Id
    private Long order_id;
    private String pizza_type;
    private int pizza_count;
    private String order_status;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customers customer;

    public Orders() {
    }

    public Orders(Long order_id, String pizza_type, int pizza_count, String order_status){//, Long customerId) {
        super();
        this.order_id = order_id;
        this.pizza_type = pizza_type;
        this.pizza_count = pizza_count;
        this.order_status = order_status;
        //this.customer = new Customers(customerId,"","","");
    }

    public Long getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
    public String getPizza_type() {
        return pizza_type;
    }
    public void setPizza_type(String pizza_type) {
        this.pizza_type = pizza_type;
    }
    public int getPizza_count() {
        return pizza_count;
    }
    public void setPizza_count(int pizza_count) {
        this.pizza_count = pizza_count;
    }
    public String getOrder_status() {
        return order_status;
    }
    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
    public Customers getCustomer() {
        return customer;
    }
    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}
