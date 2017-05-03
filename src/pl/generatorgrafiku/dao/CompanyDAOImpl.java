package pl.generatorgrafiku.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import pl.generatorgrafiku.model.Company;
import pl.generatorgrafiku.util.ConnectionProvider;

public class CompanyDAOImpl implements CompanyDAO{
	
	private static final String CREATE_COMPANY =
		"INSERT INTO company(company_NIP, company_name) VALUES (:nip, :companyName);";
	
	private NamedParameterJdbcTemplate template;
	
	public CompanyDAOImpl() {
		template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
	}
	
	@Override
	public Company create(Company company) {
		Company resultCompany = new Company(company);
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(company);
		int update = template.update(CREATE_COMPANY, paramSource, holder);
		if(update > 0) {
			resultCompany.setNip(company.getNip());
		}
		return resultCompany;
	}
	
	@Override
	public Company read(String primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Company updateObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getCompanyByNip(String nip) {
		// TODO Auto-generated method stub
		return null;
	}

}
