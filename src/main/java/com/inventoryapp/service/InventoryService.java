package com.inventoryapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryapp.dao.InventoryDao;
import com.inventoryapp.entity.Item;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;

	public Collection<Item> getAllItems(){
		return this.inventoryDao.getAllItems();
	}
	
}
