package ontrack;

public class user {
	private int ID;
	private String Name; 
	private String Role;
	
	
	public user(int iD, String name, String role) {
		ID = iD;
		Name = name;
		Role = role;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}