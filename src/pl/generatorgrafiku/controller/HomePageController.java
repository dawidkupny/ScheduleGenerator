package pl.generatorgrafiku.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class HomePageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getUserPrincipal() != null && request.getSession().getAttribute("user") !=null) {
			if(request.isUserInRole("admin") == true) {
				request.getRequestDispatcher("WEB-INF/adminpage.jsp").forward(request, response);;
			} else if(request.isUserInRole("user") == true){
				request.getRequestDispatcher("WEB-INF/userpage.jsp").forward(request, response);;
			}
		} else {
			request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
		}
	}
}
