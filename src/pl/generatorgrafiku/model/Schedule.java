package pl.generatorgrafiku.model;

import java.sql.Timestamp;

public class Schedule {
	private Timestamp day;
	private long userId;
	private String userCompanyNip;
	private WorkType shift;
	
	public Schedule() { }
	
	public Schedule(Schedule schedule) {
		this.day = new Timestamp(schedule.day.getTime());
		this.userId = schedule.userId;
		this.userCompanyNip = schedule.userCompanyNip;
		this.shift = schedule.shift;
	}

	public Timestamp getDay() {
		return day;
	}

	public void setDay(Timestamp day) {
		this.day = day;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserCompanyNip() {
		return userCompanyNip;
	}

	public void setUserCompanyNip(String userCompanyNip) {
		this.userCompanyNip = userCompanyNip;
	}

	public WorkType getShift() {
		return shift;
	}

	public void setShift(WorkType shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "Schedule [id="+day+", userId="+userId+", companyNip="+userCompanyNip+", shift="+shift+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((shift == null) ? 0 : shift.hashCode());
		result = prime * result + ((userCompanyNip == null) ? 0 : userCompanyNip.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		Schedule other = (Schedule) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (shift != other.shift)
			return false;
		if (userCompanyNip == null) {
			if (other.userCompanyNip != null)
				return false;
		} else if (!userCompanyNip.equals(other.userCompanyNip))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	
}
