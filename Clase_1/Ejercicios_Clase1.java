import java.util.Scanner;

public class Ejercicios_Clase1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese su estatura: ");
        double estatura = entrada.nextDouble();

        System.out.print("Ingrese su peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese su salario: ");
        long Salario = entrada.nextLong();
        entrada.nextLine(); // Limpiar el buffer después de leer un número
        System.out.print("Ingrese su nivel de estudios: ");
        String Estudios = entrada.nextLine();
        System.out.print("Ingrese su dirección: ");
        String Direccion = entrada.nextLine();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println(" Nombre completo es: " + nombre + " " + apellidos);
        System.out.println(" Edad: " + edad + " años");
        System.out.println(" Estatura: " + estatura + " metros");
        System.out.println(" Peso: " + peso + " kg");
        System.out.println(" Salario: $" + Salario);
        System.out.println(" Nivel de estudios: " + Estudios);
        System.out.println(" Dirección: " + Direccion);
    }
}