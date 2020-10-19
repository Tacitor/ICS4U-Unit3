/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Fibonacci Numbers
 */
package recursionexercise1;

import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNine = "";
        int input;
        
        
        //get the first 9
        for (int i = 0; i < 9; i++) {
            firstNine += fib(i+1) + ",";
        }
        //remove the last comma
        firstNine = firstNine.substring(0, firstNine.length() - 1 );
        
        System.out.println("Fibonacci Numbers");
        System.out.println("The first nine Fibonacci Numbers are: " + firstNine);
        
        input = Integer.parseInt(JOptionPane.showInputDialog("Which Fibonacci Number would you like to see? "));
        System.out.println("Fibonacci Number " + input + " is " + fib(input));
    }

    public static int fib(int n) {
        //check for base case
        if (n == 1 || n == 2) {
            return 1;
        } else if (n <= 0) {
            return 0;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
