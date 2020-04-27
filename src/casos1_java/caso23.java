package casos1_java;

import java.util.Scanner;

public class caso23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese nombre del producto: ");
		String nombre=sc.next();
		System.out.println("Precio del producto: ");
		float precio=sc.nextFloat();
		System.out.println("Cantidad: ");
		float cantidad=sc.nextFloat();
		
		float importe = precio*cantidad;
		
		float igv = (float) (importe*0.18);
		float descuento = (float) (importe*0.3);
		float total =importe - descuento + igv;
		
		System.out.println("Importe total de "+ nombre+" Es de "+ total);
		
		

	}

}
