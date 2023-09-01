package Controlador;
import  Vista.frmInventario;
import Modelo.Inventario;
import Vista.frmInventario;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ctrlInventario {
    private final Inventario inventario;
    private final frmInventario vista;

    public ctrlInventario(Inventario inventario, frmInventario vista) {
        this.inventario = inventario;
        this.vista = vista;

        // Agregar el ya al botón de búsqueda
        this.vista.btnBuscar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            buscarProductosPorNombre();
        }
    });

        // Cargar los datos iniciales en la tabla
        cargarDatosTabla();

        // Mostrar la vista
        vista.setVisible(true);
    }

    private void cargarDatosTabla() {
        DefaultTableModel model = inventario.cargarDatosTabla();
        this.vista.btnInventario();
    }

    private void buscarProductosPorNombre() {
        String nombre = vista.txtNombre.getText();
        DefaultTableModel model = inventario.buscarProductosPorNombre(nombre);
        vista.tbIventario();
    }
}