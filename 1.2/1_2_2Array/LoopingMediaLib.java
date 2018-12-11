
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib {
    
    public static void main(String [] args) { 
        String data = MediaFile.readString();
        String songInfo = "";
        // int cnt = 0;
        
        String[] dataSplit = data.split("\\|");
        
        // while (cnt * 2 < dataSplit.length - 1) {
            // songInfo = dataSplit[cnt * 2] + "|" + dataSplit[(cnt * 2) + 1];
            // cnt += 1;
            
            // System.out.println("Title: " + songInfo.substring(0, songInfo.indexOf("|")));
            // System.out.println("Rating: " + songInfo.substring(songInfo.indexOf("|") + 1));
        // }
        
        for(int cnt = 0; ((cnt * 2) + 1) <= 100; cnt++) {
            if(cnt * 2 + 1 > dataSplit.length) break;

            songInfo = dataSplit[cnt * 2] + "|" + dataSplit[(cnt * 2) + 1];
            
            System.out.println("Title: " + songInfo.substring(0, songInfo.indexOf("|")));
            System.out.println("Rating: " + songInfo.substring(songInfo.indexOf("|") + 1));
        }
    }
    
}
