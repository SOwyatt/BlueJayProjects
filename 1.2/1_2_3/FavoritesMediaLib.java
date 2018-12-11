import java.util.ArrayList;

/**
 * @author Travis Bergeron
 * @version 11/14/18
 */

public class FavoritesMediaLib { 
    public static void main(String [] args) { 
        ArrayList<String> songInfo = new ArrayList<>();
        final int FAVORITE = 8; // The (low) limit rating for a favorite song
        String[] data = MediaFile.readString().split("\\|");
        
        String output = "My Favorite Songs: \n";
        //Define two elements of songInfo, and complete the cnt=0 step
        songInfo.add(data[0]);
        songInfo.add(data[1]);
        for(int cnt = 1; ((cnt * 2) + 1) <= data.length; cnt++) {
            //Loop through all songs (each takes two indicies)
            songInfo.set(0, data[cnt * 2]);
            songInfo.set(1, data[(cnt * 2) + 1]);
            //Turn the songInfo into [{TITLE}, {RATING}]
            
            if(Integer.parseInt(songInfo.get(1)) >= FAVORITE) {
                output += songInfo.get(0) + " (" + songInfo.get(1) + ") \n";
            }
        }
        
        System.out.println(output);
    }
}