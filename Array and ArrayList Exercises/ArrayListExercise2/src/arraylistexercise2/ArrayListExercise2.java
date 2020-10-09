/*
 * Lukas Krampiz
 * Oct 9, 2020
 * Write a program that takes 10 decimal numbers as input and stores them in an ArrayList.
 */
package arraylistexercise2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class ArrayListExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vars
        ArrayList<Double> nums = new ArrayList();
        double input;
        int num = 10;//how many times to loop

        for (int i = 0; i < num; i++) {
            input = Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number (" + (num - i) + " left): "));

            nums.add(input);
        }
        
        System.out.println("The average of the numbers you entered is: " + getMean(nums));
        System.out.println("The following number(s) were above avergae:\n" + sortGreater(getMean(nums), nums) );
    }
    
    /**
     * Sort an ArrayList based on a limit. Any number larger is returned, all others are discarded
     * @param limit
     * @param list
     * @return 
     */
    public static ArrayList<Double> sortGreater(double limit, ArrayList<Double> list) {
        ArrayList<Double> above = new ArrayList();
        
        for (double num: list) {
            if (num > limit) {
                above.add(num);
            }
        }
        
        return above;
    }
    
    /**
     * Get the average of an ArrayList of doubles
     * @param list
     * @return 
     */
    public static double getMean(ArrayList<Double> list) {
        double mean = 0;
        for (double num: list) {
            mean += num;
        }
        
        mean = mean / list.size();
        
        return mean;
    }
    
}
