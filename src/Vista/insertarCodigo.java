/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author deleon
 */
public class insertarCodigo extends javax.swing.JFrame {

    private String correoUsuario;
   // private String codigoEnviado;
    private String codigoAleatorio;
    /**
     * Creates new form insertarCodigo
     */
    public insertarCodigo() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(txtFondo,"src/Imagenes/fondo_interfas2.png");
          rsscalelabel.RSScaleLabel.setScaleLabel(txtLogo,"src/Imagenes/logo.png");
    }

    public insertarCodigo(String correoUsuario, String codigoAleatorio) {
       this(); // Llamamos al constructor por defecto para inicializar los componentes del formulario
            this.correoUsuario = correoUsuario; // Almacenamos el correo del usuario en el atributo correoUsuario
            this.codigoAleatorio = codigoAleatorio;
                
            
            
            
        // Mostrar algún mensaje o hacer alguna acción adicional si es necesario
        System.out.println("Correo del usuario: " + correoUsuario);
        System.out.println("codigo aleatorio: "+ codigoAleatorio);
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLogo = new javax.swing.JLabel();
        txtFondo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 230, 200));
        jPanel1.add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel9.setText("Se le envio un codigo de verificacion al correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 400, 30));

        txtCodigo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 280, 40));

        btnContinuar.setBackground(new java.awt.Color(153, 204, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 150, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel1.setText("Ingresar codigo: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     String codigoIngresado = txtCodigo.getText().trim();

    if (codigoIngresado.equals(codigoAleatorio)) {
        //aqui loo uqe hice fue di esta bien abrir la cosa de ingresar la contra nueva
        nuevaContra nc = new nuevaContra();
        nc.setVisible(true);
        dispose(); //pa cerrar la de insert ocdigo
    } else {
        //aqui si el codigo yta malo dar error
        JOptionPane.showMessageDialog(this, "Código incorrecto. Por favor, ingrese el código de verificación válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
      
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
         char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume(); //esto es pa que si ingresa letritas no se vea, no tocaaar
    }
    }//GEN-LAST:event_txtCodigoKeyTyped

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
            java.util.logging.Logger.getLogger(insertarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertarCodigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtFondo;
    private javax.swing.JLabel txtLogo;
    // End of variables declaration//GEN-END:variables
}
