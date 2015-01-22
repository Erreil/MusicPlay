package models;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Observable;

public class Song extends Observable{
	private int Id;
	private int Rank;
	private Artist Artist;
	private String Titel; 
	private String FilePath;
	private String FileName;
	private int ArtistId;
	
	public Song(){
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
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
		super.setChanged();
		super.notifyObservers();
	}
	public Artist getArtist() {
		return Artist;
	}
	public void setArtist(Artist artist) {
		Artist = artist;
		super.setChanged();
		super.notifyObservers();
	}
	public String getTitel() {
		return Titel;
	}
	public void setTitel(String titel) {
		Titel = titel;
		super.setChanged();
		super.notifyObservers();
	}
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
		super.setChanged();
		super.notifyObservers();
	}
	
	public int getArtistId() {
		if(Artist != null) return getArtist().getId();
		return ArtistId;
	}
	public void setArtistId(int artistId) {
		ArtistId = artistId;
		super.setChanged();
		super.notifyObservers();
	}
	
	public String getFileName() {
		Path p = Paths.get(getFilePath());
		return p.getFileName().toString();
	}

	
       
}