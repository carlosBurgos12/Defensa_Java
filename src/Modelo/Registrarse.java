package Modelo;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registrarse {
    
    // Atributos
    private String usuario;
    private String email;
    private String contraseña;
    
    // Getter and Setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public boolean AgregarUsuario() {
        try {
            PreparedStatement addRegistrarse = SQLConexion.getConexion().prepareStatement("insert into tbEmpleados (usuarioEmpleado, email, contraseñaEmpleado, idTipoUsuario) values (?,?,?,1)");
            addRegistrarse.setString(1, usuario);
            addRegistrarse.setString(2, email);
            addRegistrarse.setString(3, Encrip.convertirSHA256(contraseña)); // Encriptar la contraseña antes de guardarla
            addRegistrarse.executeUpdate();
            
            System.out.println("Se ejecuta el metodo en el modelo");
            
         
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
