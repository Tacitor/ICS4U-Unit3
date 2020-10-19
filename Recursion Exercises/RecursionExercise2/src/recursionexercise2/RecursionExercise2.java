/*
 * Lukas Krampiz
 * Oct 19, 2020
 * n Choose r
 */
package recursionexercise2;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int r;
        int choose;
        
        r = Integer.parseInt(JOptionPane.showInputDialog("Number of items to choose (R): "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Number of items to choose from (N): "));
        
        choose = fact(n) / (fact(r) * fact(n - r));
        
        System.out.println("There are " + choose + " unique ways to choose " + r + " objects from a set of " + n + " total objects");
    }
    
    public static int fact(int n) {
        //check for base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    
}
