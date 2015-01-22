package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;
import models.*;
import play.libs.Json;

import java.io.File;
import java.util.*;

import play.libs.F.Callback;
import play.libs.F.Callback0;

public class Application extends Controller {
	
	final static Form<User> userForm = Form.form(User.class);
	final static Form<Artist> artistForm = Form.form(Artist.class);
	final static Form<Song> songForm = Form.form(Song.class);
	final static Form<Login> loginForm = Form.form(Login.class);
		
    public static Result index() {
    	return redirect(routes.Application.showTopTen("eu"));
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
		
		Service service = Service.getInstance();
		    
        List<Artist> artists = service.getAllArtists();       
        List<Song> topSongsList = service.getTopSongs(country);
        
        return ok(index.render(country, artists, topSongsList)); 

	}
	
	public static Result adminpanel() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin").equals("yes") == false) return redirect(routes.Application.aplogin());
		
		return redirect(routes.Application.apaddsong());
	}
	
	public static Result signup() {
		return ok(signup.render(userForm));
	}
	
	public static Result newUser(){
		Form<User> filledForm = userForm.bindFromRequest();	
		User created = filledForm.get();
		created.setIsAdmin(false);
		
		Service service = Service.getInstance();		
		if(service.createUser(created)){
			session().clear();
			session("username", created.getUsername());	
			return redirect(routes.Application.index());
		}
		else return badRequest("Es gab leider einen unerwarteten Fehler!");
	}
	
	public static Result newArtist(){
		Form<Artist> filledForm = artistForm.bindFromRequest();	
		Artist created = filledForm.get();
		Service service = Service.getInstance();		
	
		if(service.createArtist(created)) return redirect(routes.Application.apaddartist());	
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
	
	public static Result apaddsong() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin").equals("yes") == false) return redirect(routes.Application.aplogin());
				
		Service service = Service.getInstance();
		
		List<Song> songs = service.getAllSongs();
		return ok(apaddsong.render(songs, songForm));
	}
	
	public static Result apusermanagement() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin").equals("yes") == false) return redirect(routes.Application.aplogin());
		
		Service service = Service.getInstance();
		
		ArrayList<User> users = service.getAllUsers();		
		return ok(apusermanagement.render(users));
	}
		
	public static Result aprankmanagement(String country) {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin").equals("yes") == false) return redirect(routes.Application.aplogin());
		
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
			return redirect(routes.Application.aplogin());
		}
		else{		
			Login login = filledForm.get();
			Service service = Service.getInstance();
			boolean isAdmin = service.checkIfUserIsAdminByUsername(login.getUsername());
			
			session().clear();
			session("username", login.getUsername());
						
			if(isAdmin){
				session("isAdmin", "yes");
			}
			
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
			Service service = Service.getInstance();
			boolean isAdmin = service.checkIfUserIsAdminByUsername(login.getUsername());
			
			session().clear();
			session("username", login.getUsername());
			
			if(isAdmin){
				session("isAdmin", "yes");
			}
								
			return redirect(routes.Application.index());
		}
	}
	
	
	public static Result getSongRankings(String country){
		Service service = Service.getInstance();
		ArrayList<Song> songs = service.getSongsWithRanking(country);		
		return ok(Json.toJson(songs));
	}
	
	public static Result apaddartist() {
		if(session().get("username") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin") == null) return redirect(routes.Application.aplogin());
		if(session().get("isAdmin").equals("yes") == false) return redirect(routes.Application.aplogin());
		
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
	    song.setFileName(fileName);	
	    
	    service.createSong(song);
	        
	    return redirect(routes.Application.apaddsong());
	  } else {
	    return badRequest();    
	  }
	}
	
	public static Result songsByArtist(String artist){
		Service service = Service.getInstance();
	    
        List<Artist> artists = service.getAllArtists();       
        List<Song> songsList = service.getAllSongsByArtist(artist);
        
        return ok(songs.render(artists, songsList)); 
	}
	
	public static Result songsBySearch(){
		Service service = Service.getInstance();
		
		 DynamicForm requestData = Form.form().bindFromRequest();
		 String search = requestData.get("search");
			    
        List<Artist> artists = service.getAllArtists();       
        List<Song> songsList = service.getAllSongByContainsTitel(search);
        
        return ok(songs.render(artists, songsList)); 
	}
	
	public static Result addToFavorites(int id){
		Service service = Service.getInstance();
		
		int userId = service.getUsersIdByUsername(session().get("username"));	
		if(userId == 0) return badRequest();
		
		service.createFavorite(id, userId);		            
        return ok(); 
	}
	
	public static Result getMySongs(){
		Service service = Service.getInstance();
		
		int userId = service.getUsersIdByUsername(session().get("username"));	
		if(userId == 0) return badRequest();
		
		ArrayList<Song> songs = service.getAllFavoriteSongs(userId);
		List<Artist> artists = service.getAllArtists();
		
        return ok(favoriteSongs.render(artists, songs)); 
	}
	
	public static WebSocket<String> searchResult() {
		 WebSocket<String> ws = null;
		 ws = new WebSocket<String>() {
		 public void onReady(WebSocket.In<String> in, final WebSocket.Out<String> out) {
		 in.onMessage(new Callback<String>() {
		 public void invoke(String g) {
			
	     Service service = Service.getInstance();
		 ArrayList<String> list = service.getAllSongTitelByContainsTitel(g);
		 
		 String returnable = "";
		 
		 for (String value : list) {
			returnable += value + ";";
		}
		 		 
		 out.write(returnable);
		 }
		 });
		 in.onClose(new Callback0() {
		 public void invoke() {
		 }
		 });
		 }
		 };
		 return ws;
		 }

}
