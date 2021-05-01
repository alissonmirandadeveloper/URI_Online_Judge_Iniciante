package uri1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double media = (A * 2 + B * 3 + C * 5) / 10;

		
		System.out.println("MEDIA = " + String.format("%.1f", media));
	}

}
