
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author Travis Bergeron
 * @version 10/11/18
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();
        
        //Generate name
        String firstNSub = firstName.substring(0,3);
        String lastNSub = lastName.substring(0,3);
        String citySub = city.substring(0,2);
        String schoolSub = school.substring(0,3);
        
        String sciFiFirst = firstNSub + lastNSub;
        String sciFiLast = citySub + schoolSub;
        
        //Generate origin
        int relNameLen1 = relativeName1.length() - 1;
        int relNameLen2 = relativeName2.length() - 1;
        
        int r1 = (int) (Math.random() * relNameLen1);
        int r2 = (int) (Math.random() * relNameLen1);
        
        String sciFiOrigin = relativeName1.substring(r1);
        sciFiOrigin += relativeName2.substring(r2);
        
        //Case Corrections
        sciFiFirst = sciFiFirst.toLowerCase();
        sciFiLast = sciFiLast.toLowerCase();
        sciFiOrigin = sciFiOrigin.toLowerCase();
        
        sciFiFirst = sciFiFirst.substring(0,1).toUpperCase() + sciFiFirst.substring(1);
        sciFiLast = sciFiLast.substring(0,1).toUpperCase() + sciFiLast.substring(1);
        sciFiOrigin = sciFiOrigin.substring(0,1).toUpperCase() + sciFiOrigin.substring(1); 
        
        System.out.print("Hello " + sciFiFirst + " " + sciFiLast + " of " + sciFiOrigin + ". Welcome.");
    }
}
