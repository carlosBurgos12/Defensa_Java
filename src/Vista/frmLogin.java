/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Login;
import Controlador.ctrlLogin;
import Modelo.LoginAdmin;
import Vista.frmRegistrarse;
import Modelo.Registrarse;
import Vista.recuperacionContraseña;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Burgos
 */
public class frmLogin extends javax.swing.JFrame {


    public frmLogin() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(txtImagenFondo,"src/Imagenes/fondo_interfaces.png");
          rsscalelabel.RSScaleLabel.setScaleLabel(txtLogo,"src/Imagenes/logo.png");
          
           setLocationRelativeTo(null);

    }
    
    public void InitLogin(){
         Login modeloLogin = new Login();
                frmLogin frmLogin = new frmLogin();
                LoginAdmin modeloLoginAdmin = new LoginAdmin();
                ctrlLogin controlador = new ctrlLogin(modeloLogin, modeloLoginAdmin, frmLogin);
                
              
               frmLogin.setVisible(true);
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRecuperacionContraseñas = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtRegistrarse = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        txtImagenFondo = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("Usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtRecuperacionContraseñas.setForeground(new java.awt.Color(102, 153, 255));
        txtRecuperacionContraseñas.setText("¿Olvidaste la contraseña?");
        txtRecuperacionContraseñas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRecuperacionContraseñasMouseClicked(evt);
            }
        });
        jPanel1.add(txtRecuperacionContraseñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(153, 204, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 150, 70));

        txtRegistrarse.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtRegistrarse.setForeground(new java.awt.Color(102, 153, 255));
        txtRegistrarse.setText("¿No tienes cuenta? Registrate ");
        txtRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(txtRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));
        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 210, 250));
        jPanel1.add(txtImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 370, 610));

        txtContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtRecuperacionContraseñasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecuperacionContraseñasMouseClicked
            recuperacionContraseña recu = new recuperacionContraseña();
       recu.setVisible(true);
            dispose();
    }//GEN-LAST:event_txtRecuperacionContraseñasMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        try{
        LoginAdmin Login = new LoginAdmin();
        Login.setUsuario(txtUsuario.getText());
        Login.setPassword(txtContraseña.getText());
        
        
        Login log = new Login();
        log.setNombre(txtUsuario.getText());
        log.setContraseña(txtContraseña.getText());
        
        
        if(Login.Iniciar(Login)==true){
            InicioAdmin ini = new InicioAdmin();
            ini.setVisible(true);
            dispose();
            return;
        }
        else if(log.Iniciar(log)== true)
        {
            Inicio inic = new Inicio();
            inic.setVisible(true);
            dispose();
        }
    
        }
        catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "No existe el usuario");
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrarseMouseClicked
        frmRegistrarse nueva = new  frmRegistrarse();
        nueva.init();
        dispose();
        
        

    }//GEN-LAST:event_txtRegistrarseMouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                
                Login modeloLogin = new Login();
                frmLogin frmLogin = new frmLogin();
                LoginAdmin modeloLoginAdmin = new LoginAdmin();
                ctrlLogin controlador = new ctrlLogin(modeloLogin, modeloLoginAdmin, frmLogin);
                
               frmLogin.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JLabel txtImagenFondo;
    public javax.swing.JLabel txtLogo;
    public javax.swing.JLabel txtRecuperacionContraseñas;
    public javax.swing.JLabel txtRegistrarse;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
