package com.inventoryapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventoryapp.entity.Item;
import com.inventoryapp.dao.ItemRepository;


@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<Item>();
		itemRepository.findAll()
						.forEach(items:: add);
		return items;
	}

	public Item getItem(int itemId){
		return itemRepository.findById(itemId).get();
	}
	
	
	public void addItem(Item item){
		itemRepository.save(item);
	}
	
	public void updateItem(Item item){
		itemRepository.save(item);
	}
	
	public void deleteItem(int itemId){
		itemRepository.deleteById(itemId);
	}
	
	
}
