import java.util.Scanner;

public class CalculadoraEuros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce una cantidad (en pesetas):");
		double pesetas=sc.nextDouble();
		
		double tasa=166.386;
		
		if(pesetas>=0) {
			double euros=pesetas/tasa;
			System.out.println("La cantidad en euros es: "+euros);
		}else {
			System.out.println("El valor de pesetas establecido no es correcto");
		}
	}

}
