package pl.generatorgrafiku.dao;

import java.util.List;

import pl.generatorgrafiku.model.Company;

public interface CompanyDAO extends GenericDAO<Company, String>{
	
	List<Company> getAll();
	Company getCompanyByNip(String nip);
}
