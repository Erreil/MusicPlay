package models;

public class User{
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
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getStreetNumber() {
		return StreetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		StreetNumber = streetNumber;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}
	
	public boolean getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		IsAdmin = isAdmin;
	}
}