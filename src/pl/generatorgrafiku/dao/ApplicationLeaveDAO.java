package pl.generatorgrafiku.dao;

import java.util.List;

import pl.generatorgrafiku.model.ApplicationLeave;

public interface ApplicationLeaveDAO extends GenericDAO<ApplicationLeave, Long> {
	
	public List<ApplicationLeave> getAllApplicationLeaveCompanyNip(String companyNip);

}
