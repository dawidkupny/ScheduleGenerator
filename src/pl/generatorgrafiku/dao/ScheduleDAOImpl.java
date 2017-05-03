package pl.generatorgrafiku.dao;

import java.sql.Timestamp;
import java.util.List;

import pl.generatorgrafiku.model.Schedule;

public class ScheduleDAOImpl implements ScheduleDAO{

	@Override
	public Schedule create(Schedule newObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule read(Timestamp primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Schedule updateObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Timestamp key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Schedule> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule getScheduleByCompanyNip(String nip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule getScheduleByDate(Timestamp firstDay, Timestamp lastDay) {
		// TODO Auto-generated method stub
		return null;
	}

}
