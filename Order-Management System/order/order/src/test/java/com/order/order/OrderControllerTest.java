package com.order.order;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.order.order.controller.OrderController;
import com.order.order.entity.Order;
import com.order.order.repository.OrderRepository;
import com.order.order.service.OrderService;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;
    
    @Autowired
	private OrderService orderService;
    
    @MockBean
    OrderRepository orderRepository;
    
    public void testGetAllOrders()throws Exception{
    	List<Order> orders = new ArrayList<>();
    	orders.add(new Order("Burger","50"));
    	orders.add(new Order("Cake","500"));
    	orders.add(new Order("Sandwich","100"));
    	
    	Mockito.when(orderRepository.findAll()).thenReturn(orders);
    	
    	try {
			orderService.createOrder(new Order("Burger","50"));
		}
		catch (Exception exc) {
			System.out.println("Test Failed");
		}
    
    }
    
 


}
