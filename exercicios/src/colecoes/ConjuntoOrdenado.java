package colecoes;

import java.util.TreeSet;

public class ConjuntoOrdenado {

	public static void main(String[] args) {

		
		TreeSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Binha");
		listaAprovados.add("Lu");
		listaAprovados.add("Gei");
		listaAprovados.add("Vini");
		listaAprovados.add("Geisiane");
		listaAprovados.add("Gei");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
			
		}
	}

}
