package com.cognizant.orderservice.service;

import com.cognizant.orderservice.entity.Order;
import com.cognizant.orderservice.feign.UserClient;
import com.cognizant.orderservice.model.User;
import com.cognizant.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order) {

        User user = userClient.getUserById(order.getUserId());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        return orderRepository.save(order);
    }
}