package com.mySqlDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/glosysAutomation";
	private static final String userName = "root";
	private static final String password = "root";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, userName, password);
	}
}
