import java.util.ArrayList;

public class Algorithms {
    public static void main(String [] args) {
        final Song[] topTen = {
            new Song("The Twist", 1),
            new Song("Smooth", 2),
            new Song("Mack The Knife", 1),
            new Song("How Do I Live", 4),
            new Song("Party Rock Anthem", 3),
            new Song("I Gotta Feeling", 4),
            new Song("Macarena", 11),
            new Song("Physical", 4),
            new Song("You Light Up My Life", 3),
            new Song("mo bamba", 2)
        };
        
        System.out.println("----- All Songs -----");
        printSongs(topTen);
        System.out.println("----- Top Song -----");
        printSongs(findBest(topTen));
        System.out.println("----- Tied as 2 -----");
        printSongs(findTies(topTen, 2));
    }
    
    private static void printSongs(Song[] songs) {
        int longestTitleLength = 0;
        for(Song s : songs) {
            if (s.getTitle().length() > longestTitleLength) {
                longestTitleLength = s.getTitle().length();
            }
        }
        for(Song s : songs) {
            String result = s.getTitle() + " ";
            for(int i = 0; i < (longestTitleLength + 3) -  s.getTitle().length(); i++) {
                result += ".";
            }
            result += " " + s.getRating();
            System.out.println(result);
        }
    }
    
    private static Song[] findBest(Song[] songs) {
        Song bestRating = songs[0];
        
        for(int i = 1; i < songs.length; i++) {
            if(bestRating.getRating() < songs[i].getRating()) {
                bestRating = songs[i];
            }
        }
        
        return new Song[] {bestRating};
    }
    
    private static Song[] findTies(Song[] songs, int rating) {
        ArrayList<Song> resultArrayList = new ArrayList<>();
        
        for(int i = 0; i < songs.length; i++) {
            if(songs[i].getRating() == rating) {
                resultArrayList.add(songs[i]);
            }
        }

        Song[] result = new Song[resultArrayList.size()];
        for(int i = 0; i < resultArrayList.size(); i++) {
            result[i] = resultArrayList.get(i);
        }
        
        return result;
    }
}
