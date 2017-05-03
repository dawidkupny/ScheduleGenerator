package pl.generatorgrafiku.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.service.UserService;

@WebServlet("/registerUser")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("adminpage.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("inputEmail");
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		String nip = request.getParameter("inputNip");
		String role = "user";
		UserService userService = new UserService();
		userService.addUser(username, email, password, nip, role);
		response.sendRedirect(request.getContextPath()+"/afterregister.jsp");
	}

}
