/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Controlador.ctrlProductos;
import Vista.frmProductos;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Burgos
 */
public class Producto {
    private String nombreProducto;
    private int precio;
    private int cantidad;
    private String descripcion;


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

     
    public void agregar(Producto modeloProducto){

        try {

            PreparedStatement addProducto = SQLConexion.getConexion().prepareStatement("insert into tbProductos(nombre_producto, precio, cantidad, descripcion) values(?,?,?,?)");

            addProducto.setString(1, modeloProducto.getNombreProducto());

            addProducto.setInt(2, modeloProducto.getPrecio());

            addProducto.setInt(3, modeloProducto.getCantidad());
            
             addProducto.setString(4, modeloProducto.getDescripcion());
             
        
            

          addProducto.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.toString()); 

        }
     } 
    public void mostrar(frmProductos VistaCrud){

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(new Object []{"idProducto","nombre_producto", "precio", "cantidad","descripcion"});



        try{

            Statement statement = SQLConexion.getConexion().createStatement();

            String query = "SELECT * FROM tbProductos";

            ResultSet rs = statement.executeQuery(query);


            while(rs.next()){

                modelo.addRow(new Object[] {rs.getInt("idProducto") ,rs.getString("nombre_producto"),rs.getInt("precio"),rs.getInt("cantidad"), rs.getString("descripcion")});

            }
            
            

            

            VistaCrud.tablaProductos.setModel(modelo);



          

        }catch(SQLException ex){

            System.out.println(ex.toString());

        }
    }
        public void eliminar(frmProductos  VistaCrud){
    
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = VistaCrud.tablaProductos.getSelectedRow();
        
        //Obtenemos el id de la fila seleccionada
        String miId = VistaCrud.tablaProductos.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteUser = SQLConexion.getConexion().prepareStatement("delete from tbProductos where idProducto = '" + miId + "'");
            deleteUser.executeUpdate();
        } catch (Exception e) {
         System.out.println(e.toString());
        }
    }
         public void actualizar(frmProductos VistaCrud){

    

        //obtenemos que fila seleccionó el usuario

        int filaSeleccionada = VistaCrud.tablaProductos.getSelectedRow();

       

        //Obtenemos el id de la fila seleccionada

        String miId = VistaCrud.tablaProductos.getValueAt(filaSeleccionada, 0).toString();

        

       String nuevoValorIngresadoNombre = VistaCrud.txtProducto.getText();

       String nuevoValorIngresadoPrecio = VistaCrud.txtPrecio.getText();

       String nuevoValorIngresadoCantidad = VistaCrud.txtCantidad.getText();
       
       String nuevoValorIngresadoDescripcion = VistaCrud.txtDescripcion.getText();
        
   

        try {

            PreparedStatement updateUser = SQLConexion.getConexion().prepareStatement("update tbProductos set nombre_producto = ?, precio = ?, cantidad = ?, descripcion= ?  where idProducto = ?");

            updateUser.setString(1, nuevoValorIngresadoNombre);

            updateUser.setInt(2, Integer.parseInt( nuevoValorIngresadoPrecio));
               updateUser.setInt(3, Integer.parseInt( nuevoValorIngresadoCantidad));

            updateUser.setString(4, nuevoValorIngresadoDescripcion);

            updateUser.setString(5, miId);

            updateUser.executeUpdate();



        } catch (Exception e) {



            System.out.println(e.toString());



        }

    }
       
    
}
