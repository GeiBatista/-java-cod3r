package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Quantas notas você deseja informar? ");
		
		int qtdNotas = entrada.nextInt();
		
		double notas[] = new double[qtdNotas];
		
				
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d%s", i + 1, ": " );
			notas[i] = entrada.nextDouble();
			System.out.println(Arrays.toString(notas));	
		}
		
		double total = 0;
		for(double nota : notas) {
		total += nota; 
		}
		
		System.out.printf("A média é :%.2f", (total / notas.length));
		entrada.close();
	}

}
