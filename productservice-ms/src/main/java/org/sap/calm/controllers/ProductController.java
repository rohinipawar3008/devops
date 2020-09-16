package org.sap.calm.controllers;

import java.util.List;

import org.sap.calm.dao.ProductDaoService;
import org.sap.calm.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDaoService productDaoService;
	
	/*get all the products*/
	@GetMapping(value = "/products")
	private List<Product> findAllProducts(){
		return productDaoService.findAll();
	}
	
	/*get the product based on the product id*/
	@GetMapping(value = "/products/{id}")
	private Product retrieveProduct(@PathVariable int id){
		return productDaoService.findOne(id);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello() { 
		return new ResponseEntity<>("Hello World 123", HttpStatus.OK); 
	}

	@GetMapping("/test")
	public ResponseEntity<String> test() { 
		return new ResponseEntity<>("Hello World tester", HttpStatus.OK); 
	}
}
