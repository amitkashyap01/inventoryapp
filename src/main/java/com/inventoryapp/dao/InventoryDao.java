package com.inventoryapp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inventoryapp.entity.Item;

@Repository
public class InventoryDao {

	private static Map<Integer, Item> items;

	static {
		items = new HashMap<Integer, Item>();
		items.put(1, new Item(1, "Bajaj CFL 15W", 112, "CFL"));
		items.put(2, new Item(2, "Bajaj CFL 20W", 180, "CFL"));
		items.put(3, new Item(3, "Bajaj Bulb", 11, "Bulb"));
	};
	
	
	public Collection<Item> getAllItems(){
		return this.items.values();
	}
	
	
}


