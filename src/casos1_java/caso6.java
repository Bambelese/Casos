package casos1_java;
import java.util.Scanner;

public class caso6 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("Primer n�mero: ");
		n1 = sc.nextFloat();
		System.out.println("Segundo n�mero: ");
		n2 = sc.nextFloat();
		
		float promedio, aumento, disminuido;
		
		promedio = ( n1 + n2 )/2;
		aumento = (float) ( n1 *1.2 ) ;
		disminuido = (float) ( n2 * 0.7) ;
		
		System.out.println("---RESULTADO---");
		System.out.println("Promedio: "+ promedio);
		System.out.println("Aumento: "+ aumento);
		System.out.println("Disminuido: "+disminuido);

	}

}
