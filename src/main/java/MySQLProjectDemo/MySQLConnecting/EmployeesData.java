package MySQLProjectDemo.MySQLConnecting;

public class EmployeesData {
	int id;
	String name;
	String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "EmployeesData [id=" + id + ", name=" + name + ", location="
				+ location + "]";
	}
	
}
