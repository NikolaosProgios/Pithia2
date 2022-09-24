package View;

import Controller.Admin;
import Controller.Mathimata;
import Controller.Table;
import Model.DataBase;
import javax.swing.JOptionPane;

/**
 *@author ακης
 */
public class Diorthotikoi_Vathmoi extends javax.swing.JFrame {

    public Diorthotikoi_Vathmoi() {
        initComponents();
    }
   String AM;
   String Mathima;
   String Vathmos;

    public Diorthotikoi_Vathmoi(String AM, String Mathima, String Vathmos) {
        this.AM = AM;
        this.Mathima = Mathima;
        this.Vathmos= Vathmos;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mathima_Label = new javax.swing.JLabel();
        NewVathmos_Label = new javax.swing.JLabel();
        NewVathmos_TextField = new javax.swing.JTextField();
        Mathima_ComboBox = new javax.swing.JComboBox<>();
        AM_Foititi_Label = new javax.swing.JLabel();
        Arxikos_Vathmos_Label = new javax.swing.JLabel();
        SHOW_Arxikos_Vathmos_Label = new javax.swing.JLabel();
        Submit_Button = new javax.swing.JButton();
        AM_Foititi_TextBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mathima_Label.setText("Μάθημα");

        NewVathmos_Label.setText("Νέα Βαθμολογία");

        NewVathmos_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVathmos_TextFieldActionPerformed(evt);
            }
        });

        Mathima_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Μαθηματικά Ι", "Δομημένος Προγραμματισμός", "Εισαγωγή στην Επιστήμη των Υπολογιστών", "Ηλεκτρονική Φυσική", "Κυκλώματα Συνεχούς Ρεύματος", "Μαθηματικά ΙΙ", "Μετρήσεις και Κυκλώματα Εναλλασσόμενου Ρεύματος", "Τεχνική Συγγραφή, Παρουσίαση και Ορολογία Ξένης Γλώσσας", "Σχεδίαση Ψηφιακών Συστημάτων", "Αντικειμενοστρεφής Προγραμματισμός", "Θεωρία Πιθανοτήτων και Στατιστική", "Μαθηματικά ΙΙI", "Επεξεργασία Σήματος", "Γλώσσες και Τεχνολογίες Ιστού", "Δομές Δεδομένων και Ανάλυση Αλγορίθμων", "Οργάνωση και Αρχιτεκτονική Υπολογιστικών Συστημάτων", "Συστήματα Διαχείρισης Βάσεων Δεδομένων", "Τηλεπικοινωνιακά Συστήματα", "Εισαγωγή στα Λειτουργικά Συστήματα", "Ηλεκτρονικά Κυκλώματα", "Ασύρματες Επικοινωνίες", "Μικροελεγκτές", "Σχεδίαση Λειτουργικών Συστημάτων", "Ηλεκτρονικές Διατάξεις", "Αλληλεπίδραση Ανθρώπου-Μηχανής", "Τεχνητή Νοημοσύνη", "Ενσωματωμένα Συστήματα", "Σύνθεση Ηλεκτρονικών Κυκλωμάτων", "Κβαντική Υπολογιστική", "Μεθοδολογίες Σχεδιασμού Μικροηλεκτρονικών Κυκλωμάτων", "Μικροκυματική Τεχνολογία και Τηλεπισκόπηση", "Οπτοηλεκτρονική και Οπτικές Επικοινωνίες", "Συστήματα Μέσων Μαζικής Επικοινωνίας", "Αριθμητικές Μέθοδοι", "Προηγμένα Θέματα Αλληλεπίδρασης (Προγραμματισμός Κινητών Συσκευών)", "Διοίκηση Έργων", "Δίκτυα Υπολογιστών", "Ηλεκτρονικά Ισχύος", "Συστήματα Αυτομάτου Ελέγχου", "Αισθητήρια και Επεξεργασία Μετρήσεων", "Προγραμματιζόμενοι Λογικοί Ελεγκτές", "Σχεδίαση Επαναπροσδιοριζόμενων Ψηφιακών Συστημάτων (FPGA)", "Τεχνολογίες Ήχου και Εικόνας", "Εισαγωγή στην Αναλυτική των Δεδομένων", "Μηχανική Λογισμικού", "Τεχνολογία Βάσεων Δεδομένων", "Προηγμένες Αρχιτεκτονικές Υπολογιστών και Προγραμματισμός Παράλληλων Συστημάτων", "Ασφάλεια Πληροφοριακών Συστημάτων", "Αρχές και Μέθοδοι Μηχανικής Μάθησης", "Διαδίκτυο των Πραγμάτων", "Εφαρμογές Συστημάτων Αυτομάτου Ελέγχου", "Μετατροπείς Ισχύος", "Μικροηλεκτρονική", "Εφαρμογές Συστημάτων Ισχύος και ΑΠΕ", "Ηλεκτροκίνηση και Ευφυή Δίκτυα", "Ασύρματα Δίκτυα", "Ειδικά Θέματα Δικτύων (CCNA) 1", "Προηγμένα Θέματα Δικτύων", "Συστήματα Κινητών Επικοινωνιών", "Ελεύθερη Επιλογή Β", "Ραδιοτηλεοπτική Παραγωγή", "Οργάνωση Δεδομένων και Εξόρυξη Πληροφορίας", "Διαδικτυακές Υπηρεσίες Προστιθέμενης Αξίας", "Ανάπτυξη Ολοκληρωμένων Πληροφοριακών Συστημάτων", "Εφαρμογές Ενσωματωμένων Συστημάτων", "Ρομποτική", "ΑΠΕ και Ευφυή Ηλεκτρικά Δίκτυα", "Απτικές Διεπαφές", "Βιοϊατρική Τεχνολογία", "Συστήματα Μετρήσεων Υποβοηθούμενων από Η/Υ", "Ασφάλεια Δικτύων και Επικοινωνιών", "Δικτύωση Καθορισμένη από Λογισμικό", "Ειδικά Θέματα Δικτύων (CCNA) 2", "Δορυφορικές Επικοινωνίες", "Τεχνολογία Πολυμέσων", "Ανάπτυξη Διαδικτυακών Συστημάτων και Εφαρμογών", "Επιχειρησιακή Έρευνα", "Ανάκτηση Πληροφοριών – Μηχανές Αναζήτησης", "Διαχείριση Συστήματος και Υπηρεσιών DBMS", "Ευφυή Συστήματα", "Προηγμένα Θέματα Τεχνητής Νοημοσύνης", "Προηγμένη Μηχανική Μάθηση", "Κατανεμημένα Συστήματα", "Σημασιολογικός Ιστός", "Γραφικά Υπολογιστών", " ", " " }));

        AM_Foititi_Label.setText("ΑΜ_Φοιτητή");

        Arxikos_Vathmos_Label.setText("Αρχικός Βαθμός");

        SHOW_Arxikos_Vathmos_Label.setText("  ");

        Submit_Button.setText("ΥΠΟΒΟΛΗ");
        Submit_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit_ButtonMouseClicked(evt);
            }
        });

        AM_Foititi_TextBox.setText("Βάλε ΑΜ Φοιτητή");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Submit_Button)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewVathmos_Label)
                            .addComponent(Mathima_Label)
                            .addComponent(AM_Foititi_Label)
                            .addComponent(Arxikos_Vathmos_Label))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mathima_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewVathmos_TextField)
                            .addComponent(SHOW_Arxikos_Vathmos_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AM_Foititi_TextBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mathima_Label)
                    .addComponent(Mathima_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AM_Foititi_Label)
                    .addComponent(AM_Foititi_TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Arxikos_Vathmos_Label)
                    .addComponent(SHOW_Arxikos_Vathmos_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewVathmos_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVathmos_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Submit_Button)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewVathmos_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVathmos_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewVathmos_TextFieldActionPerformed

    private void Submit_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit_ButtonMouseClicked
    
    /*update*/

        Table T=new Table();      
        T.setMathima(Mathima_ComboBox.getSelectedItem().toString());
        T.setAm(AM_Foititi_TextBox.getText());
        T.setVathmos(NewVathmos_TextField.getText());
    /*update*/
    
        DataBase cf=new DataBase();   
  
        String UserName=cf.infoAdmin().getUsername();
        String Password=cf.infoAdmin().getPassword();
        String LName=cf.infoAdmin().getLastName();
        String Name=cf.infoAdmin().getName();
        String ID=String.valueOf( cf.infoAdmin().getId() );
        String Typos= cf.infoAdmin().getTypos();
        String Tmima=cf.infoAdmin().getTmima();
        
        Admin AD=new Admin(UserName,Password,ID,Name,LName,Typos,Tmima);
        
      String[]Table2;
        

