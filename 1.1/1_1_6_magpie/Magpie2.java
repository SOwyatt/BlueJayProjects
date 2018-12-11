/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        
        if(statement.trim().length() < 1) {
            response = "Say something, please";
            return response;
        }
        
        if (statement.contains("no")) { // Default
            response = "Why so negative?";
        }
        else if(statement.contains("dog") || statement.contains("cat")) { // Added x
            response = "Tell me more about your pets.";
        }
        else if(statement.contains("duck")) { // Added
            response = "Squeak";
        }
        else if(statement.contains("klien")) { // Added x
            response = "She sounds like a good teacher.";
        }
        else if(statement.contains("water") || statement.contains("H2O")) { // Added
            response = "WATER GAME! WATER GAME!";
        }
        else if(statement.contains("phone")) { // Added
            response = "No telecommunications devices permitted within the perimeter of this learning enviroment.";
        }
        else if(statement.contains("cheesecake") || statement.contains("CHEESECAKE")) { // Added
            response = (statement.contains("!")) ? "Cheesecake." : "CHEESECAKE!";
        }
        // Default
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        }
            
        else {
            response = getRandomResponse();
        }
        
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse() {
        String[] responses = { // Defines responses
            "Interesting, tell me more.",
            "Hmmm.",
            "Do you really think so?",
            "You don't say.",
            "Wow.",
            "Cheesecake..." // This is an easter egg
        };
        
        double r = Math.random(); // picks a random number
        int rInt = (int)(r * responses.length); // Makes r an int between 0 and the number of responses
        String response = responses[rInt]; // Sets the response
        
        return response;
    }
}
