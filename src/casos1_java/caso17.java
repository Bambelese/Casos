package casos1_java;

import java.util.Scanner;

public class caso17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Número de aprobados: ");
		 int n1 = sc.nextInt();
		 System.out.println("Número de desaprobados: ");
		 int n2 = sc.nextInt();
		 System.out.println("Número de retirados: ");
		 int n3 = sc.nextInt();
		 
		  int total = n1+ n2 + n3;
		  
		  float apro = ((n1*100)/total);
		  float desa = ((n2*100)/total);
		  float reti = ((n3*100)/total);
		  
		  System.out.println("Aprobados: "+ apro + "%");
		  System.out.println("Desaprobados: "+ desa +"%");
		  System.out.println("Retirados: "+reti+"%");
	}

}
