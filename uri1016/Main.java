package uri1016;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input =  new Scanner(System.in);
		
		
		int kmPercorrido = input.nextInt();
		int minutosPercorrido = (60* kmPercorrido) / 30;
		
	
		
		System.out.println(minutosPercorrido + " minutos");
		
		
		

	}

}
