package common.root.model;

public class CommonModelTest {
	private String name;
	private String id;
	private String rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "CommonModelTest [" + (name != null ? "name=" + name + ", " : "") + (id != null ? "id=" + id + ", " : "")
				+ (rollNo != null ? "rollNo=" + rollNo : "") + "]";
	}
	
}
