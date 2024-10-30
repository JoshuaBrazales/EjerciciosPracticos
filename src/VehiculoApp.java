import javax.swing.JOptionPane;

public class VehiculoApp {
    public static void main(String[] args) {
        // Pestaña 1: Ingreso de Datos Básicos
        String numeroMotor = JOptionPane.showInputDialog(null, "Cual es el número de motor del vehículo:", "Datos del Vehículo", JOptionPane.QUESTION_MESSAGE);
        String numeroVentanas = JOptionPane.showInputDialog(null, "Cuantas ventanas hay:", "Datos del Vehículo", JOptionPane.QUESTION_MESSAGE);
        String cantidadPuertas = JOptionPane.showInputDialog(null, "Cuantas puertas hay:", "Datos del Vehículo", JOptionPane.QUESTION_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Cual es la marca del vehículo:", "Datos del Vehículo", JOptionPane.QUESTION_MESSAGE);
        String modelo = JOptionPane.showInputDialog(null, "Cual es el modelo del vehículo:", "Datos del Vehículo", JOptionPane.QUESTION_MESSAGE);
        double kilometrajeInicial = 0;
        double kilometrajeFinal = 0;

        try {
            kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el kilometraje inicial:", "Kilometraje", JOptionPane.QUESTION_MESSAGE));
            kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el kilometraje final:", "Kilometraje", JOptionPane.QUESTION_MESSAGE));

            if (kilometrajeFinal < kilometrajeInicial) {
                JOptionPane.showMessageDialog(null, "El kilometraje final no puede ser menor al de inicio.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para el kilometraje.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        double kilometrosRecorridos = kilometrajeFinal - kilometrajeInicial;

        String informacionVehiculo = "Información del Vehículo:\n" +
                "Número de Motor: " + numeroMotor + "\n" +
                "Número de Ventanas: " + numeroVentanas + "\n" +
                "Cantidad de Puertas: " + cantidadPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + " km\n" +
                "Kilometraje Final: " + kilometrajeFinal + " km\n" +
                "Kilómetros Recorridos: " + kilometrosRecorridos + " km";

        JOptionPane.showMessageDialog(null, informacionVehiculo, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
