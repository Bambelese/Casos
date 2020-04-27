package casos1_java;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado1 = 0, lado2 = 0;
		
		System.out.println("Ingrese lado 1:");
		lado1 = sc.nextInt();
		System.out.println("Ingrese lado 2:");
		lado2 = sc.nextInt();
		
		System.out.println("Resultados");
		System.out.println("Área del rectángulo: "+ lado1*lado2);
		System.out.println("Perímetro: "+ (lado1+lado2)*2);
		

	}

}
