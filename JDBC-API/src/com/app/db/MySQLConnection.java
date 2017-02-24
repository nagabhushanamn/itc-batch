package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MySQLConnection {

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		// 1. register driver with JDBC API
		DriverManager.registerDriver(new Driver());
		// 2. create connection
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "root";
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
