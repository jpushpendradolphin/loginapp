package com.pusp.db;

import java.sql.DriverManager;
import java.sql.Connection;

public class LogginConnection {
	private String driverClass = "orcale.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "chetsk";
	private String pass = "chetak";
	private Connection conn = null;
	
	public LogginConnection() throws Exception{
		Class.forName(driverClass);
		conn = DriverManager.getConnection(url, user, pass);
	}
	public static Connection getLoginConnection(){
		return conn;
	}
}
