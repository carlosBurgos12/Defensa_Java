/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Inicio;
import Vista.InicioAdmin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Burgos
 */
public class LoginAdmin {
    String usuario;
    String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public LoginAdmin(){
        
    }
    public LoginAdmin(String usuario, String password){ 
        this.usuario = usuario;
        this.password = password;
    }
    
    public boolean Iniciar(LoginAdmin login) {
       
        try {
             PreparedStatement ps = null;
            ResultSet res = null;
            String query = "SELECT * FROM tbEmpleados WHERE usuario=? and contraseña=? and idTipoUsuario = 1";

            ps = Modelo.SQLConexion.getConexion().prepareStatement(query);
            ps.setString(1, login.getUsuario());
            ps.setString(2, Encrip.convertirSHA256(login.getPassword()));
            res = ps.executeQuery();
            if (res.next()) {
                     InicioAdmin incio = new InicioAdmin();
         
                System.out.println("Se encontro usuario");
                  InicioAdmin in = new InicioAdmin();
                in.setVisible(true);
                return true;
            }
            System.out.println("No se encontro usuario");
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo.Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
          

        }
    }
    
}
