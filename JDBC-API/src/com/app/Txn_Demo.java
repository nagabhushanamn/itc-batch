package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.db.MySQLConnection;
import com.app.model.Employee;

public class Txn_Demo {

	public static void main(String[] args) {

		Connection connection = null;

		try {

			connection = MySQLConnection.getConnection();
			connection.setAutoCommit(false);

			for (int i = 0; i < 10; i++) {

				Employee employee = new Employee();
				employee.setId(i + 30);
				employee.setName("dude-" + i);
				employee.setSalary(i * 100);

				// step-3 : create JDBC-statements
				String sql = "insert into itc.EMPLOYEES values(?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, employee.getId());
				ps.setString(2, employee.getName());
				ps.setDouble(3, employee.getSalary());

				if (i == 5) {
					//throw new RuntimeException();
				}

				// step-4 : Execute Statement and process result
				ps.execute();

			}
			connection.commit();

			System.out.println("all employees inserted...");

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
