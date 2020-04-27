package casos1_java;

import java.util.Scanner;

public class caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer monto:");
		float m1=sc.nextFloat();
		System.out.println("Ingrese el segundo monto:");
		float m2=sc.nextFloat();
		System.out.println("Ingrese el tercer monto:");
		float m3=sc.nextFloat();
		
		float total = m1+m2+m3;
		float monto1= (float) (m1/5)+(m2/5);
		float monto2= (float) (m3*0.6)/2;
		float monto3_1= (float) (total*0.08);
		float monto3 = (float) ( total - monto3_1);
		
		System.out.println("primer monto: "+monto1);
		System.out.println("segundo monto: "+monto2);
		System.out.println("tercer monto: "+monto3);

	}

}
