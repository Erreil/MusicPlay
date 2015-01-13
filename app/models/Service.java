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
		if(instance == null) instance = new Service();
		return instance;
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
				
				Artist artist = new Artist();
				artist.setId(rs.getInt("ArtistId"));			
				artist.setAlias(rs.getString("Alias"));
				entity.setArtist(artist);
				
				entities.add(entity);
			}
			
			closeConnection(connection, statement, rs);
			
			statementString = "SELECT"
								+ " SongId"
								+ ", Rank"
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
				System.out.println("Rank: " + song.getTitel() + "---" + song.getRank());
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
				
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
				
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
				
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
					+ ", Song.FilePath"
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
				entity.setFilePath(rs.getString("FilePath"));
				
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
						
			String statementString = "SELECT Id FROM Country WHERE Shortcut = ?";
			statement = connection.prepareStatement(statementString);
			statement.setString(1, shortcut);
			
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
			
			String statementString = "DELETE FROM SongRanking ("
					+ "WHERE SongId = ? AND CountryId = ?;";
			
			statement = connection.prepareStatement(statementString);
			statement.setLong(1, song.getId());
			statement.setLong(2, countryId);
			
			statement.executeUpdate();
			
			closeConnection(connection, statement);
			
			statementString = "INSERT INTO SongRanking (SongId, Rank, CountryId)"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?";
			
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
					+ ", FilePath"
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
			statement.setString(3, song.getFilePath());			
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
