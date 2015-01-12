package models;

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
		ArrayList<Artist> entities = new ArrayList<Artist>();
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
					
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
	public boolean deleteArtist(int Id){
		
		 Connection connection = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE Artist SET State = ? WHERE Id = ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public boolean createArtist(Artist artist){
		
		 Connection connection = null;
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, artist.getFirstname());
			statement.setString(2, artist.getLastname());
			statement.setString(3, artist.getAlias());
			statement.setLong(4, artist.getCountryId());
			statement.setLong(5,  SqlState.Active.getValue());
			
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public ArrayList<MusicType> getAllMusicTypes(){	
		
		Connection connection = null;
		ArrayList<MusicType> entities = new ArrayList<MusicType>();
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT * FROM MusicType WHERE State <> ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				MusicType entity = new MusicType();
				
				entity.setId(rs.getInt("Id"));
				entity.setType(rs.getString("Type"));
				entities.add(entity);
			}
			
			
			return entities;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
	public  ArrayList<Song> getTopSongs(String country){
		Connection connection = null;
		ArrayList<Song> entities = new ArrayList<Song>();
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, country);
			statement.setLong(2, 0);
			statement.setLong(3, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
					
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
	public  ArrayList<Song> getSongsWithRanking(String country){
		Connection connection = null;
		ArrayList<Song> entities = new ArrayList<Song>();
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
					
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
			
			String statementString2 = "SELECT"
								+ " SongId"
								+ ", Rank"
								+ " FROM SongRanking"
								+ " INNER JOIN Country ON SongRanking.CountryId=Country.Id"
								+ " WHERE Country.Shortcut = ?;";
			
			PreparedStatement statement2 = connection.prepareStatement(statementString2);
			statement2.setString(1, country);
			ResultSet rs2 = statement2.executeQuery();
			
			Map<Integer, Integer> rankings = new HashMap<Integer, Integer>();
					
			while(rs.next()){				
				rankings.put(rs.getInt("SongId"), rs.getInt("Rank"));
			}
			
			for (Song song : entities) {
				song.setRank(rankings.getOrDefault(song.getId(), 0));
			}
			
			return entities;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
	public ArrayList<Song> getAllSongs(){	
		
		Connection connection = null;
		ArrayList<Song> entities = new ArrayList<Song>();
		
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
					+ " WHERE Song.State <> ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
								
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
	public boolean deleteSong(int Id){
		
		 Connection connection = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE Song SET State = ? WHERE Id = ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public int getCountryIdByShortcut(String shortcut){
		Connection connection = null;
		
		 try {
			 connection = DB.getConnection();
			 
			String statementString = "SELECT"
					+ " Id"
					+ " FROM Country"
					+ " WHERE Shortcut = ?"
					+ " limit 1;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, shortcut);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				return rs.getInt("Id");
			}
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
		return 0;
	}
	
	public boolean createRank(Song song, String country){
			
		 Connection connection = null;
		 
		 int countryId = getCountryIdByShortcut(country);
		
		 try {
			connection = DB.getConnection();		
						
			String firstStatementString = "DELETE FROM SongRanking ("
					+ "WHERE SongId = ? AND CountryId = ?;";
			
			PreparedStatement firstStatement = connection.prepareStatement(firstStatementString);
			firstStatement.setLong(1, song.getId());
			firstStatement.setLong(2, countryId);
			
			int count = firstStatement.executeUpdate();
			
			String secondStatementString = "INSERT INTO SongRanking (SongId, Rank, CountryId)"
					+ " VALUES("
					+ "?"
					+ ", ?"
					+ ", ?";
			
			PreparedStatement secondStatement = connection.prepareStatement(secondStatementString);
			secondStatement.setLong(1, song.getId());
			secondStatement.setLong(2, song.getRank());
			secondStatement.setLong(3, countryId);
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public boolean createSong(Song song){
		
		 Connection connection = null;
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, song.getTitel());
			statement.setLong(2, song.getArtistId());
			statement.setString(3, song.getFilePath());			
			statement.setLong(4,  SqlState.Active.getValue());
			
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
		
	public boolean createUser(User user){
		
		 Connection connection = null;
		
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
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFirstname());
			statement.setString(4, user.getLastname());
			statement.setString(5, user.getZip());
			statement.setString(6, user.getLocation());
			statement.setString(7, user.getStreet());
			statement.setString(8, user.getStreetNumber());
			statement.setString(9,  user.getMail());
			statement.setLong(10,  SqlState.Active.getValue());
			
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public boolean deleteUser(int Id){
		
		 Connection connection = null;
		 
		 try {
			connection = DB.getConnection();
			
			String statementString = "UPDATE User SET State = ? WHERE Id = ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			statement.setLong(2, Id);
			int count = statement.executeUpdate();
			
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally{
				if(connection != null)
					try {
						connection.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
	}
	
	public boolean authenticate(Login login){
		
		Connection connection = null;
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT"
					+ " Username"
					+ ", Password"
					+ " FROM User"
					+ " WHERE Username = ?"
					+ " AND State <> ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setString(1, login.getUsername());
			statement.setLong(2, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()){
				if(login.getPassword().equals(rs.getString("Password"))) return true;
				else return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			
		return false;
	}
	
	public  ArrayList<User> getAllUsers(){	
		
		Connection connection = null;
		ArrayList<User> entities = new ArrayList<User>();
		
		try {
			connection = DB.getConnection();
			
			String statementString = "SELECT * FROM User WHERE State <> ?;";
			
			PreparedStatement statement = connection.prepareStatement(statementString);
			statement.setLong(1, SqlState.Deleted.getValue());
			ResultSet rs = statement.executeQuery();
						
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return entities;
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	}
	
}
