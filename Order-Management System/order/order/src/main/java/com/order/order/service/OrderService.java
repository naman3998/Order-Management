package com.order.order.service;

import java.util.List;

import com.order.order.entity.Order;

public interface OrderService {
	List<Order> getAllOrders();
	Order createOrder(Order order);
}

