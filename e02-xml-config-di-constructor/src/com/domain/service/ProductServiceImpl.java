package com.domain.service;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository = null;
    
    //CONSTRUCTOR BASED DEPENDENCY INJECTION
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getProductsFromService() {
		return productRepository.getProductsFromRepository();

}
}
