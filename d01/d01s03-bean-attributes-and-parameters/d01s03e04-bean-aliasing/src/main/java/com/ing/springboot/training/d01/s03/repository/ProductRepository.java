package com.ing.springboot.training.d01.s03.repository;

import com.ing.spring.training.domain.bootstrap.ProductsSetup;
import com.ing.spring.training.domain.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * A simple product repository
 *
 * @author bogdan.solga
 */
@Repository
public class ProductRepository {

    private List<Product> products = ProductsSetup.getRandomProducts();

    public void displayProducts() {
        System.out.println("Displaying all the available products:");
        products.forEach(product -> System.out.println("\t" + product));
    }
}
