package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //HashSet não respeita ordem de inserção
		TreeSet<String> listaAprovados = new TreeSet<>(); // TreeSet respeita ordem Alfabética
		listaAprovados.add("Binha");
		listaAprovados.add("Lu");
		listaAprovados.add("Gei");
		listaAprovados.add("Vini");
		listaAprovados.add("Geisiane");
		listaAprovados.add("Gei");
		
		for(String candidato : listaAprovados ) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new TreeSet<>(); // TreeSet respeita ordem Alfabética
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(120);
		nums.add(50);
		nums.add(85);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
