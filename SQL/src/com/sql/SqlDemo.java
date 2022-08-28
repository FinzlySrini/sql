package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.out.println("1");
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("2");
	Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/emp", "root", "1234");
	System.out.println("3");
	Statement stmt = con.createStatement();
}
}
