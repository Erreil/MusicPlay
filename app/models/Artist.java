package models;

import java.util.Observable;


public class Artist extends Observable{
	private int Id;
	private String Firstname;
	private String Lastname;
	private String Alias;
	private Country Country;
	private int CountryId;
	
	public Artist(){
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
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
		super.setChanged();
		super.notifyObservers();
	}

	public Country getCountry() {
		return Country;
	}
	public void setCountry(Country country) {
		Country = country;
		super.setChanged();
		super.notifyObservers();
	}
	
	public int getCountryId() {
		if(Country != null) return getCountry().getId();
		return CountryId;
	}
	public void setCountryId(int countryId) {
		CountryId = countryId;
		super.setChanged();
		super.notifyObservers();
	}
}