import java.util.Scanner;

public class Ejercicio_Condicionales {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println(" bienvenidos al parque Layton : ");
    System.out.println(" ingrese  nombre del titular: ");
    String nombre = entrada.nextLine();
    System.out.println(" ingrese el numero de personas: ");
    int personas = entrada.nextInt();
    System.out.println(" mayor de 18 años: ");
    double mayores = entrada.nextDouble();
    System.out.println(" menor de 18 años: ");
    double menores = entrada.nextDouble();
    System.out.println(" se encuentra afiliado: ");
    boolean descuentoAfiliados = entrada.nextBoolean();

    double valorEntradaM = 15000;
    double valorEntradaMe = 8000;
    double totalMayores = mayores * valorEntradaM;
    double totalMenores = menores * valorEntradaMe;
    double totalCuenta = totalMayores + totalMenores;
    System.out.println(" El señor " + nombre + " el total a pagar es: $" + totalCuenta);
    double descuento = 0.10;
    if (descuentoAfiliados == true) {
      double totalDescuento = totalCuenta * descuento;
      double totalPagar = totalCuenta - totalDescuento;
      System.out.println(" Se aplicó un descuento por afiliación del 10%.");
      System.out.println("El valor del descuento es: $" + totalDescuento);
      System.out.println("El total a pagar después del descuento es: $" + totalPagar);
    } else {
      System.out.println(" No tiene descuento por afiliación");

    }
    entrada.close();
  }
}