
/**
 * 
 *
 * @Travis Bergeron  
 * @9/5/2018
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
    
    public void setRating(int i) {
        rating = i;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getRating() {
        return rating;
    }
}
