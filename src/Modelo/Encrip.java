package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrip {

    
    
    
    public static String convertirSHA256(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            System.out.println("Contraseña encriptada con éxito.");
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error al obtener el algoritmo SHA-256: " + e.toString());
            return null;
        }
    }
}
