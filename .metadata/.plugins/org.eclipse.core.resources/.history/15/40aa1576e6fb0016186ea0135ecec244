package com.shop.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import com.shop.entity.Book;

public class DeleteBook {

	public static void main(String[] args) throws SQLException {

		// ----------------------------------

		// Using JDBC API

		// step-1
		DriverManager.registerDriver(new Driver());

		// step-2
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, user, password);

		// step-3
		String sql = "delete from books where isbn=?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, "1111");

		ps.execute();

		// step-4
		con.close();

		System.out.println(" Book deleted..");

	}

}
