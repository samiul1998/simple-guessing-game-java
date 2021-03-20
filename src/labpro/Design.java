/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpro;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Samiul
 */
public class Design extends javax.swing.JFrame {

    /**
     * Creates new form Design
     * 
     */
    int count1=0;
    int count2=0;
    public Design() {
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

        Dis = new javax.swing.JLabel();
        Input1 = new javax.swing.JPasswordField();
        Input2 = new javax.swing.JPasswordField();
        Player1G = new javax.swing.JTextField();
        Player1G1 = new javax.swing.JTextField();
        Player1R = new javax.swing.JTextField();
        Player2R = new javax.swing.JTextField();
        FixedText = new javax.swing.JLabel();
        FixedText1 = new javax.swing.JLabel();
        FixedText2 = new javax.swing.JLabel();
        FixedText3 = new javax.swing.JLabel();
        FixedText4 = new javax.swing.JLabel();
        FixedText5 = new javax.swing.JLabel();
        NameIn = new javax.swing.JTextField();
        WName = new javax.swing.JLabel();
        NameIn2 = new javax.swing.JTextField();
        Winner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guessing Game By Samiul");
        setResizable(false);

        Dis.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        Dis.setText("My Id Is 82 ,So Your Inputs should be in Between 0~82");

        Input1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Input1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Input1MouseExited(evt);
            }
        });
        Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input1ActionPerformed(evt);
            }
        });

        Input2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Input2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Input2MouseExited(evt);
            }
        });
        Input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input2ActionPerformed(evt);
            }
        });

        Player1G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Player1GMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Player1GMouseExited(evt);
            }
        });
        Player1G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1GActionPerformed(evt);
            }
        });

        Player1G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Player1G1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Player1G1MouseExited(evt);
            }
        });
        Player1G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1G1ActionPerformed(evt);
            }
        });

        Player1R.setEditable(false);
        Player1R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1RActionPerformed(evt);
            }
        });

        Player2R.setEditable(false);
        Player2R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2RActionPerformed(evt);
            }
        });

        FixedText.setText("Enter Player 1 Number");

        FixedText1.setText("Enter Player 2 Number");

        FixedText2.setText("Enter Player 1 Guess");

        FixedText3.setText("Enter Player2  Guess");

        FixedText4.setText("            Result");

        FixedText5.setText("            Result");

        NameIn.setEditable(false);
        NameIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInActionPerformed(evt);
            }
        });

        WName.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        WName.setText("Congratulations! You are Winner Of the Game");

        NameIn2.setEditable(false);

        Winner.setText("Winner:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FixedText2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1G1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1R, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FixedText4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NameIn)
                        .addComponent(WName, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                    .addComponent(FixedText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NameIn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Input2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Player2R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FixedText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FixedText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FixedText5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Player1G, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)))
                    .addComponent(Winner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FixedText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FixedText1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FixedText3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FixedText2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1G1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player1G, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FixedText5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Player2R, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FixedText4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Player1R, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(WName, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Winner)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input1ActionPerformed
        // TODO add your handling code here:
        System.out.println(Input1.getText());
        
    }//GEN-LAST:event_Input1ActionPerformed

    private void Player1GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1GActionPerformed
        // TODO add your handling code here:
        //int count=0;
       String save;
       save=Input1.getText();
       int done=Integer.parseInt(save);
       //System.out.print(done);
       String save2;
       save2=Player1G.getText();
       int done2=Integer.parseInt(save2);
       if(done==done2)
       {
           System.out.println("Matched");
           Player1R.setText("Matched");
           Player1G.setEnabled(true);
           NameIn.setEditable(true);
       }
       else {
           count1++;
           System.out.println("Wrong Guess:"+count1);
           Player1R.setText("Wrong Guess:"+count1);
           Player1G.setEnabled(false);
           Player1G1.setEnabled(true);
           NameIn.setEditable(false);
           Player1G.setText(null);
           
       }
        
    }//GEN-LAST:event_Player1GActionPerformed

    private void Player1RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1RActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player1RActionPerformed

    private void Player2RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2RActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Player2RActionPerformed

    private void Input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input2ActionPerformed

    private void Player1G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1G1ActionPerformed
        // TODO add your handling code here:
        //int count=0;
       String save;
       save=Input2.getText();
       int done=Integer.parseInt(save);
       //System.out.print(done);
       String save2;
       save2=Player1G1.getText();
       int done2=Integer.parseInt(save2);
       if(done==done2)
       {
           System.out.println("Matched");
           Player2R.setText("Matched");
           Player1G1.setEnabled(true);
           NameIn.setEditable(true);
       }
       else {
           count2++;
           System.out.println("Wrong Guess:"+count2);
           Player2R.setText("Wrong Guess:"+count2);
           Player1G1.setEnabled(false);
           Player1G.setEnabled(true);
           NameIn.setEditable(false);
           Player1G1.setText(null);
       }
    }//GEN-LAST:event_Player1G1ActionPerformed

    private void NameInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInActionPerformed
        // TODO add your handling code here:
        //NameIn.setEditable(false);
        NameIn.getText();
        NameIn2.setText(NameIn.getText());
        try {
            BufferedWriter writer= new BufferedWriter (new FileWriter(".\\name.txt"));
            writer.write(NameIn.getText());
            writer.close();
        }
        catch (IOException e){
            
        }
    }//GEN-LAST:event_NameInActionPerformed

    private void Input1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input1MouseEntered
        // TODO add your handling code here:
       Input1.setBackground(Color.ORANGE);
    }//GEN-LAST:event_Input1MouseEntered

    private void Input2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input2MouseEntered
        // TODO add your handling code here:
        Input2.setBackground(Color.green);
    }//GEN-LAST:event_Input2MouseEntered

    private void Input1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input1MouseExited
        // TODO add your handling code here:
        Input1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_Input1MouseExited

    private void Input2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input2MouseExited
        // TODO add your handling code here:
        Input2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_Input2MouseExited

    private void Player1G1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player1G1MouseEntered
        // TODO add your handling code here:
        Player1G1.setBackground(Color.BLUE);
    }//GEN-LAST:event_Player1G1MouseEntered

    private void Player1G1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player1G1MouseExited
        // TODO add your handling code here:
        Player1G1.setBackground(Color.gray);
    }//GEN-LAST:event_Player1G1MouseExited

    private void Player1GMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player1GMouseEntered
        // TODO add your handling code here:
        Player1G.setBackground(Color.RED);
    }//GEN-LAST:event_Player1GMouseEntered

    private void Player1GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player1GMouseExited
        // TODO add your handling code here:
        Player1G.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_Player1GMouseExited

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
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dis;
    private javax.swing.JLabel FixedText;
    private javax.swing.JLabel FixedText1;
    private javax.swing.JLabel FixedText2;
    private javax.swing.JLabel FixedText3;
    private javax.swing.JLabel FixedText4;
    private javax.swing.JLabel FixedText5;
    private javax.swing.JPasswordField Input1;
    private javax.swing.JPasswordField Input2;
    private javax.swing.JTextField NameIn;
    private javax.swing.JTextField NameIn2;
    private javax.swing.JTextField Player1G;
    private javax.swing.JTextField Player1G1;
    private javax.swing.JTextField Player1R;
    private javax.swing.JTextField Player2R;
    private javax.swing.JLabel WName;
    private javax.swing.JLabel Winner;
    // End of variables declaration//GEN-END:variables
}
