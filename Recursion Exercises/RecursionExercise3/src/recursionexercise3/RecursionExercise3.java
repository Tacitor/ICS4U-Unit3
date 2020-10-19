/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Triangle Blocks
 */
package recursionexercise3;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many rows does the triangle have?"));
        System.out.println("A triange with " + n + " rows has a total of " + getBlocks(n) + " blocks.");
    }
    
    public static int getBlocks(int n) {
        //check base case 
        if (n == 1) {
            return 1;
        } else if (n <= 0) {
            return 0;
        } else {
            return n + getBlocks(n - 1);
        }
    }
    
}
