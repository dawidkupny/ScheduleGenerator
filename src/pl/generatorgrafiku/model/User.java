package pl.generatorgrafiku.model;

public class User {
	private long id;
	private String username;
	private String email;
	private String password;
	private boolean is_hired;
	private String companyNip;
	
	public User(){ }
	
	public User(User user) {
		this.id = user.id;
		this.username = user.username;
		this.email = user.email;
		this.password = user.password;
		this.companyNip = user.companyNip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIs_hired() {
		return is_hired;
	}

	public void setIs_hired(boolean is_hired) {
		this.is_hired = is_hired;
	}

	public String getCompanyNip() {
		return companyNip;
	}

	public void setCompanyNip(String companyNip) {
		this.companyNip = companyNip;
	}

	@Override
	public String toString() {
		return "User [id="+id+", name="+username+", email="+email+", password="+password+", is_hired="+is_hired+", companyNip="+companyNip+"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyNip == null) ? 0 : companyNip.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (is_hired ? 1231 : 1237);
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (companyNip == null) {
			if (other.companyNip != null)
				return false;
		} else if (!companyNip.equals(other.companyNip))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (is_hired != other.is_hired)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}