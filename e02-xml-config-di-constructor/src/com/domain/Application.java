package com.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Product;
import com.domain.service.ProductService;

public class Application {
	public static void main(String[] args) {
	ProductService productService = null;
	
	//TRADITIONAL HARD CODED INSTANCES
	//productRepository = new LocalProductRepository();
	//productRepository = new com.domain.repository.LocalProductRepository();
	//productRepository = new CloudProductRepository();
	
	//USING SPRING FRAMEWORK : INVERSION OF CONTROL
	//Creating the IOC Container and configuring the spring beans
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	productService = applicationContext.getBean("productService",ProductService.class);
	List <Product> products = productService.getProductsFromService();
	System.out.println(products);
	
	}
}
