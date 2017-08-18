package com.pusp.db;

import java.sql.DriverManager;

import org.apache.log4j.Logger;

import java.sql.Connection;

public class LogginConnection {
	final static Logger logger = Logger.getLogger(LogginConnection.class);
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "chetak";
	private String pass = "chetak";
	private static Connection conn = null;
	
	public LogginConnection() throws Exception{
		logger.info("driverClass : "+driverClass+" url: "+url+" user: "+user+" password: "+pass);
		Class.forName(driverClass);
		conn = DriverManager.getConnection(url, user, pass);
		logger.info("Connection : "+conn);
	}
	public static Connection getLoginConnection(){
		return conn;
	}
}
