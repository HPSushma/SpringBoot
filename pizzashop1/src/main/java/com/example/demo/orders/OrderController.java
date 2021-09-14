package com.example.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.OrderComparator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/customers/{customerId}/orders")
    public List<Orders> getCustomerOrders(@PathVariable Long customerId){
        return orderService.getAllOrdersByCustId(customerId);
    }
    @RequestMapping("/customers/{customerId}/orders/{orderId}")
    public Orders getOrderDetails(@PathVariable Long orderId){
    return orderService.getAllOrders(orderId);
    }
    @RequestMapping(method= RequestMethod.POST,value="/customers/{customerId}/orders")
    public void addOrders(@RequestBody Orders order,@PathVariable Long customerId){
        orderService.addOrder(order);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}/orders/{orderId}")
    public void updateOrders(@RequestBody Orders order, @PathVariable Long customerId, @PathVariable Long orderId){
        orderService.updateOrder(order);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/customers/{customerId}/orders/{orderId}")
    public void deleteOrders(@PathVariable Long orderId){
        orderService.deleteOrder(orderId);
    }

}
