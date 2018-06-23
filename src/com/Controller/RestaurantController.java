package com.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.Menu;
import com.Service.MenuService;

/**
 * Servlet implementation class RestaurantController
 */
@WebServlet("/RestaurantController")
public class RestaurantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String action=request.getParameter("action");

		MenuService service=new MenuService();
		Menu menu=new Menu();
		
		System.out.println(action);
		
		
		
		
		if(action.equals("AddMenutodb")){
			RequestDispatcher rd=request.getRequestDispatcher("jsp/AddMenu.jsp");
			rd.forward(request, response);
		}
		
		if(action.equals("AddMenu")){
	
		menu.setMenuName(request.getParameter("menuname"));
		menu.setDescription(request.getParameter("menudescription"));
		menu.setCategory(request.getParameter("menucategory"));
		menu.setType(request.getParameter("type"));
		menu.setCost(Double.parseDouble(request.getParameter("menucost")));
		menu.setStatus("Available");
		
		boolean result=service.addMenuPage(menu);
		
		if(result==true){
			request.setAttribute("MenuId",menu.getMenuId());
		RequestDispatcher rd=request.getRequestDispatcher("jsp/Success.jsp");
		rd.forward(request, response);
		
		}
		}
		
		
		
		if(action.equals("ViewMenu")){
			
			
			ArrayList<Menu> menuList=service.viewMenu();
			request.setAttribute("MenuList",menuList);
			RequestDispatcher rd=request.getRequestDispatcher("jsp/ViewMenu.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}
