package com.example.demo.customers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    private Long customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_phone;

    public Customers() {
    }
    public Customers(Long customer_id, String customer_name, String customer_email, String customer_phone) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
    }

    public Long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getCustomer_email() {
        return customer_email;
    }
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
    public String getCustomer_phone() {
        return customer_phone;
    }
    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }
}
