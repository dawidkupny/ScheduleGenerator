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
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "/";
		if(request.getUserPrincipal() != null && request.isUserInRole("admin") == true) {
			page="/adminpage.jsp";
		} if(request.getUserPrincipal() != null && request.isUserInRole("user") == true) {
			page="/userpage.jsp";
		} if(request.getUserPrincipal() != null) {
			response.sendRedirect(request.getContextPath()+page);
		} else	{
			response.sendError(403);
		}
	}

}
