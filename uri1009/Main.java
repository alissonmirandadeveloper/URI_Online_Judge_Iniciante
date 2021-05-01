package uri1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nomeFuncionario = input.next();
		double salarioFixo = input.nextDouble();
		double vendasEfetuadas = input.nextDouble();
		double comissao = vendasEfetuadas * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", salarioFinal));
		
		
		input.close();

	}

}