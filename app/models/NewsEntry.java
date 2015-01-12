package models;

import java.util.*;

public class NewsEntry{
	private int Id;
	private String Headline;
	private String ShortDescription;
	private String Description;
	private List<String> PichturePaths; 
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getHeadline() {
		return Headline;
	}
	public void setHeadline(String headline) {
		Headline = headline;
	}
	public String getShortDescription() {
		return ShortDescription;
	}
	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public List<String> getPichturePaths() {
		return PichturePaths;
	}
	public void setPichturePaths(List<String> pichturePaths) {
		PichturePaths = pichturePaths;
	}
}
