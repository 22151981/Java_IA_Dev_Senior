import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        
        do {
            Menu.mostrarMenu();
            opcion = Menu.leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    // Llama a la lógica de agendar reservas
                    Operaciones.agendar(scanner);
                    break;
                case 2:
                    // Llama a listar las reservas
                    Operaciones.listar();
                    break;
                case 3:
                    // Llama a cancelar una reserva específica
                    Operaciones.cancelar(scanner);
                    break;
                case 4:
                    // Muestra el reporte acumulado del día
                    Operaciones.reporte();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de forma ordenada... ¡Hasta pronto, doña Marta!");
                    break;
                default:
                    // Captura opciones fuera del rango 1-5 o entradas no numéricas controladas
                    if (opcion != -1) {
                        System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
            }
        } while (opcion != 5); // El ciclo termina cuando el usuario selecciona la opción 5

        // Cerrar el Scanner limpiamente al finalizar la aplicación
        scanner.close();
    }
}
