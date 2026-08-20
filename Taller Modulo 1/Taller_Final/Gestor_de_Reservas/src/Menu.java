import java.util.Scanner;

public class Menu {

  // Bloque 1: Dibuja las opciones del menú principal
  public static void mostrarMenu() {
    System.out.println("\n=== Bienvenidos al MENÚ PRINCIPAL ===");
    System.out.println("\n=== GESTOR DE RESERVAS - MARTA PELUQUERÍA ===");
    System.out.println("Seleccione una opción del menú:");
    System.out.println("1. Agendar una reserva");
    System.out.println("2. Listar todas las reservas del día");
    System.out.println("3. Cancelar una reserva");
    System.out.println("4. Ver el reporte del día");
    System.out.println("5. Salir");
    System.out.print("Seleccione una opción: ");
  }

  // Bloque 1: Lee la opción ingresada por el usuario usando el Scanner compartido
  public static int leerOpcion(Scanner scanner) {
    if (scanner.hasNextInt()) {
      int opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer del Scanner
      return opcion;
    } else {
      System.out.println("Error: Por favor, ingrese un número válido.");
      scanner.nextLine(); // Limpiar el buffer en caso de entrada inválida
      return -1; // Retorna un valor de control inválido
    }
  }
}
