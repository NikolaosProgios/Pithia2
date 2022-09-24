package View;
import Controller.Admin;
import Controller.Table;
import Model.DataBase;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Oristikopoihsi_Vathmon extends javax.swing.JFrame {
     /*update*/
    Object[] row;
    public Oristikopoihsi_Vathmon() {
        initComponents(); 
        print_info ();
        
    /*update*/   
        DefaultTableModel model  = (DefaultTableModel) Aitisis_Kathigiton.getModel();
        model.addRow(row);
    /*update*/
    }
    public void print_info (){
        Table T=new Table();   
        
        row[0]=T.getMathima();
        row[1]=T.getAm();
        row[3]=T.getVathmos();    
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Aitisi_Kathigiti_Label = new javax.swing.JLabel();
        APPROVE_Button = new javax.swing.JButton();
        DISAPPROVE_Button = new javax.swing.JButton();
        Aitisi_Kathigiti_ComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Aitisis_Kathigiton = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aitisi_Kathigiti_Label.setText("Αίτηση Καθηγητή");

        APPROVE_Button.setText("ΕΓΚΡΙΣΗ");
        APPROVE_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPROVE_ButtonMouseClicked(evt);
            }
        });

        DISAPPROVE_Button.setText("ΑΠΟΡΙΨΗ");
        DISAPPROVE_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DISAPPROVE_ButtonMouseClicked(evt);
            }
        });

        Aitisi_Kathigiti_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Aitisi_Kathigiti_ComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aitisi_Kathigiti_ComboBoxMouseClicked(evt);
            }
        });

        Aitisis_Kathigiton.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Μάθημα", "ΑΜ", "Νεος Βαθμός"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Aitisis_Kathigiton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Aitisi_Kathigiti_Label)
                                .addGap(92, 92, 92)
                                .addComponent(Aitisi_Kathigiti_ComboBox, 0, 209, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(APPROVE_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DISAPPROVE_Button)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aitisi_Kathigiti_Label)
                    .addComponent(Aitisi_Kathigiti_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APPROVE_Button)
                    .addComponent(DISAPPROVE_Button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APPROVE_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPROVE_ButtonMouseClicked
        DataBase cf=new DataBase();       
        
        String UserName=cf.infoAdmin().getUsername();
        String Password=cf.infoAdmin().getPassword();
        String LName=cf.infoAdmin().getLastName();
        String Name=cf.infoAdmin().getName();
        String ID=String.valueOf( cf.infoAdmin().getId() );
        String Typos= cf.infoAdmin().getTypos();
        String Tmima=cf.infoAdmin().getTmima();
        
        Admin AD=new Admin(UserName,Password,ID,Name,LName,Typos,Tmima); 
        
        AD.showMessage(true);
    }//GEN-LAST:event_APPROVE_ButtonMouseClicked

    private void DISAPPROVE_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DISAPPROVE_ButtonMouseClicked
        DataBase cf=new DataBase();       
        
        String UserName=cf.infoAdmin().getUsername();
        String Password=cf.infoAdmin().getPassword();
        String LName=cf.infoAdmin().getLastName();
        String Name=cf.infoAdmin().getName();
        String ID=String.valueOf( cf.infoAdmin().getId() );
        String Typos= cf.infoAdmin().getTypos();
        String Tmima=cf.infoAdmin().getTmima();
        
        Admin AD=new Admin(UserName,Password,ID,Name,LName,Typos,Tmima); 
        
        AD.showMessage(false);
    }//GEN-LAST:event_DISAPPROVE_ButtonMouseClicked

    private void Aitisi_Kathigiti_ComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aitisi_Kathigiti_ComboBoxMouseClicked

        Table T=new Table();
        String [] newT = T.getTable();
        for(int i=0;i<3;i++)
        {
        //Aitisi_Kathigiti_ComboBox.insertItemAt(newT[i], i);
        }
        
    }//GEN-LAST:event_Aitisi_Kathigiti_ComboBoxMouseClicked
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
            java.util.logging.Logger.getLogger(Oristikopoihsi_Vathmon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oristikopoihsi_Vathmon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oristikopoihsi_Vathmon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oristikopoihsi_Vathmon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oristikopoihsi_Vathmon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APPROVE_Button;
    private javax.swing.JComboBox<String> Aitisi_Kathigiti_ComboBox;
    private javax.swing.JLabel Aitisi_Kathigiti_Label;
    private javax.swing.JTable Aitisis_Kathigiton;
    private javax.swing.JButton DISAPPROVE_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
