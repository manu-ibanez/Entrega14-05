package equipoN1;

import java.util.Scanner;

public class calculadorEntrega {

	  public static void main(String[] args) {
		  //codigo Manu
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
	  //fin codigo manu
	  }























// Inicio elessar
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
}//Fin elessar






