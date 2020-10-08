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
public class InvestCalc extends javax.swing.JFrame {

    static DecimalFormat money = new DecimalFormat("$#,##0.00");

    static double rate;
    static int years;
    static double prince;
    static double intrestAmtYear;
    static double intrestAmt;
    static String chart;

    /**
     * Creates new form InvestCalc
     */
    public InvestCalc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rateLbl = new javax.swing.JLabel();
        yearsLbl = new javax.swing.JLabel();
        princeLbl = new javax.swing.JLabel();
        rateSpn = new javax.swing.JSpinner();
        yearsSpn = new javax.swing.JSpinner();
        princeTxt = new javax.swing.JTextField();
        calcBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTxtar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 240, 255));
        jPanel1.setForeground(new java.awt.Color(200, 240, 255));
        jPanel1.setToolTipText("");

        rateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rateLbl.setText("Rate %:");

        yearsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearsLbl.setText("Years Invested:");

        princeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        princeLbl.setText("Beginning Principal:");

        rateSpn.setMaximumSize(new java.awt.Dimension(30, 50));
        rateSpn.setMinimumSize(new java.awt.Dimension(30, 50));
        rateSpn.setPreferredSize(new java.awt.Dimension(30, 50));
        rateSpn.setRequestFocusEnabled(false);

        yearsSpn.setMaximumSize(new java.awt.Dimension(30, 50));
        yearsSpn.setMinimumSize(new java.awt.Dimension(30, 50));
        yearsSpn.setPreferredSize(new java.awt.Dimension(30, 50));

        princeTxt.setText("5000");

        calcBtn.setText("Calculate");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        outputTxtar.setEditable(false);
        outputTxtar.setColumns(20);
        outputTxtar.setRows(5);
        jScrollPane1.setViewportView(outputTxtar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rateLbl)
                            .addComponent(yearsLbl)
                            .addComponent(princeLbl))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(princeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rateSpn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addComponent(yearsSpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rateLbl)
                            .addComponent(rateSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearsSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearsLbl))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(princeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(princeLbl))
                        .addGap(18, 18, 18)
                        .addComponent(calcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 257, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        // TODO add your handling code here:
        //reset the chart
        chart = "Year\t\tBeg Value\t\tAmt Interest\t\tEnd Value";
        
        //load the entered values
        rate = (int) rateSpn.getValue();
        years = (int) yearsSpn.getValue();
        prince = Integer.parseInt(princeTxt.getText());
        
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
        
        outputTxtar.setText(chart);
        //System.out.println(chart);
    }//GEN-LAST:event_calcBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvestCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvestCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvestCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvestCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvestCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputTxtar;
    private javax.swing.JLabel princeLbl;
    private javax.swing.JTextField princeTxt;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JSpinner rateSpn;
    private javax.swing.JLabel yearsLbl;
    private javax.swing.JSpinner yearsSpn;
    // End of variables declaration//GEN-END:variables
}
