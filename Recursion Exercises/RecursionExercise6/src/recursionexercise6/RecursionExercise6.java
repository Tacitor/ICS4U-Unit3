/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Square fractals
 */
package recursionexercise6;

import TurtleGraphics.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise6 {

    protected static StandardPen p = new StandardPen(500, 500);
    //protected static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //get center position ad size
        int x = Integer.parseInt(JOptionPane.showInputDialog("What is the x pos of the fractal?"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("What is the y pos of the fractal?"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("What is the size of the fractal?"));
        p.setColor(Color.red);
        //draw the fractal
        fractalSq(x, y, r);

    }
    
    /**
     * Draw a fractal of squares
     * @param x
     * @param y
     * @param r 
     */
    public static void fractalSq(int x, int y, int r) {
        //check base case if the size is viable
        if (r > 1) {
            //draw the main square
            drawSquare(x, y, r);
            //draw four smaller fractals in each corner
            fractalSq(x + r, y + r, r / 2);
            fractalSq(x + r, y - r, r / 2);
            fractalSq(x - r, y - r, r / 2);
            fractalSq(x - r, y + r, r / 2);
        } /*else {
            //i++;
            //System.out.println("done " + i);
            return;
        }*/

    }
    
    /**
     * Draw a square based off a center and a half side length
     * @param x
     * @param y
     * @param r 
     */
    public static void drawSquare(int x, int y, int r) {
        p.up();
        p.move(x, y);
        p.move(x + r, y + r);
        p.down();
        p.move(x + r, y - r);
        p.move(x - r, y - r);
        p.move(x - r, y + r);
        p.move(x + r, y + r);
    }

}
