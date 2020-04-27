package casos1_java;

import java.util.Scanner;

public class caso21 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de la gasto: ");
		double gasto= sc.nextDouble();
		
		double porcentaje = gasto*0.12;
		double descuento= gasto - porcentaje;
		
		System.out.println("El descuento es de: "+ porcentaje);
		System.out.println("El gasto es de : "+ descuento);
		
	}

}
