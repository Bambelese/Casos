package casos1_java;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("Ingrese su 1er número: ");
		n1= sc.nextFloat();
		System.out.println("Ingrese su 2do número: ");
		n2 = sc.nextFloat();
		System.out.println("----RESULTADO----");
		System.out.println("Números ingresados "+n1+" y "+n2);
		System.out.println("Primer número "+n1);
		System.out.println("Segundo número "+n2);
	}

}
