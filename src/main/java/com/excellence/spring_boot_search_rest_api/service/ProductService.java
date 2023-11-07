package com.excellence.spring_boot_search_rest_api.service;

import java.util.List;

import com.excellence.spring_boot_search_rest_api.entity.Product;

public interface ProductService {
	List<Product> searchProducts(String query);

	Product createProduct(Product product);
}
