package pl.generatorgrafiku.model;

import java.sql.Date;

public class ApplicationLeave {
	private long id;
	private Date firstDay;
	private Date lastDay;
	private User user;
	private String userCompanyNip;
	
	public ApplicationLeave() { }
	
	public ApplicationLeave(ApplicationLeave applicationLeave) {
		this.id = applicationLeave.id;
		this.firstDay = new Date(applicationLeave.firstDay.getTime());
		this.lastDay = new Date(applicationLeave.lastDay.getTime());
		this.user = new User(applicationLeave.user);
		this.userCompanyNip = applicationLeave.userCompanyNip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(Date firstDay) {
		this.firstDay = firstDay;
	}

	public Date getLastDay() {
		return lastDay;
	}

	public void setLastDay(Date lastDay) {
		this.lastDay = lastDay;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserCompanyNip() {
		return userCompanyNip;
	}

	public void setUserCompanyNip(String userCompanyNip) {
		this.userCompanyNip = userCompanyNip;
	}
	
	@Override
	public String toString() {
		return "ApplicationLeave [id="+id+", firstDay="+firstDay+", lastDay="+lastDay+", user="+user+", companyNip="+userCompanyNip+"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstDay == null) ? 0 : firstDay.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastDay == null) ? 0 : lastDay.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((userCompanyNip == null) ? 0 : userCompanyNip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationLeave other = (ApplicationLeave) obj;
		if (firstDay == null) {
			if (other.firstDay != null)
				return false;
		} else if (!firstDay.equals(other.firstDay))
			return false;
		if (id != other.id)
			return false;
		if (lastDay == null) {
			if (other.lastDay != null)
				return false;
		} else if (!lastDay.equals(other.lastDay))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userCompanyNip == null) {
			if (other.userCompanyNip != null)
				return false;
		} else if (!userCompanyNip.equals(other.userCompanyNip))
			return false;
		return true;
	}
	
	
}
