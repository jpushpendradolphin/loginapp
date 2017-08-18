package com.pusp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pusp.db.LogginConnection;

public class LoginServiceIImpl implements LoginServiceI {
	private Connection conn = null;
	LogginConnection loginConn = null;
	String query = "select * from users where u_name = ? and u_pass = ?";
	public LoginServiceIImpl() throws Exception{
		loginConn = new LogginConnection();
	}
	public boolean validateUser(String uname, String pass) throws Exception{
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
