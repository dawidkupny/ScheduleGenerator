package pl.generatorgrafiku.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.generatorgrafiku.model.ApplicationDayOff;
import pl.generatorgrafiku.model.ApplicationLeave;
import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.service.ApplicationDayOffService;
import pl.generatorgrafiku.service.ApplicationLeaveService;

@WebServlet("/readMonthAppli")
public class ReadMonthApplicationsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getUserPrincipal() != null && request.isUserInRole("admin") == true) {
			saveMonthApplicationsInRequest(request);
			request.getRequestDispatcher("WEB-INF/adminpage.jsp").forward(request, response);
		} else {
            response.sendError(403);
        }
	}
	
	private void saveMonthApplicationsInRequest(HttpServletRequest request) {
		User authenticatedUser = (User) request.getSession().getAttribute("user");
		String month = request.getParameter("inputMonth");
		ApplicationDayOffService applicationDayOffService = new ApplicationDayOffService();
		List<ApplicationDayOff> monthApplicationDayOff = applicationDayOffService.getApplicationDayOffMonthCompanyNip(authenticatedUser, month, 
				(d1, d2) -> d1.getDay().compareTo(d2.getDay()));
		ApplicationLeaveService applicationLeaveService = new ApplicationLeaveService();
		List<ApplicationLeave> monthApplicationsLeave = applicationLeaveService.getApplicationLeaveMonthCompanyNip(authenticatedUser, month, 
				(d1, d2) -> d1.getFirstDay().compareTo(d2.getFirstDay()));
		if(monthApplicationDayOff.isEmpty() && monthApplicationsLeave.isEmpty()) {
			String noResults = "Brak wyników";
			request.setAttribute("noneApplicationsDayOff", noResults);
		} else {
			request.setAttribute("applicationsDayOff", monthApplicationDayOff);
			request.setAttribute("applicationsLeave", monthApplicationsLeave);
		}
		
	}

}
