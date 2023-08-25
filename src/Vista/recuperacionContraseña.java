
package Vista;

/**
 *
 * @author deleon
 */

import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;


public class recuperacionContraseña extends javax.swing.JFrame {

    //esto lo tengo que cambiar a algun correo qeu nosotros creemos
   private static String emailFrom = "oirsaoirsa@gmail.com";
    private static String passwordFrom = "";
   private String emailTo;
   private String  subject;
   private String codigoAleatorio;
    private insertarCodigo codigoVentana;
    private String content;
    
    
    public recuperacionContraseña() {
        initComponents();
        
        rsscalelabel.RSScaleLabel.setScaleLabel(txtFondo,"src/Imagenes/fondo_interfas2.png");
          rsscalelabel.RSScaleLabel.setScaleLabel(txtLogo,"src/Imagenes/logo.png");
    }
    //esto es pa el codigo aleatorio no moveeer por faa
    public String generarCodigoAleatorio() {
        Random random = new Random();
        int codigo = 10000 + random.nextInt(90000); 
        return Integer.toString(codigo);
    }

    public void mandarCorreo(){
    
        String correoDestinatario = txtCorreo.getText().trim(); // agarramos el correo ingresado por el usua
        if (correoDestinatario.isEmpty()) {
            //por si da error 
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un correo electrónico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Generar código aleatorio de 5 dígitos
        codigoAleatorio = generarCodigoAleatorio(); 
        enviarCorreo(codigoAleatorio, correoDestinatario);
        JOptionPane.showMessageDialog(this, "Se ha enviado un código de verificación al correo electrónico proporcionado.", "Código enviado", JOptionPane.INFORMATION_MESSAGE);
        
      //para asignar a la variable de codigoVentana
        codigoVentana = new insertarCodigo(correoDestinatario, codigoAleatorio);
        codigoVentana.setVisible(true);

        
        dispose();
    }
     private void enviarCorreo(String codigo, String correoDestinatario) { 
            System.out.println("Código aleatorio a enviar por correo: " + codigo);

        try{
            //Preparar las cosas
            String correoEmisor = "ejemploclase24@gmail.com";
            String contraseñaEmisor = "dsrgrrmdgdpjvoak";     
            String asunto = "Recuperación de contraseña";
            String mensaje = "Este es tu código de recuperación: " + codigo;
            
            //Configurar SMTP
          Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
          
            //Configurar el envio
           Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEmisor));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            message.setSubject(asunto);
            message.setText(mensaje);

            //Envío del mensaje
           Transport t = session.getTransport("smtp");
            t.connect(correoEmisor, contraseñaEmisor);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al enviar el correo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JButton();
        txtLogo = new javax.swing.JLabel();
        txtFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 290, 30));

        txtCodigo.setBackground(new java.awt.Color(153, 255, 51));
        txtCodigo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setText("Continuar");
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 150, 40));
        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 230, 200));
        jPanel1.add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Escriba su correo electronico:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
          
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked

         mandarCorreo();
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(recuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperacionContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recuperacionContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel txtFondo;
    private javax.swing.JLabel txtLogo;
    // End of variables declaration//GEN-END:variables

}
