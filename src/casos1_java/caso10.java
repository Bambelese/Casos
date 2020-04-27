package casos1_java;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int radio = 0;
		double area, perimetro;
		
		System.out.println("ingrese el radio: ");
		radio=sc.nextInt();
		
		perimetro = 2*Math.PI*radio;
		area = 3.1416 * Math.pow(radio, 2);
		
		System.out.println("Área del círculo: "+ area);
		System.out.println("Perimetro del círculo; "+ perimetro );

	}

}
