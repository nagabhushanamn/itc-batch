package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.db.MySQLConnection;
import com.app.model.Employee;

public class EmployeeDAO {

	// CRUD ( Create , Retrieve , Update , Delete )

	public void save(Employee employee) {

		Connection connection = null;

		try {
			connection = MySQLConnection.getConnection();

			// step-3 : create JDBC-statements
			String sql = "insert into itc.EMPLOYEES values(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());

			// step-4 : Execute Statement and process result
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
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

	public void update(int id, double salary) {

		Connection connection = null;

		try {
			connection = MySQLConnection.getConnection();

			// step-3 : create JDBC-statements
			String sql = "update itc.EMPLOYEES set salary=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, salary);
			ps.setInt(2, id);

			// step-4 : Execute Statement and process result
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
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

	public List<Employee> findAll() {

		Connection connection = null;
		List<Employee> employees = new ArrayList<>();

		try {
			connection = MySQLConnection.getConnection();

			String sql = "select * from itc.Employees";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));

				employees.add(employee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
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

		return employees;
	}

	public Employee find(int id) {

		Connection connection = null;
		Employee employee = null;

		try {
			connection = MySQLConnection.getConnection();

			String sql = "select * from itc.Employees where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			rs.next();

			employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getDouble(3));

		} catch (SQLException e) {
			e.printStackTrace();
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

		return employee;

	}

	public void delete(int id) {

		Connection connection = null;

		try {
			connection = MySQLConnection.getConnection();

			String sql = "delete from itc.Employees where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
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

	public List<Employee> findBySalary(double salary) {

		Connection connection = null;
		List<Employee> employees = new ArrayList<>();

		try {
			connection = MySQLConnection.getConnection();

			String sql = "select * from itc.Employees where salary > " + salary;
			PreparedStatement ps = connection.prepareStatement(sql);
			// ps.setDouble(1, salary);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));

				employees.add(employee);

			}

		} catch (SQLException e) {
			e.printStackTrace();
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

		return employees;

	}

}
