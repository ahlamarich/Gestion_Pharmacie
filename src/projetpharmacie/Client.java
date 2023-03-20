/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpharmacie;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author KAMAR
 */
public class Client extends javax.swing.JFrame {

   Connection c;
   ResultSet res;
    Statement st;
    PreparedStatement pt;
    public Client() {
        initComponents();
        try{
        Class.forName("org.postgresql.Driver");    
        c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/DBpharma","postgres", "123456");
        selectClient();
        combobox();
        recupererID();
        
        }catch(Exception e){        
         JOptionPane.showMessageDialog(this,"Erreur de connextion!","Authentification",JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
        }
    }
     public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmed = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtville = new javax.swing.JTextField();
        txtcin = new javax.swing.JTextField();
        cmbmed = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnajouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnVider = new javax.swing.JButton();
        txtspecialite = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableclient = new javax.swing.JTable();
        btnrechercher = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        iconemaxminclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Buttonmin = new javax.swing.JPanel();
        Buttonmax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 184, 191));
        jLabel1.setText("Liste des clients");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 311, 43));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(133, 200, 42));
        jLabel2.setText("Nom :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(133, 200, 42));
        jLabel3.setText("ID :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 200, 42));
        jLabel4.setText("CIN :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 120, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 200, 42));
        jLabel5.setText("Spécialité :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 150, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(133, 200, 42));
        jLabel6.setText("Liste médicament :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 160, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(133, 200, 42));
        jLabel7.setText("Téléphone :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(133, 200, 42));
        jLabel8.setText("Ville : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 120, 36));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(133, 200, 42));
        jLabel10.setText("Nom medecin :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, 36));

        txtmed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmed.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 150, 30));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 102, 0));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 190, 30));

        txtnom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnom.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 190, 30));

        txttelephone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttelephone.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txttelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 190, 30));

        txtville.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtville.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtville, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 30));

        txtcin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcin.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 150, 30));

        cmbmed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbmed.setForeground(new java.awt.Color(133, 200, 42));
        jPanel2.add(cmbmed, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(133, 200, 42));
        jLabel9.setText("Gestion des clients");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 311, 43));

        btnajouter.setBackground(new java.awt.Color(49, 184, 191));
        btnajouter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnajouter.setForeground(new java.awt.Color(255, 255, 255));
        btnajouter.setText("Ajouter");
        btnajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnajouterMouseClicked(evt);
            }
        });
        jPanel2.add(btnajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 152, 42));

        btnModifier.setBackground(new java.awt.Color(49, 184, 191));
        btnModifier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });
        jPanel2.add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 152, 42));

        btnSupprimer.setBackground(new java.awt.Color(49, 184, 191));
        btnSupprimer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseClicked(evt);
            }
        });
        jPanel2.add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 152, 42));

        btnVider.setBackground(new java.awt.Color(49, 184, 191));
        btnVider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVider.setForeground(new java.awt.Color(255, 255, 255));
        btnVider.setText("Vider");
        btnVider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViderMouseClicked(evt);
            }
        });
        jPanel2.add(btnVider, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 152, 42));

        txtspecialite.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtspecialite.setForeground(new java.awt.Color(0, 102, 0));
        jPanel2.add(txtspecialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 150, 30));

        tableclient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableclient.setMinimumSize(new java.awt.Dimension(120, 0));
        tableclient.setRowHeight(24);
        tableclient.setSelectionBackground(new java.awt.Color(188, 226, 142));
        tableclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableclientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableclient);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 810, 290));

        btnrechercher.setBackground(new java.awt.Color(49, 184, 191));
        btnrechercher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnrechercher.setForeground(new java.awt.Color(255, 255, 255));
        btnrechercher.setText("Rechercher");
        btnrechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrechercherMouseClicked(evt);
            }
        });
        jPanel2.add(btnrechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 150, 50));

        header.setBackground(new java.awt.Color(133, 200, 42));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.setLayout(new java.awt.BorderLayout());

        iconemaxminclose.setBackground(new java.awt.Color(133, 200, 42));
        iconemaxminclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(133, 200, 42));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reven/icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconemaxminclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Buttonmin.setBackground(new java.awt.Color(133, 200, 42));
        Buttonmin.setLayout(new java.awt.BorderLayout());
        iconemaxminclose.add(Buttonmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Buttonmax.setBackground(new java.awt.Color(133, 200, 42));
        Buttonmax.setLayout(new java.awt.BorderLayout());

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/reven/icon/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });
        Buttonmax.add(fullmax, java.awt.BorderLayout.CENTER);

        iconemaxminclose.add(Buttonmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        header.add(iconemaxminclose, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 764, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void selectClient(){
         try{
        st = c.createStatement();
        res = st.executeQuery("select * from client");
        tableclient.setModel(DbUtils.resultSetToTableModel(res));
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
   
   public void combobox(){
         try{
        String sql = "select * from produit where caracteristique ='" +"true'";
        pt = c.prepareStatement(sql);
        res = pt.executeQuery();
        while (res.next()){
            String name = res.getString("nomp");
            cmbmed.addItem(name);
        }
       }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Erreur de lecture Combobox!","Combobox",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }
    }
   
    public void recupererID(){
         try{
        String sql = "select max(numcl)+1 as IDsuivi from client";
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
    private void btnajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnajouterMouseClicked
        try{
         PreparedStatement pt = c.prepareStatement("insert into client values (?,?,?,?,?,?,?,?)");
         pt.setInt(1, Integer.valueOf(txtid.getText()));
         pt.setString(2, txtnom.getText());
         pt.setString(3, txttelephone.getText());
         pt.setString(4, txtville.getText());
         pt.setString(5, txtcin.getText());
         pt.setString(6, txtmed.getText());
         pt.setString(7, txtspecialite.getText());
         pt.setString(8, cmbmed.getSelectedItem().toString());
         int row = pt.executeUpdate();
         JOptionPane.showMessageDialog(this,"un client à été ajouté!","Ajout Clients",JOptionPane.PLAIN_MESSAGE);

         selectClient();
        txtid.setText("");
        txtnom.setText("");
        txttelephone.setText("");
        txtville.setText("");
        txtcin.setText("");
        txtmed.setText("");
        txtspecialite.setText("");
        cmbmed.setSelectedIndex(0);
        txtid.requestFocus();
        }catch(SQLException e){
         e.printStackTrace();
         }catch(Exception e){
          JOptionPane.showMessageDialog(this,"Erreur ajout client!","Ajout Clients",JOptionPane.ERROR_MESSAGE);
          e.printStackTrace();
        }
    }//GEN-LAST:event_btnajouterMouseClicked

    private void btnSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseClicked
        if(txtid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "entez ID de client qui va etre supprimé");
        }
        else{
            try{
                String Id = txtid.getText();
                String query = "delete from client where numcl="+Id;
                Statement st = c.createStatement();
                st.executeUpdate(query);
                selectClient();
               JOptionPane.showMessageDialog(this,"un client à été supprimé!","Suppression Clients",JOptionPane.PLAIN_MESSAGE);
                txtid.setText("");
                txtnom.setText("");
                txttelephone.setText("");
                txtville.setText("");
                txtcin.setText("");
                txtmed.setText("");
                txtspecialite.setText("");
                cmbmed.setSelectedIndex(0);
                txtid.requestFocus();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Erreur de suppression client!","Supression Clients",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSupprimerMouseClicked

    private void btnViderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViderMouseClicked
        txtid.setText("");
        txtnom.setText("");
        txttelephone.setText("");
        txtville.setText("");
        txtcin.setText("");
        txtmed.setText("");
        txtspecialite.setText("");
        cmbmed.setSelectedIndex(0);
        txtid.requestFocus();
        btnajouter.setEnabled(true);
        
        recupererID();
    }//GEN-LAST:event_btnViderMouseClicked

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        if(txtid.getText().isEmpty() || txtnom.getText().isEmpty() || txttelephone.getText().isEmpty() || txtville.getText().isEmpty() || txtcin.getText().isEmpty() || txtmed.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "des informations qui manquent");
        }else
        {
            try{
                DefaultTableModel model=(DefaultTableModel)tableclient.getModel();
                int  selected=tableclient.getSelectedRow();
                int    id=Integer.parseInt(model.getValueAt(selected,0).toString());

                pt = c.prepareStatement("UPDATE  client  SET nomcl=?,telcl=?,villecl=?,cin=?,nommed=?, specialite=?,liste_med=? WHERE numcl = ?");
                pt.setString(1,txtnom.getText());
                pt.setString(2,txttelephone.getText());
                pt.setString(3,txtville.getText());
                pt.setString(4,txtcin.getText());
                pt.setString(5,txtmed.getText());
                pt.setString(6, txtspecialite.getText());
                pt.setString(7, cmbmed.getSelectedItem().toString());
                pt.setInt(8,id);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(this,"un client à été modifié!","Modification Clients",JOptionPane.PLAIN_MESSAGE);
                txtid.setText("");
                txtnom.setText("");
                txttelephone.setText("");
                txtville.setText("");
                txtcin.setText("");
                txtmed.setText("");
                txtspecialite.setText("");
                cmbmed.setSelectedIndex(0);
                txtid.requestFocus();
                btnajouter.setEnabled(true);
            }catch(Exception e){
              JOptionPane.showMessageDialog(this,"Erreur de modification client!","Modification Clients",JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
            }
            selectClient();
        
        }
    }//GEN-LAST:event_btnModifierMouseClicked

    private void tableclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableclientMouseClicked
        DefaultTableModel model = (DefaultTableModel)tableclient.getModel();
        int Myindex = tableclient.getSelectedRow();
        txtid.setText(model.getValueAt(Myindex, 0).toString());
        txtnom.setText(model.getValueAt(Myindex, 1).toString());
        txttelephone.setText(model.getValueAt(Myindex, 2).toString());
        txtville.setText(model.getValueAt(Myindex, 3).toString());
        txtcin.setText(model.getValueAt(Myindex, 4).toString());
        txtmed.setText(model.getValueAt(Myindex, 5).toString());
        txtspecialite.setText(model.getValueAt(Myindex, 6).toString());
        cmbmed.setSelectedItem(model.getValueAt(Myindex, 7).toString());
        
        btnajouter.setEnabled(false);
    }//GEN-LAST:event_tableclientMouseClicked

    private void btnrechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrechercherMouseClicked
        int id = Integer.valueOf(txtid.getText());
        for (int i = 0; i < tableclient.getRowCount(); i++) {
            if (tableclient.getValueAt(i, 0).equals(id)) {
                tableclient.setRowSelectionInterval(i, i);

            }

        }
        txtid.setText("");
    }//GEN-LAST:event_btnrechercherMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);

    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

        changecolor(Buttonclose, new Color(183,189,192));

    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited

        changecolor(Buttonclose, new Color(133,200,42));

    }//GEN-LAST:event_closeMouseExited

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked

        if(this.getExtendedState()!= MenuPersonnel.MAXIMIZED_BOTH){
            this.setExtendedState(MenuPersonnel.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(MenuPersonnel.NORMAL);
        }

    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered

        changecolor(Buttonmax, new Color(183,189,192));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited

        changecolor(Buttonmax, new Color(133,200,42));

    }//GEN-LAST:event_fullmaxMouseExited

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JPanel Buttonmin;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnVider;
    private javax.swing.JButton btnajouter;
    private javax.swing.JButton btnrechercher;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> cmbmed;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel header;
    private javax.swing.JPanel iconemaxminclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableclient;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmed;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtspecialite;
    private javax.swing.JTextField txttelephone;
    private javax.swing.JTextField txtville;
    // End of variables declaration//GEN-END:variables
}
