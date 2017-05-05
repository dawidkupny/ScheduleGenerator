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
	
	public User getUserById(long userId) {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		User user = userDao.read(userId);
		return user;
	}
	
	public User getUserByUsername(String username) {
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		User user = userDao.getUserByUsername(username);
		return user;
	}
}
