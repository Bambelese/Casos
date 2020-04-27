package casos1_java;

import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.println("Ingrese lado: ");
		
		lado = sc.nextInt();
		
		System.out.println("resultado");
		System.out.println("Área del cuadrado: "+ lado * lado);
		System.out.println("Perímetro: "+ lado * 4);

	}

}
