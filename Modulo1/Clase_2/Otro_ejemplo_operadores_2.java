
import java.util.Scanner;

public class Otro_ejemplo_operadores_2 {
   public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.println(" valor a pagar: ");
      double valor = entrada.nextDouble();

      double Propina = valor * 0.05;
      double Total = valor + Propina;
      double Total_redondeado = Math.round(Total * 100.0) / 100.0;

      // Mostramos los resultados actuales en pantalla
      System.out.println("Valor de la compra: " + valor);
      System.out.println("Propina (5%): " + Propina);
      System.out.println("Total a pagar (con propina): " + Total_redondeado);

      // Pedimos el dinero en efectivo que entrega el cliente
      System.out.println("¿Con cuánto dinero paga el cliente?: ");
      double dineroRecibido = entrada.nextDouble(); // El sistema espera que escribas aquí

      // Calculamos los vueltos restando el dinero que dio menos el total
      double vueltos = dineroRecibido - Total_redondeado;

      // Mostramos los vueltos en la consola
      System.out.println("Los vueltos a entregar son: " + vueltos);

      entrada.close();

   }

}
