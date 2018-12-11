
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
    private double price;
    private boolean favorite;

    /** Constructors */
    public Song() 
    {
        rating = 0;
        title = "";
        price = 0;
        favorite = false;
    }
    
    public Song(String title, double price)
    {
        this.title = title;
        this.price = price;
        rating = 0;
        favorite = false;
    }
    
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        favorite = false;
    }
    
    
    //Mutators for flags
    public void addToFavorites() {
        favorite = true;
    }
    
    //Mutators for non-flags
    public void setRating(int i) {
        rating = i;
    }
    
    public void setTitle(String i) {
        title = i;
    }
    
    public void setPrice(double i) {
        price = i;
    }
    
    //Accessors
    public String getTitle() {
        return title;
    }
    
    public int getRating() {
        return rating;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String displaySong() {
        return this.title + " $" + this.price + " " + this.rating + " stars.";
    }
}
