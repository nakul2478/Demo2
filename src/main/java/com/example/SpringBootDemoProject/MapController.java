package com.example.SpringBootDemoProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MapController {
@Autowired
MapService service;

@GetMapping("/getAllItems")
public List<Item> getAllItems(){
	return service.getAllItems();
}

@PostMapping("/addItems")
public String addItems(@RequestBody Item item) {
	return service.addItems(item);
}
}  
