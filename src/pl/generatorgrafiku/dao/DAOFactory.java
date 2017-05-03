package pl.generatorgrafiku.dao;

import pl.generatorgrafiku.exception.NoSuchDbTypeException;

public abstract class DAOFactory {
	
	public static final int MYSQL_DAO_FACTORY = 1;
	
	public abstract ApplicationDayOffDAO getApplicationDayOffDAO();
	
	public abstract ApplicationLeaveDAO getApplicationLeaveDAO();
	
	public abstract CompanyDAO getCompanyDAO();
	
	public abstract ScheduleDAO getScheduleDAO();
	
	public abstract UserDAO getUserDAO();
	
	public static DAOFactory getDAOFactory() {
		DAOFactory factory = null;
		try {
			factory = getDAOFactory(MYSQL_DAO_FACTORY);
		} catch (NoSuchDbTypeException e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	private static DAOFactory getDAOFactory(int type) throws NoSuchDbTypeException {
		switch(type) {
		case MYSQL_DAO_FACTORY:
			return new MysqlDAOFactory();
		default:
			throw new NoSuchDbTypeException();
		}
	}
}

/* W naszym przypadku jedynym rodzajem bazy danych jest Mysql, ale zmieniaj�c w tej klasie jedynie kilka linijek kodu w metodach 
   getDAOFactory() mogliby�my przepi�� ca�� aplikacj� na zupe�nie inny silnik. Stworzyli�my te� wyj�tek informuj�cy o podaniu 
   niepoprawnego rodzaju bazy danych*/
