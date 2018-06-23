package com.Service;

import java.util.ArrayList;

import com.Bean.Menu;
import com.Dao.MenuDao;


public class MenuService {
	public MenuService() {
		super();
		// TODO Auto-generated constructor stub
	}


	MenuDao menudao= new MenuDao();
	public boolean addMenuPage(Menu menu){
	return	menudao.addMenuPage(menu);
	}
	
	
	public ArrayList<Menu> viewMenu(){
		return menudao.viewMenu();
	}

}
