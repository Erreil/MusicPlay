package controllers;

import play.data.Form;
import play.data.validation.ValidationError;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;
import models.*;
import play.libs.Json;

import java.io.File;
import java.util.*;

import jdk.nashorn.internal.runtime.Context;

public class Application extends Controller {
	
	final static Form<User> userForm = Form.form(User.class);
	final static Form<Artist> artistForm = Form.form(Artist.class);
	final static Form<Song> songForm = Form.form(Song.class);
	final static Form<Login> loginForm = Form.form(Login.class);
		
    public static Result index() {
    	return redirect(routes.Application.showTopTen("europe"));
    }
    
    private static Result index(Form<Login> login) {
    	return showTopTen("europe", login);
    }
	
    private static Result showTopTen(String country, Form<Login> login){
		Service service = Service.getInstance();
		
		List<MusicType> musicTypes = service.getAllMusicTypes();     
        List<Artist> artists = service.getAllArtists();       
        List<Song> topSongsList = service.getTopSongs(country);
        
        return ok(index.render(country ,musicTypes, artists, topSongsList, login));
    }
    
    public static Result logoutUser() {
        session().clear();
        return index();
    }
    
    public static Result logoutAdmin() {
        session().clear();
        return redirect(routes.Application.aplogin());
    }
    
	public static Result showTopTen(String country){
		
		return showTopTen(country, loginForm);
		
		//List<NewsEntry> news = new ArrayList<NewsEntry>();
		//NewsEntry entry = new NewsEntry();
		//entry.setHeadline("Neuer Album!");
		//entry.setShortDescription("Ein neuer Album ist RAUS!");
		//entry.setDescription("Busta Ryhmes hat wieder ein neues Album rausgebracht. Hört es euch an!");
		
		//List<String> pictures = new ArrayList<String>();
		//pictures.add("busta.jpg");
		//entry.setPichturePaths(pictures);		
		//news.add(entry);
             

	}
	
	public static Result adminpanel() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		return redirect(routes.Application.apaddsong());
	}
	
	public static Result signup() {
		return ok(signup.render(userForm));
	}
	
	public static Result newUser(){
		Form<User> filledForm = userForm.bindFromRequest();	
		User created = filledForm.get();
		
		Service service = Service.getInstance();		
		if(service.createUser(created)) return index();
		else return badRequest();
	}
	
	public static Result newArtist(){
		Form<Artist> filledForm = artistForm.bindFromRequest();	
		Artist created = filledForm.get();
		
		Service service = Service.getInstance();		
		if(service.createArtist(created)) return apaddartist();
		else return badRequest();
	}
	
	public static Result getUsers(){
		Service service = Service.getInstance();
		ArrayList<User> users = service.getAllUsers();		
		return ok(Json.toJson(users));
	}
	
	public static Result deleteUser(int id){		
		Service service = Service.getInstance();
		service.deleteUser(id);			
		return ok();
	}
	
	public static Result getSongs(){
		Service service = Service.getInstance();
		ArrayList<Song> songs = service.getAllSongs();		
		return ok(Json.toJson(songs));
	}
	
	public static Result deleteSong(int id){		
		Service service = Service.getInstance();
		service.deleteSong(id);		
		return ok();
	}
	
	public static Result getArtists(){
		Service service = Service.getInstance();
		ArrayList<Artist> artists = service.getAllArtists();		
		return ok(Json.toJson(artists));
	}
	
	public static Result deleteArtist(int id){		
		Service service = Service.getInstance();
		service.deleteArtist(id);		
		return ok();
	}
	
	@Security.Authenticated(Secured.class)
	public static Result apaddsong() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		Service service = Service.getInstance();
		
		List<Song> songs = service.getAllSongs();
		return ok(apaddsong.render(songs, songForm));
	}
	
	public static Result apusermanagement() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		Service service = Service.getInstance();
		
		ArrayList<User> users = service.getAllUsers();		
		return ok(apusermanagement.render(users));
	}
		
	public static Result aprankmanagement(String country) {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		Service service = Service.getInstance();
		
		ArrayList<Song> songs = service.getSongsWithRanking(country);		
		return ok(aprankmanagement.render(songs, country));
	}
	
	public static Result updateRankingEu(String parameter) {
		return updateRanking(parameter, "eu");
	}
	
	public static Result updateRankingUsa(String parameter) {
		return updateRanking(parameter, "usa");
	}
	
	public static Result updateRankingUk(String parameter) {
		return updateRanking(parameter, "uk");
	}
		
	public static Result updateRanking(String parameter, String country) {
		Service service = Service.getInstance();
		
		String[] parameters = parameter.split(";");
		
		Song song = new Song();
		song.setId(Integer.parseInt(parameters[0]));
		song.setRank(Integer.parseInt(parameters[1]));
		
		service.createRank(song, country);		
		return ok();
	}
	
	public static Result aplogin() {
		return ok(aplogin.render(loginForm));
	}
	
	public static Result authenticateUser(){
		Form<Login> filledForm = loginForm.bindFromRequest();
				
		if(filledForm.hasErrors()){			 
			return badRequest(aplogin.render(filledForm)); 
		}
		else{
			
			Login login = filledForm.get();
						
			session().clear();
			session("username", login.getUsername());
			
			return redirect(routes.Application.index());
		}
	}
		
	public static Result authenticateAdmin(){
		Form<Login> filledForm = loginForm.bindFromRequest();
				
		if(filledForm.hasErrors()){			 
			return badRequest(aplogin.render(filledForm)); 
		}
		else{
			
			Login login = filledForm.get();
						
			session().clear();
			session("username", login.getUsername());
			session("isAdmin", "yes");
			
			return redirect(routes.Application.apaddsong());
		}
	}
	
	
	public static Result getSongRankings(String country){
		Service service = Service.getInstance();
		ArrayList<Song> songs = service.getSongsWithRanking(country);		
		return ok(Json.toJson(songs));
	}
	
	public static Result apaddartist() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		Service service = Service.getInstance();
		
		List<Artist> artists = service.getAllArtists();
		return ok(apaddartist.render(artists, artistForm));
	}
	
	public static Result newSong(){
		
	  MultipartFormData body = request().body().asMultipartFormData();
	  FilePart picture = body.getFile("songFile");
	  
	  if (picture != null) {
	    String fileName = picture.getFilename();
	    String contentType = picture.getContentType(); 
	    File file = picture.getFile();
	    file.renameTo(new File(System.getProperty("user.dir") + "\\public\\music", fileName));
	    
	    Service service = Service.getInstance();
	    Map<String, String[]> values = body.asFormUrlEncoded();
	    
	    Song song = new Song();
	    song.setArtistId(Integer.parseInt(values.get("artistId")[0]));
	    song.setTitel(values.get("titel")[0]);
	    song.setFilePath(System.getProperty("user.dir") + "\\public\\music\\" + fileName);	
	    
	    service.createSong(song);
	        
	    return apaddsong();
	  } else {
	    flash("error", "Missing file");
	    return redirect(routes.Application.index());    
	  }
	}
	
	

	
}
