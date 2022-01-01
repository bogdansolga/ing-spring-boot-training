package com.ing.springboot.training.d02.s05.repository;

import com.ing.spring.training.jpa.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
