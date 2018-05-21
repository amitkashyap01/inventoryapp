package com.inventoryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.inventoryapp.entity.Item;
import com.inventoryapp.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Item getItem(@PathVariable("id") int id){
		return itemService.getItem(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> deleteItem(@PathVariable("id") int id){
		 itemService.deleteItem(id);
		 
		 // Returning HTTP 204
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> addItem(@RequestBody Item item, UriComponentsBuilder ucBuilder){
		System.out.println("The value from request body: "+item);
		itemService.addItem(item);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/items/{itemId}").buildAndExpand(item.getItemid()).toUri());
		
		return new ResponseEntity<>(headers, HttpStatus.CREATED);

	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateItem(@RequestBody Item item){
		itemService.updateItem(item);
	}
	
}
