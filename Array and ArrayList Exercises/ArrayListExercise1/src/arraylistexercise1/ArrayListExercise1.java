/*
 * Lukas Krampitz
 * Oct 9, 2020
 * Write a program that takes 10 integers as input and sort them.
 */
package arraylistexercise1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tacitor
 */
public class ArrayListExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //vars
        ArrayList<Integer> evenList =  new ArrayList();
        ArrayList<Integer> oddList =  new ArrayList();
        ArrayList<Integer> negativeList =  new ArrayList();
        int input;
        int num = 10;//how many times to loop
        
        for (int i = 0; i < num; i++) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (" + (num - i) + " left): "));
            
            //check which ArrayList to store it in
            if (input < 0) {
                negativeList.add(input);
            } else if (input % 2 == 0) {
                evenList.add(input);
            } else if (input % 2 == 1) {
                oddList.add(input);
            } else {
                System.out.println("This is a bug, and something when wrong");
            }
        }
        
        //display the results
        System.out.println("You entered the folling even numbers:");
        for (int even: evenList) {
            System.out.println(even);
        }
        System.out.println("You entered the folling odd numbers:");
        for (int odd: oddList) {
            System.out.println(odd);
        }
        System.out.println("You entered the folling negative numbers:");
        for (int negative: negativeList) {
            System.out.println(negative);
        }
        
    }
    
}
