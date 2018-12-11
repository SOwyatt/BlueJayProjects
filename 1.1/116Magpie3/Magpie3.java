/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
    /**
     * Get a default greeting
     * 
     * @return a greeting
     */
    public String getGreeting()
    {
        return getRandomGreeting(); // Picks a random greeting to output
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        
        if(statement.trim().length() < 1) {
            response = "Say something, please";
            return response;
        }
        if (findKeyword(statement, "no", 0) >= 0) { // Default
            response = "Why so negative?";
        }
        else if(findKeyword(statement, "dog", 0) >= 0 || findKeyword(statement, "cat", 0) >= 0) { // Added x
            response = "Tell me more about your pets.";
        }
        else if(findKeyword(statement, "duck", 0) >= 0) { // Added
            response = "Squeak";
        }
        else if(findKeyword(statement, "klien", 0) >= 0) { // Added x
            response = "She sounds like a good teacher.";
        }
        else if(findKeyword(statement, "water", 0) >= 0 || findKeyword(statement, "H2O", 0) >= 0){ // Added
            response = "WATER GAME! WATER GAME!";
        }
        else if(findKeyword(statement, "phone", 0) >= 0) { // Added
            response = "No telecommunications devices permitted within the perimeter of this learning enviroment.";
        }
        else if(findKeyword(statement, "cheesecake", 0) >= 0) { // Added
            response = (findKeyword(statement, "!", 0) >= 0) ? "Cheesecake." : "CHEESECAKE!";
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
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0) {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length()) {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0))) {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * 
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
    
    /** Pick a random greeting
     * 
     * @return a string suitable as a greeting
     */
    private String getRandomGreeting() {
        String[] greetings = { // Defines possible greetings
            "Hello, let's talk.",
            "Howdy partna",
            "Top of the morning",
            "Why hello there",
            "Cheesecake"
        };
        
        double r = Math.random(); // Picks a random number
        int rInt = (int)(r * greetings.length); // Makes r an int between 0 and greetings.length
        String greeting = greetings[rInt]; // Sets the greeting
        
        return greeting;
    }
}
