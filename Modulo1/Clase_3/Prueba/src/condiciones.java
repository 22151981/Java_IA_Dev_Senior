
public class condiciones {

  public static void main(String[] args) {

    double cuenta = 150000;

    if (cuenta >= 200000) {
      System.out.println("Descuento VIP (15%)");
    } else if (cuenta > 100000) {
      System.out.println("Descuento normal (10%)");
    } else {
      System.out.println("Sin descuento");
    }

  }
}
