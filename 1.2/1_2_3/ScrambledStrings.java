
/**
 * Write a description of class ScrambledStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScrambledStrings {
    public static String scrambleWord(String input) {
        String[] inputAsList = input.toLowerCase().split("");
        
        for(int i = 0, len = inputAsList.length; i < len; ++i) {
            if(inputAsList[i].equals("a") && (inputAsList.length > i)) { 
                //If the current letter is a, the array has a next letter, and the next letter is not a
                if(inputAsList[i + 1].equals("a")) {
                    inputAsList[i] = inputAsList[i + 1]; // Swap the next letter with this one
                    inputAsList[i + 1] = "a"; // Set the next letter to a
                    i++; // Add 1 to i to skip the next spot, as that letter has already been swapped
                }
            } 
        }
        
        return String.join("", inputAsList);
    }
    
    public static void main(String [] args) {
        System.out.println(scrambleWord("aaaat"));
        System.out.println(scrambleWord("ataaa"));
        System.out.println(scrambleWord("atatat"));
        System.out.println(scrambleWord("taaaa"));
        System.out.println(scrambleWord("tttttt"));
    }
}