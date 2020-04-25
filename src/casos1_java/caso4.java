package casos1_java;
import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0;
		float n2 = 0;
		System.out.println("Primer número: ");
		n1 = sc.nextFloat();
		System.out.println("Segundo número: ");
		n2 = sc.nextFloat();
		float suma, resta, producto, division, resto;
		suma = n1 + n2;
		resta = n1 - n2;
		producto = n1 * n2;
		division = n1 / n2;
		
		System.out.println("----RESULTADOS----");
		System.out.println("Suma: "+ suma);
		System.out.println("Resta: "+ resta);
		System.out.println("Producto: "+producto);
		System.out.println("Division: "+division);
		
	}

}
