package programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre Alumno:");
		String nombre = entrada.next();

		System.out.println("Nota 1");
		int n1 = entrada.nextInt();
		
		System.out.println("Nota 2");
		int n2 = entrada.nextInt();

		System.out.println("Nota 3");
		int n3 = entrada.nextInt();

		System.out.println("Nota 4");
		int n4 = entrada.nextInt();

		System.out.println("Nota 5");
		int n5 = entrada.nextInt();
		
		int media = (n1 + n2 + n3 + n4 + n5);
		int resultado = (media / 5);
		
		if (n1 >= 5 && n2 >= 5 && n3 >= 5 && n4 >= 5 && n5 >= 5) {
			System.out.println(nombre + " Es apto" + " la media es " + resultado);
		} 
		else if (n1 < 5 && n2 < 5 && n3 < 5 && n4 < 5 && n5 < 5) {
			System.out.println(nombre + " No es apto" + " la media es " + resultado);
		}
		
	}

	}
