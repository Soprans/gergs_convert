import java.util.ArrayList;
import java.util.Scanner;

public class playlist_Convertion 
{
    
    public void start_Convertion() 
    {
        ArrayList<playlist> play = new ArrayList<playlist>();
        play.add(new playlist("It's On", "Korn", "Follow The Leader"));
        play.add(new playlist("Lucid Dreams", "Juice WRLD", "Goodbye & Good Riddance"));
        play.add(new playlist("Night Lights", "Gerry Mulligan", "Night Lights"));
        play.add(new playlist("Is It A Crime?", "Sade", "Promise"));
        
        ArrayList<playlist> app = new ArrayList<playlist>();
        app.add(new playlist("It's On", "Korn", "Follow The Leader"));
        app.add(new playlist("Lucid Dreams", "Juice WRLD", "Goodbye & Good Riddance"));
        app.add(new playlist("Break Stuff", "Limp Bizkit", "Significant Other"));
        app.add(new playlist("Twist", "Korn", "Life Is Peachy"));
        app.add(new playlist("Is It A Crime?", "Sade", "Promise"));
        
    	System.out.println("~~~~~~~~~~~~Playlist A~~~~~~~~~~~");
    	System.out.println();
    	
        showPlaylist(play);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    	System.out.println();
        
        convert_Playlist(play, app);
	} 
    
    public static void showPlaylist(ArrayList<playlist> play) 
    {	
        for (int i = 0; i < play.size(); i++) 
        {
        	System.out.println("Song " + (i + 1));
        	System.out.println("-----------------------");
        	play.get(i).Display();
        	System.out.println("-----------------------");
        	System.out.println();
        }
    }
    
    public static void convert_Playlist(ArrayList<playlist> play, ArrayList<playlist> app) 
    {
    	ArrayList<playlist> new_play = new ArrayList<playlist>();
    	
    	int play_len = play.size();
    	int r = 0;
    	
    	for (playlist p : play) 
    	{
    		String p_song = p.getSong();
    		String p_artist = p.getArtist();
    		String p_album = p.getAlbum();
    		
    		for (playlist a : app) 
    		{
    			String a_song = a.getSong();
    			String a_artist = a.getArtist();
        		String a_album = a.getAlbum();
    			
        		boolean song_result = a_song.contains(p_song);
        		boolean artist_result = a_artist.contains(p_artist);
        		boolean album_result = a_album.contains(p_album);
    			
        		if (song_result && artist_result && album_result)
        		{
        			new_play.add(new playlist(p_song, p_artist, p_album));
        			r += 1;
        		}
    		}
    	}
    	
    	double doubleR = Double.valueOf(r);
    	double doubleLen = Double.valueOf(play_len);
    	
    	double finalResult = (doubleR/doubleLen) * 100;
		
    	System.out.println();
		System.out.println("Convertion Complete");
		System.out.println("Result: " + String.format("%.0f", finalResult) + "%");
		System.out.println("~~~~~~~~~~~~New Playlist~~~~~~~~~~~");
		System.out.println();
		showPlaylist(new_play);
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}