import java.util.Scanner;

public class Opciones {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println(" Ingrese el numero de pedido: ");
    int opcion = entrada.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("nuevo pedido");
        break;
      case 2:
        System.out.println("Aplicar descuento");
        break;
      case 3:
        System.out.println("Cerrar caja");
        break;

      default:
        System.out.println("Opcion Invalida.....");
        break;

    }

    entrada.close();
  }

}
