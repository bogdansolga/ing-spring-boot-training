package com.ing.springboot.training.d02.s05.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(final DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Integer getProductsWithMinPrice(final int minPrice) {
        return jdbcTemplate.queryForObject("SELECT * FROM product WHERE price > ?", Integer.class, minPrice);
    }
}
