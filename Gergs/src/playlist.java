public class playlist 
{
	String song_name;
	String artist_name;
	String album_name;
	
	public playlist(String song_name, String artist_name, String album_name) 
	{
		this.song_name = song_name;
		this.artist_name = artist_name;
		this.album_name = album_name;
	}
	
	public String getSong() {
		return song_name;
	}

	public String getArtist() 
	{
		return artist_name;
	}
		
	public String getAlbum() 
	{
		return album_name;
	}
	
	public void Display() 
	{
		System.out.println("Song: " + song_name);
		System.out.println("Artist: " + artist_name);
		System.out.println("Album: " + album_name);
	}
		
}
