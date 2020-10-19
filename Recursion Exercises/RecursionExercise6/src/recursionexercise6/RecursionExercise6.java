/*
 * Lukas Krampiz
 * Oct 19, 2020
 * Square fractals
 */
package recursionexercise6;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author lukra1175
 */
public class RecursionExercise6 {

    protected static StandardPen p = new StandardPen(500, 500);
    protected static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
       p.setColor(Color.red);
        fractalSq(0, 0, 100);
    }
    
    public static void fractalSq(int x, int y, int r) throws InterruptedException {
        //check base case if the size is viable
        if (r > 1) {
            TimeUnit.MILLISECONDS.sleep(10);
            drawSquare(x, y, r);
            fractalSq(x + r, y + r, r/2);
            fractalSq(x + r, y - r, r/2);
            fractalSq(x - r, y - r, r/2);
            fractalSq(x - r, y + r, r/2);
        } else {
            i++;
            System.out.println("done " + i);
            return;
        }
        
    }

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
