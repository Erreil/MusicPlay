package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import play.data.validation.ValidationError;


public class Login extends Observable {
	
	private String username;
	private String password;
	
	public Login(){
		super();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		super.setChanged();
		super.notifyObservers();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		super.setChanged();
		super.notifyObservers();
	}
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<ValidationError>();
		
		if(username == null || username.isEmpty()) {
			errors.add(new ValidationError("", "Btte geben Sie einen Benutzer ein!"));
			return errors;
		}
		
		if(password == null || password.isEmpty()) {
			errors.add(new ValidationError("", "Btte geben Sie Ihr Kennwort ein!"));
			return errors;
		}
		
		Service service = Service.getInstance();
			
		if(service.authenticate(this) == false){
			errors.add(new ValidationError("", "Benutzername oder Passwort ist ungültig"));
			return errors;
		}
		return null;
	}
}
