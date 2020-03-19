package edu.mum.cs.cs425.lab8.task3.service;

import java.util.List;

import edu.mum.cs.cs425.lab8.task3.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product save(Product product);
}
