package uri1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double PI = 3.14159;
		
		double area;
		double raio = input.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.println("A="+String.format("%.4f", area));
	}

}
