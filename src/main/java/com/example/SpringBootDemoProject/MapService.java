package com.example.SpringBootDemoProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MapService {
	
	public static List<Item> loadItem() {
		List<Item> Itm = new ArrayList<Item>();
		Itm.add(new Item(1, "Pune"));
		Itm.add(new Item(2, "Nagpur"));
		return Itm;
	}

	List<Item> List = loadItem();
	public List<Item> getAllItems() {
		return List;
	}
	
	public String addItems(Item item) {
		List.add(item);
		return "Item added successfully";
	}

}
