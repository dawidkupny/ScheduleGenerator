package pl.generatorgrafiku.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.service.ApplicationLeaveService;

@WebServlet("/appliLeave")
public class ApplicationLeaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getUserPrincipal() != null) {
			request.getRequestDispatcher("/index.jsp").forward(request, response); //??
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String firstDayStr = request.getParameter("inputFirstDay");
		java.sql.Date firstDay = java.sql.Date.valueOf(firstDayStr);
		String lastDayStr = request.getParameter("inputLastDay");
		java.sql.Date lastDay = java.sql.Date.valueOf(lastDayStr);
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		if(request.getUserPrincipal() != null) {
			ApplicationLeaveService applicationLeaveService = new ApplicationLeaveService();
			applicationLeaveService.addApplicationLeave(firstDay, lastDay, authenticatedUser);
			response.sendRedirect(request.getContextPath()+"/index.jsp");  //mozna uzupelnic o informacje np dodatkowa strone, twoj wniosek zostal przeslany kliknij by wrocic na strone..
		} else {
			response.sendError(403);
		}
	}

}
