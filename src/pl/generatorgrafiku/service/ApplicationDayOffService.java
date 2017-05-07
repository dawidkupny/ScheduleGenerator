package pl.generatorgrafiku.service;

import java.sql.Date;
import java.util.Comparator;
import java.util.List;

import pl.generatorgrafiku.dao.ApplicationDayOffDAO;
import pl.generatorgrafiku.dao.DAOFactory;
import pl.generatorgrafiku.model.ApplicationDayOff;
import pl.generatorgrafiku.model.User;

public class ApplicationDayOffService {
	public void addApplicationDayOff(Date day, String reason, User user) {
		ApplicationDayOff applicationDay = createApplicationDayOffObject(day, reason, user);
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplicationDayOffDAO applicationDayDao = factory.getApplicationDayOffDAO();
		applicationDayDao.create(applicationDay);
	}
	
	private ApplicationDayOff createApplicationDayOffObject(Date day, String reason, User user) {
		ApplicationDayOff applicationDay = new ApplicationDayOff();
		applicationDay.setDay(day);
		applicationDay.setReason(reason);
		User userCopy = new User(user);
		applicationDay.setUser(userCopy);
		applicationDay.setUserCompanyNip(userCopy.getCompanyNip());
		return applicationDay;
	}
	
	public List<ApplicationDayOff> getAllApplicationDayOffByCompanyNip() {
		return getAllApplicationDayOffByCompanyNip(null, null);
	}
	
	public List<ApplicationDayOff> getAllApplicationDayOffByCompanyNip(User user, Comparator<ApplicationDayOff> comparator) {
		String companyNip = user.getCompanyNip();
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplicationDayOffDAO applicationDayDao = factory.getApplicationDayOffDAO();
		List<ApplicationDayOff> applicationDay = applicationDayDao.getAllApplicationDayOffCompanyNip(companyNip);
		if(comparator != null && applicationDay!=null) {
			applicationDay.sort(comparator);
		}
		return applicationDay;
	}
}
