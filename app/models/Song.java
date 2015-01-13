package models;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Song{
	private int Id;
	private int Rank;
	private Artist Artist;
	private String Titel; 
	private String FilePath;
	private String FileName;
	
	private int ArtistId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	public Artist getArtist() {
		return Artist;
	}
	public void setArtist(Artist artist) {
		Artist = artist;
	}
	public String getTitel() {
		return Titel;
	}
	public void setTitel(String titel) {
		Titel = titel;
	}
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	
	public int getArtistId() {
		if(Artist != null) return getArtist().getId();
		return ArtistId;
	}
	public void setArtistId(int artistId) {
		ArtistId = artistId;
	}
	
	public String getFileName() {
		Path p = Paths.get(getFilePath());
		return p.getFileName().toString();
	}

	
       
}