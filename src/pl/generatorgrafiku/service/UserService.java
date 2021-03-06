package pl.generatorgrafiku.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.List;

import pl.generatorgrafiku.dao.DAOFactory;
import pl.generatorgrafiku.dao.UserDAO;
import pl.generatorgrafiku.model.User;

public class UserService {
	public void addUser(String username, String firstName, String lastName, String email, String password, String companyNip, String role) {
		User user = new User();
		user.setUsername(username);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		String md5Pass = encryptPassword(password);
		user.setPassword(md5Pass);
		user.setCompanyNip(companyNip);
		user.setRole(role);
		user.setIs_hired(true);
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		userDao.create(user);
	}
	
	private String encryptPassword(String password) {
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		digest.update(password.getBytes());
		String md5Password = new BigInteger(1, digest.digest()).toString(16);
		return md5Password;
	}
	
	public void addUserByAdmin(String username, String firstName, String lastName, String email, String password, User adminUser, String role) {
		String nip = adminUser.getCompanyNip();
		addUser(username, firstName, lastName, email, password, nip, role);
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
	
	public List<User> getAllUsersByNip() {
		return getAllUsersByNip(null, null);
	}
	
	public List<User> getAllUsersByNip(User user, Comparator<User> comparator) {
		String companyNip = user.getCompanyNip();
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		List<User> Allusers = userDao.getUserByNip(companyNip);
		if(comparator != null && Allusers!=null) {
			Allusers.sort(comparator);
		}
		return Allusers;
	}
}
