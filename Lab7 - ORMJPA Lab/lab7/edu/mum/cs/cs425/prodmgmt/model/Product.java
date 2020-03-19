package edu.mum.cs.cs425.prodmgmt.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="PRODUCTS")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private Long productNumber;
	private String name;
	private Float unitPrice;
	@Temporal(TemporalType.DATE)
	private Date dateMfd;
	
	
	
	public Product() {
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Long productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getDateMfd() {
		return dateMfd;
	}
	public void setDateMfd(Date dateMfd) {
		this.dateMfd = dateMfd;
	}
	
	

}
