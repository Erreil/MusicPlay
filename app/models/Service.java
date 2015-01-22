package models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import play.db.DB;

public class Service {
	private static Service instance = null;
	
	private Service(){}
	
	public static Service getInstance() {
				
		if(instance == null){
			instance = new Service();
			instance.Initialize();
		}
		return instance;
	}
	
	public void Initialize(){
		InitializeCountry();
		InitializeUser();
		InitializeArtist();
		InitializeSong();
		InitializeSongRanking();
		InitializeFavorites();
	}
	
	private void InitializeFavorites(){	

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		 try {

			 connection = DB.getConnection();
			 
			String statementString = " SELECT name FROM sqlite_master WHERE name='Favorites'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();
			
			String name = "";
					
			while(rs.next()){				
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE [Favorites] ("
					+ "[SongId] INTEGER  NOT NULL"
					+ ",[UserId] INTEGER  NOT NULL"
					+ ",PRIMARY KEY ([SongId],[UserId])"
					+ ",FOREIGN KEY(SongId) REFERENCES Song(Id)"
					+ ",FOREIGN KEY(UserId) REFERENCES User(Id))";
		
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement, rs);
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	
	private void InitializeSongRanking(){	

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		 try {

			 connection = DB.getConnection();
			 
			String statementString = " SELECT name FROM sqlite_master WHERE name='SongRanking'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();
			
			String name = "";
					
			while(rs.next()){				
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE [SongRanking] ("
					+ "[SongId] INTEGER  NOT NULL"
					+ ",[Rank] INTEGER  NOT NULL"
					+ ",[CountryId] INTEGER  NOT NULL"
					+ ",PRIMARY KEY ([SongId],[Rank],[CountryId])"
					+ ",FOREIGN KEY(SongId) REFERENCES Song(Id)"
					+ ",FOREIGN KEY(CountryId) REFERENCES Country(Id)"
					+ ")";
			
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			Song song = new Song();
			song.setId(1);
			song.setRank(1);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(2);
			song.setRank(2);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(3);
			song.setRank(3);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(4);
			song.setRank(4);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(1);
			song.setRank(4);
			
			createRank(song, "usa");
			
			song = new Song();
			song.setId(2);
			song.setRank(3);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(3);
			song.setRank(2);
			
			createRank(song, "eu");
			
			song = new Song();
			song.setId(4);
			song.setRank(1);
			
			createRank(song, "eu");
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	private void InitializeSong(){		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		 try {
			 
			 connection = DB.getConnection();
			 
			String statementString = " SELECT name FROM sqlite_master WHERE name='Song'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();	
			
			String name = "";	
			while(rs.next()){
					
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE [Song] ("
					+ "[Id] INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL"
					+ ",[Titel] NVARCHAR(128)  NOT NULL"
					+ ",[ArtistId] INTEGER  NOT NULL"
					+ ",[FileName] NVARCHAR(512)  NOT NULL"
					+ ",[State] INTEGER  NOT NULL"
					+ ", FOREIGN KEY(ArtistId) REFERENCES Artist(Id)"
					+ ")";
			
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			Song song = new Song();
			song.setTitel("Sunshine");
			song.setArtistId(1);
			song.setFileName("Psycho Metal - Sunshine.mp3");
			
			createSong(song);
			
			song = new Song();
			song.setTitel("Freestyle Skills");
			song.setArtistId(1);
			song.setFileName("Psycho Metal - Freestyle Skills.mp3");
			
			createSong(song);
			
			song = new Song();
			song.setTitel("La Isla Bonita");
			song.setArtistId(3);
			song.setFileName("madonna-la isla bonita.mp3");
			
			createSong(song);
			
			song = new Song();
			song.setTitel("Cry me a river");
			song.setArtistId(4);
			song.setFileName("Justin Timberlake feat 50 cent - Cry me a river.mp3");
			
			createSong(song);
					
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	private void InitializeArtist(){		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		 try {
			 
			 connection = DB.getConnection();
			 
			String statementString = " SELECT name FROM sqlite_master WHERE name='Artist'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();
			
			String name = "";
			while(rs.next()){
					
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE IF NOT EXISTS [Artist] ("
					+ "[Id] INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL"
					+ ",[Firstname] NVARCHAR(128)  NOT NULL"
					+ ",[Lastname] NVARCHAR(128)  NOT NULL"
					+ ",[Alias] NVARCHAR(128)  NOT NULL"
					+ ",[CountryId] INTEGER  NOT NULL"
					+ ",[State] INTEGER  NOT NULL)";
			
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			Artist artist = new Artist();
			artist.setFirstname("Marshall");
			artist.setLastname("Mathers");
			artist.setAlias("EMINEM");
			artist.setCountryId(2);
			
			createArtist(artist);
			
			artist = new Artist();
			artist.setFirstname("Curtis James");
			artist.setLastname("Jackson III");
			artist.setAlias("50 Cent");
			artist.setCountryId(2);
			
			createArtist(artist);
			
			artist = new Artist();
			artist.setFirstname("Madonna Louise");
			artist.setLastname("Ciccone");
			artist.setAlias("Madonna");
			artist.setCountryId(2);
			
			createArtist(artist);
			
			artist = new Artist();
			artist.setFirstname("Justin");
			artist.setLastname("Timberlake");
			artist.setAlias("Justin Timberlake");
			artist.setCountryId(2);
			
			createArtist(artist);
		
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	
	
	private void InitializeUser(){		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		 try {
			 
			 connection = DB.getConnection();
			 
			String statementString = " SELECT name FROM sqlite_master WHERE name='User'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();
			
			String name = "";
			while(rs.next()){
					
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE IF NOT EXISTS [User] ("
					+ "[Id] INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL"
					+ ",[Username] NVARCHAR(128)  NOT NULL"
					+ ",[Password] NVARCHAR(128)  NOT NULL"
					+ ",[Firstname] NVARCHAR(128)  NOT NULL"
					+ ",[Lastname] NVARCHAR(128)  NOT NULL"
					+ ",[Zip] NVARCHAR(128)  NOT NULL"
					+ ",[Location] NVARCHAR(128)  NOT NULL"
					+ ",[Street] NVARCHAR(128)  NOT NULL"
					+ ",[StreetNumber] NVARCHAR(128)  NOT NULL"
					+ ",[Mail] NVARCHAR(128)  NOT NULL"
					+ ",[State] INTEGER  NOT NULL"
					+ ",[IsAdmin] BOOLEAN  NOT NULL)";
			
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement);
						
			User user = new User();
			user.setFirstname("Admin");
			user.setLastname("Admin");
			user.setLocation("Berlin");
			user.setMail("info@admin.de");
			user.setPassword(encryptPassword("1"));
			user.setStreet("Berlinerstreet");
			user.setStreetNumber("1");
			user.setUsername("Admin");
			user.setZip("1000");
			user.setIsAdmin(true);
			
			createUser(user);
		
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	private void InitializeCountry(){		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		 try {
			 
			connection = DB.getConnection();
			String statementString = "SELECT name FROM sqlite_master WHERE name='Country'";
			statement = connection.prepareStatement(statementString);
			rs = statement.executeQuery();

			String name = "";
				
			while(rs.next()){				
				name = rs.getString("name");
			}
			
			if(name.equals("") == false) return;
			
			closeConnection(connection, statement, rs);
			 
			connection = DB.getConnection();
			
			statementString = "CREATE TABLE IF NOT EXISTS [Country] ("
					+ "[Id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT"
					+ ",[Shortcut] NVARCHAR(5)  NOT NULL"
					+ ",[Name] NVARCHAR(256)  NOT NULL"
					+ ",[State] INTEGER  NOT NULL)";
			
			statement = connection.prepareStatement(statementString);
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			connection = DB.getConnection();
			
			statementString = "INSERT INTO Country (Shortcut, Name, State)"
					+ " VALUES (?, ?, ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, "eu");
			statement.setString(2, "Europa");
			statement.setLong(3, SqlState.Active.getValue());
			
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			connection = DB.getConnection();
			
			statementString = "INSERT INTO Country (Shortcut, Name, State)"
					+ " VALUES (?, ?, ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, "usa");
			statement.setString(2, "Amerika");
			statement.setLong(3, SqlState.Active.getValue());
			
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			connection = DB.getConnection();
			
			statementString = "INSERT INTO Country (Shortcut, Name, State)"
					+ " VALUES (?, ?, ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, "uk");
			statement.setString(2, "England");
			statement.setLong(3, SqlState.Active.getValue());
			
			statement.executeUpdate();

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			finally{
				closeConnection(connection, statement);
			}
	}
		
	public ArrayList<Artist> getAllArtists(){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Artist.Id AS ArtistId"
					+ ", Artist.Firstname"
					+ ", Artist.Lastname"
					+ ", Artist.Alias"
					+ ", Country.Id AS CountryId"
					+ ", Country.Shortcut"
					+ ", Country.Name"
					+ " FROM Artist"
					+ " INNER JOIN Country ON Artist.CountryId=Country.Id"
					+ " WHERE Artist.State <> ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
				
			ArrayList<Artist> entities = new ArrayList<Artist>();
			
			while(rs.next()){
				Artist entity = new Artist();
				
				entity.setId(rs.getInt("ArtistId"));
				entity.setFirstname(rs.getString("Firstname"));
				entity.setLastname(rs.getString("Lastname"));
				entity.setAlias(rs.getString("Alias"));
				
				Country country = new Country();
				country.setId(rs.getInt("CountryId")) ;
				country.setName(rs.getString("Name"));
				country.setShortcut(rs.getString("Shortcut"));
				
				entity.setCountry(country);

				entities.add(entity);
			}

			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
		
	public  ArrayList<Song> getTopSongs(String country){
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
				
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Song.State"
					+ ", SongRanking.Rank"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN SongRanking ON Song.Id = SongRanking.SongId"
					+ " INNER JOIN Country ON SongRanking.CountryId=Country.Id"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " WHERE Country.Shortcut = ?"
					+ " AND SongRanking.Rank <> ?"
					+ " AND Song.State <> ?"
					+ " ORDER BY SongRanking.Rank"
					+ " limit 10;";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, country);
			statement.setLong(2, 0);
			statement.setLong(3, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
				
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				entity.setRank(rs.getInt("Rank"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
			
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public  ArrayList<Song> getSongsWithRanking(String country){
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
				
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " WHERE Song.State <> ?";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
				
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				
				entities.add(entity);
			}
						
			closeConnection(connection, statement, rs);
			
			connection = DB.getConnection();
						
			statementString = "SELECT"
								+ " SongRanking.SongId"
								+ ", SongRanking.Rank"
								+ " FROM SongRanking"
								+ " INNER JOIN Country ON SongRanking.CountryId=Country.Id"
								+ " WHERE Country.Shortcut = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, country);
			rs = statement.executeQuery();
			
			Map<Integer, Integer> rankings = new HashMap<Integer, Integer>();
					
			while(rs.next()){				
				rankings.put(rs.getInt("SongId"), rs.getInt("Rank"));
			}
			
			for (Song song : entities) {	
				song.setRank(rankings.getOrDefault(song.getId(), 0));
			}
			
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public ArrayList<Song> getAllSongByContainsTitel(String titel){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
			
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " WHERE Song.State <> ?"		
					+ " AND Song.Titel LIKE ? ;";
						
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setString(2, "%" + titel + "%");
			rs = statement.executeQuery();
			
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
						
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
		
	public ArrayList<String> getAllSongTitelByContainsTitel(String titel){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
			
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Titel"
					+ " FROM Song"
					+ " WHERE Song.State <> ?"				
					+ " AND Song.Titel LIKE ? ;";
						
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setString(2, "%" + titel + "%");
			rs = statement.executeQuery();
			
			ArrayList<String> entities = new ArrayList<String>();
								
			while(rs.next()){				
				entities.add(rs.getString("Titel"));
			}
						
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
		
	public ArrayList<Song> getAllSongsByArtist(String alias){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
				
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Song.State"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " WHERE Song.State <> ?"
					+ "AND Artist.Alias = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setString(2, alias);
			rs = statement.executeQuery();
			
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
			
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public ArrayList<Song> getAllFavoriteSongs(int userId){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " INNER JOIN Favorites ON Song.Id=Favorites.SongId"
					+ " WHERE Song.State <> ?"
					+ " AND Favorites.UserId = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, userId);
			rs = statement.executeQuery();
			
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
			
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public ArrayList<Song> getAllSongs(){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Song.Id AS SongId"
					+ ", Song.Titel"
					+ ", Song.FileName"
					+ ", Artist.Id AS ArtistId"
					+ ", Artist.Alias"
					+ " FROM Song"
					+ " INNER JOIN Artist ON Song.ArtistId=Artist.Id"
					+ " WHERE Song.State <> ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
			
			ArrayList<Song> entities = new ArrayList<Song>();
			
			while(rs.next()){
				Song entity = new Song();
				
				entity.setId(rs.getInt("SongId"));
				entity.setTitel(rs.getString("Titel"));
				entity.setFileName(rs.getString("FileName"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
			
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public int getCountryIdByShortcut(String shortcut){
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		 try {
			connection = DB.getConnection();							
			String statementString = "SELECT * FROM Country";
			statement = connection.prepareStatement(statementString);
			
			rs = statement.executeQuery();
			
			ArrayList<Country> countries = new ArrayList<Country>();
			while(rs.next()){
				Country country = new Country();
				
				country.setId(rs.getInt("Id"));
				country.setName(rs.getString("Name"));
				country.setShortcut(rs.getString("Shortcut"));
				
				countries.add(country);
			}
						
			for (Country country : countries) {
				if(country.getShortcut().equals(shortcut)) {
					return country.getId();
				}
			}
						
			return 0;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return 0;
			}
			finally{
				closeConnection(connection, statement, rs);
			}
	}
	
	public boolean authenticate(Login login){
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Username"
					+ ", Password"
					+ " FROM User"
					+ " WHERE Username = ?"
					+ " AND State <> ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, login.getUsername());
			statement.setLong(2, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
			
			while(rs.next()){
				String password = encryptPassword(login.getPassword()); 
				
				if(password.equals(rs.getString("Password"))){
					return true;
				}
				else{					
					return false;
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
			
		return false;
	}
	
	public int getUsersIdByUsername(String username){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT Id FROM User WHERE State <> ? AND Username = ? limit 1;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setString(2, username);
			rs = statement.executeQuery();
						
			while(rs.next()){
				return rs.getInt("Id");
			}
			
			return 0;			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return 0;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public boolean checkIfUserIsAdminByUsername(String username){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT IsAdmin FROM User WHERE State <> ? AND Username = ? limit 1;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setString(2, username);
			rs = statement.executeQuery();
						
			while(rs.next()){
				return rs.getBoolean("IsAdmin");
			}
			return false;		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
		
	public  ArrayList<User> getAllUsers(){	
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		ArrayList<User> entities = new ArrayList<User>();
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT * FROM User WHERE State <> ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			rs = statement.executeQuery();
						
			while(rs.next()){
				User entity = new User();
				
				entity.setId(rs.getInt("Id"));
				entity.setUsername(rs.getString("Username"));
				entity.setPassword(rs.getString("Password"));
				entity.setFirstname(rs.getString("Firstname"));
				entity.setLastname(rs.getString("Lastname"));
				entity.setZip(rs.getString("Zip"));
				entity.setLocation(rs.getString("Location"));
				entity.setStreet(rs.getString("Street"));
				entity.setStreetNumber(rs.getString("StreetNumber"));
				entity.setMail(rs.getString("Mail"));
				entities.add(entity);
			}
						
			return entities;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	public boolean deleteArtist(int Id){
		
		Connection connection = null;
		PreparedStatement statement = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE Artist SET State = ? WHERE Id = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean deleteSong(int Id){
		
		Connection connection = null;
		PreparedStatement statement = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE Song SET State = ? WHERE Id = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			int count = statement.executeUpdate();
					
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean deleteUser(int Id){
		
		Connection connection = null;
		PreparedStatement statement = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE User SET State = ? WHERE Id = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean createArtist(Artist artist){
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		 try {
			connection = DB.getConnection();
			
			String statementString = "INSERT INTO Artist ("
					+ "Firstname"
					+ ", Lastname"
					+ ", Alias"
					+ ", CountryId"
					+ ", State"
					+ ")"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, artist.getFirstname());
			statement.setString(2, artist.getLastname());
			statement.setString(3, artist.getAlias());
			statement.setLong(4, artist.getCountryId());
			statement.setLong(5,  SqlState.Active.getValue());
			
			statement.executeUpdate();
						
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean createRank(Song song, String country){
		
		Connection connection = null;
		PreparedStatement statement = null;

		 try {
			int countryId = getCountryIdByShortcut(country);	
			
			connection = DB.getConnection();
			
			String statementString = "DELETE FROM SongRanking "
					+ "WHERE SongId = ? AND CountryId = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, song.getId());
			statement.setLong(2, countryId);
				
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			connection = DB.getConnection();
			statementString = "INSERT INTO SongRanking (SongId, Rank, CountryId)"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, song.getId());
			statement.setLong(2, song.getRank());
			statement.setLong(3, countryId);
			
			statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean createSong(Song song){
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		 try {
			connection = DB.getConnection();
			
			String statementString = "INSERT INTO Song ("
					+ "Titel"
					+ ", ArtistId"
					+ ", FileName"
					+ ", State"
					+ ")"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?"
					+ ", ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, song.getTitel());
			statement.setLong(2, song.getArtistId());
			statement.setString(3, song.getFileName());			
			statement.setLong(4,  SqlState.Active.getValue());
			
			statement.executeUpdate();
						
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean createFavorite(int songId, int userId){
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		 try {
			connection = DB.getConnection();
			
			String statementString = "DELETE FROM Favorites WHERE SongId = ? AND UserId = ? ;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, songId);
			statement.setLong(2, userId);
			
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			connection = DB.getConnection();
			
			statementString = "INSERT INTO Favorites "
					+ "(SongId, UserId)"
					+ " VALUES(?, ?) ;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, songId);
			statement.setLong(2, userId);
			
			statement.executeUpdate();
						
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
	
	public boolean createUser(User user){
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		 try {
			connection = DB.getConnection();
			
			String statementString = "INSERT INTO User ("
					+ "Username"
					+ ", Password"
					+ ", Firstname"
					+ ", Lastname"
					+ ", Zip"
					+ ", Location"
					+ ", Street"
					+ ", StreetNumber"
					+ ", Mail"
					+ ", State"
					+ ", IsAdmin"					
					+ ")"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?"
					+ ", ?)";
			
			statement = connection.prepareStatement(statementString);
			statement.setString(1, user.getUsername());
			statement.setString(2, encryptPassword(user.getPassword()));
			statement.setString(3, user.getFirstname());
			statement.setString(4, user.getLastname());
			statement.setString(5, user.getZip());
			statement.setString(6, user.getLocation());
			statement.setString(7, user.getStreet());
			statement.setString(8, user.getStreetNumber());
			statement.setString(9,  user.getMail());
			statement.setLong(10,  SqlState.Active.getValue());
			statement.setBoolean(11, user.getIsAdmin());			
			
			statement.executeUpdate();
						
			return true;
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				return false;
			}
			finally{
				closeConnection(connection, statement);
			}
	}
		
	private void closeConnection(Connection connection, Statement statement){
		try{
			connection.close();
			connection = null;
		}catch(Exception e) {}
		
		try{
			statement.close();
			statement = null;
		}catch(Exception e) {}
	}
	
	private void closeConnection(Connection connection, Statement statement, ResultSet rs){
		closeConnection(connection, statement);
		
		try{
			rs.close();
			rs = null;
		}catch(Exception e) {}
	}
	
	private String encryptPassword(String password){
        String passwordToHash = "password";
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
			System.out.println(e.getMessage());
        }
        return generatedPassword;
    }
	
}
