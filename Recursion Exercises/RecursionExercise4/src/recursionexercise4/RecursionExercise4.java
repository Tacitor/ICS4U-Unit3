/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Fraction Reducer
 */
package recursionexercise4;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numer = Integer.parseInt(JOptionPane.showInputDialog("What is the numerator?"));
        int demom = Integer.parseInt(JOptionPane.showInputDialog("What is the denominator?"));
        
        int gcf = getGCD(numer, demom);
        
        System.out.println("The reduced fraction of \" " + numer + " / " + demom + " \" is: " + numer / gcf + " / " + demom / gcf);
    }
    
    /**
     * Use Euclid's algorithm find the gcf of 2 ints 
     * @param a
     * @param b
     * @return 
     */
    public static int getGCD(int a, int b) {
        //check the base case
        if (a % b == 0) {
            //System.out.println("done");
            return b;            
        } else {
            //System.out.println("step");
            return getGCD(b, a % b);
        }
    }
    
}
