package com.inventoryapp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryapp.entity.Item;
import com.inventoryapp.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Item> getAllItems(){
		return this.inventoryService.getAllItems();
	}
	
}
