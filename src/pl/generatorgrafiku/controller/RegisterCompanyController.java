package pl.generatorgrafiku.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.service.CompanyService;
import pl.generatorgrafiku.service.UserService;

@WebServlet("/registerCompany")
public class RegisterCompanyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.sendRedirect(request.getContextPath() + "/");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String companyName = request.getParameter("inputCompany");
		String nip = request.getParameter("inputNip");
		String firstName = request.getParameter("inputFirstName");
		String lastName = request.getParameter("inputLastName");
		CompanyService companyService = new CompanyService();
		companyService.addCompany(nip, companyName);
		String email = request.getParameter("inputEmail");
		String username = request.getParameter("inputUsername");
		String password = request.getParameter("inputPassword");
		String role = "admin";
		UserService userService = new UserService();
		userService.addUser(username, firstName, lastName, email, password, nip, role);
		request.getRequestDispatcher("WEB-INF/afterregister.jsp").forward(request, response);
	}

}
