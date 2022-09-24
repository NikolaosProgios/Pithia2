package View;
import Controller.Mathimata;
import Model.DataBase;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class MathimaVathmoi extends javax.swing.JFrame {


    public MathimaVathmoi() {
        initComponents();
        LessonsTable.setAutoCreateRowSorter(true);       
    }
    DataBase l = new DataBase();
    ArrayList <Mathimata> mathimataa=new ArrayList<>();    
   
//pinakas me name Mathimata gia tin Lessonlist
    String lessons_list [] = new String [60];/*
    for (int s=0; s < lessons_list.size(); s++){
        lessons_list[s]= l.lessons1(s);
    }
    
    
    //pinakas me object Mathimata gia ton table Lessons Table
    Mathimata lessons_table[] = new Mathimata[60];//table a//table a
    //a.size = 0 ;   a.length=60
    for (int s=0; s < lessons_table.size() ; s++){
        lessons_table[s]= l.lessons2(s);
    }
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LessonsList = new javax.swing.JList( lessons_list );
        addButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        LessonsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LessonsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        LessonsList.setToolTipText("");
        LessonsList.setSelectedIndex(0);
        LessonsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                LessonsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(LessonsList);

        addButton1.setText("Προσσθήκη στον πινακα");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        LessonsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Κωδ.Μαθ.", "Όνομα Μαθ.", "Ώρες-Δ.Μ."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(LessonsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(addButton1)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void LessonsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LessonsListValueChanged
        int idx=LessonsList.getSelectedIndex();
        
    }//GEN-LAST:event_LessonsListValueChanged

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        int numm=LessonsList.getSelectedIndex();
        //pare to num tou mathimatos
       // Mathimata math=LessonsTable[numm];
        //pare apo ton pinaka lessons to math poy exei to numm
      /*  
        String codemath=String.valueOf(math.getId());
        String namemth =String.valueOf(math.getOnomasia());
        String oresmath =String.valueOf(math.getOres());
        */
       // Object[] row = { codemath , namemth, oresmath } ;
        //fill row in LessonsTable
    }//GEN-LAST:event_addButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MathimaVathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathimaVathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathimaVathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathimaVathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathimaVathmoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList LessonsList;
    private javax.swing.JTable LessonsTable;
    private javax.swing.JButton addButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
}
