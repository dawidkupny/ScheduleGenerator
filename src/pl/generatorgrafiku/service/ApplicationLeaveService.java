package pl.generatorgrafiku.service;

import java.sql.Date;
import java.util.Comparator;
import java.util.List;

import pl.generatorgrafiku.dao.ApplicationLeaveDAO;
import pl.generatorgrafiku.dao.DAOFactory;
import pl.generatorgrafiku.model.ApplicationLeave;
import pl.generatorgrafiku.model.User;

public class ApplicationLeaveService {
	public void addApplicationLeave(Date firstDay, Date lastDay, User user) {
		ApplicationLeave applicationLeave = createApplicationLeaveObject(firstDay, lastDay, user);
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplicationLeaveDAO applicationLeaveDao = factory.getApplicationLeaveDAO();
		applicationLeaveDao.create(applicationLeave);
	}
	
	private ApplicationLeave createApplicationLeaveObject(Date firstDay, Date lastDay, User user) {
		ApplicationLeave applicationLeave = new ApplicationLeave();
		applicationLeave.setFirstDay(firstDay);
		applicationLeave.setLastDay(lastDay);
		User userCopy = new User(user);
		applicationLeave.setUser(userCopy);
		applicationLeave.setUserCompanyNip(userCopy.getCompanyNip());
		return applicationLeave;
	}
	
	public List<ApplicationLeave> getAllApplicationLeaveByCompanyNip() {
		return getAllApplicationLeaveByCompanyNip(null, null);
	}
	
	public List<ApplicationLeave> getAllApplicationLeaveByCompanyNip(User user, Comparator<ApplicationLeave> comparator) {
		String companyNip = user.getCompanyNip();
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplicationLeaveDAO applicationLeaveDao = factory.getApplicationLeaveDAO();
		List<ApplicationLeave> applicationLeave = applicationLeaveDao.getAllApplicationLeaveCompanyNip(companyNip);
		if(comparator != null && applicationLeave!=null) {
			applicationLeave.sort(comparator);
		}
		return applicationLeave;
	}
}
