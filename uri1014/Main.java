package uri1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		double Y = input.nextDouble();
		
		double mediaCombustivel =  (double) X / Y;
		
		System.out.printf("%.3f km/l%n", mediaCombustivel);
		

	}

}
