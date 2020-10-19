/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Triangle A
 */
package recursionexercise5a;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise5a {
    
    public static final char STAR = '*';

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        String triOutput;
        
        triOutput = getTri(n);
        
        JOptionPane.showMessageDialog(null, triOutput);
    }
    
    public static String getTri(int n) {
        //check base case
        if (n == 1) {
            return getRow(n);
        } else {
            return getTri(n-1) + "\n" + getRow(n);
        }
    }
    
    public static String getRow(int n) {
        //check base case
        if (n == 1) {
            return Character.toString(STAR);
        } else {
            return Character.toString(STAR) + getRow(n-1);
        }
    }
    
}
