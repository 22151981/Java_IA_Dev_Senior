
import config.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;



public class App {
    public static void main(String[] args) throws Exception {
        try (Connection conexion = ConexionBD.obtenerConexion()) {
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
