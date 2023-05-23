/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ontapgiaodien1;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class bai5x0 extends javax.swing.JFrame {

    /**
     * Creates new form bai5x0
     */
    private String Start="X";
    public int xCount=0,oCount=0;
    public bai5x0() {
        initComponents();
    }
    public void diemgame()
    {
        Playx.setText(String.valueOf(xCount));
        Playo.setText(String.valueOf(oCount));
    }
    private void chonplay()
    {
        if(Start.equalsIgnoreCase("X"))
        {
            Start="O";
        }
        else
        {
            Start="X";
        }
    }
    public void wingame()
    {
        String b1=bt1.getText();
        String b2=bt2.getText();
        String b3=bt3.getText();
        String b4=bt4.getText();
        String b5=bt5.getText();
        String b6=bt6.getText();
        String b7=bt7.getText();
        String b8=bt8.getText();
        String b9=bt9.getText();
        if(b1=="X" && b2=="X" && b3=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
        if(b1=="X" && b4=="X" && b7=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
        if(b3=="X" && b5=="X" && b7=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
         if(b3=="X" && b6=="X" && b9=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
          if(b4=="X" && b5=="X" && b6=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        } 
          if(b7=="X" && b8=="X" && b9=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
           if(b2=="X" && b5=="X" && b8=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
            if(b1=="X" && b5=="X" && b9=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
             if(b1=="X" && b4=="X" && b7=="X")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        }
           if(b1=="O" && b2=="O" && b3=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
        if(b1=="O" && b4=="O" && b7=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
         if(b3=="O" && b6=="O" && b9=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
          if(b4=="O" && b5=="O" && b6=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            diemgame();
        } 
          if(b7=="0" && b8=="O" && b9=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
           if(b2=="O" && b5=="O" && b8=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY OWIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
            if(b1=="O" && b5=="O" && b9=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
             if(b1=="O" && b4=="O" && b7=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY O WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }  
             if(b3=="O" && b5=="O" && b7=="O")
        {
            JOptionPane.showConfirmDialog(this, "PLAY X WIN", b9,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            diemgame();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Playx = new javax.swing.JTextField();
        Playo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("CO CA RO");

        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 4, 3));

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);

        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);

        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);

        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);

        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("EXIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField2.setText("Play X");

        jTextField3.setText("Play 0");

        Playx.setText("XXXXXXXX");
        Playx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayxActionPerformed(evt);
            }
        });

        Playo.setText("XXXXXXXX");
        Playo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Playx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Playo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(38, 38, 38)
                        .addComponent(jButton11))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        bt7.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt7.setForeground(Color.red);
        }
       else
       {
               bt7.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        bt8.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt8.setForeground(Color.red);
        }
       else
       {
               bt8.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
        bt9.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt9.setForeground(Color.red);
        }
       else
       {
               bt9.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        bt4.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt4.setForeground(Color.red);
        }
       else
       {
               bt4.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        bt1.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt1.setForeground(Color.red);
        }
       else
       {
               bt1.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        bt2.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt2.setForeground(Color.red);
        }
       else
       {
               bt2.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        bt3.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt3.setForeground(Color.red);
        }
       else
       {
               bt3.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        bt5.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt5.setForeground(Color.red);
        }
       else
       {
               bt5.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        bt6.setText(Start);
        if(Start.equalsIgnoreCase("X"))
        {
            bt6.setForeground(Color.red);
        }
       else
       {
               bt6.setForeground(Color.blue);
          }
        chonplay();
        wingame();
    }//GEN-LAST:event_bt6ActionPerformed

    private void PlayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayoActionPerformed

    private void PlayxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayxActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        bt1.setText(null);
        bt2.setText(null);
        bt3.setText(null);
        bt4.setText(null);bt9.setText(null);
        bt5.setText(null);
        bt6.setText(null);
        bt7.setText(null);Playx.setText(null);Playo.setText(null);
        bt8.setText(null);
        
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(bai5x0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai5x0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai5x0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai5x0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai5x0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Playo;
    private javax.swing.JTextField Playx;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
