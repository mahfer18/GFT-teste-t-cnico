package ex2;

	import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
        Scanner entrada = new Scanner(System.in);
        int maiorV = 0;
        int menorV = 0;
        int somaTotal = 0;
        double media = 0;
        int acimaDez =0;
        int acimaCinq = 0;

        int[] numero = new int[10];
        for(int i = 0; i <numero.length; i++){
            System.out.println("Informe um n�mero: ");
            numero[i] = entrada.nextInt();
            somaTotal+= numero[i];

            if(i ==0){
                maiorV = numero[i];
                menorV = numero[i];
            }
            else if(numero[i] > maiorV){
                maiorV = numero[i];
            }
            else if (numero [i] < menorV){
                menorV = numero[i];
            }
            media = somaTotal/10;
	      }
	       System.out.println("O maior valor �: " + maiorV);
	       System.out.println("O menor valor �: " + menorV);
	       System.out.println("A Soma total �: " + somaTotal);
	       System.out.println("A m�dia � " + media);
	   }
	}