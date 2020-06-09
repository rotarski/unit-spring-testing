package com.example.demo.unittesting.business;

import org.springframework.stereotype.Component;

import com.example.demo.unittesting.model.Item;

@Component
public class ItemBusinessService {

	public Item retrieveHarcodedItem() {
		
		return new Item(1, "Ball", 10, 100);
	}

		
}
