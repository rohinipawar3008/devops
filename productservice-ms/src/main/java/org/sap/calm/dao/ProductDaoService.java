package org.sap.calm.dao;

import java.util.ArrayList;
import java.util.List;

import org.sap.calm.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoService {

	private static List<Product> products	 = new ArrayList<>();
	
	static {
		products.add(new Product(101, "Apple"));
		products.add(new Product(102, "Samsung"));
		products.add(new Product(103, "Karbon"));
		products.add(new Product(104, "Nokia"));
		products.add(new Product(105, "OnePlus"));
		products.add(new Product(106, "HTC"));
	}
	
	public  List<Product> findAll(){
		return products;
	}
	
	public  Product findOne(int id){
		for (Product product: products) {
			if (product.getProductId()==id) {
				return product;
			}
		}
		return null;
	}
	
	public Product save(Product product) {
		
		/*
		 * if(product.getProductId() = null) { product.setProductId(++ productsCount); }
		 */
		 
		products.add(product);
		return product;
	}
	
}
