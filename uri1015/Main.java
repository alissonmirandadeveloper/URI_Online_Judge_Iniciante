package uri1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double distancia;
		
		Locale.setDefault(Locale.US);
		Scanner input =  new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		distancia = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
		
		System.out.println(String.format("%.4f", distancia));

	}

}
