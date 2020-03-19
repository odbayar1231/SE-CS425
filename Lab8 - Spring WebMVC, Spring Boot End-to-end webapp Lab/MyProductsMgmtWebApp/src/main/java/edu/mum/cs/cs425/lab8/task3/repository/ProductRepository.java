package edu.mum.cs.cs425.lab8.task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.lab8.task3.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
