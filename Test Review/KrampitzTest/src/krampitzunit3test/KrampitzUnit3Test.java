/*
 * Lukas Krampiz
 * Oct 20, 2020
 * Format a positive integer so that is represents currency. Oh and also the answer to Part C of the unit 3 Test
 */
package krampitzunit3test;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class KrampitzUnit3Test {
    
    protected final static String PHRASE = "My friend, here is the formatted version: ";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean runLoop = true;
        boolean validInput;
        int input = 0;
        
        //main loop
        while (runLoop) {
            //no input yet
            validInput = false;
            //get some input
            while (!validInput) {     
                //error handeling
                try {
                    input = Integer.parseInt(JOptionPane.showInputDialog("Kindly enter an integer for formatting (enter -1 to quit)"));
                    validInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Sorry that is not an integer.\nTry again.", "Error: Bad Number!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            //check for stop condition
            if (input < 0) { //-1 but also any other ngeative number because I can "assume that the number entered by the user will be an integer greater than or equal to 0"
                runLoop = false;
                JOptionPane.showMessageDialog(null, "Calc you later!");
            } else {
                JOptionPane.showMessageDialog(null, formatInt(input));
            }
        }
        
    }
    
    /**
     * Format an integer so that it begins with a $ sign and has a comma every 1000.
     * @param n the integer to format
     * @return String formated
     */
    public static String formatInt(int n) {
        //check base case 
        if (n < 1000) { //check for anything that does not need a comma
            return PHRASE + "$" + n;
        } else { //check for anything that does need a comma
            String num = Integer.toString(n); //get a sting copy
            String back = num.substring(num.length()-3, num.length()); //get the back portion that goes after the comma
            int front = n / 1000; //get everything else
            return formatInt(front) + "," + back; //check the front if it needs further formating add a comma and add the back
        }
    }
    
}
