package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

import java.util.*;

public class Application extends Controller {

    public static Result index() {
		return showTopTen("europe");
    }
	
	public static Result showTopTen(String country){
		List<MusicType> musicTypes = new ArrayList<MusicType>();
        MusicType musicType = new MusicType();
		musicType.Type = "Rock";      
        musicTypes.add(musicType);
        
        List<Artist> artists = new ArrayList<Artist>();
        Artist artist = new Artist();
        artist.Alias = "Eminem";
        artists.add(artist);
        
        List<Song> topSongsList = new ArrayList<Song>();
        Song topSong = new Song();
        topSong.Rank = 1;
        topSong.Artist = artist;
        topSong.Titel = "TestSong";
        topSongsList.add(topSong);
		
		List<NewsEntry> news = new ArrayList<NewsEntry>();
		NewsEntry entry = new NewsEntry();
		entry.Headline = "Neuer Album!";
		entry.ShortDescription = "Ein neuer Album ist RAUS!";
		entry.Description = "Busta Ryhmes hat wieder ein neues Album rausgebracht. Hört es euch an!";
		
		List<String> pictures = new ArrayList<String>();
		pictures.add("busta.jpg");
		entry.PichturePaths = pictures;
		
		news.add(entry);
             
        return ok(index.render(country ,musicTypes, artists, topSongsList, news));
	}
	
	public static Result adminpanel() {
		return aplogin();
	}
	
	public static Result signup() {
		return ok(signup.render());
	}
	
	public static Result aplogin() {
		return ok(aplogin.render());
	}
	
	public static Result apaddsong() {
		Artist artist = new Artist();
        artist.Alias = "Eminem";
	
		List<Song> songsList = new ArrayList<Song>();
        Song song = new Song();
        song.Rank = 1;
        song.Artist = artist;
        song.Titel = "TestSong";
        songsList.add(song);
	
		return ok(apaddsong.render(songsList));
	}
	
	public static Result apusermanagement() {
	
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.Firstname = "Erik";
		user.Lastname = "Reil";
		user.Mail = "info@musicplay.de";
		user.Username = "erreil";
		users.add(user);
		
		return ok(apusermanagement.render(users));
	}
	
	public static Result apaddartist() {
		List<Artist> artists = new ArrayList<Artist>();
        Artist artist = new Artist();
        artist.Alias = "Eminem";
        artists.add(artist);
	
		return ok(apaddartist.render(artists));
	}
}
