package pl.generatorgrafiku.dao;

public class MysqlDAOFactory extends DAOFactory {

	@Override
	public ApplicationDayOffDAO getApplicationDayOffDAO() {
		return new ApplicationDayOffDAOImpl();
	}

	@Override
	public ApplicationLeaveDAO getApplicationLeaveDAO() {
		return new ApplicationLeaveDAOImpl();
	}

	@Override
	public CompanyDAO getCompanyDAO() {
		return new CompanyDAOImpl();
	}

	@Override
	public ScheduleDAO getScheduleDAO() {
		return new ScheduleDAOImpl();
	}

	@Override
	public UserDAO getUserDAO() {
		return new UserDAOImpl();
	}

}
