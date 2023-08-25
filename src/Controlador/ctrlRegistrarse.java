package Controlador;

import Modelo.Registrarse;
import Vista.frmRegistrarse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ctrlRegistrarse implements ActionListener {
    private Registrarse modeloRegistrarse;
    private frmRegistrarse vistaRegistrarse;
    
    public ctrlRegistrarse(Registrarse modeloRegistrarse, frmRegistrarse vistaRegistrarse) {
        this.modeloRegistrarse = modeloRegistrarse;
        this.vistaRegistrarse = vistaRegistrarse;
        
        // Agregar los ActionListener a los botones
        this.vistaRegistrarse.btnRegistrarse.addActionListener(this);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegistrarse.btnRegistrarse) {
            String usuario = vistaRegistrarse.txtNombreUsuario.getText();
            String email = vistaRegistrarse.txtEmailUsuario.getText();
            String contraseña = new String(vistaRegistrarse.txtContraseñaUsuario.getPassword());
            
            modeloRegistrarse.setUsuario(usuario);
            modeloRegistrarse.setEmail(email);
            modeloRegistrarse.setContraseña(contraseña);
            
            
            if (modeloRegistrarse.AgregarUsuario() == true) {
                // Mostrar un mensaje de éxito o realizar alguna acción adicional
                System.out.println("Usuario registrado exitosamente.");
            } else {
                // Mostrar un mensaje de error o realizar alguna acción adicional
                System.out.println("Error al registrar el usuario.");
            }
        }
    }
}
