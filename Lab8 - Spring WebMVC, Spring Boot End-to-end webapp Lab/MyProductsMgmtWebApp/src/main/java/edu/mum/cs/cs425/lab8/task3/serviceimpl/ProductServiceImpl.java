package edu.mum.cs.cs425.lab8.task3.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.lab8.task3.model.Product;
import edu.mum.cs.cs425.lab8.task3.repository.ProductRepository;
import edu.mum.cs.cs425.lab8.task3.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepopsitory;

	@Override
	public List<Product> findAll() {
		return productRepopsitory.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepopsitory.save(product);
	}

}
