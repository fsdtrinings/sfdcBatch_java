package entity;

public class Project {
	
	private int id;
	private String projectName;
	private String location;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Project(int id, String projectName, String location) {
		
		this.id = id;
		this.projectName = projectName;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", location=" + location + "]";
	}
	
	

}
