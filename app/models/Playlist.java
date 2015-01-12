package models;

import java.util.*;

public class Playlist{
	private int Id;
	private String Name;
	private ArrayList<Song> Songs;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Song> getSongs() {
		return Songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		Songs = songs;
	}
}