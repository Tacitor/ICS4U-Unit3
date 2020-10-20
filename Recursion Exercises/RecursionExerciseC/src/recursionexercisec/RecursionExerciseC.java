/*
 * Lukas Krampitz
 * Oct 19, 2020
 * Sierpinski’s Triangle
 */
package recursionexercisec;

import TurtleGraphics.*;

/**
 *
 * @author Tacitor
 */
public class RecursionExerciseC {
    
    protected static StandardPen p = new StandardPen(500, 500);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //fractalTri(1, 1, 100);
        drawTri(10, 10, 50);
    }
    
    public static void fractalTri(int x, int y, int r) {
        //check base case if the size is viable
        if (r > 1) {
            drawTri(x, y, r);
            fractalTri(x + r, y + r, r / 2);
        } else {
            //i++;
            //System.out.println("done " + i);
            return;
        }

    }
    
    public static void drawTri(int x, int y, int r) {
        double small = Math.toRadians(120);
        double big = Math.toRadians(240);
        int bx = (int)(x * Math.cos(small) - ((y + r) * Math.sin(small)));
        int by = (int)(x * Math.sin(small) + ((y + r) * Math.cos(small)));
        int ax = (int)(x * Math.cos(big) - ((y + r) * Math.sin(big)));
        
        p.up();
        p.move(x, y);
        p.down();
        p.move(x, y);
        p.up();
        p.move(x, y + r);
        p.down();
        p.move(bx, by);
        p.move(ax, by);
        p.move(x, y + r);
        
    }
    
}
