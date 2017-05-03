package pl.generatorgrafiku.dao;

import java.sql.Timestamp;
import java.util.List;

import pl.generatorgrafiku.model.Schedule;

public interface ScheduleDAO extends GenericDAO<Schedule, Timestamp>{
	
	List<Schedule> getAll();
	Schedule getScheduleByCompanyNip(String nip);
	Schedule getScheduleByDate(Timestamp firstDay, Timestamp lastDay);
}
