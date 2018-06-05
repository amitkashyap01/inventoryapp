package com.inventoryapp.dao;

import org.springframework.stereotype.Repository;

import com.inventoryapp.entity.Item;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{
	Optional<?> findByItemName(String itemName);
}
