package pl.generatorgrafiku.service;

import pl.generatorgrafiku.dao.CompanyDAO;
import pl.generatorgrafiku.dao.DAOFactory;
import pl.generatorgrafiku.model.Company;

public class CompanyService {
	public void addCompany(String nip, String companyName) {
		Company company = new Company();
		company.setNip(nip);
		company.setCompanyName(companyName);
		DAOFactory factory = DAOFactory.getDAOFactory();
		CompanyDAO companyDao = factory.getCompanyDAO();
		companyDao.create(company);
	}
}
