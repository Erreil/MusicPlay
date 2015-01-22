package models;

import java.util.Observable;

public class User extends Observable{
	private int Id;
	private String Username;
	private String Password;
	private String Firstname;
	private String Lastname;
	private String Zip;
	private String Location;
	private String Street;
	private String StreetNumber;
	private String Mail;
	private boolean IsAdmin;
	
	public User(){
		super();
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
		super.setChanged();
		super.notifyObservers();
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
		super.setChanged();
		super.notifyObservers();
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
		super.setChanged();
		super.notifyObservers();
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
		super.setChanged();
		super.notifyObservers();
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
		super.setChanged();
		super.notifyObservers();
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
		super.setChanged();
		super.notifyObservers();
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
		super.setChanged();
		super.notifyObservers();
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
		super.setChanged();
		super.notifyObservers();
	}

	public String getStreetNumber() {
		return StreetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		StreetNumber = streetNumber;
		super.setChanged();
		super.notifyObservers();
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
		super.setChanged();
		super.notifyObservers();
	}
	
	public boolean getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		IsAdmin = isAdmin;
		super.setChanged();
		super.notifyObservers();
	}
}