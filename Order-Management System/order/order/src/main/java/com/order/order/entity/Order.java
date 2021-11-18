package com.order.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "order_name")
	private String orderName;


	@Column(name = "amount")
	private String amount;

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	private Date orderDate=new Date(System.currentTimeMillis());

	
	
	public Order() {

	}

	public Order(String orderName, String amount) {
		super();
		this.orderName = orderName;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getAMount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
