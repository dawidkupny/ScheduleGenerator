package pl.generatorgrafiku.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "/";
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			request.login(username, password);
		} catch(Exception e) {
			response.sendRedirect(request.getContextPath()+page);
			return;
		}
		if(request.getUserPrincipal() != null && request.isUserInRole("admin") == true) {
			page="WEB-INF/adminpage.jsp";
		} if(request.getUserPrincipal() != null && request.isUserInRole("user") == true) {
			page="WEB-INF/userpage.jsp";
		} if(request.getUserPrincipal() != null) {
			request.getRequestDispatcher(page).forward(request, response);;
		} else	{
			response.sendError(403);
		}
	}

}
