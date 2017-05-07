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

import pl.generatorgrafiku.model.ApplicationLeave;
import pl.generatorgrafiku.model.User;
import pl.generatorgrafiku.util.ConnectionProvider;

public class ApplicationLeaveDAOImpl implements ApplicationLeaveDAO{
	
	private static final String CREATE_APPLICATION_LEAVE =
			"INSERT INTO application_form_leave (first_day, last_day, user_user_id, user_company_company_NIP) VALUES(:firstDay, :lastDay, :userId, :companyNip);";
	
	private static final String READ_ALL_APPLICATION_LEAVE = 
			"SELECT user.user_id, username, email, is_hired, company_company_NIP, password, idapplication_leave_id, first_day, last_day FROM application_form_leave LEFT JOIN user ON application_form_leave.user_user_id = user.user_id WHERE company_company_NIP = :companyNip;";
	
	private NamedParameterJdbcTemplate template;
	
	public ApplicationLeaveDAOImpl() {
		template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
	}
	
	@Override
	public ApplicationLeave create(ApplicationLeave applicationLeave) {
		ApplicationLeave resultApplicationLeave = new ApplicationLeave(applicationLeave);
		KeyHolder holder = new GeneratedKeyHolder();
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("firstDay", applicationLeave.getFirstDay());
		paramMap.put("lastDay", applicationLeave.getLastDay());
		paramMap.put("userId", applicationLeave.getUser().getId());
		paramMap.put("companyNip", applicationLeave.getUser().getCompanyNip());
		SqlParameterSource paramSource = new MapSqlParameterSource(paramMap);
		int update = template.update(CREATE_APPLICATION_LEAVE, paramSource, holder);
		if(update > 0) {
			resultApplicationLeave.setId((Long)holder.getKey());
		}
		return resultApplicationLeave;
	}

	@Override
	public ApplicationLeave read(Long primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(ApplicationLeave updateObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ApplicationLeave> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ApplicationLeave> getAllApplicationLeaveCompanyNip(String companyNip) {
		SqlParameterSource paramSource = new MapSqlParameterSource("companyNip", companyNip);
		List<ApplicationLeave> applicationLeave = template.query(READ_ALL_APPLICATION_LEAVE, paramSource, new ApplicationLeaveMapper());
		return applicationLeave;
	}
	
	private class ApplicationLeaveMapper implements RowMapper<ApplicationLeave> {

		@Override
		public ApplicationLeave mapRow(ResultSet resultSet, int row) throws SQLException {
			ApplicationLeave applicationLeave = new ApplicationLeave();
			applicationLeave.setId(resultSet.getLong("idapplication_leave_id"));
			applicationLeave.setFirstDay(resultSet.getDate("first_day"));
			applicationLeave.setLastDay(resultSet.getDate("last_day"));
			applicationLeave.setUserCompanyNip(resultSet.getString("company_company_NIP"));
			User user = new User();
			user.setId(resultSet.getLong("user_id"));
			user.setUsername(resultSet.getString("username"));
			user.setEmail(resultSet.getString("email"));
			user.setIs_hired(resultSet.getBoolean("is_hired"));
			user.setCompanyNip(resultSet.getString("company_company_NIP"));
			user.setPassword(resultSet.getString("password"));
			user.setRole("user");
			applicationLeave.setUser(user);
			return applicationLeave;
		}
		
	}

}
