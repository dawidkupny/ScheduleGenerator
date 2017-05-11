package pl.generatorgrafiku.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.service.UserService;

@WebServlet("/registerUser")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USER_ROLE = "user";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("inputEmail");
		String firstName = request.getParameter("inputFirstName");
		String lastName = request.getParameter("inputLastName");
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		UserService userService = new UserService();
		userService.addUserByAdmin(username, firstName, lastName, email, password, authenticatedUser, USER_ROLE);
		request.getRequestDispatcher("WEB-INF/afterregister.jsp").forward(request, response);
	}

}
