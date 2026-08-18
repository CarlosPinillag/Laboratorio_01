# Laboratorio 01 - Gestión de Batería

Proyecto Java para la asignatura **DSY1105** (Duoc UC) que simula la evaluación del estado de batería y detalles de un teléfono móvil.

##  Funcionalidades

* **Evaluación de batería:** Determina el estado del teléfono según el porcentaje:
    * Menos de 20%: *Batería baja*
    * De 20% a 79%: *Batería suficiente*
    * 80% o más: *Batería alta*
* **Manejo de valores nulos:** Uso de operador ternario para asignar el valor `"Sin propietario"` si la variable es `null`.
* **Salida por consola:** Imprime el resumen formateado del dispositivo.

##  Estructura

* **Paquete:** `cl.duoc.dsy1105.lab`
* **Clase principal:** `LaboratorioJava.java`

##  Ejecución

### Desde Terminal

1. Posiciónate en la carpeta `src`:
   ```bash
   cd src