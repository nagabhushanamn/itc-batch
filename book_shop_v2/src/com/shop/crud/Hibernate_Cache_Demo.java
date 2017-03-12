package com.shop.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import com.mysql.jdbc.Driver;
import com.shop.entity.Book;

public class Hibernate_Cache_Demo {

	public static void main(String[] args) throws SQLException {

		/*
		 *  Hibernate - Cache
		 *  
		 *  1. First-Level / Session Cache
		 *  
		 *  2. Second-Level / SessionFactory
		 * 
		 * 
		 */


		// Using Hibernate API
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();

		// User-1
		//---------------------------------------------------
		Session session=sessionFactory.openSession();
		Book book=session.get(Book.class, "54321");
		book=null;
		//book=session.get(Book.class, "54321");
		session.close();
		//--------------------------------------------------
		
		System.out.println("--------------------------------");
		
		// User-2
		//---------------------------------------------------
		session=sessionFactory.openSession();
		book=session.get(Book.class, "54321");
		session.close();
		//--------------------------------------------------
		
		sessionFactory.close();
		

	}

}