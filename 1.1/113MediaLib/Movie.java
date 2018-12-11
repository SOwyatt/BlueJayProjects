
/**
 * Movie
 *
 * @Travis Bergeron
 * @9/13/2018
 */
public class Movie
{
        // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;

    /** Constructos */
    public Movie() 
    {
        rating = 0;
        title = "";
        duration = 0;
    }
    
    public Movie(String title) 
    {
        this.title = title;
        rating = 0;
        duration = 0;
    }
    
    public Movie(String title, int duration) 
    {
        this.title = title;
        this.duration = duration;
        rating = 0;
    }
    
    public Movie(String title, int duration, int rating) 
    {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
    
    
    //Setters
    public void setRating(int i) {
        rating = i;
    }
    
    public void setTitle(String i) {
        title = i;
    }
    
    public void setDuration(int i) {
        duration = i;
    }
    
    //Getters
    public String getTitle() {
        return title;
    }
    
    public int getRating() {
        return rating;
    }
    
    public int getDuration() {
        return duration;
    }
    
    
    private String displayDuration() {
        int hour = 0;
        int min = 0;
        
        hour = this.duration / 60;
        min = this.duration % 60;
        
        return hour + ":" + min;
    }
    
    public String displayMovie() {
        return this.title + " Duration: " + this.displayDuration() + " Rating: " + this.rating + " stars.";
    }
}
