package ex4;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		Random gerador = new Random();
		int numero = gerador.nextInt(10);
		int num =0;
		
		while(num != numero) {

		System.out.println("Por favor digite um número");
		int num1 = entrada.nextInt();
		}
}
}