//AM.Update(AM_Foititi_TextBox.getText(),Mathima_ComboBox.getSelectedItem().toString(),NewVathmos_TextField.getText());
        Table2 = AD.egrisi(AM_Foititi_TextBox.getText(),Mathima_ComboBox.getSelectedItem().toString(), NewVathmos_TextField.getText());
        Table Sa=new Table();
        Sa.setTable(Table2);        
        
        new Oristikopoihsi_Vathmon().setVisible(true);
        
    }//GEN-LAST:event_Submit_ButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Diorthotikoi_Vathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diorthotikoi_Vathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diorthotikoi_Vathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diorthotikoi_Vathmoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diorthotikoi_Vathmoi().setVisible(true);
            }
        });
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AM_Foititi_Label;
    private javax.swing.JTextField AM_Foititi_TextBox;
    private javax.swing.JLabel Arxikos_Vathmos_Label;
    private javax.swing.JComboBox<String> Mathima_ComboBox;
    private javax.swing.JLabel Mathima_Label;
    private javax.swing.JLabel NewVathmos_Label;
    private javax.swing.JTextField NewVathmos_TextField;
    private javax.swing.JLabel SHOW_Arxikos_Vathmos_Label;
    private javax.swing.JButton Submit_Button;
    // End of variables declaration//GEN-END:variables
}
