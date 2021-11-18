package com.order.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.order.entity.Order;
import com.order.order.service.OrderService;

@CrossOrigin(origins = "http://localhost:4800")
@RestController
@RequestMapping("/api/v1/")
public class OrderController {

	@Autowired
	private OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping("/orders")
	public List<Order> getAllOrders() {

		return orderService.getAllOrders();

	}

	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.createOrder(order), HttpStatus.CREATED);
	}

}
