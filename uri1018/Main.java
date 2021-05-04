package uri1018;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int numero = input.nextInt();
		
		int cem = numero / 100;
		int cinquenta = (numero % 100) / 50;
		int vinte = ((numero % 100) % 50) / 20;
		int dez = (((numero % 100) % 50) % 20) / 10;
		int cinco = ((((numero % 100) % 50) % 20) % 10) / 5;
		int dois = (((((numero % 100) % 50) % 20) % 10) % 5) / 2;
		int um = ((((((numero % 100) % 50) % 20) % 10) % 5) % 2) / 1;
		
		
		System.out.println(numero);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");

		input.close();
		
	}

}
