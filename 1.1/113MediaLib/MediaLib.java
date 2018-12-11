
/**
 * Does a Thing (1.1.2)
 *
 * @Travis Bergeron
 * @9/5/2018
 */
public class MediaLib
{
    public static void main(String [] args) {
        System.out.println("Welcome to your Media Library");
        
        /** Stuff from 1.2 */
        
        /*
        //Song
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        song1.setRating(3);
        System.out.println(song1.getTitle());
        System.out.println(song1.getRating());
        
        //Movie
        Movie movie1 = new Movie();
        movie1.setTitle("The Bee Movie");
        movie1.setRating(1000);
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getRating());
        
        //Book
        Book book1 = new Book();
        book1.setTitle("1984");
        book1.setRating(5);
        System.out.println(book1.getTitle());
        System.out.println(book1.getRating());
        
        */
        
        
        /** Stuff from 1.3 */
        
        //Define Songs
        Song songA = new Song("Africa", 1.29, 10);
        Song songB = new Song("Mr. Brightside", .99, 8);
        Song songC = new Song("Perfect Couple", 1.29, 8);
        Song songD = new Song("Sunflower", 1.29, 10);
        Song songE = new Song("Ten Feet Tall", .99, 7);
        Song songF = new Song("Green", 1.29, 10);
        Song songG = new Song("Cut my Hair", .99, 8);
        
        //Define Movies
        Movie movieA = new Movie("8th Grade", 94, 10);
        
        //Defind Counters and Trackers
        double totalCost = 0.0;
        int totalRating = 0;
        int numSongs = 7;
        
        //Define Averages
        double averageCost;
        double averageRating;
        
        //Increment counters
        
        totalRating = songA.getRating() + songB.getRating() + songC.getRating() + songD.getRating() + songE.getRating() + songF.getRating() + songG.getRating(); 
        totalCost = songA.getPrice() + songB.getPrice() + songC.getPrice() + songD.getPrice() + songE.getPrice() + songF.getPrice() + songG.getPrice();
        
        //Set Averages
        averageCost = totalCost / numSongs;
        averageRating = ((double) totalRating / numSongs);
        
        //Print output
        
        //Songs
        System.out.println("Songs:");
        
        System.out.println(songA.displaySong());
        System.out.println(songB.displaySong());
        System.out.println(songC.displaySong());
        System.out.println(songD.displaySong());
        System.out.println(songE.displaySong());
        System.out.println(songF.displaySong());
        System.out.println(songG.displaySong());
        
        
        System.out.print("\n Total Cost: $" + totalCost + " Total Rating: " + totalRating + " stars.");
        System.out.print("\n Average Cost: $" + averageCost + " Average Rating: " + averageRating + " stars.");
        
        //Movies
        System.out.println("\n\nMovies:");
        System.out.println(movieA.displayMovie());
        
    }
}