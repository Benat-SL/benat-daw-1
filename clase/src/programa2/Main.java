package programa2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que clase de cliente eres?");
		String Opciones = entrada.next();
		switch(Opciones) {
		case "normal":
			System.out.println();
			break;
		case "vip":// 5%
			System.out.println();
			break;
		case "socio":// 20%
			System.out.println();
			break;
			
		}
		System.out.println("Intrudece un numero");
		int n1 = entrada.nextInt();

	}

}
