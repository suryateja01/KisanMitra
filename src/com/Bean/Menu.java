package com.Bean;

public class Menu {

	private String menuId; 
	private String menuName;
	private String description;
	private String category;
	private String type;
	private double cost;
	private String status;
	
	
	public Menu(String menuId, String menuName, String description,
			String category, String type, double cost, String status) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.description = description;
		this.category = category;
		this.type = type;
		this.cost = cost;
		this.status = status;
	}


	public String getMenuId() {
		return menuId;
	}


	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getType() {
		return type;
	}


	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
