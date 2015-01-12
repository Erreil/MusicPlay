package models;

public enum SqlState {
	Active(1),
	Deleted(255);
	
	private int value;
	private SqlState (int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
