package org.simplilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int id;
	
	@ManyToMany
	@JoinColumn(name = "User_id")
	private int userId;
	
	@ManyToMany
	@JoinColumn(name = "shoe_id")
	private int shoeId;
	
	@Column(name = "date")
	private String date;
	
	public OrderDetails() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getShoeId() {
		return shoeId;
	}
	
	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return String.format("OrderDetails [id=%s, userId=%s, shoeId=%s, date=%s]", id, userId, shoeId, date);
	}
	
	
}
