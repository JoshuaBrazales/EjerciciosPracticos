import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class EmpleadoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del empleado:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el género del empleado:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        double salario = 0;
        try {
            salario = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: Debe ser un número.");
            scanner.next();
            return;
        }

        System.out.println("Año de nacimiento del empleado:");
        int anioNacimiento = leerEntero(scanner);

        System.out.println("Mes de nacimiento del empleado:");
        int mesNacimiento = leerEntero(scanner);

        System.out.println("Día de nacimiento del empleado:");
        int diaNacimiento = leerEntero(scanner);

        System.out.println("Año de ingreso del empleado:");
        int anioIngreso = leerEntero(scanner);

        System.out.println("Mes de ingreso del empleado:");
        int mesIngreso = leerEntero(scanner);

        System.out.println("Día de ingreso del empleado:");
        int diaIngreso = leerEntero(scanner);

        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaIngreso = LocalDate.of(anioIngreso, mesIngreso, diaIngreso);

        int edad = calcularEdad(fechaNacimiento);
        System.out.println("La edad del empleado es: " + edad + " años");

        double prestaciones = calcularPrestaciones(fechaIngreso, salario);
        System.out.println("Las prestaciones del empleado son: " + prestaciones);

        System.out.println("¿Desea modificar el salario? (si/no)");
        scanner.nextLine();  // Limpiar el buffer
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nuevo salario:");
            try {
                salario = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida para el salario. Debe ser un número.");
                return;
            }
            prestaciones = calcularPrestaciones(fechaIngreso, salario);
            System.out.println("Las nuevas prestaciones del empleado son: " + prestaciones);
        }

        scanner.close();
    }
    /////////////////
    private static int leerEntero(Scanner scanner) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Error: Debe ser un número entero.");
                scanner.next();
            }
        }
        return numero;
    }

    ////////////
    public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public static double calcularPrestaciones(LocalDate fechaIngreso, double salario) {
        LocalDate fechaActual = LocalDate.now();
        int antiguedad = Period.between(fechaIngreso, fechaActual).getYears();
        return (antiguedad * salario) / 12;
    }
}
