package com.cii.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="OrderDetail")
@Entity
public class OrderDetail implements Serializable{
	
	private static final long serialVersionUID=1L;
	@Id
	@Column(name= "id_orderDetail")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional= false)
	
	private Long id_orderDetail;
	

	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="subtotal")
	private double subtotal;

	public OrderDetail() {
		super();
	}

	public OrderDetail(Long id_orderDetail) {
		super();
		this.id_orderDetail = id_orderDetail;
	}

	public Long getId_orderDetail() {
		return id_orderDetail;
	}

	public void setId_orderDetail(Long id_orderDetail) {
		this.id_orderDetail = id_orderDetail;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	

}
