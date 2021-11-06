import java.util.Scanner;

/**
 * 
 */

/**
 * @author diama
 *
 */
public class calculadora {
	
	
	public static void main(String[] args) {
		
		//Variable que almacenamos la opcion;
		int opcion = 0;     
		Scanner sc;
		
		sc= new Scanner(System.in);
		
		do {
			
			//impresión del menu por consola
			System.out.print('\n'); // salto de linea
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("*****************");
			System.out.println("0. Salir de la calculadora");
			System.out.println("*****************");
			System.out.print('\n');
			System.out.print("Introduce una opcion valida: ");
			
			//Recoger el parametro de entrada y convertirlo a entero
			opcion = Integer.parseInt(sc.nextLine());   
			
			if (opcion < 0 || opcion > 5) {
				System.out.println("Introduce un valor correcto");
				
			}else if (opcion != 0) {
				System.out.println("\n");
				
				float operando1, operando2;
				
				System.out.print("Introduce el primer operando: ");
				operando1 = Float.parseFloat(sc.nextLine());
				System.out.print("Introduce el segundo operando: ");
				operando2 = Float.parseFloat(sc.nextLine());
				
				
				switch(opcion) {
				
				case 1: 
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
					
				case 2: 
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				
				case 3: 
					System.out.println("El resultado de la multiplicacion es " + (operando1 * operando2));
					break;
					
				case 4: 
					System.out.println("El resultado de la division es " + (operando1 / operando2));
					break;
					
				case 5: 
					System.out.println("El resultado del resto es " + (operando1 % operando2));
					break;
					
				}
				
			}
				
		}while (opcion != 0);
		
		sc.close();
		
		System.out.println("cierre del programa");
		
	}
}