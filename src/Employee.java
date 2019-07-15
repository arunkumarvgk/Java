

import java.sql.Timestamp;

public class Employee {

	private String name;
	private String status;
	private Timestamp lastUpdated;

	public Employee(String name, String status, Timestamp lastUpdated) {
		super();
		this.name = name;
		this.status = status;
		this.lastUpdated = lastUpdated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", status=" + status + ", lastUpdated=" + lastUpdated + "]";
	}
}
