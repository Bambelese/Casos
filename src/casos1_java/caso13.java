package casos1_java;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ingrese nombre:");
		String nombre= s.next();
		System.out.println("Ingrese apellido:");
		String apellido= s.next();
		
		System.out.println("resultados");
		System.out.println("Alumno: "+nombre+" "+apellido);
		

	}

}
