import java.util.Scanner;

public class Clase_Clicos {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el numero de la tabla de multiplicar: ");
    int tabla = entrada.nextInt();

    System.out.println("Tabla del " + tabla + ":");

    for (int i = 1; i <= 10; i++) {
      int resultado = tabla * i;

      System.out.println(+tabla + " x " + i + " = " + resultado);

    }
    System.out.println("gracias por usar el programa ");
    entrada.close();
  }

}
