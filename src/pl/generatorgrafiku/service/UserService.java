package pl.generatorgrafiku.service;

import pl.generatorgrafiku.dao.DAOFactory;
import pl.generatorgrafiku.dao.UserDAO;
import pl.generatorgrafiku.model.User;

public class UserService {
	public void addUser(String username, String email, String password, String companyNip, String role) {
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setCompanyNip(companyNip);
		user.setRole(role);
		user.setIs_hired(true);
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		userDao.create(user);
	}
}
