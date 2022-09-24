package View;
import Controller.*;
import Model.DataBase;
import View.MainLoginUI;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class write_deleteUI extends javax.swing.JFrame {

    public write_deleteUI() {
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Write_F = new javax.swing.JLabel();
        w_foititis_username = new javax.swing.JTextField();
        Delete_F = new javax.swing.JLabel();
        d_foititis_am = new javax.swing.JTextField();
        Write_B = new javax.swing.JButton();
        Delete_Foititi = new javax.swing.JButton();
        w_foititis_am = new javax.swing.JTextField();
        w_foititis_password = new javax.swing.JTextField();
        Write_Ad = new javax.swing.JLabel();
        Delete_Ad = new javax.swing.JLabel();
        w_admin_username = new javax.swing.JTextField();
        d_admin_id = new javax.swing.JTextField();
        w_admin_password = new javax.swing.JTextField();
        w_admin_id = new javax.swing.JTextField();
        Write_B_Ad = new javax.swing.JButton();
        Delete_Admin = new javax.swing.JButton();
        w_foititis_lastname = new javax.swing.JTextField();
        w_foititis_name = new javax.swing.JTextField();
        w_admin_name = new javax.swing.JTextField();
        w_admin_lastname = new javax.swing.JTextField();
        w_foititis_tmima = new javax.swing.JTextField();
        Write_Ad1 = new javax.swing.JLabel();
        Delete_Ad1 = new javax.swing.JLabel();
        w_lesson_kodikos = new javax.swing.JTextField();
        d_lesson_kodikos = new javax.swing.JTextField();
        w_lesson_examin = new javax.swing.JTextField();
        w_lesson_typos = new javax.swing.JTextField();
        Write_Lesson = new javax.swing.JButton();
        Delete_B_Ad1 = new javax.swing.JButton();
        w_lesson_onoma = new javax.swing.JTextField();
        w_lesson_ores = new javax.swing.JTextField();
        d_foititis_tmima = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 700));

        Write_F.setText("Εισαγωγή φοιτητών");

        w_foititis_username.setText("UserName");

        Delete_F.setText("Διαγραφή φοιτητών");

        d_foititis_am.setText("AM");

        Write_B.setText("Εκχώρηση");
        Write_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Write_BMouseClicked(evt);
            }
        });

        Delete_Foititi.setText("Διαγραφή");
        Delete_Foititi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_FoititiMouseClicked(evt);
            }
        });

        w_foititis_am.setText("AM");

        w_foititis_password.setText("Password");

        Write_Ad.setText("Εισαγωγή Διαχειριστών");

        Delete_Ad.setText("Διαγραφή Διαχειριστών");

        w_admin_username.setText("UserName");

        d_admin_id.setText("ιδ");

        w_admin_password.setText("Password");
        w_admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w_admin_passwordActionPerformed(evt);
            }
        });

        w_admin_id.setText("ΙΔ");

        Write_B_Ad.setText("Εκχώρηση");
        Write_B_Ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Write_B_AdMouseClicked(evt);
            }
        });

        Delete_Admin.setText("Διαγραφή");
        Delete_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_AdminMouseClicked(evt);
            }
        });

        w_foititis_lastname.setText("LastName");

        w_foititis_name.setText("Name");

        w_admin_name.setText("Name");

        w_admin_lastname.setText("LastName");

        w_foititis_tmima.setText("LastName");

        Write_Ad1.setText("Ειισαγωγή Μαθήματος");

        Delete_Ad1.setText("Διαγραφή Μαθηματος");

        w_lesson_kodikos.setText("Κωδικος μαθηματος");

        d_lesson_kodikos.setText("κωδικος");

        w_lesson_examin.setText("εξαμυνο");
        w_lesson_examin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w_lesson_examinActionPerformed(evt);
            }
        });

        w_lesson_typos.setText("τυπος");

        Write_Lesson.setText("Εκχώρηση");
        Write_Lesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Write_LessonMouseClicked(evt);
            }
        });

        Delete_B_Ad1.setText("Διαγραφή");
        Delete_B_Ad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_B_Ad1MouseClicked(evt);
            }
        });

        w_lesson_onoma.setText("ονομα");

        w_lesson_ores.setText("ωρες");

        d_foititis_tmima.setText("tmima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Delete_Foititi)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Delete_Admin)
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Delete_F, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(Write_F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w_foititis_username, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(d_foititis_am)
                            .addComponent(w_foititis_name))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_foititis_password)
                            .addComponent(w_foititis_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(d_foititis_tmima))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_foititis_am)
                            .addComponent(Write_B)
                            .addComponent(w_foititis_tmima, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Write_Ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete_Ad))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w_admin_username)
                            .addComponent(d_admin_id, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(w_admin_name))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_admin_password, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(w_admin_lastname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_admin_id, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Write_B_Ad))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Write_Ad1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(Delete_Ad1))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w_lesson_kodikos, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(d_lesson_kodikos, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(w_lesson_onoma))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_lesson_examin)
                            .addComponent(w_lesson_ores, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(w_lesson_typos, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Write_Lesson)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delete_B_Ad1)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Write_F)
                    .addComponent(w_foititis_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_foititis_am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_foititis_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w_foititis_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_foititis_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_foititis_tmima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Write_B)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_F)
                    .addComponent(d_foititis_am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_foititis_tmima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete_Foititi)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Write_Ad)
                    .addComponent(w_admin_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w_admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_admin_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Write_B_Ad))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Ad)
                    .addComponent(d_admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete_Admin)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Write_Ad1)
                    .addComponent(w_lesson_kodikos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_lesson_examin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_lesson_typos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w_lesson_onoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_lesson_ores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Write_Lesson))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_Ad1)
                    .addComponent(d_lesson_kodikos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Delete_B_Ad1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DataBase pp=new DataBase();
    
//insertFoititi
    private void Write_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Write_BMouseClicked
        pp.insertFoititi(w_foititis_username.getText(), w_foititis_password.getText()
                , Integer.valueOf(w_foititis_am.getText()) , w_foititis_name.getText(),
                        w_foititis_lastname.getText() ,w_foititis_tmima.getText() );
        
    }//GEN-LAST:event_Write_BMouseClicked

    private void w_admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w_admin_passwordActionPerformed
        
    }//GEN-LAST:event_w_admin_passwordActionPerformed

