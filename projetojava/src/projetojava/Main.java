
package projetojava;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n\n", product2, price2);
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		Locale.setDefault(new Locale("en", "US"));
		System.out.printf("US decimal point: %.3f", measure);
	}
}
