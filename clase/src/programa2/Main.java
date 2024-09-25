package programa2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Escriba el importe:");
		double numero = entrada.nextDouble();
		double importe = numero;
		
		System.out.println("Que clase de cliente eres?");
		System.out.println("normal , socio o vip");
		String Opciones = entrada2.next();
		switch(Opciones) {
		case "normal":
			System.out.println("Usted no tiene descuento el precio es:" + importe);
			break;
		case "socios":// 5%
			double descuento1 = importe * 0.05;
			double resultado = importe - descuento1;
			System.out.println("Los socios tienen un 5% su precio es:" + resultado);
			
			break;
		case "vip":// 20%
			double descuento2 = importe * 0.20;
			double resultado2 = importe - descuento2;
			System.out.println("Los clientes vip tienen un 20%su precio es:" + resultado2 );
			break;
			
		}
	}

}