//Insert Admin
    private void Write_B_AdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Write_B_AdMouseClicked
        pp.insertAdmin(w_admin_username.getText() , w_admin_password.getText() , w_admin_name.getText()
                , w_admin_id.getText(), w_admin_lastname.getText() , "monimos"  ,"Dipae");
    }//GEN-LAST:event_Write_B_AdMouseClicked
 
//DeleteFoititi    
    private void Delete_FoititiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_FoititiMouseClicked
        pp.deleteFoititi(
                Integer.valueOf(d_foititis_am.getText()) 
                , d_foititis_tmima.getText() ) ;
    }//GEN-LAST:event_Delete_FoititiMouseClicked

//DeleteAdmin
    private void Delete_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_AdminMouseClicked
        pp.deleteAdmin(d_admin_id.getText());
    }//GEN-LAST:event_Delete_AdminMouseClicked

    private void w_lesson_examinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w_lesson_examinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_w_lesson_examinActionPerformed
//InsertLesson
    private void Write_LessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Write_LessonMouseClicked
        pp.insertMathimata(w_lesson_kodikos.getText(), w_lesson_examin.getText()  ,
                w_lesson_typos.getText() , w_lesson_onoma.getText(),w_lesson_ores.getText(),"-",w_foititis_name.getText() );
    }//GEN-LAST:event_Write_LessonMouseClicked
//DeleteLesson
    private void Delete_B_Ad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_B_Ad1MouseClicked
        pp.deleteMathima(d_lesson_kodikos.getText()); 
    }//GEN-LAST:event_Delete_B_Ad1MouseClicked

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
            java.util.logging.Logger.getLogger(write_deleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(write_deleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(write_deleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(write_deleteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new write_deleteUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete_Ad;
    private javax.swing.JLabel Delete_Ad1;
    private javax.swing.JButton Delete_Admin;
    private javax.swing.JButton Delete_B_Ad1;
    private javax.swing.JLabel Delete_F;
    private javax.swing.JButton Delete_Foititi;
    private javax.swing.JLabel Write_Ad;
    private javax.swing.JLabel Write_Ad1;
    private javax.swing.JButton Write_B;
    private javax.swing.JButton Write_B_Ad;
    private javax.swing.JLabel Write_F;
    private javax.swing.JButton Write_Lesson;
    private javax.swing.JTextField d_admin_id;
    private javax.swing.JTextField d_foititis_am;
    private javax.swing.JTextField d_foititis_tmima;
    private javax.swing.JTextField d_lesson_kodikos;
    private javax.swing.JTextField w_admin_id;
    private javax.swing.JTextField w_admin_lastname;
    private javax.swing.JTextField w_admin_name;
    private javax.swing.JTextField w_admin_password;
    private javax.swing.JTextField w_admin_username;
    private javax.swing.JTextField w_foititis_am;
    private javax.swing.JTextField w_foititis_lastname;
    private javax.swing.JTextField w_foititis_name;
    private javax.swing.JTextField w_foititis_password;
    private javax.swing.JTextField w_foititis_tmima;
    private javax.swing.JTextField w_foititis_username;
    private javax.swing.JTextField w_lesson_examin;
    private javax.swing.JTextField w_lesson_kodikos;
    private javax.swing.JTextField w_lesson_onoma;
    private javax.swing.JTextField w_lesson_ores;
    private javax.swing.JTextField w_lesson_typos;
    // End of variables declaration//GEN-END:variables
}
