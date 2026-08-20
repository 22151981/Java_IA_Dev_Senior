import java.util.Scanner;

public class cajero {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Subtotal de la cuenta: ");
    double subtotal = entrada.nextDouble();

    if (subtotal >= 200000) {
      System.out.println("Descuento VIP aplicado");

    } else if (subtotal > 100000) {
      System.out.println("Descuento normal aplicado");

    } else {
      System.out.println("Sin Descuento");

    }
    entrada.close();
  }

}
