package pl.generatorgrafiku.dao;

import pl.generatorgrafiku.model.ApplicationDayOff;

public interface ApplicationDayOffDAO extends GenericDAO<ApplicationDayOff, Long> {
	
	public ApplicationDayOff getApplicationDayOffByUserIdCompanyNip(long userId, String companyNip);
}
