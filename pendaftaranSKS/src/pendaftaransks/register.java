/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaransks;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class register extends javax.swing.JFrame {

    public login login;
    public Connection con;
    public Statement stmt;
    //private Object JOption;
    public register() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendaftaran","root","");
            stmt = con.createStatement();
            
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null,"Salah Prosedur");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        npm = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JenKelamin = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        batal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setText("register");

        jLabel2.setText("Nama");

        jLabel3.setText("NPM");

        jLabel4.setText("username / email");

        jLabel5.setText("password");

        signUp.setText("daftar");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis Kelamin");

        JenKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "L", "P" }));

        jLabel7.setText("ulangi pasword");

        batal.setText("batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(JenKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(npm)
                            .addComponent(nama)
                            .addComponent(username)
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(password2))))
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(batal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(signUp)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JenKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUp)
                    .addComponent(batal))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int out; 
        out = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin Ingin Keluar ?"); 
        if(out==JOptionPane.YES_OPTION){ 
            System.exit(0); 
        } 
        else{}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        if (npm.getText().equals("") || nama.getText().equals("") || username.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"mohon isi semua field yang telah disediakan");
        }   
        else if (JenKelamin.getSelectedItem().equals(" ")){
                JOptionPane.showMessageDialog(null,"Jenis kelamin anda ?");
        }
        else {
  
            if (String.valueOf(password1.getPassword()).equals (String.valueOf(password2.getPassword()))) {
                try{
            
            String sql = "insert into mahasiswa (NIM, nama_Mahasiswa, JenKel, username, password) values ('"+npm.getText()+"', '"+nama.getText()+"', '"+JenKelamin.getSelectedItem()+"', '"+username.getText()+"', '"+String.valueOf(password1.getPassword())+"')";
            int good = stmt.executeUpdate(sql);
            if (good > 0) {
                JOptionPane.showMessageDialog(null, "anda berhasil mendaftarkan diri");
                //nama.setText("");
                //npm.setText("");
                //username.setText("");
                //password1.setText("");
                //password2.setText("");
                //JenKelamin.RemoveAllItem();
                login = new login();
                login.setVisible(true);
              
            } else {
                //JOptionPane.showMessageDialog(null, "masih ada field kosong");
            }
            con.close();
            stmt.close();
            
            
            this.dispose();
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
               
            } 
 
            
            else  {
                JOptionPane.showMessageDialog(null,"password belum cocok");
            }
        }
                
    }//GEN-LAST:event_signUpActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        int out; 
        out = JOptionPane.showConfirmDialog(null,"\tyakin ingin membatalkan pendaftaran ? \n\tanda tidak akan bisa login jika tidak punya akun"); 
        if(out==JOptionPane.YES_OPTION){ 
            login = new login();
            login.setVisible(true);
            this.dispose();
        } 
        else{}
        
    }//GEN-LAST:event_batalActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JenKelamin;
    private javax.swing.JButton batal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField npm;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
