package programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre Alumno:");
		String nombre = entrada.next();

		System.out.println("Nota 1");
		double n1 = entrada.nextDouble();
		
		System.out.println("Nota 2");
		double n2 = entrada.nextDouble();

		System.out.println("Nota 3");
		double n3 = entrada.nextDouble();

		System.out.println("Nota 4");
		double n4 = entrada.nextDouble();

		System.out.println("Nota 5");
		double n5 = entrada.nextDouble();
		
		double media = (n1 + n2 + n3 + n4 + n5);
		double resultado = (media / 5);
		
		if (n1 >= 5 && n2 >= 5 && n3 >= 5 && n4 >= 5 && n5 >= 5) {
			System.out.println(nombre + " Es apto" + " la media es " + resultado);
		} 
		else if (n1 < 5 && n2 < 5 && n3 < 5 && n4 < 5 && n5 < 5) {
			System.out.println(nombre + " No es apto" + " la media es " + resultado);
		}
		
	}

	}
