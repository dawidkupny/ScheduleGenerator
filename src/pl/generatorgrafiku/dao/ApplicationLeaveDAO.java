package pl.generatorgrafiku.dao;

import pl.generatorgrafiku.model.ApplicationLeave;

public interface ApplicationLeaveDAO extends GenericDAO<ApplicationLeave, Long> {
	
	public ApplicationLeave getApplicationLeaveByUserIdCompanyNip(long userId, String companyNip);

}
