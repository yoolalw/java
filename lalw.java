package projetojava;

import java.util.Scanner;

public class lalw {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		x = sc.nextInt();
		
		if(x %2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		
		sc.close();
	}
}
