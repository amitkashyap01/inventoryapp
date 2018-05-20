package com.inventoryapp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table (name="item")
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemid;
	
	private String itemName;
	
	private float itemPrice;
	
	private String itemCategory;
	
	@javax.persistence.Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date itemLastUpdated;
	
	public Item(){
		
	}
	
	public Item(int itemid, String itemName, float itemPrice, String itemCategory, Date itemLastUpdated) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
		this.itemLastUpdated = itemLastUpdated;
	}

	public Date getItemLastUpdated() {
		return itemLastUpdated;
	}

	public void setItemLastUpdated(Date itemLastUpdated) {
		this.itemLastUpdated = itemLastUpdated;
	}

	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	
	
}
