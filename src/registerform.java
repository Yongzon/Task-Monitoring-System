
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
    }
    
    Color bodycolor = new Color(255,153,51);
    Color bodycolor2 = new  Color(255,102,0);
    Color lblogcolor = new Color(255,153,51);
    Color lblogcolor2 = new Color(255,102,0);
    Color bodycolorsign = new Color(255,102,102);
    Color bodycolorsign2 = new Color(255,51,51);
    Color lbsign = new Color(255,102,102);
    Color lbsign2 = new Color(255,51,51);
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Signpane = new javax.swing.JPanel();
        btnloginpanel1 = new javax.swing.JPanel();
        btnlogin1 = new javax.swing.JLabel();
        lblsignup = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        l_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        c_password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Best-Task-Management-Software-Platforms.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 380, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Signpane.setBackground(new java.awt.Color(255, 51, 51));
        Signpane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignpaneMouseExited(evt);
            }
        });
        Signpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnloginpanel1.setBackground(new java.awt.Color(255, 51, 51));
        btnloginpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginpanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginpanel1MouseExited(evt);
            }
        });
        btnloginpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlogin1.setText("Login");
        btnlogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogin1MouseExited(evt);
            }
        });
        btnloginpanel1.add(btnlogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 20));

        Signpane.add(btnloginpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, 40));

        lblsignup.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblsignup.setForeground(new java.awt.Color(255, 255, 255));
        lblsignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignup.setText("Signup");
        lblsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignupMouseClicked(evt);
            }
        });
        Signpane.add(lblsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 20));

        jPanel3.add(Signpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 180, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Email");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sign Up");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 40));

        username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 250, 40));

        password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 250, 40));

        l_name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        l_name.setBorder(null);
        l_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_nameActionPerformed(evt);
            }
        });
        jPanel3.add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 40));

        email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Username");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 30));

        lbl_login.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("Already have an account? Click here");
        lbl_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 220, 30));

        c_password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        c_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_password.setBorder(null);
        jPanel3.add(c_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 250, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Confirm Password");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, 30));

        f_name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        f_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        f_name.setBorder(null);
        f_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nameActionPerformed(evt);
            }
        });
        jPanel3.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Fist Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 330, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignpaneMouseEntered
        Signpane.setBackground(bodycolorsign);
    }//GEN-LAST:event_SignpaneMouseEntered

    private void SignpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignpaneMouseExited
        Signpane.setBackground(bodycolorsign2);
    }//GEN-LAST:event_SignpaneMouseExited

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void l_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void btnlogin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogin1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin1MouseEntered

    private void btnlogin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin1MouseExited

    private void btnloginpanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginpanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginpanel1MouseEntered

    private void btnloginpanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginpanel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginpanel1MouseExited

    private void SignpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignpaneMouseClicked
      String firstname = f_name.getText();
      String lastname = l_name.getText();
      String email1 = email.getText();
      String username1 = username.getText();
      String password1 = new String(password.getPassword());
      String cpassword = new String(c_password.getPassword());
      
      if (firstname.isEmpty() || lastname.isEmpty() || email1.isEmpty() || username1.isEmpty() || password1.isEmpty() || cpassword.isEmpty()){
          JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
      }else if(password1.length() < 8){
          JOptionPane.showMessageDialog(this, "Password must be atleast 8 characters!", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
           JOptionPane.showMessageDialog(this, "Sign up Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
      }
      
     l_name.setText("");
     email.setText("");
     username.setText("");
     password.setText("");  
    }//GEN-LAST:event_SignpaneMouseClicked

    private void lblsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignupMouseClicked
      String firstname = f_name.getText();
      String lastname = l_name.getText();
      String email1 = email.getText();
      String username1 = username.getText();
      String password1 = new String(password.getPassword());
      String cpassword = new String(c_password.getPassword());
      
      if (firstname.isEmpty() || lastname.isEmpty() || email1.isEmpty() || username1.isEmpty() || password1.isEmpty() || cpassword.isEmpty()){
          JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
      }else if(password1.length() < 8){
          JOptionPane.showMessageDialog(this, "Password must be atleast 8 characters!", "Error", JOptionPane.ERROR_MESSAGE);
      }else{
           JOptionPane.showMessageDialog(this, "Sign up Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
      }
      
     l_name.setText("");
     email.setText("");
     username.setText("");
     password.setText("");
    }//GEN-LAST:event_lblsignupMouseClicked

    private void lbl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseClicked
      loginform lf = new loginform();
      lf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lbl_loginMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void f_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nameActionPerformed

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Signpane;
    private javax.swing.JLabel btnlogin1;
    private javax.swing.JPanel btnloginpanel1;
    private javax.swing.JPasswordField c_password;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField l_name;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
