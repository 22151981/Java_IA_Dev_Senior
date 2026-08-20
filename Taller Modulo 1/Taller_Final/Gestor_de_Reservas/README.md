
TALLER FINAL - MODULO 1 

# Gestor de Reservas - Marta Peluquería 💇‍♀️💅

Este proyecto es una aplicación de consola (CLI) desarrollada en Java que resuelve el problema de negocio de "Marta Peluquería", permitiendo gestionar citas diarias sin solapamiento de horarios y automatizando el reporte financiero del día. 

Proyecto desarrollado como reto integrador del **Módulo 1** de fundamentos de programación.  Dev Senior

---

## 🛠️ Arquitectura del Proyecto

El sistema está diseñado bajo un modelo modular utilizando programación estructurada con métodos estáticos y arreglos paralelos para el almacenamiento temporal de la información:

*   **`App.java`**: Punto de entrada del programa. Contiene el ciclo principal del menú y gestiona el flujo de ejecución.
*   **`Menu.java`**: Encargada de la interfaz de consola, imprimiendo las opciones y capturando la selección del usuario.
*   **`Validador.java`**: Capa de seguridad y validación. Evalúa la validez de los nombres, horas y códigos de servicio.
*   **`Operaciones.java`**: El motor lógico del programa. Controla el almacenamiento en arreglos paralelos, gestiona altas de reservas, listas, cancelaciones sin dejar "huecos" y estadísticas de caja.

---

## 📋 Reglas de Negocio Implementadas

*   **Horario de Atención**: Únicamente de 8:00 a 18:00 (citas en horas en punto de 8 a 17).
*   **Sin Duplicaciones**: No se permite agendar dos citas en la misma hora.
*   **Validación Estricta**: No se permiten nombres vacíos ni códigos de servicio inexistentes (1, 2 o 3).
*   **Cupo Limitado**: Agenda con un límite máximo de 10 reservas simultáneas.
*   **Reorganización de Memoria**: Al cancelar una reserva, los arreglos paralelos se desplazan automáticamente para no dejar posiciones vacías intermedias.

---
  
## 🚀 Instrucciones de Ejecución

Sigue estos pasos para compilar y ejecutar el proyecto desde tu terminal:

### 1. Requisitos previos
Asegúrate de tener instalado el Kit de Desarrollo de Java (JDK 17 o superior). Puedes verificarlo ejecutando:
```bash
java -version