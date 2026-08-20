import java.util.Scanner;

public class Ciclos2 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numero = 0;

    while (numero > 5 || numero <= 0) {
      System.out.println("Ingrese un número entre 1 y 5: ");
      numero = entrada.nextInt();

      if (numero > 5 || numero <= 0) {
        System.out.println("Número inválido, intente de nuevo.");
      }
    }

    System.out.println("El número ingresado es: " + numero);
    entrada.close();
  }
}
