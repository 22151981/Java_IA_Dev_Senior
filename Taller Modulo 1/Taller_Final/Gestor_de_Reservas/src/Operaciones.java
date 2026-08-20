import java.util.Scanner;

public class Operaciones {

  // Bloque 3: Constante de capacidad máxima de la agenda (10 reservas)
  private static final int MAX_RESERVAS = 10;

  // Bloque 3: Arreglos paralelos compartidos para guardar las reservas
  private static String[] clientes = new String[MAX_RESERVAS];
  private static int[] horas = new int[MAX_RESERVAS];
  private static int[] servicios = new int[MAX_RESERVAS];

  // Bloque 3: Contador de reservas actuales agendadas
  private static int contadorReservas = 0;

  // Constantes de precios de los servicios
  private static final int PRECIO_CORTE = 25000;
  private static final int PRECIO_TINTE = 60000;
  private static final int PRECIO_MANICURE = 30000;

  // Bloque 4: Método auxiliar para verificar si una hora ya está ocupada en la
  // agenda
  public static boolean horaOcupada(int hora) {
    for (int i = 0; i < contadorReservas; i++) {
      if (horas[i] == hora) {
        return true; // La hora ya está agendada
      }
    }
    return false; // La hora está libre
  }

  // Bloque 5: Método auxiliar para traducir el código numérico al nombre del
  // servicio
  public static String obtenerNombreServicio(int codigoServicio) {
    switch (codigoServicio) {
      case 1:
        return "Corte de cabello";
      case 2:
        return "Tinte";
      case 3:
        return "Manicure";
      default:
        return "Desconocido";
    }
  }

  // Bloque 5: Método auxiliar para obtener el precio según el código de servicio
  public static int obtenerPrecioServicio(int codigoServicio) {
    switch (codigoServicio) {
      case 1:
        return PRECIO_CORTE;
      case 2:
        return PRECIO_TINTE;
      case 3:
        return PRECIO_MANICURE;
      default:
        return 0;
    }
  }

  // Bloque 4: Agendar una nueva reserva con validaciones
  public static void agendar(Scanner scanner) {
    // 1. Validar si hay cupo disponible
    if (contadorReservas >= MAX_RESERVAS) {
      System.out.println("No hay cupo disponible. Agenda llena (Máximo " + MAX_RESERVAS + " reservas).");
      return;
    }

    // 2. Pedir y validar el nombre
    System.out.print("Ingrese el nombre del cliente: ");
    String nombre = scanner.nextLine();
    if (!Validador.nombreValido(nombre)) { // Usando nombre exacto del taller
      System.out.println("Error: El nombre no puede estar vacío.");
      return;
    }

    // 3. Pedir y validar la hora
    System.out.print("Ingrese la hora de la cita (8 a 17): ");
    if (!scanner.hasNextInt()) {
      System.out.println("Error: Debe ingresar un número entero para la hora.");
      scanner.nextLine(); // Limpiar buffer
      return;
    }
    int hora = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer

    if (!Validador.horaValida(hora)) {
      System.out.println("Error: El horario de atención es únicamente de 8 a 17 horas.");
      return;
    }

    // 4. Validar si la hora ya está ocupada
    if (horaOcupada(hora)) {
      System.out.println("Error: Ya existe una cita agendada a las " + hora + ":00.");
      return;
    }

    // 5. Pedir y validar el servicio
    System.out.println("Servicios disponibles:");
    System.out.println("1. Corte de cabello ($25.000)");
    System.out.println("2. Tinte ($60.000)");
    System.out.println("3. Manicure ($30.000)");
    System.out.print("Seleccione el servicio (1-3): ");
    if (!scanner.hasNextInt()) {
      System.out.println("Error: Debe ingresar un número para el servicio.");
      scanner.nextLine(); // Limpiar buffer
      return;
    }
    int servicio = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer

    if (!Validador.servicioValido(servicio)) {
      System.out.println("Error: Servicio inválido. Debe seleccionar entre 1, 2 o 3.");
      return;
    }

    // 6. Guardar datos en los arreglos paralelos e incrementar el contador
    clientes[contadorReservas] = nombre;
    horas[contadorReservas] = hora;
    servicios[contadorReservas] = servicio;
    contadorReservas++;

    System.out.println("¡Reserva agendada con éxito para " + nombre + " a las " + hora + ":00!");
  }

  // Bloque 5: Listar todas las reservas del día actual
  public static void listar() {
    if (contadorReservas == 0) {
      System.out.println("Aún no hay reservas.");
      return;
    }

    System.out.println("\n--- LISTA DE RESERVAS DEL DÍA ---");
    for (int i = 0; i < contadorReservas; i++) {
      String nombreServicio = obtenerNombreServicio(servicios[i]);
      // Se muestra el índice + 1 de forma legible ("más humano")
      System.out.println(
          (i + 1) + ". Cliente: " + clientes[i] + " | Hora: " + horas[i] + ":00 | Servicio: " + nombreServicio);
    }
  }

  // Bloque 6: Cancelar una reserva y reorganizar los arreglos para "tapar el
  // hueco"
  public static void cancelar(Scanner scanner) {
    if (contadorReservas == 0) {
      System.out.println("No hay reservas registradas para poder cancelar.");
      return;
    }

    System.out.print("Ingrese el número de reserva que desea cancelar (1 a " + contadorReservas + "): ");
    if (!scanner.hasNextInt()) {
      System.out.println("Error: Debe ingresar un número válido.");
      scanner.nextLine(); // Limpiar buffer
      return;
    }
    int numReserva = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer

    // Validar que el número de reserva exista en el rango del contador actual
    if (numReserva < 1 || numReserva > contadorReservas) {
      System.out.println("Error: El número de reserva no existe.");
      return;
    }

    // Traducir el número humano al índice del arreglo (num - 1)
    int indiceBorrar = numReserva - 1;
    String clienteCancelado = clientes[indiceBorrar];

    // "Tapar el hueco" desplazando los elementos hacia la izquierda
    for (int i = indiceBorrar; i < contadorReservas - 1; i++) {
      clientes[i] = clientes[i + 1];
      horas[i] = horas[i + 1];
      servicios[i] = servicios[i + 1];
    }

    // Limpiar el último elemento duplicado tras el desplazamiento por buena
    // práctica
    clientes[contadorReservas - 1] = null;
    horas[contadorReservas - 1] = 0;
    servicios[contadorReservas - 1] = 0;

    // Reducir el contador global de reservas
    contadorReservas--;
    System.out.println("La reserva de " + clienteCancelado + " ha sido cancelada exitosamente.");
  }

  // Bloque 7: Reporte financiero del día
  public static void reporte() {
    int totalCitas = contadorReservas; // El contador indica cuántas citas hay agendadas actualmente
    int dineroFacturado = 0;

    // Acumular el costo de cada reserva según el servicio asignado
    for (int i = 0; i < contadorReservas; i++) {
      dineroFacturado += obtenerPrecioServicio(servicios[i]);
    }

    System.out.println("\n=== REPORTE DIARIO DE CAJA ===");
    System.out.println("Total de citas agendadas: " + totalCitas);
    System.out.println("Dinero facturado hoy: $" + dineroFacturado);
    System.out.println("==============================");
  }
}
