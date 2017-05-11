package pl.generatorgrafiku.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.service.ApplicationDayOffService;


@WebServlet("/appliDay")
public class ApplicationDayOffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getUserPrincipal() != null && request.isUserInRole("user") == true) {
			request.getRequestDispatcher("WEB-INF/userpage.jsp").forward(request, response);
		} else {
            response.sendError(403);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String dayStr = request.getParameter("inputDay");
		java.sql.Date day = java.sql.Date.valueOf(dayStr);
		String reason = request.getParameter("inputReason");
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		if(request.getUserPrincipal() != null) {
			ApplicationDayOffService applicationDayService = new ApplicationDayOffService();
			applicationDayService.addApplicationDayOff(day, reason, authenticatedUser);
			request.getRequestDispatcher("WEB-INF/applisuccess.jsp").forward(request, response);
		} else {
			response.sendError(403);
		}
		
	}

}
