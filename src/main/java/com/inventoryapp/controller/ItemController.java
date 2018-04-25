package com.inventoryapp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.inventoryapp.dao.ItemRepository;
import com.inventoryapp.entity.Item;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Iterable<Item> getAllItems(){
		return itemRepository.findAll();
	}
	
	/*
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Item getItem(@PathVariable("id") Integer id){
		return itemRepository.findOne(id);
	}
	*/
	
}
