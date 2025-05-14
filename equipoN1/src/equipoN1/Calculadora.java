package equipoN1;
import java.util.Scanner;

public class Calculadora {
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