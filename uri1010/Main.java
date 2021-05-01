package uri1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int peca1= input.nextInt();
		int quantidadePeca1 = input.nextInt();
		double valorUnitarioPeca1 = input.nextDouble();
		
		int peca2= input.nextInt();
		int quantidadePeca2 = input.nextInt();
		double valorUnitarioPeca2 = input.nextDouble();
		
		double precoFinal = quantidadePeca1 * valorUnitarioPeca1 + quantidadePeca2 * valorUnitarioPeca2;
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", precoFinal));
		input.close();

	}

}