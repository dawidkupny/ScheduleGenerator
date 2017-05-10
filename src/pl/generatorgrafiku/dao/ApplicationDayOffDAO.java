package pl.generatorgrafiku.dao;

import java.util.List;

import pl.generatorgrafiku.model.ApplicationDayOff;

public interface ApplicationDayOffDAO extends GenericDAO<ApplicationDayOff, Long> {
	
	public List<ApplicationDayOff> getAllApplicationDayOffCompanyNip(String companyNip);
	
	public List<ApplicationDayOff> getApplicationDayOffMonthCompanyNip(String companyNip, String month);
}
