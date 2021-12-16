/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghost
 */
public class GUI extends javax.swing.JFrame {
    String[] queueString ;
    int headInt , size=0;
    String cylinders , moveFcfs ,headInitail , moveOptimized;
    int [] queueInt ;
    String fcfsSequenceOfCylinders = "" ;
    String optimizedSequenceOfCylinders = "" ;
    String [] returnFcfsAlgoritm ;
    String []returnOptimzed ;
    FCFS f = new FCFS();
    newOptimized o = new newOptimized();

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jlable = new javax.swing.JLabel();
        initialhead = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cylindersrequests = new javax.swing.JTextField();
        head = new javax.swing.JTextField();
        out = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        fcfs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        movement = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optimized = new javax.swing.JTextField();
        moveoptimized = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newoptimized = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlable.setText("cylinders I/O requests");

        initialhead.setText("Initial head ");

        jLabel3.setText("Sequence of FCFS");

        cylindersrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cylindersrequestsActionPerformed(evt);
            }
        });

        head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headActionPerformed(evt);
            }
        });

        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        fcfs.setText("FCFS");
        fcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Movement");

        movement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movementActionPerformed(evt);
            }
        });

        jLabel2.setText("Sequence of Optimized");

        optimized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optimizedActionPerformed(evt);
            }
        });

        moveoptimized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveoptimizedActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Movement");

        newoptimized.setText("Optimzed");
        newoptimized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newoptimizedActionPerformed(evt);
            }
        });

        jLabel5.setText("Assignment 2 OS Done By : Muaath Hasan & Yageen Mohamed ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fcfs)
                                .addGap(37, 37, 37)
                                .addComponent(newoptimized))
                            .addComponent(moveoptimized)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(initialhead, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlable)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cylindersrequests)
                            .addComponent(head, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movement)
                            .addComponent(optimized)
                            .addComponent(out))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cylindersrequests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialhead, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(movement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(optimized, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moveoptimized, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(fcfs)
                    .addComponent(newoptimized))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        cylinders = cylindersrequests.getText() ;
        headInitail = head.getText() ;
        headInt = Integer.parseInt(headInitail);
        for(int i =0 ; i< cylinders.length() ; i++){
            queueString = cylinders.split(" ");
        } 
        size = queueString.length ;
        queueInt = new int[size];
        for (int j = 0; j <queueString.length ; j++) {
            queueInt[j] = Integer.parseInt(queueString[j]);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cylindersrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cylindersrequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cylindersrequestsActionPerformed

    private void headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_headActionPerformed

    private void fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsActionPerformed
        // TODO add your handling code here:
        returnFcfsAlgoritm = f.fcfsAlgorithm(queueString, headInitail);
        for (int i = 0; i <returnFcfsAlgoritm.length; i++) {
            fcfsSequenceOfCylinders+= returnFcfsAlgoritm[i];
            fcfsSequenceOfCylinders+= " ";
        }
        out.setText(fcfsSequenceOfCylinders);
        moveFcfs = f.totalMovement(queueInt, headInt);
        movement.setText(moveFcfs);
    }//GEN-LAST:event_fcfsActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

    private void movementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movementActionPerformed

    private void optimizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optimizedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optimizedActionPerformed

    private void newoptimizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newoptimizedActionPerformed
        // TODO add your handling code here:
        returnOptimzed = o.optimizedAlgorithm(queueInt);
        for (int i = 0; i <returnOptimzed.length; i++) {
            optimizedSequenceOfCylinders+= returnOptimzed[i];
            optimizedSequenceOfCylinders+= " ";
        }
         optimized.setText(optimizedSequenceOfCylinders);
        moveOptimized = o.totalMovement(queueInt);
        moveoptimized.setText(moveOptimized);
    }//GEN-LAST:event_newoptimizedActionPerformed

    private void moveoptimizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveoptimizedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveoptimizedActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cylindersrequests;
    private javax.swing.JButton fcfs;
    private javax.swing.JTextField head;
    private javax.swing.JLabel initialhead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlable;
    private javax.swing.JTextField movement;
    private javax.swing.JTextField moveoptimized;
    private javax.swing.JButton newoptimized;
    private javax.swing.JTextField optimized;
    private javax.swing.JTextField out;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}