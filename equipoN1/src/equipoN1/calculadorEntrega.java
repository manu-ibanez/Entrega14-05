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
