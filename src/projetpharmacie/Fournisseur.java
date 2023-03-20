
package projetpharmacie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fournisseur extends javax.swing.JInternalFrame {

    Connection c;
    PreparedStatement   pst;
    DefaultTableModel   df;
     PreparedStatement pt;
     ResultSet res;
    Statement st;
    public Fournisseur() {
        initComponents();
        
         try{
            //établir la connexion
            //on l'a mis ici car a chaque chargement de la page il faut établir la connexion
        Class.forName("org.postgresql.Driver");    
        c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBpharma","postgres", "123456");
  
       
        }catch(Exception e){        
         JOptionPane.showMessageDialog(this,"Erreur de connextion!");//this = la fenetre en cours
         e.printStackTrace();
        }
           
        Load();
        recupererID();
         txtname.requestFocus();
    }
        public void recupererID(){
         try{
        String sql = "select max(numf)+1 as IDsuivi from fornisseur";
        pt = c.prepareStatement(sql);
        res = pt.executeQuery();
        while (res.next()){
            int ID = res.getInt("IDsuivi");
            txtid.setText(String.valueOf(ID));
        }
        txtid.setEnabled(false);
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Erreur de recuperer ID!","Combobox",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }

     public void Load(){
        
        int a;
        
        try{
            pst = c.prepareStatement("SELECT * FROM fornisseur");
           ResultSet rs=pst.executeQuery();
           
           ResultSetMetaData rd=rs.getMetaData();
           a=rd.getColumnCount();
           
           df=(DefaultTableModel)jTable1.getModel();
           df.setRowCount(0);
           
           while(rs.next()){
               Vector   v2=new  Vector();
               for(int i=1;i<=a;i++){
                   
                   v2.add(rs.getString("numf"));
                    v2.add(rs.getString("nomf"));
                     v2.add(rs.getString("telf"));
                      v2.add(rs.getString("adressef"));
                      v2.add(rs.getString("entreprise"));
               
               
               }
               df.addRow(v2);
           
           }
        }catch(Exception e){        
         JOptionPane.showMessageDialog(this,"Erreur de connextion!");//this = la fenetre en cours
         e.printStackTrace();
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtadress = new javax.swing.JTextField();
        txtent = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();

        setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 200, 42));
        jLabel1.setText("ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 100, 79, 41);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 200, 42));
        jLabel2.setText("Liste des fournisseurs");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 390, 360, 46);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(133, 200, 42));
        jLabel3.setText("Nom");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 160, 79, 41);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 200, 42));
        jLabel4.setText("Entreprise");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(560, 220, 110, 41);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(133, 200, 42));
        jLabel6.setText("Adresse");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(570, 160, 90, 41);

        txtadress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtadress.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtadress);
        txtadress.setBounds(750, 160, 167, 33);

        txtent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtent.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtent);
        txtent.setBounds(750, 220, 167, 33);

        jButton1.setBackground(new java.awt.Color(49, 184, 191));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(780, 320, 130, 50);

        jButton2.setBackground(new java.awt.Color(49, 184, 191));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(130, 320, 130, 50);

        jButton3.setBackground(new java.awt.Color(49, 184, 191));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(360, 320, 130, 50);

        jButton4.setBackground(new java.awt.Color(49, 184, 191));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(560, 320, 130, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(133, 200, 42));
        jLabel9.setText("Gérer fournisseurs");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(340, 20, 472, 46);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FournisseurId", "FournisseurName", "TelephoneFournisseur", "Adresse", "Entreprise"
            }
        ));
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(188, 226, 142));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(130, 450, 910, 210);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(133, 200, 42));
        jLabel11.setText("Téléphone");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(90, 230, 100, 41);

        txttel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttel.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txttel);
        txttel.setBounds(250, 230, 167, 33);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtid);
        txtid.setBounds(250, 110, 167, 33);

        txtname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtname);
        txtname.setBounds(250, 160, 167, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtname.setText("");
        txttel.setText("");
        txtadress.setText("");
        txtent.setText("");
        txtname.requestFocus();
        Load();
        jButton2.setEnabled(true);
        recupererID();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            pst = c.prepareStatement("INSERT INTO fornisseur(nomf,telf,adressef,entreprise) VALUES (?,?,?,?)");
            pst.setString(1,txtname.getText());
            pst.setString(2,txttel.getText());
            pst.setString(3,txtadress.getText());
            pst.setString(4,txtent.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"L'ajout de Fournisseur avec succés");

            txtname.setText("");
            txttel.setText("");
            txtadress.setText("");
            txtent.setText("");
            txtname.requestFocus();
            Load();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"erreur ajout Fournisseur ");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        df=(DefaultTableModel)jTable1.getModel();
        int  selected=jTable1.getSelectedRow();
        int    id=Integer.parseInt(df.getValueAt(selected,0).toString());

        try{

            pst = c.prepareStatement("UPDATE  fornisseur  SET nomf=?,telf=?,adressef=?,entreprise=? WHERE numf=?");
            pst.setString(1,txtname.getText());
            pst.setString(2,txttel.getText());
            pst.setString(3,txtadress.getText());
            pst.setString(4,txtent.getText());
            pst.setInt(5,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this," Personnel est Modifié avec succés");

            txtname.setText("");
            txttel.setText("");
            txtadress.setText("");
            txtent.setText("");
            txtname.requestFocus();
            Load();
            jButton2.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"erreur de modification Personnel ");
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        df=(DefaultTableModel)jTable1.getModel();
        int  selected=jTable1.getSelectedRow();
        int    id=Integer.parseInt(df.getValueAt(selected,0).toString());

        try{

            pst = c.prepareStatement("DELETE FROM fornisseur WHERE numf=?");

            pst.setInt(1,id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this," Fournisseur est supprimé avec succés");

            txtname.setText("");
            txttel.setText("");
            txtadress.setText("");
            txtent.setText("");
            txtname.requestFocus();
            Load();
            jButton2.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"erreur de la suppression Fournisseur ");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        df=(DefaultTableModel)jTable1.getModel();
        int  selected=jTable1.getSelectedRow();
       // int    id=Integer.parseInt(df.getValueAt(selected,0).toString());
       txtid.setText(df.getValueAt(selected, 0).toString());
        txtname.setText(df.getValueAt(selected,1).toString());
        txttel.setText(df.getValueAt(selected,2).toString());
        txtadress.setText(df.getValueAt(selected,3).toString());
        txtent.setText(df.getValueAt(selected,4).toString());
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked
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
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fournisseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtent;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
