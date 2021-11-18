package com.order.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.order.entity.Order;
import com.order.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;


public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
	

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	
	}

}
