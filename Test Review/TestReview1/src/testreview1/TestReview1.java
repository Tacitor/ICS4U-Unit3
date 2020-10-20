/*
 * Lukas Krampiz
 * Oct 20, 2020
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars
 */
package testreview1;

/**
 *
 * @author lukra1175
 */
public class TestReview1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(changeXY("xhixhix"));
    }
    
    public static String changeXY(String string) {
        if (string.equals("x")) {
            return "y";
        } else if (string.length() == 1) {
            return string;
        } else {
            String first =  string.substring(0, 1);
            String theRest = string.substring(1, string.length());
            return changeXY(first) + changeXY(theRest);
        }
    }
    
}
