import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos a mi Codigo ...!");

        Perro miPerro = new Perro();
        miPerro.nombre = "manu";
        miPerro.raza = "pug";
        miPerro.ladrar();
        miPerro.correr();

        Perro miPerro2 = new Perro();
        miPerro2.nombre = "luna";
        miPerro2.raza = "labrador";
        miPerro2.ladrar();
        miPerro2.correr();

        Libro milibro = new Libro();
        System.out.println("Ingrese el titulo del libro:");
        milibro.titulo = entrada.nextLine();
        System.out.println("Ingrese el autor del libro:");
        milibro.autor = entrada.nextLine();
        milibro.mostrarInformacion();

        Libro milibro2 = new Libro();
        milibro2.titulo = ("El principito");

        milibro2.autor = ("Antoine de Saint-Exupéry");
        milibro2.mostrarInformacion();

        entrada.close();
    }

}
