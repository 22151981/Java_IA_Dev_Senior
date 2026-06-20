import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("nombre del cliente: ");
        String nombre = entrada.nextLine();

        System.out.println("cuentas personas en la mesa: ");
        int personas = entrada.nextInt();

        System.out.println("mesa de : " + nombre + " con " + personas + " personas");

    }
}
