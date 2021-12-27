import java.util.Scanner;

public class gergs {

	public static void main(String[] args) 
	{
		menu();
	}

	public static void menu() 
    {
		System.out.println("Hello!");
		System.out.println();
		System.out.println();
		
	    Scanner menu_choice = new Scanner(System.in);
	    System.out.print("Would you like to convert playlist A to playlist B? (Y/N): ");

	    String convert_choice = menu_choice.nextLine();
	    System.out.println();
	    
	    switch (convert_choice) 
	    {
	    	case "Y":
	    	case "y":
	    		playlist_Convertion user_a = new playlist_Convertion();
	    		user_a.start_Convertion();
	    		System.out.println();
	    		break;
	    	case "N":
	    	case "n":
	    		System.out.println("Bonk!");
	    		break;
	    	default:
	    		System.out.println("Yallagugu!");
	    		System.out.println();
	    		menu();
	    }
	}
}
