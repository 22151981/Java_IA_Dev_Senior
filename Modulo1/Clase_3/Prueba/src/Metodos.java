
public class Metodos {

  // Método para calcular el pago total
  public double calcularPago(double cuenta) {
    double propina = cuenta * 0.05; // 5% de propina
    double descuento = 0;

    // Condiciones de descuento
    if (cuenta > 150000) {
      descuento = cuenta * 0.15; // 15% de descuento
    } else if (cuenta > 100000) {
      descuento = cuenta * 0.10; // 10% de descuento
    } else {
      descuento = 0; // No hay descuento
    }

    // Calcular total
    double total = cuenta + propina - descuento;

    // Mostrar desglose
    System.out.println("Cuenta base: $" + cuenta);
    System.out.println("Propina (5%): $" + propina);
    System.out.println("Descuento aplicado: $" + descuento);
    System.out.println("Total a pagar: $" + total);

    return total;
  }

  // Método principal para probar
  public static void main(String[] args) {
    Metodos r = new Metodos();

    // Ejemplo de cuentas
    r.calcularPago(90000); // Sin descuento
    r.calcularPago(120000); // 10% descuento
    r.calcularPago(160000); // 15% descuento
  }

}

/*
 * Definimos una clase cualquier
 * 
 * public class personas {
 * 
 * 
 * // Atributos
 * String nombre;
 * int edad;
 * 
 * // Método vacío (void): muestra información
 * public void mostrarInfo() {
 * System.out.println("Nombre: " + nombre);
 * System.out.println("Edad: " + edad);
 * }
 * 
 * // Método con parámetros: asigna valores
 * public void asignarDatos(String n, int e) {
 * nombre = n;
 * edad = e;
 * }
 * 
 * // Método con retorno: devuelve si es mayor de edad
 * public boolean esMayorDeEdad() {
 * return edad >= 18;
 * }
 * }
 * 
 * // Clase principal para probar
 * public class Main {
 * public static void main(String[] args) {
 * Persona p1 = new Persona(); // Crear objeto
 * 
 * p1.asignarDatos("Thiago", 10); // Usar método con parámetros
 * p1.mostrarInfo(); // Usar método void
 * 
 * boolean mayor = p1.esMayorDeEdad(); // Usar método con retorno
 * System.out.println("¿Es mayor de edad? " + mayor);
 * }
 * }
 */
