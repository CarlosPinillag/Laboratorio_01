package cl.duoc.dsy1105.lab;

public class LaboratorioJava {


    public static String obtenerEstadoBateria(int bateria) {
        if (bateria < 20) {
            return "Batería baja";
        } else if (bateria <= 79) {
            return "Batería suficiente";
        } else {
            return "Batería alta";
        }
    }

    public static void main(String[] args) {

        String modelo = "Galaxy A55";
        int porcentaje = 18;
        boolean modoAhorro = false;
        String propietario = null;


        String estado = obtenerEstadoBateria(porcentaje);


        String nombrePropietario = (propietario != null) ? propietario : "Sin propietario";


        System.out.println("TELÉFONO");
        System.out.println("Modelo: " + modelo);
        System.out.println("Batería: " + porcentaje + "%");
        System.out.println("Estado: " + estado);
        System.out.println("Ahorro de energía: " + modoAhorro);
        System.out.println("Propietario: " + nombrePropietario);
    }
}
