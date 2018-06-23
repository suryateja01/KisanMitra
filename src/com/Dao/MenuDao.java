package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Bean.Menu;
import com.Util.DbUtil;

public class MenuDao {
	
	
	
	public boolean addMenuPage(Menu menu){
		int id=0; 
	try{	Connection con=DbUtil.getConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select Menusequence_1358296.nextval from dual");
		
		
		while (rs.next()){
			
			id= rs.getInt("NEXTVAl");
			
		}
	menu.setMenuId("MENU_"+""+id );
	
		PreparedStatement pst= con.prepareStatement("insert into Menu_1358296 values(?,?,?,?,?,?,?)");
		pst.setString(1,menu.getMenuId());
		pst.setString(2,menu.getMenuName());
		pst.setString(3,menu.getDescription());
		pst.setString(4,menu.getCategory());
		pst.setString(5,menu.getType());
		pst.setDouble(6,menu.getCost());
		pst.setString(7, menu.getStatus());
		
		int result= pst.executeUpdate();
		if(result==1){
			return true;
		}
				
	}catch(SQLException e){e.printStackTrace();}
	return false;
		
	}
	
	
	
	public MenuDao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ArrayList<Menu> viewMenu(){
		ArrayList<Menu> menulist=new ArrayList<Menu>();

		try{
		Connection con=DbUtil.getConnection();
		if(con!=null){
			System.out.println("Connection Establlshed");
			
		}
		
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select * from Menu_1358296");
		 while(rs.next()){
				Menu menu=new Menu();
			menu.setMenuId(rs.getString("MENUID"));
			menu.setMenuName(rs.getString("MENUNAME"));
			menu.setDescription(rs.getString("DESCRIPTION"));
			menu.setCategory(rs.getString("CATEGORY"));
			menu.setType(rs.getString("TYPE"));
			menu.setCost(rs.getDouble("COST"));
			menu.setStatus(rs.getString("STATUS"));
			menulist.add(menu);
			
			
		 }
		
		
		
		
		}catch(SQLException e){e.printStackTrace();}
		return menulist;
	}
	
	
	

}
