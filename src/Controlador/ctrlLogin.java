/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Login;
import Modelo.LoginAdmin;
import Vista.frmLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos Burgos
 */
public class ctrlLogin implements ActionListener{
    
    private Login modeloLogin;
    private LoginAdmin modeloLoginAdmin;
    private frmLogin vistaLogin;
    
    public ctrlLogin(Login modeloLogin, LoginAdmin modeloLoginAdmin, frmLogin vistaLogin){
        this.modeloLogin = modeloLogin;
        this.modeloLoginAdmin = modeloLoginAdmin;
        this.vistaLogin = vistaLogin;
        this.vistaLogin.btnIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== vistaLogin.btnIngresar){
            modeloLogin.setNombre(vistaLogin.txtUsuario.getText());
            modeloLogin.setContraseña(vistaLogin.txtContraseña.getText());
            
            
            //CERRRAR LOGIN
         
            
            if(modeloLogin.Iniciar(modeloLogin) == false){
                modeloLoginAdmin.setUsuario(vistaLogin.txtUsuario.getText());
                modeloLoginAdmin.setPassword(vistaLogin.txtContraseña.getText());
                modeloLoginAdmin.Iniciar(modeloLoginAdmin);
            }
            
            
            
            
        }
    }
}
