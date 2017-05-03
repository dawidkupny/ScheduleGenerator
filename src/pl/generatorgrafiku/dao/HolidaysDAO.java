package pl.generatorgrafiku.dao;

import java.sql.Timestamp;
import java.util.List;

import pl.generatorgrafiku.model.Holidays;

public interface HolidaysDAO extends GenericDAO<Holidays, Timestamp>{

	List<Holidays> getAll();
}
