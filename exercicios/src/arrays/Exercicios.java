package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		double[] notasDoAluno = new double[3];
	
		notasDoAluno[0] = 5;
		notasDoAluno[1] = 3;
		notasDoAluno[2] = 8;
		
		System.out.println(Arrays.toString(notasDoAluno));
		
		double total = 0;
		
		for(int i=0; i < notasDoAluno.length; i++) {
			total += notasDoAluno[i];
		}
		System.out.println(total);
	}
}
