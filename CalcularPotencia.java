import java.util.Scanner;

public class CalcularPotencia {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la base: ");
		double base=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduce el exponente (entero positivo o negativo: )");
		int exponente=sc.nextInt();
		sc.nextLine();
		
		double resultado=calcularPotencia(base, exponente);
		
		System.out.println("El resultado de "+base+" elevado a la "+exponente+" es: "+resultado);
	}
	
	private static double calcularPotencia(double base, int exponente) {
		if(exponente>=0) {
			return Math.pow(base, exponente);
		}else {
			return 1.0/Math.pow(base, Math.abs(exponente));
		}
	}

}
