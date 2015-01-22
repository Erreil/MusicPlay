package models;

import java.util.Observable;
import java.util.Observer;

public class Listener implements Observer {

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Eine Änderung ist erfolgt");		
	}
}
