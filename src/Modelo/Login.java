/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Inicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;

/**
 *
 * @aut
 */
public class Login {

    private String nombre;
    private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // metodo
    public boolean Iniciar(Login login) {
       
        try {
             PreparedStatement ps = null;
            ResultSet res = null;
            String query = "SELECT * FROM tbEmpleados WHERE usuario=? and contraseña=? and idTipoUsuario = 2";

            ps = Modelo.SQLConexion.getConexion().prepareStatement(query);
            ps.setString(1, login.getNombre());
            ps.setString(2, Encrip.convertirSHA256(login.getContraseña()));
            res = ps.executeQuery();
            if (res.next()) {

                System.out.println("Se encontro usuario");
                
                  Inicio in = new Inicio();
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
