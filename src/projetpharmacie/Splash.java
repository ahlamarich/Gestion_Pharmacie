
package projetpharmacie;


import javax.swing.JProgressBar;



public class Splash extends javax.swing.JFrame {
    pbThead t1;

    public Splash() {
        initComponents();
        t1 = new pbThead (progress);
        t1.start();
    }
    class pbThead extends Thread{
        JProgressBar pbar;
        pbThead(JProgressBar pbar)
        {
            pbar = progress;
        }
        public void run(){
            int min =0;
            int max = 50;
            
            progress.setMaximum(min);
            progress.setMaximum(max);
            progress.setValue(0);
            
            for (int i = min; i < max; i++) {
                progress.setValue(i);
                
                try{
                    sleep(200);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        lblbar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("x");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 0, 20, 38);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMAR\\Documents\\projet_pharmacie\\images.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 140, 270, 240);

        progress.setBackground(new java.awt.Color(0, 102, 0));
        progress.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(progress);
        progress.setBounds(0, 514, 690, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Gestion pharmacie");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 40, 240, 38);

        lblbar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblbar.setForeground(new java.awt.Color(0, 102, 0));
        lblbar.setText("100%");
        lblbar.setName(""); // NOI18N
        jPanel1.add(lblbar);
        lblbar.setBounds(270, 420, 120, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblbar;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
