package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static Connection con=null;
	public static Connection getConnection(){
		
	 try {
		Class.forName(Constants.driver);
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
//		e1.printStackTrace();
	}
	 try {
		con =DriverManager.getConnection(Constants.url,Constants.username,Constants.password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
		return con;
	}

}
