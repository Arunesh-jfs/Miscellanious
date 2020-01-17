package com.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Application {
	
	static SessionFactory sessionFactory= null;
	
	public static void main(String[] args) {
		setUpSessionFactory();
		
		//CRUD FUNCTION
		//createProduct();
		//updateProduct();
		deleteProduct();
		readProduct();
		
		
	}

	private static void setUpSessionFactory() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	private static void createProduct() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product();
		product.setProductId(03);
		product.setProductName("Hoho");
//		product.setProductId(02);
//		product.setProductName("Hehe");
		session.save(product);
		transaction.commit();
		
	}

	private static void readProduct() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query selectQuery = session.createQuery("from Product");
		List<Product> products= (List<Product>)selectQuery.list();
		for(Product product: products) {
			System.out.println(product);
		}
		transaction.commit();
	}

	private static void updateProduct() {
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Product product = (Product)session.get(Product.class,01);
		product.setProductName("Heha");
		transaction.commit();
	}

	private static void deleteProduct() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product = (Product)session.get(Product.class, 02);
		product.setProductName("Haha");
		session.delete(product);
		transaction.commit();
	}
}