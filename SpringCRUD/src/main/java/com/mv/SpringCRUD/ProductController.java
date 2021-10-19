package com.mv.SpringCRUD;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

//THIS CONTROLLER CLASS CALLS THE SERVICE METHODS AND PASSES USER PARAMETERS TO THE RESPECTIVE HTTP-MAPPED METHODS

@RestController
public class ProductController
{
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	private List<Product> getAll()
	{
		return service.listAll();
	}
	
	@GetMapping("/products/{id}")
	private Product get(@PathVariable("id") int id)
	{
		return service.get(id);
	}
	
	@PostMapping("/products")
	private void add(@RequestBody Product product)
	{
		service.save(product);
	}
	
	@PutMapping("/products/{id}")
	private void update(@RequestBody Product product, @PathVariable("id") int id)
	{
		service.save(product);
	}
	
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable("id") int id) {
	    service.delete(id);
	}
}
