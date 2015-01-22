package models;

import java.util.Observable;

public class Country  extends Observable {
	private int Id;
	private String Shortcut;
	private String Name;
	
	public Country(){
		super;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
		super.setChanged();
		super.notifyObservers();
	}
	public String getShortcut() {
		return Shortcut;
	}
	public void setShortcut(String shortcut) {
		Shortcut = shortcut;
		super.setChanged();
		super.notifyObservers();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		super.setChanged();
		super.notifyObservers();
	}	
}
