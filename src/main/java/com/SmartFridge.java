package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import beans.Item;

public class SmartFridge {

	private List<Item> items;
	
	public SmartFridge() {
		super();
		items = new ArrayList<>();
	}

	public synchronized void addItem(Item item) {
		item.setId(items.size());
		items.add(item);
	}
	
	public synchronized void removeItem(Item item) {
		items.remove(item);
	}

	public List<Item> getItems() {
		return items;
	}
	
	//this should be a Cron Job in real life
	public synchronized void removeExpiredItems() {
		items = items.parallelStream()
				.filter(item -> !item.isExpired())
				.collect(Collectors.toList());
	}

}
