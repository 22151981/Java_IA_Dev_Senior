import java.util.Scanner;

public class Ejercicios_clase2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        double resultadoDivision = (double) numero1 / numero2;

        System.out.println(" ingrese el primer número: ");
        numero1 = entrada.nextInt();
        System.out.println(" inghrese el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("--- RESULTADOS ---");

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);

        entrada.close();
    }

}
