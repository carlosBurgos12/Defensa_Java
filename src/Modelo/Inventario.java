package Modelo;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Inventario {
    private final String DB_URL = "jdbc:mysql://localhost:62959/OIRSA_Expo";
    private final String DB_USER = "sa";
    private final String DB_PASS = "itr2023";

    public DefaultTableModel cargarDatosTabla() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Codigo", "Cantidad", "Precio"}, 0);

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            PreparedStatement statement = connection.prepareStatement("SELECT nombre, codigo, unidades, precio FROM tbProductos");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String codigo = resultSet.getString("codigo");
                int cantidad = resultSet.getInt("unidades");
                double precio = resultSet.getDouble("precio");
                model.addRow(new Object[]{nombre, codigo, cantidad, precio});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return model;
    }

    public DefaultTableModel buscarProductosPorNombre(String nombre) {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Codigo", "Cantidad", "Precio"}, 0);

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            String query = "SELECT nombre, codigo, unidades, precio FROM tbProductos WHERE nombre LIKE ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, "%" + nombre + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String productoNombre = resultSet.getString("nombre");
                String codigo = resultSet.getString("codigo");
                int cantidad = resultSet.getInt("unidades");
                double precio = resultSet.getDouble("precio");
                model.addRow(new Object[]{productoNombre, codigo, cantidad, precio});
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return model;
    }
}
