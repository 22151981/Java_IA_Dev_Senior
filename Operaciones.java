

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.println("Ingrese el primer número: ");
        int a = entrada.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int c = entrada.nextInt();

        // Operaciones
        int resultadoSuma = a + b + c;
        int resultadoResta = a - b - c;
        int resultadoMultiplicacion = a * b * c;
        double resultadoDivision = (double) a / b / c;
        int resultadoModulo = a % b % c;

        // Mostrar resultados
        System.out.println("--- RESULTADOS ---");
        System.out.println("Número 1: " + a);
        System.out.println("Número 2: " + b);
        System.out.println("Número 3: " + c);
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
        System.out.println("Módulo: " + resultadoModulo);

        entrada.close();
    }
}

