public class operadores_logicos {

  public static void main(String[] args) {

    double subtotal = 120000;
    boolean tieneCupon = false;

    boolean aplicarDescuento = subtotal > 100000 && tieneCupon;
    System.out.println("Aplica descuento? " + aplicarDescuento);

  }

}
// ===============================
// 📘 Operadores lógicos en Java
// ===============================

// && → Operador AND lógico (cortocircuito).
// Significa "Y". La condición se cumple solo si ambas son verdaderas.
// Ejemplo: (a > 0 && b > 0)
// Interpretación: las dos condiciones deben ser true sí o sí.

// || → Operador OR lógico (cortocircuito).
// Significa "O". La condición se cumple si al menos una es verdadera.
// Ejemplo: (a == 0 || b == 0)
// Interpretación: basta con que una condición sea true para que se cumpla.

// ! → Operador NOT lógico.
// Significa "NO". Invierte el valor booleano.
// Ejemplo: !encontrado
// Interpretación: si encontrado es true, !encontrado será false, y viceversa.

// ^ → Operador XOR lógico (OR exclusivo).
// Significa "O exclusivo". Se cumple solo si exactamente una condición es
// verdadera.
// Ejemplo: (true ^ false) → true
// Interpretación: solo una de las dos debe ser true, no ambas.

// & → Operador AND sin cortocircuito.
// Igual que &&, pero siempre evalúa ambas condiciones.
// Ejemplo: (a > 0 & b++ > 0)
// Interpretación: ambas deben ser true, pero incluso si la primera es false,
// la segunda condición se evalúa (puede afectar variables).

// | → Operador OR sin cortocircuito.
// Igual que ||, pero siempre evalúa ambas condiciones.
// Ejemplo: (a == 0 | b++ == 0)
// Interpretación: basta con que una sea true, pero siempre se evalúan las dos.
