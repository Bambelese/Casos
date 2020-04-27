package casos1_java;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ingrese un número: ");
		int in=s.nextInt();
		int iSumatorio = 0;
		int iContador = in;
				
		while (iContador != 0) {
				   
		  iSumatorio = iSumatorio + iContador;
		  iContador--;
		}
		
		
		System.out.println("Resultado");
		System.out.println("Sumatoria:"+iSumatorio);

	}

}
