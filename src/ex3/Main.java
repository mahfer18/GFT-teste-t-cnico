package ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ICMS icms = new ICMS();
		IPI ipi = new IPI();
		COFINS cofins = new COFINS();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double valor = entrada.nextInt();
		
		System.out.printf("%s%d, ICMS: ", icms.calculaImposto(valor));
		System.out.printf("%s%d, IPI: ", ipi.calculaImposto(valor));
		System.out.printf("%s%d, COFINS: ", cofins.calculaImposto(valor));
		
		double valorFinal = valor+ icms.calculaImposto(valor) +ipi.calculaImposto(valor)+cofins.calculaImposto(valor);
		System.out.printf("%s%d, Valor final: ", valorFinal);
		

	
	}

}
