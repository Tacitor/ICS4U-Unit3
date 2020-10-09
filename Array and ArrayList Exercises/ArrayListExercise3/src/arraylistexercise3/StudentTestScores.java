/*
 * Lukas Krampiz
 * Oct 9, 2020
 * Create a StudentTestScores application which looks similar to the one in the instructions.
 */
package arraylistexercise3;

import java.util.ArrayList;

/**
 *
 * @author lukra1175
 */
public class StudentTestScores extends javax.swing.JFrame {

    private static ArrayList<Student> students = new ArrayList();
    private static int index = 0;

    /**
     * Creates new form StudentTestScores
     */
    public StudentTestScores() {
        initComponents();
        loadTestingArr();
        updateTextFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl = new javax.swing.JLabel();
        test1Lbl = new javax.swing.JLabel();
        test1Lbl1 = new javax.swing.JLabel();
        test1Lbl2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        test1Txt = new javax.swing.JTextField();
        test2Txt = new javax.swing.JTextField();
        test3Txt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        avgTxt = new javax.swing.JTextField();
        avgLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        firstBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        countTxt = new javax.swing.JTextField();
        countLbl = new javax.swing.JLabel();
        globalAvgTxt = new javax.swing.JTextField();
        globalAvgLbl = new javax.swing.JLabel();
        highAvgLbl = new javax.swing.JLabel();
        highAvgTxt = new javax.swing.JTextField();
        highScoreLbl = new javax.swing.JLabel();
        highScoreTxt = new javax.swing.JTextField();
        highTestScoreTxt = new javax.swing.JTextField();
        highTestScoreLbl = new javax.swing.JLabel();
        highAvgScoreLbl = new javax.swing.JLabel();
        highAvgScoreTxt = new javax.swing.JTextField();
        indexLbl = new javax.swing.JLabel();
        indexTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Test Scores");

        namelbl.setText("Name:");

        test1Lbl.setText("Test 1:");

        test1Lbl1.setText("Test 2:");

        test1Lbl2.setText("Test 3:");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        avgTxt.setEditable(false);

        avgLbl.setText("Average:");

        nextBtn.setText(">");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        firstBtn.setText("<<");
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });

        lastBtn.setText(">>");
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });

        countTxt.setEditable(false);
        countTxt.setText("0");

        countLbl.setText("Count:");

        globalAvgTxt.setEditable(false);

        globalAvgLbl.setText("Overall Class Average:");

        highAvgLbl.setText("Student With Highest Average:");

        highAvgTxt.setEditable(false);

        highScoreLbl.setText("Student With Highest Test Score:");

        highScoreTxt.setEditable(false);

        highTestScoreTxt.setEditable(false);

        highTestScoreLbl.setText("Their Test Score");

        highAvgScoreLbl.setText("Thier Average:");

        highAvgScoreTxt.setEditable(false);

        indexLbl.setText("Current Index:");

        indexTxt.setEditable(false);
        indexTxt.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelbl)
                    .addComponent(test1Lbl)
                    .addComponent(test1Lbl1)
                    .addComponent(test1Lbl2)
                    .addComponent(avgLbl)
                    .addComponent(countLbl)
                    .addComponent(globalAvgLbl)
                    .addComponent(highAvgLbl)
                    .addComponent(highScoreLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(test1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(test2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100))
                            .addComponent(test3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastBtn)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(globalAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indexLbl)
                            .addComponent(highAvgScoreLbl)
                            .addComponent(highTestScoreLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(highAvgScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highTestScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test1Lbl)
                    .addComponent(test1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(test1Lbl1)
                    .addComponent(modifyBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(test1Lbl2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avgLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBtn)
                            .addComponent(backBtn)
                            .addComponent(firstBtn)
                            .addComponent(lastBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(globalAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(globalAvgLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highAvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highAvgLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highScoreLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(indexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indexLbl))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highAvgScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highAvgScoreLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highTestScoreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highTestScoreLbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        // TODO add your handling code here:
        index = 0;

        updateTextFields();
    }//GEN-LAST:event_firstBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (index != 0) {
            index--;
        }

        updateTextFields();
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if (index < students.size() - 1) {
            index++;
        }

        updateTextFields();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        // TODO add your handling code here:
        if (!students.isEmpty()) {
            index = students.size() - 1;
        } else {
            index = 0;
        }

        updateTextFields();
    }//GEN-LAST:event_lastBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        Student s = new Student(nameTxt.getText());
        s.setScore(1, Integer.parseInt(test1Txt.getText()));
        s.setScore(2, Integer.parseInt(test2Txt.getText()));
        s.setScore(3, Integer.parseInt(test3Txt.getText()));
        students.set(index, s);
        updateTextFields();
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Student s = new Student(nameTxt.getText());
        s.setScore(1, Integer.parseInt(test1Txt.getText()));
        s.setScore(2, Integer.parseInt(test2Txt.getText()));
        s.setScore(3, Integer.parseInt(test3Txt.getText()));
        students.add(s);

        updateTextFields();
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * Update the text fields to the current values
     */
    private void updateTextFields() {
        indexTxt.setText(Integer.toString(index + 1));
        countTxt.setText(Integer.toString(students.size()));
        nameTxt.setText(students.get(index).getName());
        avgTxt.setText(Integer.toString(students.get(index).getAverage()));
        test1Txt.setText(Integer.toString(students.get(index).getScore(1)));
        test2Txt.setText(Integer.toString(students.get(index).getScore(2)));
        test3Txt.setText(Integer.toString(students.get(index).getScore(3)));
        globalAvgTxt.setText(Integer.toString(getClassAvg()));
        highAvgTxt.setText(students.get(getHighAvg()).getName());
        highAvgScoreTxt.setText(Integer.toString(students.get(getHighAvg()).getAverage()));
        highScoreTxt.setText(students.get(getHighTest()[0]).getName());
        highTestScoreTxt.setText(Integer.toString(students.get(getHighTest()[0]).getScore(getHighTest()[1])));
    }

    /**
     * Return the index of the student with the highest test score
     *
     * @return
     */
    private int[] getHighTest() {
        int highTest = Integer.MIN_VALUE;
        int[] highIndex = new int[2];

        for (int j = 0; j < students.size(); j++) {
            for (int i = 1; i < 4; i++) {
                if (students.get(j).getScore(i) > highTest) {
                    highTest = students.get(j).getScore(i);
                    highIndex[0] = j;
                    highIndex[1] = i;
                }
            }
        }

        return highIndex;
    }

    /**
     * Return the index of the student with the highest average
     *
     * @return
     */
    private int getHighAvg() {
        int highAvg = Integer.MIN_VALUE;
        int highIndex = -1;

        for (int j = 0; j < students.size(); j++) {
            if (students.get(j).getAverage() > highAvg) {
                highAvg = students.get(j).getAverage();
                highIndex = j;
            }
        }

        return highIndex;
    }

    /**
     * Calculate and return the average of the class
     *
     * @return
     */
    private int getClassAvg() {
        double avg = 0; //set an acumulator
        //get every students average
        for (Student student : students) {
            avg += student.getAverage();
        }
        //claculate class average
        avg = avg / students.size();

        return (int) avg;
    }

    /**
     * Populates the ArrayList with Students. Used for testing when writing the
     * program to test new functionality without having to create students
     * manually each time.
     */
    private void loadTestingArr() {
        Student a = new Student("Tebby");
        a.setScore(1, 51);
        a.setScore(2, 98);
        a.setScore(3, 12);
        students.add(a);
        Student b = new Student("Torry");
        b.setScore(1, 58);
        b.setScore(2, 45);
        b.setScore(3, 15);
        students.add(b);
        Student c = new Student("Tanny");
        c.setScore(1, 84);
        c.setScore(2, 65);
        c.setScore(3, 55);
        students.add(c);
    }

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
            java.util.logging.Logger.getLogger(StudentTestScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTestScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTestScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTestScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTestScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel avgLbl;
    private javax.swing.JTextField avgTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel countLbl;
    private javax.swing.JTextField countTxt;
    private javax.swing.JButton firstBtn;
    private javax.swing.JLabel globalAvgLbl;
    private javax.swing.JTextField globalAvgTxt;
    private javax.swing.JLabel highAvgLbl;
    private javax.swing.JLabel highAvgScoreLbl;
    private javax.swing.JTextField highAvgScoreTxt;
    private javax.swing.JTextField highAvgTxt;
    private javax.swing.JLabel highScoreLbl;
    private javax.swing.JTextField highScoreTxt;
    private javax.swing.JLabel highTestScoreLbl;
    private javax.swing.JTextField highTestScoreTxt;
    private javax.swing.JLabel indexLbl;
    private javax.swing.JTextField indexTxt;
    private javax.swing.JButton lastBtn;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel namelbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel test1Lbl;
    private javax.swing.JLabel test1Lbl1;
    private javax.swing.JLabel test1Lbl2;
    private javax.swing.JTextField test1Txt;
    private javax.swing.JTextField test2Txt;
    private javax.swing.JTextField test3Txt;
    // End of variables declaration//GEN-END:variables
}
