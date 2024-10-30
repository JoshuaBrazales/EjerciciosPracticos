import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FigurasGeometricasApp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Menú para seleccionar la figura
        System.out.println("Seleccione la figura para calcular área y perímetro:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");

        int opcion = Integer.parseInt(reader.readLine());

        switch (opcion) {
            case 1:
                calcularTriangulo(reader);
                break;
            case 2:
                calcularCuadrado(reader);
                break;
            case 3:
                calcularRectangulo(reader);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    // Método para el cálculo del área y perímetro del triángulo
    public static void calcularTriangulo(BufferedReader reader) throws IOException {
        System.out.println("Ingrese la base del triángulo:");
        double base = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del triángulo:");
        double altura = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese los tres lados del triángulo (lado1, lado2, lado3):");
        double lado1 = Double.parseDouble(reader.readLine());
        double lado2 = Double.parseDouble(reader.readLine());
        double lado3 = Double.parseDouble(reader.readLine());

        double area = (base * altura) / 2;
        double perimetro = lado1 + lado2 + lado3;

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    // Método para el cálculo del área y perímetro del cuadrado
    public static void calcularCuadrado(BufferedReader reader) throws IOException {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = Double.parseDouble(reader.readLine());

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    // Método para el cálculo del área y perímetro del rectángulo
    public static void calcularRectangulo(BufferedReader reader) throws IOException {
        System.out.println("Ingrese la base del rectángulo:");
        double base = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = Double.parseDouble(reader.readLine());

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
}
