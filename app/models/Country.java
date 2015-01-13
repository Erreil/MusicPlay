package models;

public class Country {
	private int Id;
	private String Shortcut;
	private String Name;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getShortcut() {
		return Shortcut;
	}
	public void setShortcut(String shortcut) {
		Shortcut = shortcut;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}	
}
