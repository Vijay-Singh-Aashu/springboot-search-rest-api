package com.excellence.spring_boot_search_rest_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.excellence.spring_boot_search_rest_api.entity.Product;
import com.excellence.spring_boot_search_rest_api.repository.ProductRepository;
import com.excellence.spring_boot_search_rest_api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> searchProducts(String query) {
		List<Product> products = productRepository.searchProductsSQL(query);
		return products;
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
}
