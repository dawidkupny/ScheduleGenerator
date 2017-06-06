package pl.generatorgrafiku.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.service.UserService;

@WebServlet("/generateSchedule")
public class GenerateScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getUserPrincipal() != null && request.isUserInRole("admin") == true) {
			request.getRequestDispatcher("WEB-INF/adminpage.jsp").forward(request, response);
		} else {
            response.sendError(403);
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String monthStr = request.getParameter("inputMonthScheduler");
		String[] checkboxName = request.getParameterValues("checkboxName");
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		UserService userService = new UserService();
		List<User> users = userService.getAllUsersByNip(authenticatedUser, (u1, u2) -> u1.getUsername().compareTo(u2.getUsername()));
		
		System.out.println(monthStr);
		for(String c : checkboxName) {
			System.out.println(c);
		}
		for(User u : users) {
			System.out.println(u);
		}
	}

}
