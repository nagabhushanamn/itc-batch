package com.shop.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.Driver;
import com.shop.entity.Book;

public class InsertBook {

	public static void main(String[] args) {

		Book book = new Book();
		book.setIsbn("1111");
		book.setName("DUMMY");
		book.setPrice(500.00);
		book.setAuthor("Ria");

		// ----------------------------------

		// Using Hibernate API
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(book);
		
		
		session.getTransaction().commit();
		sessionFactory.close();

		System.out.println("New Book inserted..");
		
		

	}

}
