/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Vista.frmProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Burgos
 */
public class ctrlProductos implements ActionListener{
    private Producto modeloProducto;
    private  frmProductos vistaCrud;
    
     public ctrlProductos(Producto modeloProducto,frmProductos vistaCrud){
        this.modeloProducto=modeloProducto;
        this.vistaCrud=vistaCrud;
        this.vistaCrud.btnAñadir.addActionListener(this);
        this.vistaCrud.btnEditar.addActionListener(this);
         this.vistaCrud.btnEliminar.addActionListener(this);
       
    }
 
    @Override
     public void actionPerformed (ActionEvent e) {
        if(e.getSource() == vistaCrud.btnAñadir){
            if (!(vistaCrud.txtProducto.getText().equals(""))) {
            modeloProducto.setNombreProducto(vistaCrud.txtProducto.getText());
            modeloProducto.setPrecio(Integer.parseInt(vistaCrud.txtPrecio.getText()));
            modeloProducto.setCantidad(Integer.parseInt(vistaCrud.txtCantidad.getText()));
            modeloProducto.setDescripcion(vistaCrud.txtDescripcion.getText());

            
            modeloProducto.agregar(modeloProducto);
            modeloProducto.mostrar(vistaCrud);    
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese el nombre");
            }
             
        }
          if(e.getSource() == vistaCrud.btnEliminar){
         
              if(vistaCrud.tablaProductos.getSelectedRow()>=0){
                  modeloProducto.eliminar(vistaCrud);
                  modeloProducto.mostrar(vistaCrud);
              }
              
             
        }
            if(e.getSource() == vistaCrud.btnEditar){
           
            if(vistaCrud.tablaProductos.getSelectedRow()>=0){
                modeloProducto.actualizar(vistaCrud);
                modeloProducto.mostrar(vistaCrud);
            }
            
             
        }
   
    }
}
