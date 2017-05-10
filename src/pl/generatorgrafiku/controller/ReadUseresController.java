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

@WebServlet("/readUsers")
public class ReadUseresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveAllUsersInRequest(request);
		request.getRequestDispatcher("adminpage.jsp").forward(request, response);
	}

	private void saveAllUsersInRequest(HttpServletRequest request) {
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		UserService userService = new UserService();
		List<User> users = userService.getAllUsersByNip(authenticatedUser, (u1, u2) -> u1.getUsername().compareTo(u2.getUsername()));
		if(users.isEmpty()) {
			String noResults = "Brak pracowników";
			request.setAttribute("noUsers", noResults);
		} else {
			request.setAttribute("allUsers", users);
		}
	}

}
