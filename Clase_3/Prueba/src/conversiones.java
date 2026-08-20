public class conversiones {

  public static void main(String[] args) {

    /*
     * hay dos clases IMPLICITA Y EXPLICITA
     * IMPLICITA( automatica) de un tipo pequeño a una grande java lo hace solo y no
     * se pierde nada. Ejemplo: int.double
     * 
     * EXPLICITA ( casting): de un tipo grande a uno pequeño. La fuerzas tu con
     * (tipo) y puede perder infotmacion. Ejmplo: double.int
     */

    int unidades = 5;
    double comoDecimal = unidades;
    System.out.println("Implicita: " + comoDecimal);

    double precio = 19990.75;
    int precioRecortado = (int) precio;
    System.out.println("CAstin: " + precioRecortado);

  }

}
