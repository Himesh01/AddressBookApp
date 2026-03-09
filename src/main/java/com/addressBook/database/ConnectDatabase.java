package com.addressBook.database;
import java.sql.*;

public class ConnectDatabase {
	private static String url = "jdbc:mysql://localhost:3306/addressbook";
	private static String user = "root";
	private static String password = "Himesh@123";
	private static Connection con;
	
	public static Connection getConnection() throws SQLException{
		if(con == null || con.isClosed()) {
			con = DriverManager.getConnection(url,user,password);
		}
		return con;
	}
}
