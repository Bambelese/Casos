package casos1_java;

import java.util.Scanner;

public class caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese lado A");
		double a=sc.nextDouble();
		System.out.println("Ingrese lado B");
		double b = sc.nextDouble();
		System.out.println("ingrese lado C");
		double c= sc.nextDouble();
		
		double perimetro=a+b+c;
		
		System.out.println("Perímetro: "+perimetro);

	}

}
