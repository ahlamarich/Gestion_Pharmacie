/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpharmacie;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Personnel extends javax.swing.JInternalFrame {

     Connection c;
    PreparedStatement   pst;
    DefaultTableModel   df;
    PreparedStatement pt;
     ResultSet res;
    Statement st;
    public Personnel() {
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
        txtName.requestFocus();
        Load();
        recupererID();
        

    }
         public void recupererID(){
         try{
        String sql = "select max(numu)+1 as IDsuivi from utilisateur";
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
            pst = c.prepareStatement("SELECT * FROM utilisateur");
           ResultSet rs=pst.executeQuery();
           
           ResultSetMetaData rd=rs.getMetaData();
           a=rd.getColumnCount();
           
           df=(DefaultTableModel)jTable1.getModel();
           df.setRowCount(0);
           
           while(rs.next()){
               Vector   v2=new  Vector();
               for(int i=1;i<=a;i++){
                   
                   v2.add(rs.getString("numu"));
                    v2.add(rs.getString("login"));
                     v2.add(rs.getString("passwrd"));
                      v2.add(rs.getString("role"));
               
               
               }
               df.addRow(v2);
           
           }
        }catch(Exception e){        
         JOptionPane.showMessageDialog(this,"Erreur de connextion!");//this = la fenetre en cours
         e.printStackTrace();
        }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cbxRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();

        setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 500));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(133, 200, 42));
        jLabel1.setText("ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(150, 100, 79, 41);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 200, 42));
        jLabel2.setText("Liste des personnels");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 360, 330, 46);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(133, 200, 42));
        jLabel3.setText("UserName");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(150, 160, 100, 41);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 200, 42));
        jLabel4.setText("Role");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(550, 100, 40, 41);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 102, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(310, 160, 167, 33);

        cbxRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxRole.setForeground(new java.awt.Color(133, 200, 42));
        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Personnel" }));
        jPanel2.add(cbxRole);
        cbxRole.setBounds(650, 110, 160, 28);

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
        jButton1.setBounds(770, 290, 130, 50);

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
        jButton2.setBounds(160, 290, 130, 50);

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
        jButton3.setBounds(370, 290, 130, 50);

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
        jButton4.setBounds(580, 290, 130, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(133, 200, 42));
        jLabel9.setText("Gérer personnels");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(440, 10, 472, 46);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonnelId", "PersonnelName", "Password", "Role"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(188, 226, 142));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(160, 430, 750, 210);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(133, 200, 42));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(150, 210, 90, 41);

        txtPasswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPasswd.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtPasswd);
        txtPasswd.setBounds(310, 200, 167, 33);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtid);
        txtid.setBounds(310, 110, 167, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        txtName.setText("");
        txtPasswd.setText("");
        cbxRole.setSelectedItem("");
        txtName.requestFocus();
        Load();
        jButton2.setEnabled(true);
        recupererID();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{

            pst = c.prepareStatement("INSERT INTO utilisateur(login,passwrd,role) VALUES (?,?,?)");
            pst.setString(1,txtName.getText());
            pst.setString(2,txtPasswd.getText());
            pst.setString(3,cbxRole.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"L'ajout de Personnel avec succés");

            txtName.setText("");
            txtPasswd.setText("");
            cbxRole.setSelectedItem("");
            txtName.requestFocus();
            Load();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"erreur ajout Personnel ");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        df=(DefaultTableModel)jTable1.getModel();
        int  selected=jTable1.getSelectedRow();
        int    id=Integer.parseInt(df.getValueAt(selected,0).toString());

        try{

            pst = c.prepareStatement("UPDATE  utilisateur SET login=?,passwrd=?,role=? WHERE numu=?");
            pst.setString(1,txtName.getText());
            pst.setString(2,txtPasswd.getText());
            pst.setString(3,cbxRole.getSelectedItem().toString());
            pst.setInt(4,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this," Personnel est Modifié avec succés");

            txtName.setText("");
            txtPasswd.setText("");
            cbxRole.setSelectedItem("");
            txtName.requestFocus();
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

            pst = c.prepareStatement("DELETE FROM utilisateur WHERE numu=?");

            pst.setInt(1,id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this," Personnel est supprimé avec succés");

            txtName.setText("");
            txtPasswd.setText("");
            cbxRole.setSelectedItem("");
            txtName.requestFocus();
            Load();
            jButton2.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"erreur de la suppression Personnel ");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        df=(DefaultTableModel)jTable1.getModel();
        int  selected=jTable1.getSelectedRow();
        //int    id=Integer.parseInt(df.getValueAt(selected,0).toString());
         txtid.setText(df.getValueAt(selected, 0).toString());
        txtName.setText(df.getValueAt(selected,1).toString());
        txtPasswd.setText(df.getValueAt(selected,2).toString());
        cbxRole.setSelectedItem(df.getValueAt(selected,3).toString());
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPasswd;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
