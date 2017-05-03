package pl.generatorgrafiku.dao;

import java.util.List;

import pl.generatorgrafiku.model.User;

public interface UserDAO extends GenericDAO<User, Long>{
	
	List<User> getAll();
	User getUserByUsername(String username);
}
