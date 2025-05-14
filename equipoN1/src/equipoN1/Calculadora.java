package equipoN1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("------------------");
        
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion(scanner);
            
            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }
            
            double[] numeros = obtenerNumeros(scanner);
            double resultado = realizarOperacion(opcion, numeros[0], numeros[1]);
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.printf("Resultado: %.2f%n", resultado);
            }
        }
        
        scanner.close();
    }

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\nOperaciones disponibles:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
    }

    // Método para obtener la opción del usuario
    public static int obtenerOpcion(Scanner scanner) {
        System.out.print("Seleccione una operación (0-4): ");
        return scanner.nextInt();
    }

    // Método para obtener los números de entrada
    public static double[] obtenerNumeros(Scanner scanner) {
        double[] numeros = new double[2];
        System.out.print("Ingrese el primer número: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = scanner.nextDouble();
        return numeros;
    }

    // Método para realizar la operación seleccionada
    public static double realizarOperacion(int opcion, double num1, double num2) {
        switch (opcion) {
            case 1:
                return sumar(num1, num2);
            case 2:
                return restar(num1, num2);
            case 3:
                return multiplicar(num1, num2);
            case 4:
                return dividir(num1, num2);
            default:
                System.out.println("Opción no válida");
                return 0;
        }
    }

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN; // Retorna "Not a Number" para divisiones por cero
        }
        return a / b;
    }
}