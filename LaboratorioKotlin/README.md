# Laboratorio 01 - Gestión de Batería (Kotlin)

Versión desarrollada en **Kotlin** para la asignatura **DSY1105** (Duoc UC) que evalúa el estado de la batería y muestra las características de un dispositivo móvil.

##  Funcionalidades

* **Evaluación de batería:**
    * Menos de 20%: *Batería baja*
    * De 20% a 79%: *Batería suficiente*
    * 80% o más: *Batería alta*
* **Manejo de Nulos (Null Safety):** Utiliza características nativas de Kotlin (operador elvis `?:`) para controlar valores nulos.
* **Salida por consola:** Imprime el estado del teléfono.

##  Estructura del Proyecto

* **Lenguaje:** Kotlin
* **Ubicación:** `LaboratorioKotlin/src/`

##  Ejecución desde Terminal

1. Compilar el archivo Kotlin:
   ```bash
   kotlinc src -include-runtime -d LaboratorioKotlin.jar