/*
 * Lukas Krampiz
 * Oct 8, 2020
 * 
 */
package guiexercise2;

import java.text.DecimalFormat;

/**
 *
 * @author lukra1175
 */
public class InvestCalcDryTest {
    
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        
        double rate = 10;
        int years = 20;
        double prince = 5000;
        double intrestAmtYear;
        double intrestAmt;
        
        String chart = "Year\t\tBeg Value\t\tAmt Interest\t\tEnd Value";

        for (int year = 0; year < years; year++) {
            //reset the intrestAmtYear
            intrestAmtYear = 0;
            
            chart += "\n" + (year + 1) + "\t\t" + money.format(prince);
            //get q1
            intrestAmt = (prince /100) * 2.5;
            intrestAmtYear+=intrestAmt;
            prince+=intrestAmt;
            //get q2
            intrestAmt = (prince /100) * 2.5;
            intrestAmtYear+=intrestAmt;
            prince+=intrestAmt;
            //get q3
            intrestAmt = (prince /100) * 2.5;
            intrestAmtYear+=intrestAmt;
            prince+=intrestAmt;
            //get q4
            intrestAmt = (prince /100) * 2.5;
            intrestAmtYear+=intrestAmt;
            prince+=intrestAmt;
            
            //add to the chart
            chart += "\t\t" + money.format(intrestAmtYear) + "\t\t" + money.format(prince);
        }
        
        System.out.println(chart);
    }

}
