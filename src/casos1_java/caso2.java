package casos1_java;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("Ingrese su 1er n�mero: ");
		n1= sc.nextFloat();
		System.out.println("Ingrese su 2do n�mero: ");
		n2 = sc.nextFloat();
		System.out.println("----RESULTADO----");
		System.out.println("N�meros ingresados "+n1+" y "+n2);
		System.out.println("Primer n�mero "+n1);
		System.out.println("Segundo n�mero "+n2);
	}

}
