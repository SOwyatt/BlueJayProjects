
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
    }
}