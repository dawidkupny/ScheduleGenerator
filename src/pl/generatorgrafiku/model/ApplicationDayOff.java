package pl.generatorgrafiku.model;

import java.sql.Date;

public class ApplicationDayOff {
	private long id;
	private Date day;
	private String reason;
	private User user;
	private String userCompanyNip;
	
	public ApplicationDayOff() { }
	
	public ApplicationDayOff(ApplicationDayOff applicationDayOff) {
		this.id = applicationDayOff.id;
		this.day = new Date(applicationDayOff.day.getTime());
		this.reason = applicationDayOff.reason;
		this.user = new User(applicationDayOff.user);
		this.userCompanyNip = applicationDayOff.userCompanyNip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
		return "ApplicationDayOff [id="+id+", day="+day+", reason="+reason+", user="+user+", companyNip="+userCompanyNip+"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
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
		ApplicationDayOff other = (ApplicationDayOff) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (id != other.id)
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
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
