
/**
 * @Travis Bergeron
 * @11/19/2018
 */

// Double empty line between each new question
public class ArrayMediaLib {
    public static void main(String [] args) {
        // String[] sharingFriends = {
            // "Lilly",
            // "Addison",
            // "Logan",
            // "Gianna",
            // "Shane"
        // };
        
        // for(int i = 0; i < 5; i++) {
            // System.out.println(sharingFriends[i]);
        // }
        
        
        // for(String i : sharingFriends) {
            // System.out.println(i);
        // }
        
        
        // int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        // int total = 0;
        
        // for(int i : daysBtwnPurchase) {
            // total += i;
        // }
        
        // System.out.println(total / (double)daysBtwnPurchase.length);
        
        
        final Song[] topTenSongs = {
            new Song("The Twist"),
            new Song("Smooth"),
            new Song("Mack The Knife"),
            new Song("How Do I Live"),
            new Song("Party Rock Anthem"),
            new Song("I Gotta Feeling"),
            new Song("Macarena"),
            new Song("Physical"),
            new Song("You Light Up My Life"),
            new Song("mo bamba")
        };
        
        // for(int i = 0; i < topTenSongs.length; i++) {
            // String result = "";
            // if((i + 1) % 3 == 0) result += "Fizz";
            // if((i + 1) % 5 == 0) result += "Buzz";
            
            // if(result.equals("")) result = Integer.toString(i + 1);
            
            // topTenSongs[i].setTitle(result);
        // }
        
        // for(Song s : topTenSongs) {
            // s.setPrice(1.29)
        // }
        
        for(int i = 0, len = topTenSongs.length; i < len; ++i) {
            /* (i + 1) means every human third song will be $0.99, starting on index 2 (the third song)
               rather than index 0 (the first song) */
            topTenSongs[i].setPrice(((i + 1) % 3 == 0) ? .99 : 1.29);
        }
        
        //This is to make the output more readable- prices should be aligned.
        // int maxLength = 0;
        // for(Song s : topTenSongs) {
            // if(s.getTitle().length() > maxLength) maxLength = s.getTitle().length();
        // }
        // maxLength += 3;
        // for(Song s : topTenSongs) {
            // s.setTitle(s.getTitle() + " ");
            // while(s.getTitle().length() < maxLength) {
                // s.setTitle(s.getTitle() + ".");
            // }
            // s.setTitle(s.getTitle() + " ");
        // }
        
        // // Output
        // for(int i = 0, len = topTenSongs.length; i < 5 && i < len; ++i) {
            // Song s = topTenSongs[i];
            // System.out.println(s.getTitle() + " $" + s.getPrice());
        // }
        
        // For and for-each to print every other song
        // System.out.println("----- Every other with FOR ----- ");
        // for(int i = 0, len = topTenSongs.length; i < len; i += 2) {
            // System.out.println(topTenSongs[i].getTitle() + topTenSongs[i].getPrice());
        // }
        // System.out.println("----- Every other with FOR EACH ----- ");
        // int cnt = 0;
        // for(Song s : topTenSongs) {
            // if(cnt % 2 == 0) System.out.println(s.getTitle() + s.getPrice());
            // cnt++;
        // }
        int index;
        
        // index = SongFinder.findTitle(null, null);
        // if(index >= 0) {
            // System.out.println("Found " + topTenSongs[index].getTitle());
        // }
        // else {
            // System.out.println("Song not found!");
        // }
        
        // index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        // if (index >= 0 ) {
            // System.out.println("Discount found " + topTenSongs[index].getTitle());
        // }
        // else {
            // System.out.println("No songs are discounted");
        // }   
        
        System.out.println("--Find last song --");
        index = SongFinder.getIndexLastTitle(topTenSongs);
        if (index >= 0 ) {
            System.out.println("Last title: " + topTenSongs[index].getTitle());
        }
        else {
            System.out.println("You have a blank title!");
        }
        }
}
