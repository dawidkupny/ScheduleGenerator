package pl.generatorgrafiku.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import pl.generatorgrafiku.model.ApplicationDayOff;
import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.util.ConnectionProvider;

public class ApplicationDayOffDAOImpl implements ApplicationDayOffDAO{

	private static final String CREATE_APPLICATION_DAY_OFF =
			"INSERT INTO application_form_day_off (day, reason, user_user_id, user_company_company_NIP) VALUES (:day, :reason, :userId, :companyNip);";
	
	private static final String READ_ALL_APPLICATION_DAY_OFF = 
			"SELECT user.user_id, username, email, is_hired, company_company_NIP, password, application_day_off_id, day, reason FROM application_form_day_off LEFT JOIN user ON application_form_day_off.user_user_id = user.user_id WHERE company_company_NIP = :companyNip;";
	
	private static final String READ_MONTH_APPLICATION_DAY_OFF = 
			"SELECT user.user_id, username, email, is_hired, company_company_NIP, password, application_day_off_id, day, reason FROM application_form_day_off LEFT JOIN user ON application_form_day_off.user_user_id = user.user_id WHERE company_company_NIP = :companyNip AND day LIKE :month;";
	
	private NamedParameterJdbcTemplate template;
	
	public ApplicationDayOffDAOImpl() {
		template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
	}
	
	@Override
	public ApplicationDayOff create(ApplicationDayOff applicationDay) {
		ApplicationDayOff resultApplicationDay = new ApplicationDayOff(applicationDay);
		KeyHolder holder = new GeneratedKeyHolder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("day", applicationDay.getDay());
		paramMap.put("reason", applicationDay.getReason());
		paramMap.put("userId", applicationDay.getUser().getId());
		paramMap.put("companyNip", applicationDay.getUser().getCompanyNip());
		SqlParameterSource paramSource = new MapSqlParameterSource(paramMap);
		int update = template.update(CREATE_APPLICATION_DAY_OFF, paramSource, holder);
		if(update > 0) {
			resultApplicationDay.setId((Long)holder.getKey());
		}
		return resultApplicationDay;
	}

	@Override
	public ApplicationDayOff read(Long primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(ApplicationDayOff updateObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ApplicationDayOff> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplicationDayOff> getAllApplicationDayOffCompanyNip(String companyNip) {
		SqlParameterSource paramSource = new MapSqlParameterSource("companyNip", companyNip);
		List<ApplicationDayOff> applicationDayOff = template.query(READ_ALL_APPLICATION_DAY_OFF, paramSource, new ApplicationDayOffMapper());
		return applicationDayOff;
	}
	
	@Override
	public List<ApplicationDayOff> getApplicationDayOffMonthCompanyNip(String companyNip, String month) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("companyNip", companyNip);
		paramMap.put("month", month+"%");
		SqlParameterSource paramSource = new MapSqlParameterSource(paramMap);
		List<ApplicationDayOff> applicationDayOff = template.query(READ_MONTH_APPLICATION_DAY_OFF, paramSource, new ApplicationDayOffMapper());
		return applicationDayOff;
	}
	
	private class ApplicationDayOffMapper implements RowMapper<ApplicationDayOff> {

		@Override
		public ApplicationDayOff mapRow(ResultSet resultSet, int row) throws SQLException {
			ApplicationDayOff applicationDay = new ApplicationDayOff();
			applicationDay.setId(resultSet.getLong("application_day_off_id"));
			applicationDay.setDay(resultSet.getDate("day"));
			applicationDay.setReason(resultSet.getString("reason"));
			applicationDay.setUserCompanyNip("company_company_NIP");
			User user = new User();
			user.setId(resultSet.getLong("user_id"));
			user.setUsername(resultSet.getString("username"));
			user.setEmail(resultSet.getString("email"));
			user.setIs_hired(resultSet.getBoolean("is_hired"));
			user.setCompanyNip(resultSet.getString("company_company_NIP"));
			user.setPassword(resultSet.getString("password"));
			user.setRole("user");
			applicationDay.setUser(user);
			return applicationDay;
		}
		
	}

}
