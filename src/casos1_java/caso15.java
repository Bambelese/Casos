package casos1_java;
import java.util.*;

public class caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese cantidad");
		float cantidad = sc.nextFloat();
		
		System.out.println("Ingrese precio");
		float precio = sc.nextFloat();
		
		
		float importe = cantidad * precio;
		float importe_d = (float) (importe / 3.24);
		float importe_e = (float) (importe / 3.75);
		
		System.out.println("resultado");
		System.out.println("Importe en soles: " + importe);
		System.out.println("Importe en Dolares: "+ importe_d);
		System.out.println("Importe en Euros: "+ importe_e);

	}

}
