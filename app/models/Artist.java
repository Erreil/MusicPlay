package models;


public class Artist{
	private int Id;
	private String Firstname;
	private String Lastname;
	private String Alias;
	private Country Country;
	private int CountryId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}

	public Country getCountry() {
		return Country;
	}
	public void setCountry(Country country) {
		Country = country;
	}
	
	public int getCountryId() {
		if(Country != null) return getCountry().getId();
		return CountryId;
	}
	public void setCountryId(int countryId) {
		CountryId = countryId;
	}
}