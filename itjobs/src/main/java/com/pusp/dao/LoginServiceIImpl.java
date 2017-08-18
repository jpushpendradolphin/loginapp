package com.pusp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.pusp.db.LogginConnection;

public class LoginServiceIImpl implements LoginServiceI {
	final static Logger logger = Logger.getLogger(LoginServiceIImpl.class);
	private Connection conn = null;
	LogginConnection loginConn = null;
	String query = "select * from users where u_name = ? and u_pass = ?";
	public LoginServiceIImpl() throws Exception{
		loginConn = new LogginConnection();
	}
	public boolean validateUser(String uname, String pass) throws Exception{
		logger.debug("user :"+uname +" password : "+pass);
		boolean response = false;
		response = getLoginStatus(uname,pass);
		return response;
		
	}
	private boolean getLoginStatus(String uname, String pass) throws SQLException{
		boolean msg = false;
		conn  = LogginConnection.getLoginConnection();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, uname);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			msg = true;
		return msg;
	}

}
