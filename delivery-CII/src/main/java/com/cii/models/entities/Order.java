package com.cii.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="Order")
@Entity
public class Order implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name= "idOrder")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional= false)
	
	private Long id_order;
	
	@Column(name="dateOrder")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Calendar dateOrder;
	
	@Column(name="stateOrder")
	private String stateOrder;
	
	@Column(name="iva")
	private double iva;
	
	@Column(name="total")
	private double total;
	
	public Order() {
		super();
	}

	public Order(Long id_order) {
		super();
		this.id_order = id_order;
	}

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public Calendar getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Calendar dateOrder) {
		this.dateOrder = dateOrder;
	}

	public String getStateOrder() {
		return stateOrder;
	}

	public void setStateOrder(String stateOrder) {
		this.stateOrder = stateOrder;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	


}
