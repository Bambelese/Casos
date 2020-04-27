package casos1_java;

import java.util.Scanner;

public class caso22 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Ingrese nombre: ");
		 String nombre=sc.next();
		 System.out.println("Ingrese notas:");
		 int n1 =sc.nextInt();
		 System.out.println("Siguiente:");
		 int n2= sc.nextInt();
		 System.out.println("Siguiente:");
		 int n3= sc.nextInt();
		 
		 double promedio=(n1+n2+n3)/3;
		 
		 double nota1= n1*(0.20*promedio);
		 double nota2= n2*(0.30*promedio);
		 double nota3= n3*(0.50*promedio);
		 
		 System.out.println("Promedios de alumno "+nombre);
		 System.out.println("Nota 1: "+nota1+"%");
		 System.out.println("Nota 2: "+nota2+"%");
		 System.out.println("Nota 3: "+nota3+"%");

	}

}
